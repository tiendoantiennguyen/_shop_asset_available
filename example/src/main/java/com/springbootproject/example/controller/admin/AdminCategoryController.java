package com.springbootproject.example.controller.admin;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbootproject.example.entity.admin.product.AdminCategoryEntity;
import com.springbootproject.example.model.admin.product.AdminCategoryModel;
import com.springbootproject.example.service.admin.product.IAdminCategoryService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin/categories")
public class AdminCategoryController {
	@Autowired
	IAdminCategoryService categoryService;

	@GetMapping("")
	public String list(ModelMap model) {
		List<AdminCategoryEntity> list = categoryService.findAll();
		model.addAttribute("categories", list);
		return "admin/categoryManagement";
	}

	@GetMapping("/add")
	public String add(ModelMap model) {
		AdminCategoryModel category = new AdminCategoryModel();
		category.setIsEdit(false);
		model.addAttribute("category", category);
		return "admin/categoryAdd";
	}

	@PostMapping("/saveOrUpdate")
	public ModelAndView saveOrUpdate(ModelMap model, @Valid @ModelAttribute("category") AdminCategoryModel categoryModel,
			BindingResult result) {
		String message = "";

		if (result.hasErrors()) {
			return new ModelAndView("admin/categories/adOrEdit");
		}
		AdminCategoryEntity entity = new AdminCategoryEntity();

		// Copy data from model to entity
		BeanUtils.copyProperties(categoryModel, entity);

		categoryService.save(entity);

		if (categoryModel.getIsEdit() == true) {
			message = "category is update";
		} else {
			message = "category is save";
		}
		model.addAttribute("message", message);

		return new ModelAndView("forward:/admin/categories/", model);

	}

	@PostMapping("/edit/{categoryId}")
	public ModelAndView edit(ModelMap model, @PathVariable("categoryId") Long categoryId) {
		Optional<AdminCategoryEntity> opt = categoryService.findById(categoryId);
		AdminCategoryModel categoryModel = new AdminCategoryModel();
		if (opt.isPresent()) {
			AdminCategoryEntity entity = opt.get();
			// Copy data from model to entity
			BeanUtils.copyProperties(entity, opt);
			categoryModel.setIsEdit(true);
			model.addAttribute("categories", categoryModel);
			return new ModelAndView("amdin/categories/addOrEdit", model);
		} else {
			model.addAttribute("message", "category is not exist.");
			return new ModelAndView("foward:/admin/categories", model);
		}

	}

	@GetMapping("/delete/{categoryId}")
	public ModelAndView delete(ModelMap model, @PathVariable("categoryId") Long categoryId) {
		categoryService.deleteById(categoryId);
		model.addAttribute("message", "category deleted");
		return new ModelAndView("redirect:/admin/categories", model);
	}

	@GetMapping("/search")
	public String search(ModelMap modelMap, @RequestParam(name = "name", required = false) String name) {
		
		List<AdminCategoryEntity> list = null;
		if(StringUtils.hasText(name)) {
			list = categoryService.findByCategoryNameContainining(name);
		}else {
			list = categoryService.findAll();
		}
		modelMap.addAttribute("categories", list);
		return "/admin/categories/search";

	}
	
	@GetMapping("/searchPagenated")
	public String search(ModelMap modelMap
			,@RequestParam(name = "name",required = false) String name
			,@RequestParam("page") Optional<Integer> page
			,@RequestParam("size") Optional<Integer> size) {
		int count = (int) categoryService.count();
		int currentPage = page.orElse(1);
		int pageSize = size.orElse(3);
		
		Pageable pageable = PageRequest.of(currentPage -1, pageSize, Sort.by("categoryId"));
		
		Page<AdminCategoryEntity> resultPage = null;
		
		if(StringUtils.hasText(name)) {
			resultPage = categoryService.findByCategoryNameContainining(name, pageable);
			modelMap.addAttribute("name", name);
		}else {
			resultPage = categoryService.findAll(pageable);
		}
		
		int totalPage = resultPage.getTotalPages();
		if (totalPage > 0) {
			int start = Math.max(1, currentPage -2) ;
			int end = Math.min(currentPage + 2, totalPage) ;
			if (totalPage > count) {
				if(end == totalPage) {
					start = end - count;
				}
				else if (start == 1) {
					end = start +count;
				}
			}
			List<Integer> pageNumbers = IntStream.rangeClosed(start, end)
					.boxed()
					.collect(Collectors.toList());
			modelMap.addAttribute("pageNmbers", pageNumbers);
		}
		modelMap.addAttribute("categories", resultPage);
		
		return "/admin/categories/searchpagenated";
	}

}

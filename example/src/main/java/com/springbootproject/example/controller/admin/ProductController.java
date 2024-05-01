package com.springbootproject.example.controller.admin;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
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

import com.springbootproject.example.entity.admin.product.CategoryEntity;
import com.springbootproject.example.entity.admin.product.ProductsEntity;
import com.springbootproject.example.model.admin.product.ProductModel;
import com.springbootproject.example.model.web.product.CategoryModel;
import com.springbootproject.example.service.admin.product.IProductService;
import com.springbootproject.example.service.web.product.ICategoryService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@Autowired
	ICategoryService categoryService;
	
	//get all of category and then map to model
	@ModelAttribute("categories")
	public List<CategoryModel> getCategories(){
		return categoryService.findAll().stream().map(item -> {
			CategoryModel categoryModel = new CategoryModel();
			BeanUtils.copyProperties(item, categoryModel);
			return categoryModel;
		}).toList();
	}

	@GetMapping("")
	public String list(ModelMap model) {
		List<ProductsEntity> list = productService.findAll();
		model.addAttribute("product", list);
		return "amin/product/list";
	}

	@GetMapping("/add")
	public String add(ModelMap model) {
		ProductModel productModel = new ProductModel();
		productModel.setIsEdit(false);
		model.addAttribute("product", productModel);
		return "admin/product/addOrEdit";
	}

	@PostMapping("/saveOrUpdate")
	public ModelAndView saveOrUpdate(ModelMap model, @Valid @ModelAttribute("product") ProductModel productModel,
			BindingResult result) {
		String message = "";

		if (result.hasErrors()) {
			return new ModelAndView("admin/product/adOrEdit");
		}
		UUID uuid = UUID.randomUUID();
		String uuservice = uuid.toString();
		ProductsEntity entity = new ProductsEntity();

		// Copy data from model to entity
		BeanUtils.copyProperties(productModel, entity);
		
		entity.setProductId(uuservice);
		
		// process category
		CategoryEntity categoryEntity = new  CategoryEntity();
		categoryEntity.setCategoryId(productModel.getCategoryId());
		entity.setCategory(categoryEntity);

		productService.save(entity);

		if (productModel.getIsEdit() == true) {
			message = "product is update";
		} else {
			message = "product is save";
		}
		model.addAttribute("message", message);

		return new ModelAndView("forward:/admin/product/", model);

	}

	@PostMapping("/edit/{productId}")
	public ModelAndView edit(ModelMap model, @PathVariable("productId") String productId) {
		Optional<ProductsEntity> opt = productService.findById(productId);
		ProductModel productModel = new ProductModel();
		if (opt.isPresent()) {
			ProductsEntity entity = opt.get();
			// Copy data from model to entity
			BeanUtils.copyProperties(entity, opt);
			productModel.setIsEdit(true);
			model.addAttribute("product", productModel);
			return new ModelAndView("amdin/product/addOrEdit", model);
		} else {
			model.addAttribute("message", "product is not exist.");
			return new ModelAndView("foward:/admin/product", model);
		}

	}

	@GetMapping("/delete/{categoryId}")
	public ModelAndView delete(ModelMap model, @PathVariable("productId") String productId) {
		productService.deleteById(productId);
		model.addAttribute("message", "product deleted");
		return new ModelAndView("redirect:/admin/product", model);
	}

	@GetMapping("/search")
	public String search(ModelMap modelMap, @RequestParam(name = "name", required = false) String name) {
		
		List<ProductsEntity> list = null;
		if(StringUtils.hasText(name)) {
			list = productService.findByCategoryNameContainining(name);
		}else {
			list = productService.findAll();
		}
		modelMap.addAttribute("product", list);
		return "/admin/product/search";

	}
	
	@GetMapping("/searchPagenated")
	public String search(ModelMap modelMap
			,@RequestParam(name = "name",required = false) String name
			,@RequestParam("page") Optional<Integer> page
			,@RequestParam("size") Optional<Integer> size) {
		int count = (int) productService.count();
		int currentPage = page.orElse(1);
		int pageSize = size.orElse(3);
		
		Pageable pageable = PageRequest.of(currentPage -1, pageSize, Sort.by("productId"));
		
		Page<ProductsEntity> resultPage = null;
		
		if(StringUtils.hasText(name)) {
			resultPage = productService.findByCategoryNameContainining(name, pageable);
			modelMap.addAttribute("name", name);
		}else {
			resultPage = productService.findAll(pageable);
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
		modelMap.addAttribute("product", resultPage);
		
		return "/admin/product/searchpagenated";
	}

}

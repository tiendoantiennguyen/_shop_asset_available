package com.springbootproject.example.service.admin.product.productImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.admin.product.AdminCategoryEntity;
import com.springbootproject.example.repository.admin.product.AdminCategoryRepository;
import com.springbootproject.example.service.admin.product.IAdminCategoryService;

@Service
public class AdminCategoryService implements IAdminCategoryService {

	@Autowired
	private AdminCategoryRepository categoryRepository;

	public AdminCategoryService() {

	}

	public AdminCategoryService(AdminCategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public <S extends AdminCategoryEntity> S save(S entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public <S extends AdminCategoryEntity> List<S> saveAll(Iterable<S> entities) {
		return categoryRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminCategoryEntity> Optional<S> findOne(Example<S> example) {
		return categoryRepository.findOne(example);
	}

	@Override
	public List<AdminCategoryEntity> findAll(Sort sort) {
		return categoryRepository.findAll(sort);
	}

	@Override
	public void flush() {
		categoryRepository.flush();
	}

	@Override
	public Page<AdminCategoryEntity> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminCategoryEntity> S saveAndFlush(S entity) {
		return categoryRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminCategoryEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return categoryRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminCategoryEntity> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public List<AdminCategoryEntity> findAllById(Iterable<Long> ids) {
		return categoryRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminCategoryEntity> entities) {
		categoryRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<AdminCategoryEntity> findById(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminCategoryEntity> entities) {
		categoryRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Long id) {
		return categoryRepository.existsById(id);
	}

	@Override
	public <S extends AdminCategoryEntity> long count(Example<S> example) {
		return categoryRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		categoryRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminCategoryEntity> boolean exists(Example<S> example) {
		return categoryRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		categoryRepository.deleteAllInBatch();
	}

	@Override
	public AdminCategoryEntity getOne(Long id) {
		return categoryRepository.getOne(id);
	}

	@Override
	public <S extends AdminCategoryEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return categoryRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public AdminCategoryEntity getById(Long id) {
		return categoryRepository.getById(id);
	}

	@Override
	public void delete(AdminCategoryEntity entity) {
		categoryRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		categoryRepository.deleteAllById(ids);
	}

	@Override
	public AdminCategoryEntity getReferenceById(Long id) {
		return categoryRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminCategoryEntity> entities) {
		categoryRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminCategoryEntity> List<S> findAll(Example<S> example) {
		return categoryRepository.findAll(example);
	}

	@Override
	public void deleteAll() {
		categoryRepository.deleteAll();
	}

	@Override
	public List<AdminCategoryEntity> findByCategoryNameContainining(String name) {

		return categoryRepository.findByCategoryNameContaining(name);
	}

	@Override
	public Page<AdminCategoryEntity> findByCategoryNameContainining(String name, Pageable pageable) {

		return categoryRepository.findByCategoryNameContaining(name, pageable);
	}

}

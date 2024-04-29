package com.springbootproject.example.service.web.product.productImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.product.CategoryEntity;
import com.springbootproject.example.repository.web.product.CategoryRepository;
import com.springbootproject.example.service.web.product.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryService () {
		
	}

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public <S extends CategoryEntity> S save(S entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public <S extends CategoryEntity> List<S> saveAll(Iterable<S> entities) {
		return categoryRepository.saveAll(entities);
	}

	@Override
	public <S extends CategoryEntity> Optional<S> findOne(Example<S> example) {
		return categoryRepository.findOne(example);
	}

	@Override
	public List<CategoryEntity> findAll(Sort sort) {
		return categoryRepository.findAll(sort);
	}

	@Override
	public void flush() {
		categoryRepository.flush();
	}

	@Override
	public Page<CategoryEntity> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public <S extends CategoryEntity> S saveAndFlush(S entity) {
		return categoryRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends CategoryEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return categoryRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<CategoryEntity> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public List<CategoryEntity> findAllById(Iterable<String> ids) {
		return categoryRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<CategoryEntity> entities) {
		categoryRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends CategoryEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return categoryRepository.findAll(example, pageable);
	}

	@Override
	public Optional<CategoryEntity> findById(String id) {
		return categoryRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<CategoryEntity> entities) {
		categoryRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return categoryRepository.existsById(id);
	}

	@Override
	public <S extends CategoryEntity> long count(Example<S> example) {
		return categoryRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		categoryRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends CategoryEntity> boolean exists(Example<S> example) {
		return categoryRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		categoryRepository.deleteAllInBatch();
	}

	@Override
	public CategoryEntity getOne(String id) {
		return categoryRepository.getOne(id);
	}

	@Override
	public <S extends CategoryEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return categoryRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void deleteById(String id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public CategoryEntity getById(String id) {
		return categoryRepository.getById(id);
	}

	@Override
	public void delete(CategoryEntity entity) {
		categoryRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		categoryRepository.deleteAllById(ids);
	}

	@Override
	public CategoryEntity getReferenceById(String id) {
		return categoryRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends CategoryEntity> entities) {
		categoryRepository.deleteAll(entities);
	}

	@Override
	public <S extends CategoryEntity> List<S> findAll(Example<S> example) {
		return categoryRepository.findAll(example);
	}

	@Override
	public <S extends CategoryEntity> List<S> findAll(Example<S> example, Sort sort) {
		return categoryRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		categoryRepository.deleteAll();
	}
	
	

}

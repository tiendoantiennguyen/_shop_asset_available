package com.springbootproject.example.service.admin.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.product.AdminCategoryEntity;

public interface IAdminCategoryService {

	void deleteAll();

	<S extends AdminCategoryEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminCategoryEntity> entities);

	AdminCategoryEntity getReferenceById(Long id);

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(AdminCategoryEntity entity);

	AdminCategoryEntity getById(Long id);

	void deleteById(Long id);

	long count();

	<S extends AdminCategoryEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminCategoryEntity getOne(Long id);

	void deleteAllInBatch();

	<S extends AdminCategoryEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	<S extends AdminCategoryEntity> long count(Example<S> example);

	boolean existsById(Long id);

	void deleteAllInBatch(Iterable<AdminCategoryEntity> entities);

	Optional<AdminCategoryEntity> findById(Long id);

	void deleteInBatch(Iterable<AdminCategoryEntity> entities);

	List<AdminCategoryEntity> findAllById(Iterable<Long> ids);

	List<AdminCategoryEntity> findAll();

	<S extends AdminCategoryEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminCategoryEntity> S saveAndFlush(S entity);

	Page<AdminCategoryEntity> findAll(Pageable pageable);

	void flush();

	List<AdminCategoryEntity> findAll(Sort sort);

	<S extends AdminCategoryEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminCategoryEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminCategoryEntity> S save(S entity);
	
	// function to search data for all category
	List<AdminCategoryEntity> findByCategoryNameContainining(String name);
	
	// function to search data for all category and pageable
	Page<AdminCategoryEntity> findByCategoryNameContainining(String name,Pageable pageable);

}

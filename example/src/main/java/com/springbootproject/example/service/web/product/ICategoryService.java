package com.springbootproject.example.service.web.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.product.CategoryEntity;

public interface ICategoryService {

	void deleteAll();

	<S extends CategoryEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends CategoryEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends CategoryEntity> entities);

	CategoryEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(CategoryEntity entity);

	CategoryEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends CategoryEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	CategoryEntity getOne(String id);

	void deleteAllInBatch();

	<S extends CategoryEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends CategoryEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<CategoryEntity> entities);

	Optional<CategoryEntity> findById(String id);

	<S extends CategoryEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<CategoryEntity> entities);

	List<CategoryEntity> findAllById(Iterable<String> ids);

	List<CategoryEntity> findAll();

	<S extends CategoryEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends CategoryEntity> S saveAndFlush(S entity);

	Page<CategoryEntity> findAll(Pageable pageable);

	void flush();

	List<CategoryEntity> findAll(Sort sort);

	<S extends CategoryEntity> Optional<S> findOne(Example<S> example);

	<S extends CategoryEntity> List<S> saveAll(Iterable<S> entities);

	<S extends CategoryEntity> S save(S entity);

}

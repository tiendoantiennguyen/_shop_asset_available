package com.springbootproject.example.service.admin.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.product.AdminProductsEntity;

public interface IAdminProductService {

	void deleteAll();

	<S extends AdminProductsEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminProductsEntity> entities);

	AdminProductsEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(AdminProductsEntity entity);

	AdminProductsEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends AdminProductsEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminProductsEntity getOne(String id);

	void deleteAllInBatch();

	<S extends AdminProductsEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends AdminProductsEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<AdminProductsEntity> entities);

	Optional<AdminProductsEntity> findById(String id);

	void deleteInBatch(Iterable<AdminProductsEntity> entities);

	List<AdminProductsEntity> findAllById(Iterable<String> ids);

	List<AdminProductsEntity> findAll();

	<S extends AdminProductsEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminProductsEntity> S saveAndFlush(S entity);

	void flush();

	<S extends AdminProductsEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminProductsEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminProductsEntity> S save(S entity);
	
	List<AdminProductsEntity> findByProductNameContaining(String name);

	Page<AdminProductsEntity> findByProductNameContaining(String name, Pageable pageable);

	Page<AdminProductsEntity> findAll(Pageable pageable);

	List<AdminProductsEntity> findAll(Sort sort);

}

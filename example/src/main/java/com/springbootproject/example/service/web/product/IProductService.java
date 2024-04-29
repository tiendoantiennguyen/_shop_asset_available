package com.springbootproject.example.service.web.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.product.ProductsEntity;

public interface IProductService {

	void deleteAll();

	<S extends ProductsEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends ProductsEntity> entities);

	ProductsEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(ProductsEntity entity);

	ProductsEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends ProductsEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	ProductsEntity getOne(String id);

	void deleteAllInBatch();

	<S extends ProductsEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends ProductsEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<ProductsEntity> entities);

	Optional<ProductsEntity> findById(String id);

	void deleteInBatch(Iterable<ProductsEntity> entities);

	List<ProductsEntity> findAllById(Iterable<String> ids);

	List<ProductsEntity> findAll();

	<S extends ProductsEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends ProductsEntity> S saveAndFlush(S entity);

	void flush();

	<S extends ProductsEntity> Optional<S> findOne(Example<S> example);

	<S extends ProductsEntity> List<S> saveAll(Iterable<S> entities);

	<S extends ProductsEntity> S save(S entity);

}

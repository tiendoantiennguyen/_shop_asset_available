package com.springbootproject.example.service.web.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.product.OrderEntity;

public interface IOrderService {

	void deleteAll();

	<S extends OrderEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends OrderEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends OrderEntity> entities);

	OrderEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(OrderEntity entity);

	OrderEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends OrderEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	OrderEntity getOne(String id);

	void deleteAllInBatch();

	<S extends OrderEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends OrderEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<OrderEntity> entities);

	Optional<OrderEntity> findById(String id);

	void deleteInBatch(Iterable<OrderEntity> entities);

	List<OrderEntity> findAllById(Iterable<String> ids);

	List<OrderEntity> findAll();

	<S extends OrderEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends OrderEntity> S saveAndFlush(S entity);

	void flush();

	List<OrderEntity> findAll(Sort sort);

	<S extends OrderEntity> Optional<S> findOne(Example<S> example);

	<S extends OrderEntity> List<S> saveAll(Iterable<S> entities);

	<S extends OrderEntity> S save(S entity);

}

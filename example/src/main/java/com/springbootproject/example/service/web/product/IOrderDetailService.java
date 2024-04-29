package com.springbootproject.example.service.web.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.product.OrderDetailEntity;

public interface IOrderDetailService {

	void deleteAll();

	<S extends OrderDetailEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends OrderDetailEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends OrderDetailEntity> entities);

	OrderDetailEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(OrderDetailEntity entity);

	OrderDetailEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends OrderDetailEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	OrderDetailEntity getOne(String id);

	void deleteAllInBatch();

	<S extends OrderDetailEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends OrderDetailEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<OrderDetailEntity> entities);

	Optional<OrderDetailEntity> findById(String id);

	void deleteInBatch(Iterable<OrderDetailEntity> entities);

	List<OrderDetailEntity> findAllById(Iterable<String> ids);

	List<OrderDetailEntity> findAll();

	<S extends OrderDetailEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends OrderDetailEntity> S saveAndFlush(S entity);

	void flush();

	List<OrderDetailEntity> findAll(Sort sort);

	<S extends OrderDetailEntity> Optional<S> findOne(Example<S> example);

	<S extends OrderDetailEntity> List<S> saveAll(Iterable<S> entities);

	<S extends OrderDetailEntity> S save(S entity);

}

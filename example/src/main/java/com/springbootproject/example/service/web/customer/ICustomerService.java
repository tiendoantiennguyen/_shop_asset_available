package com.springbootproject.example.service.web.customer;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.customer.CustomerEntity;

public interface ICustomerService {

	void deleteAll();

	<S extends CustomerEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends CustomerEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends CustomerEntity> entities);

	CustomerEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(CustomerEntity entity);

	CustomerEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends CustomerEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	CustomerEntity getOne(String id);

	void deleteAllInBatch();

	<S extends CustomerEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends CustomerEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<CustomerEntity> entities);

	Optional<CustomerEntity> findById(String id);

	void deleteInBatch(Iterable<CustomerEntity> entities);

	List<CustomerEntity> findAllById(Iterable<String> ids);

	List<CustomerEntity> findAll();

	<S extends CustomerEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends CustomerEntity> S saveAndFlush(S entity);

	void flush();

	List<CustomerEntity> findAll(Sort sort);

	<S extends CustomerEntity> Optional<S> findOne(Example<S> example);

	<S extends CustomerEntity> List<S> saveAll(Iterable<S> entities);

	<S extends CustomerEntity> S save(S entity);

}

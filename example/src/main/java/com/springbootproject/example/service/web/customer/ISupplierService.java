package com.springbootproject.example.service.web.customer;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.customer.SuppliersEntity;

public interface ISupplierService {

	void deleteAll();

	<S extends SuppliersEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends SuppliersEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends SuppliersEntity> entities);

	SuppliersEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(SuppliersEntity entity);

	SuppliersEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends SuppliersEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	SuppliersEntity getOne(String id);

	void deleteAllInBatch();

	<S extends SuppliersEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends SuppliersEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<SuppliersEntity> entities);

	Optional<SuppliersEntity> findById(String id);

	void deleteInBatch(Iterable<SuppliersEntity> entities);

	List<SuppliersEntity> findAllById(Iterable<String> ids);

	List<SuppliersEntity> findAll();

	<S extends SuppliersEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends SuppliersEntity> S saveAndFlush(S entity);

	Page<SuppliersEntity> findAll(Pageable pageable);

	void flush();

	List<SuppliersEntity> findAll(Sort sort);

	<S extends SuppliersEntity> Optional<S> findOne(Example<S> example);

	<S extends SuppliersEntity> List<S> saveAll(Iterable<S> entities);

	<S extends SuppliersEntity> S save(S entity);

}

package com.springbootproject.example.service.admin.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.product.AdminOrderEntity;

public interface IAdminOrderDetailService {

	void deleteAll();

	<S extends AdminOrderEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends AdminOrderEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminOrderEntity> entities);

	AdminOrderEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(AdminOrderEntity entity);

	AdminOrderEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends AdminOrderEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminOrderEntity getOne(String id);

	void deleteAllInBatch();

	<S extends AdminOrderEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends AdminOrderEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<AdminOrderEntity> entities);

	Optional<AdminOrderEntity> findById(String id);

	<S extends AdminOrderEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<AdminOrderEntity> entities);

	List<AdminOrderEntity> findAllById(Iterable<String> ids);

	List<AdminOrderEntity> findAll();

	<S extends AdminOrderEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminOrderEntity> S saveAndFlush(S entity);

	Page<AdminOrderEntity> findAll(Pageable pageable);

	void flush();

	List<AdminOrderEntity> findAll(Sort sort);

	<S extends AdminOrderEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminOrderEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminOrderEntity> S save(S entity);


}

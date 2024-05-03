package com.springbootproject.example.service.admin.customer;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.customer.AdminSuppliersEntity;

public interface IAdminSupplierService {

	void deleteAll();

	<S extends AdminSuppliersEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends AdminSuppliersEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminSuppliersEntity> entities);

	AdminSuppliersEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(AdminSuppliersEntity entity);

	AdminSuppliersEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends AdminSuppliersEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminSuppliersEntity getOne(String id);

	void deleteAllInBatch();

	<S extends AdminSuppliersEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends AdminSuppliersEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<AdminSuppliersEntity> entities);

	Optional<AdminSuppliersEntity> findById(String id);

	<S extends AdminSuppliersEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<AdminSuppliersEntity> entities);

	List<AdminSuppliersEntity> findAllById(Iterable<String> ids);

	List<AdminSuppliersEntity> findAll();

	<S extends AdminSuppliersEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminSuppliersEntity> S saveAndFlush(S entity);

	Page<AdminSuppliersEntity> findAll(Pageable pageable);

	void flush();

	List<AdminSuppliersEntity> findAll(Sort sort);

	<S extends AdminSuppliersEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminSuppliersEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminSuppliersEntity> S save(S entity);

}

package com.springbootproject.example.service.admin.customer;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.customer.AdminCustomerEntity;

public interface IAdminCustomerService {

	void deleteAll();

	<S extends AdminCustomerEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends AdminCustomerEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminCustomerEntity> entities);

	AdminCustomerEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(AdminCustomerEntity entity);

	AdminCustomerEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends AdminCustomerEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminCustomerEntity getOne(String id);

	void deleteAllInBatch();

	<S extends AdminCustomerEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends AdminCustomerEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<AdminCustomerEntity> entities);

	Optional<AdminCustomerEntity> findById(String id);

	<S extends AdminCustomerEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<AdminCustomerEntity> entities);

	List<AdminCustomerEntity> findAllById(Iterable<String> ids);

	List<AdminCustomerEntity> findAll();

	<S extends AdminCustomerEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminCustomerEntity> S saveAndFlush(S entity);

	Page<AdminCustomerEntity> findAll(Pageable pageable);

	void flush();

	List<AdminCustomerEntity> findAll(Sort sort);

	<S extends AdminCustomerEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminCustomerEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminCustomerEntity> S save(S entity);


}

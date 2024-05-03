package com.springbootproject.example.service.admin.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.product.AdminPaymentEntity;

public interface IAdminPaymentService {

	void deleteAll();

	<S extends AdminPaymentEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends AdminPaymentEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminPaymentEntity> entities);

	AdminPaymentEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(AdminPaymentEntity entity);

	AdminPaymentEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends AdminPaymentEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminPaymentEntity getOne(String id);

	void deleteAllInBatch();

	<S extends AdminPaymentEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends AdminPaymentEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<AdminPaymentEntity> entities);

	Optional<AdminPaymentEntity> findById(String id);

	<S extends AdminPaymentEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<AdminPaymentEntity> entities);

	List<AdminPaymentEntity> findAllById(Iterable<String> ids);

	List<AdminPaymentEntity> findAll();

	<S extends AdminPaymentEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminPaymentEntity> S saveAndFlush(S entity);

	Page<AdminPaymentEntity> findAll(Pageable pageable);

	void flush();

	List<AdminPaymentEntity> findAll(Sort sort);

	<S extends AdminPaymentEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminPaymentEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminPaymentEntity> S save(S entity);

	

}

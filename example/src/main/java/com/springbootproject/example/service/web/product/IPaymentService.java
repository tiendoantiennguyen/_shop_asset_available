package com.springbootproject.example.service.web.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.web.product.PaymentEntity;

public interface IPaymentService {

	void deleteAll();

	<S extends PaymentEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends PaymentEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends PaymentEntity> entities);

	PaymentEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(PaymentEntity entity);

	PaymentEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends PaymentEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	PaymentEntity getOne(String id);

	void deleteAllInBatch();

	<S extends PaymentEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends PaymentEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<PaymentEntity> entities);

	Optional<PaymentEntity> findById(String id);

	void deleteInBatch(Iterable<PaymentEntity> entities);

	List<PaymentEntity> findAllById(Iterable<String> ids);

	List<PaymentEntity> findAll();

	<S extends PaymentEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends PaymentEntity> S saveAndFlush(S entity);

	void flush();

	List<PaymentEntity> findAll(Sort sort);

	<S extends PaymentEntity> Optional<S> findOne(Example<S> example);

	<S extends PaymentEntity> List<S> saveAll(Iterable<S> entities);

	<S extends PaymentEntity> S save(S entity);

}

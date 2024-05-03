package com.springbootproject.example.service.admin.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootproject.example.entity.admin.product.AdminShipperEntity;

public interface IAdminShipperService {

	void deleteAll();

	<S extends AdminShipperEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends AdminShipperEntity> List<S> findAll(Example<S> example);

	void deleteAll(Iterable<? extends AdminShipperEntity> entities);

	AdminShipperEntity getReferenceById(String id);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(AdminShipperEntity entity);

	AdminShipperEntity getById(String id);

	void deleteById(String id);

	long count();

	<S extends AdminShipperEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	AdminShipperEntity getOne(String id);

	void deleteAllInBatch();

	<S extends AdminShipperEntity> boolean exists(Example<S> example);

	void deleteAllByIdInBatch(Iterable<String> ids);

	<S extends AdminShipperEntity> long count(Example<S> example);

	boolean existsById(String id);

	void deleteAllInBatch(Iterable<AdminShipperEntity> entities);

	Optional<AdminShipperEntity> findById(String id);

	<S extends AdminShipperEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<AdminShipperEntity> entities);

	List<AdminShipperEntity> findAllById(Iterable<String> ids);

	List<AdminShipperEntity> findAll();

	<S extends AdminShipperEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends AdminShipperEntity> S saveAndFlush(S entity);

	Page<AdminShipperEntity> findAll(Pageable pageable);

	void flush();

	List<AdminShipperEntity> findAll(Sort sort);

	<S extends AdminShipperEntity> Optional<S> findOne(Example<S> example);

	<S extends AdminShipperEntity> List<S> saveAll(Iterable<S> entities);

	<S extends AdminShipperEntity> S save(S entity);

	

}

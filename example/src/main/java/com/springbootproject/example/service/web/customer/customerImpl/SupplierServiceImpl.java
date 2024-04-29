package com.springbootproject.example.service.web.customer.customerImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.customer.SuppliersEntity;
import com.springbootproject.example.repository.web.customer.SupplierRepository;
import com.springbootproject.example.service.web.customer.ISupplierService;

@Service
public class SupplierServiceImpl implements ISupplierService {

	private SupplierRepository supplierRepository;

	public SupplierServiceImpl(SupplierRepository supplierRepository) {
		this.supplierRepository = supplierRepository;
	}

	@Override
	public <S extends SuppliersEntity> S save(S entity) {
		return supplierRepository.save(entity);
	}

	@Override
	public <S extends SuppliersEntity> List<S> saveAll(Iterable<S> entities) {
		return supplierRepository.saveAll(entities);
	}

	@Override
	public <S extends SuppliersEntity> Optional<S> findOne(Example<S> example) {
		return supplierRepository.findOne(example);
	}

	@Override
	public List<SuppliersEntity> findAll(Sort sort) {
		return supplierRepository.findAll(sort);
	}

	@Override
	public void flush() {
		supplierRepository.flush();
	}

	@Override
	public Page<SuppliersEntity> findAll(Pageable pageable) {
		return supplierRepository.findAll(pageable);
	}

	@Override
	public <S extends SuppliersEntity> S saveAndFlush(S entity) {
		return supplierRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends SuppliersEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return supplierRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<SuppliersEntity> findAll() {
		return supplierRepository.findAll();
	}

	@Override
	public List<SuppliersEntity> findAllById(Iterable<String> ids) {
		return supplierRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<SuppliersEntity> entities) {
		supplierRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<SuppliersEntity> findById(String id) {
		return supplierRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<SuppliersEntity> entities) {
		supplierRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return supplierRepository.existsById(id);
	}

	@Override
	public <S extends SuppliersEntity> long count(Example<S> example) {
		return supplierRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		supplierRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends SuppliersEntity> boolean exists(Example<S> example) {
		return supplierRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		supplierRepository.deleteAllInBatch();
	}

	@Override
	public SuppliersEntity getOne(String id) {
		return supplierRepository.getOne(id);
	}

	@Override
	public <S extends SuppliersEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return supplierRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return supplierRepository.count();
	}

	@Override
	public void deleteById(String id) {
		supplierRepository.deleteById(id);
	}

	@Override
	public SuppliersEntity getById(String id) {
		return supplierRepository.getById(id);
	}

	@Override
	public void delete(SuppliersEntity entity) {
		supplierRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		supplierRepository.deleteAllById(ids);
	}

	@Override
	public SuppliersEntity getReferenceById(String id) {
		return supplierRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends SuppliersEntity> entities) {
		supplierRepository.deleteAll(entities);
	}

	@Override
	public <S extends SuppliersEntity> List<S> findAll(Example<S> example) {
		return supplierRepository.findAll(example);
	}

	@Override
	public <S extends SuppliersEntity> List<S> findAll(Example<S> example, Sort sort) {
		return supplierRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		supplierRepository.deleteAll();
	}

}

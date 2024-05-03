package com.springbootproject.example.service.admin.customer.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.admin.customer.AdminSuppliersEntity;
import com.springbootproject.example.entity.web.customer.SuppliersEntity;
import com.springbootproject.example.repository.admin.customer.AdminSupplierRepository;
import com.springbootproject.example.repository.web.customer.SupplierRepository;
import com.springbootproject.example.service.admin.customer.IAdminSupplierService;
import com.springbootproject.example.service.web.customer.ISupplierService;

@Service
public class AdminSupplierServiceImpl implements IAdminSupplierService {

	@Autowired
	private AdminSupplierRepository adminSupplierRepository;

	public AdminSupplierServiceImpl(AdminSupplierRepository adminSupplierRepository) {
		this.adminSupplierRepository = adminSupplierRepository;
	}

	@Override
	public <S extends AdminSuppliersEntity> S save(S entity) {
		return adminSupplierRepository.save(entity);
	}

	@Override
	public <S extends AdminSuppliersEntity> List<S> saveAll(Iterable<S> entities) {
		return adminSupplierRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminSuppliersEntity> Optional<S> findOne(Example<S> example) {
		return adminSupplierRepository.findOne(example);
	}

	@Override
	public List<AdminSuppliersEntity> findAll(Sort sort) {
		return adminSupplierRepository.findAll(sort);
	}

	@Override
	public void flush() {
		adminSupplierRepository.flush();
	}

	@Override
	public Page<AdminSuppliersEntity> findAll(Pageable pageable) {
		return adminSupplierRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminSuppliersEntity> S saveAndFlush(S entity) {
		return adminSupplierRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminSuppliersEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return adminSupplierRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminSuppliersEntity> findAll() {
		return adminSupplierRepository.findAll();
	}

	@Override
	public List<AdminSuppliersEntity> findAllById(Iterable<String> ids) {
		return adminSupplierRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminSuppliersEntity> entities) {
		adminSupplierRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends AdminSuppliersEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return adminSupplierRepository.findAll(example, pageable);
	}

	@Override
	public Optional<AdminSuppliersEntity> findById(String id) {
		return adminSupplierRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminSuppliersEntity> entities) {
		adminSupplierRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return adminSupplierRepository.existsById(id);
	}

	@Override
	public <S extends AdminSuppliersEntity> long count(Example<S> example) {
		return adminSupplierRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		adminSupplierRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminSuppliersEntity> boolean exists(Example<S> example) {
		return adminSupplierRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		adminSupplierRepository.deleteAllInBatch();
	}

	@Override
	public AdminSuppliersEntity getOne(String id) {
		return adminSupplierRepository.getOne(id);
	}

	@Override
	public <S extends AdminSuppliersEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return adminSupplierRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return adminSupplierRepository.count();
	}

	@Override
	public void deleteById(String id) {
		adminSupplierRepository.deleteById(id);
	}

	@Override
	public AdminSuppliersEntity getById(String id) {
		return adminSupplierRepository.getById(id);
	}

	@Override
	public void delete(AdminSuppliersEntity entity) {
		adminSupplierRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		adminSupplierRepository.deleteAllById(ids);
	}

	@Override
	public AdminSuppliersEntity getReferenceById(String id) {
		return adminSupplierRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminSuppliersEntity> entities) {
		adminSupplierRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminSuppliersEntity> List<S> findAll(Example<S> example) {
		return adminSupplierRepository.findAll(example);
	}

	@Override
	public <S extends AdminSuppliersEntity> List<S> findAll(Example<S> example, Sort sort) {
		return adminSupplierRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		adminSupplierRepository.deleteAll();
	}

}

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

import com.springbootproject.example.entity.admin.customer.AdminCustomerEntity;
import com.springbootproject.example.repository.admin.customer.AdminCustomerRepository;
import com.springbootproject.example.service.admin.customer.IAdminCustomerService;

@Service
public class AdminCustomerServiceImpl implements IAdminCustomerService {
	
	@Autowired
	private AdminCustomerRepository adminCustomerRepository;

	public AdminCustomerServiceImpl(AdminCustomerRepository adminCustomerRepository) {
		this.adminCustomerRepository = adminCustomerRepository;
	}

	@Override
	public <S extends AdminCustomerEntity> S save(S entity) {
		return adminCustomerRepository.save(entity);
	}

	@Override
	public <S extends AdminCustomerEntity> List<S> saveAll(Iterable<S> entities) {
		return adminCustomerRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminCustomerEntity> Optional<S> findOne(Example<S> example) {
		return adminCustomerRepository.findOne(example);
	}

	@Override
	public List<AdminCustomerEntity> findAll(Sort sort) {
		return adminCustomerRepository.findAll(sort);
	}

	@Override
	public void flush() {
		adminCustomerRepository.flush();
	}

	@Override
	public Page<AdminCustomerEntity> findAll(Pageable pageable) {
		return adminCustomerRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminCustomerEntity> S saveAndFlush(S entity) {
		return adminCustomerRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminCustomerEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return adminCustomerRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminCustomerEntity> findAll() {
		return adminCustomerRepository.findAll();
	}

	@Override
	public List<AdminCustomerEntity> findAllById(Iterable<String> ids) {
		return adminCustomerRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminCustomerEntity> entities) {
		adminCustomerRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends AdminCustomerEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return adminCustomerRepository.findAll(example, pageable);
	}

	@Override
	public Optional<AdminCustomerEntity> findById(String id) {
		return adminCustomerRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminCustomerEntity> entities) {
		adminCustomerRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return adminCustomerRepository.existsById(id);
	}

	@Override
	public <S extends AdminCustomerEntity> long count(Example<S> example) {
		return adminCustomerRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		adminCustomerRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminCustomerEntity> boolean exists(Example<S> example) {
		return adminCustomerRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		adminCustomerRepository.deleteAllInBatch();
	}

	@Override
	public AdminCustomerEntity getOne(String id) {
		return adminCustomerRepository.getOne(id);
	}

	@Override
	public <S extends AdminCustomerEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return adminCustomerRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return adminCustomerRepository.count();
	}

	@Override
	public void deleteById(String id) {
		adminCustomerRepository.deleteById(id);
	}

	@Override
	public AdminCustomerEntity getById(String id) {
		return adminCustomerRepository.getById(id);
	}

	@Override
	public void delete(AdminCustomerEntity entity) {
		adminCustomerRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		adminCustomerRepository.deleteAllById(ids);
	}

	@Override
	public AdminCustomerEntity getReferenceById(String id) {
		return adminCustomerRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminCustomerEntity> entities) {
		adminCustomerRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminCustomerEntity> List<S> findAll(Example<S> example) {
		return adminCustomerRepository.findAll(example);
	}

	@Override
	public <S extends AdminCustomerEntity> List<S> findAll(Example<S> example, Sort sort) {
		return adminCustomerRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		adminCustomerRepository.deleteAll();
	}
	
	
	

}

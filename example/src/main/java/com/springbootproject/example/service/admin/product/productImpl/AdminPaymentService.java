package com.springbootproject.example.service.admin.product.productImpl;

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

import com.springbootproject.example.entity.admin.product.AdminPaymentEntity;
import com.springbootproject.example.repository.admin.product.AdminPaymentRepository;
import com.springbootproject.example.service.admin.product.IAdminPaymentService;

@Service
public class AdminPaymentService implements IAdminPaymentService {
	
	@Autowired
	private AdminPaymentRepository adminPaymentRepository;

	public AdminPaymentService(AdminPaymentRepository adminPaymentRepository) {
		this.adminPaymentRepository = adminPaymentRepository;
	}

	@Override
	public <S extends AdminPaymentEntity> S save(S entity) {
		return adminPaymentRepository.save(entity);
	}

	@Override
	public <S extends AdminPaymentEntity> List<S> saveAll(Iterable<S> entities) {
		return adminPaymentRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminPaymentEntity> Optional<S> findOne(Example<S> example) {
		return adminPaymentRepository.findOne(example);
	}

	@Override
	public List<AdminPaymentEntity> findAll(Sort sort) {
		return adminPaymentRepository.findAll(sort);
	}

	@Override
	public void flush() {
		adminPaymentRepository.flush();
	}

	@Override
	public Page<AdminPaymentEntity> findAll(Pageable pageable) {
		return adminPaymentRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminPaymentEntity> S saveAndFlush(S entity) {
		return adminPaymentRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminPaymentEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return adminPaymentRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminPaymentEntity> findAll() {
		return adminPaymentRepository.findAll();
	}

	@Override
	public List<AdminPaymentEntity> findAllById(Iterable<String> ids) {
		return adminPaymentRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminPaymentEntity> entities) {
		adminPaymentRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends AdminPaymentEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return adminPaymentRepository.findAll(example, pageable);
	}

	@Override
	public Optional<AdminPaymentEntity> findById(String id) {
		return adminPaymentRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminPaymentEntity> entities) {
		adminPaymentRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return adminPaymentRepository.existsById(id);
	}

	@Override
	public <S extends AdminPaymentEntity> long count(Example<S> example) {
		return adminPaymentRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		adminPaymentRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminPaymentEntity> boolean exists(Example<S> example) {
		return adminPaymentRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		adminPaymentRepository.deleteAllInBatch();
	}

	@Override
	public AdminPaymentEntity getOne(String id) {
		return adminPaymentRepository.getOne(id);
	}

	@Override
	public <S extends AdminPaymentEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return adminPaymentRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return adminPaymentRepository.count();
	}

	@Override
	public void deleteById(String id) {
		adminPaymentRepository.deleteById(id);
	}

	@Override
	public AdminPaymentEntity getById(String id) {
		return adminPaymentRepository.getById(id);
	}

	@Override
	public void delete(AdminPaymentEntity entity) {
		adminPaymentRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		adminPaymentRepository.deleteAllById(ids);
	}

	@Override
	public AdminPaymentEntity getReferenceById(String id) {
		return adminPaymentRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminPaymentEntity> entities) {
		adminPaymentRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminPaymentEntity> List<S> findAll(Example<S> example) {
		return adminPaymentRepository.findAll(example);
	}

	@Override
	public <S extends AdminPaymentEntity> List<S> findAll(Example<S> example, Sort sort) {
		return adminPaymentRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		adminPaymentRepository.deleteAll();
	}

}

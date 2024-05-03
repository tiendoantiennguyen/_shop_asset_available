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

import com.springbootproject.example.entity.admin.product.AdminOrderEntity;
import com.springbootproject.example.repository.admin.product.AdminOrderRepository;
import com.springbootproject.example.service.admin.product.IAdminOrderService;

@Service
public class AdminOrderService implements IAdminOrderService{
	
	@Autowired
	private AdminOrderRepository adminOrderRepository;

	public AdminOrderService(AdminOrderRepository adminOrderRepository) {
		this.adminOrderRepository = adminOrderRepository;
	}

	@Override
	public <S extends AdminOrderEntity> S save(S entity) {
		return adminOrderRepository.save(entity);
	}

	@Override
	public <S extends AdminOrderEntity> List<S> saveAll(Iterable<S> entities) {
		return adminOrderRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminOrderEntity> Optional<S> findOne(Example<S> example) {
		return adminOrderRepository.findOne(example);
	}

	@Override
	public List<AdminOrderEntity> findAll(Sort sort) {
		return adminOrderRepository.findAll(sort);
	}

	@Override
	public void flush() {
		adminOrderRepository.flush();
	}

	@Override
	public Page<AdminOrderEntity> findAll(Pageable pageable) {
		return adminOrderRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminOrderEntity> S saveAndFlush(S entity) {
		return adminOrderRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminOrderEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return adminOrderRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminOrderEntity> findAll() {
		return adminOrderRepository.findAll();
	}

	@Override
	public List<AdminOrderEntity> findAllById(Iterable<String> ids) {
		return adminOrderRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminOrderEntity> entities) {
		adminOrderRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends AdminOrderEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return adminOrderRepository.findAll(example, pageable);
	}

	@Override
	public Optional<AdminOrderEntity> findById(String id) {
		return adminOrderRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminOrderEntity> entities) {
		adminOrderRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return adminOrderRepository.existsById(id);
	}

	@Override
	public <S extends AdminOrderEntity> long count(Example<S> example) {
		return adminOrderRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		adminOrderRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminOrderEntity> boolean exists(Example<S> example) {
		return adminOrderRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		adminOrderRepository.deleteAllInBatch();
	}

	@Override
	public AdminOrderEntity getOne(String id) {
		return adminOrderRepository.getOne(id);
	}

	@Override
	public <S extends AdminOrderEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return adminOrderRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return adminOrderRepository.count();
	}

	@Override
	public void deleteById(String id) {
		adminOrderRepository.deleteById(id);
	}

	@Override
	public AdminOrderEntity getById(String id) {
		return adminOrderRepository.getById(id);
	}

	@Override
	public void delete(AdminOrderEntity entity) {
		adminOrderRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		adminOrderRepository.deleteAllById(ids);
	}

	@Override
	public AdminOrderEntity getReferenceById(String id) {
		return adminOrderRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminOrderEntity> entities) {
		adminOrderRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminOrderEntity> List<S> findAll(Example<S> example) {
		return adminOrderRepository.findAll(example);
	}

	@Override
	public <S extends AdminOrderEntity> List<S> findAll(Example<S> example, Sort sort) {
		return adminOrderRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		adminOrderRepository.deleteAll();
	}

	
}

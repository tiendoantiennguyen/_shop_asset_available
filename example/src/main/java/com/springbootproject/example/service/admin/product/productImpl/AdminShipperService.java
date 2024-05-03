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

import com.springbootproject.example.entity.admin.product.AdminShipperEntity;
import com.springbootproject.example.repository.admin.product.AdminShipperRepository;
import com.springbootproject.example.service.admin.product.IAdminShipperService;

@Service
public class AdminShipperService implements IAdminShipperService{
	
	@Autowired
	private AdminShipperRepository adminShipperRepository;

	public AdminShipperService(AdminShipperRepository adminShipperRepository) {
		this.adminShipperRepository = adminShipperRepository;
	}

	@Override
	public <S extends AdminShipperEntity> S save(S entity) {
		return adminShipperRepository.save(entity);
	}

	@Override
	public <S extends AdminShipperEntity> List<S> saveAll(Iterable<S> entities) {
		return adminShipperRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminShipperEntity> Optional<S> findOne(Example<S> example) {
		return adminShipperRepository.findOne(example);
	}

	@Override
	public List<AdminShipperEntity> findAll(Sort sort) {
		return adminShipperRepository.findAll(sort);
	}

	@Override
	public void flush() {
		adminShipperRepository.flush();
	}

	@Override
	public Page<AdminShipperEntity> findAll(Pageable pageable) {
		return adminShipperRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminShipperEntity> S saveAndFlush(S entity) {
		return adminShipperRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminShipperEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return adminShipperRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminShipperEntity> findAll() {
		return adminShipperRepository.findAll();
	}

	@Override
	public List<AdminShipperEntity> findAllById(Iterable<String> ids) {
		return adminShipperRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminShipperEntity> entities) {
		adminShipperRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends AdminShipperEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return adminShipperRepository.findAll(example, pageable);
	}

	@Override
	public Optional<AdminShipperEntity> findById(String id) {
		return adminShipperRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminShipperEntity> entities) {
		adminShipperRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return adminShipperRepository.existsById(id);
	}

	@Override
	public <S extends AdminShipperEntity> long count(Example<S> example) {
		return adminShipperRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		adminShipperRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminShipperEntity> boolean exists(Example<S> example) {
		return adminShipperRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		adminShipperRepository.deleteAllInBatch();
	}

	@Override
	public AdminShipperEntity getOne(String id) {
		return adminShipperRepository.getOne(id);
	}

	@Override
	public <S extends AdminShipperEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return adminShipperRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return adminShipperRepository.count();
	}

	@Override
	public void deleteById(String id) {
		adminShipperRepository.deleteById(id);
	}

	@Override
	public AdminShipperEntity getById(String id) {
		return adminShipperRepository.getById(id);
	}

	@Override
	public void delete(AdminShipperEntity entity) {
		adminShipperRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		adminShipperRepository.deleteAllById(ids);
	}

	@Override
	public AdminShipperEntity getReferenceById(String id) {
		return adminShipperRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminShipperEntity> entities) {
		adminShipperRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminShipperEntity> List<S> findAll(Example<S> example) {
		return adminShipperRepository.findAll(example);
	}

	@Override
	public <S extends AdminShipperEntity> List<S> findAll(Example<S> example, Sort sort) {
		return adminShipperRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		adminShipperRepository.deleteAll();
	}
	
	

}

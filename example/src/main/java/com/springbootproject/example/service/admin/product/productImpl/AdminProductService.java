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

import com.springbootproject.example.entity.admin.product.AdminProductsEntity;
import com.springbootproject.example.repository.admin.product.AdminProductRepository;
import com.springbootproject.example.service.admin.product.IAdminProductService;

@Service
public class AdminProductService implements IAdminProductService{
	
	@Autowired
	private AdminProductRepository productRepository;
	
	public AdminProductService () {
		
	}

	public AdminProductService(AdminProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public <S extends AdminProductsEntity> S save(S entity) {
		return productRepository.save(entity);
	}

	@Override
	public List<AdminProductsEntity> findAll(Sort sort) {
		return productRepository.findAll(sort);
	}

	@Override
	public Page<AdminProductsEntity> findAll(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

	@Override
	public <S extends AdminProductsEntity> List<S> saveAll(Iterable<S> entities) {
		return productRepository.saveAll(entities);
	}

	@Override
	public <S extends AdminProductsEntity> Optional<S> findOne(Example<S> example) {
		return productRepository.findOne(example);
	}

	@Override
	public void flush() {
		productRepository.flush();
	}

	@Override
	public <S extends AdminProductsEntity> S saveAndFlush(S entity) {
		return productRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends AdminProductsEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return productRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<AdminProductsEntity> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<AdminProductsEntity> findAllById(Iterable<String> ids) {
		return productRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<AdminProductsEntity> entities) {
		productRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<AdminProductsEntity> findById(String id) {
		return productRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<AdminProductsEntity> entities) {
		productRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return productRepository.existsById(id);
	}

	@Override
	public <S extends AdminProductsEntity> long count(Example<S> example) {
		return productRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		productRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends AdminProductsEntity> boolean exists(Example<S> example) {
		return productRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		productRepository.deleteAllInBatch();
	}

	@Override
	public AdminProductsEntity getOne(String id) {
		return productRepository.getOne(id);
	}

	@Override
	public <S extends AdminProductsEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return productRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return productRepository.count();
	}

	@Override
	public void deleteById(String id) {
		productRepository.deleteById(id);
	}

	@Override
	public AdminProductsEntity getById(String id) {
		return productRepository.getById(id);
	}

	@Override
	public void delete(AdminProductsEntity entity) {
		productRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		productRepository.deleteAllById(ids);
	}

	@Override
	public AdminProductsEntity getReferenceById(String id) {
		return productRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends AdminProductsEntity> entities) {
		productRepository.deleteAll(entities);
	}

	@Override
	public <S extends AdminProductsEntity> List<S> findAll(Example<S> example) {
		return productRepository.findAll(example);
	}

	@Override
	public void deleteAll() {
		productRepository.deleteAll();
	}

	@Override
	public List<AdminProductsEntity> findByProductNameContaining(String name) {
		
		return productRepository.findByProductNameContaining(name);
	}

	@Override
	public Page<AdminProductsEntity> findByProductNameContaining(String name, Pageable pageable) {
		
		return productRepository.findByProductNameContaining(name, pageable);
	}

}

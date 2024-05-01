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

import com.springbootproject.example.entity.admin.product.ProductsEntity;
import com.springbootproject.example.repository.admin.product.ProductRepository;
import com.springbootproject.example.service.admin.product.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductService () {
		
	}

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public <S extends ProductsEntity> S save(S entity) {
		return productRepository.save(entity);
	}

	@Override
	public List<ProductsEntity> findAll(Sort sort) {
		return productRepository.findAll(sort);
	}

	@Override
	public Page<ProductsEntity> findAll(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

	@Override
	public <S extends ProductsEntity> List<S> saveAll(Iterable<S> entities) {
		return productRepository.saveAll(entities);
	}

	@Override
	public <S extends ProductsEntity> Optional<S> findOne(Example<S> example) {
		return productRepository.findOne(example);
	}

	@Override
	public void flush() {
		productRepository.flush();
	}

	@Override
	public <S extends ProductsEntity> S saveAndFlush(S entity) {
		return productRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends ProductsEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return productRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<ProductsEntity> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<ProductsEntity> findAllById(Iterable<String> ids) {
		return productRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<ProductsEntity> entities) {
		productRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<ProductsEntity> findById(String id) {
		return productRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<ProductsEntity> entities) {
		productRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return productRepository.existsById(id);
	}

	@Override
	public <S extends ProductsEntity> long count(Example<S> example) {
		return productRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		productRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends ProductsEntity> boolean exists(Example<S> example) {
		return productRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		productRepository.deleteAllInBatch();
	}

	@Override
	public ProductsEntity getOne(String id) {
		return productRepository.getOne(id);
	}

	@Override
	public <S extends ProductsEntity, R> R findBy(Example<S> example,
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
	public ProductsEntity getById(String id) {
		return productRepository.getById(id);
	}

	@Override
	public void delete(ProductsEntity entity) {
		productRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		productRepository.deleteAllById(ids);
	}

	@Override
	public ProductsEntity getReferenceById(String id) {
		return productRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends ProductsEntity> entities) {
		productRepository.deleteAll(entities);
	}

	@Override
	public <S extends ProductsEntity> List<S> findAll(Example<S> example) {
		return productRepository.findAll(example);
	}

	@Override
	public void deleteAll() {
		productRepository.deleteAll();
	}

	@Override
	public List<ProductsEntity> findByCategoryNameContainining(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductsEntity> findByCategoryNameContainining(String name, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

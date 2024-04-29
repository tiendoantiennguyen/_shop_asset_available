package com.springbootproject.example.service.web.product.productImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.product.OrderDetailEntity;
import com.springbootproject.example.repository.web.product.OrderDetailRepository;
import com.springbootproject.example.service.web.product.IOrderDetailService;

@Service
public class OrderDetailService implements IOrderDetailService{
	
	private OrderDetailRepository orderDetailRepository;

	public OrderDetailService(OrderDetailRepository orderDetailRepository) {
		this.orderDetailRepository = orderDetailRepository;
	}

	@Override
	public <S extends OrderDetailEntity> S save(S entity) {
		return orderDetailRepository.save(entity);
	}

	@Override
	public <S extends OrderDetailEntity> List<S> saveAll(Iterable<S> entities) {
		return orderDetailRepository.saveAll(entities);
	}

	@Override
	public <S extends OrderDetailEntity> Optional<S> findOne(Example<S> example) {
		return orderDetailRepository.findOne(example);
	}

	@Override
	public List<OrderDetailEntity> findAll(Sort sort) {
		return orderDetailRepository.findAll(sort);
	}

	@Override
	public void flush() {
		orderDetailRepository.flush();
	}

	@Override
	public <S extends OrderDetailEntity> S saveAndFlush(S entity) {
		return orderDetailRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends OrderDetailEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return orderDetailRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<OrderDetailEntity> findAll() {
		return orderDetailRepository.findAll();
	}

	@Override
	public List<OrderDetailEntity> findAllById(Iterable<String> ids) {
		return orderDetailRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<OrderDetailEntity> entities) {
		orderDetailRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<OrderDetailEntity> findById(String id) {
		return orderDetailRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<OrderDetailEntity> entities) {
		orderDetailRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return orderDetailRepository.existsById(id);
	}

	@Override
	public <S extends OrderDetailEntity> long count(Example<S> example) {
		return orderDetailRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		orderDetailRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends OrderDetailEntity> boolean exists(Example<S> example) {
		return orderDetailRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		orderDetailRepository.deleteAllInBatch();
	}

	@Override
	public OrderDetailEntity getOne(String id) {
		return orderDetailRepository.getOne(id);
	}

	@Override
	public <S extends OrderDetailEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return orderDetailRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return orderDetailRepository.count();
	}

	@Override
	public void deleteById(String id) {
		orderDetailRepository.deleteById(id);
	}

	@Override
	public OrderDetailEntity getById(String id) {
		return orderDetailRepository.getById(id);
	}

	@Override
	public void delete(OrderDetailEntity entity) {
		orderDetailRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		orderDetailRepository.deleteAllById(ids);
	}

	@Override
	public OrderDetailEntity getReferenceById(String id) {
		return orderDetailRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends OrderDetailEntity> entities) {
		orderDetailRepository.deleteAll(entities);
	}

	@Override
	public <S extends OrderDetailEntity> List<S> findAll(Example<S> example) {
		return orderDetailRepository.findAll(example);
	}

	@Override
	public <S extends OrderDetailEntity> List<S> findAll(Example<S> example, Sort sort) {
		return orderDetailRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		orderDetailRepository.deleteAll();
	}
	
	

}

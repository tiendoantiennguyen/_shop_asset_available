package com.springbootproject.example.service.web.product.productImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.product.OrderEntity;
import com.springbootproject.example.repository.web.product.OrderRepository;
import com.springbootproject.example.service.web.product.IOrderService;

@Service
public class OrderService implements IOrderService{
	
	private OrderRepository orderRepository;
	
	public OrderService() {
		
	}

	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public <S extends OrderEntity> S save(S entity) {
		return orderRepository.save(entity);
	}

	@Override
	public <S extends OrderEntity> List<S> saveAll(Iterable<S> entities) {
		return orderRepository.saveAll(entities);
	}

	@Override
	public <S extends OrderEntity> Optional<S> findOne(Example<S> example) {
		return orderRepository.findOne(example);
	}

	@Override
	public List<OrderEntity> findAll(Sort sort) {
		return orderRepository.findAll(sort);
	}

	@Override
	public void flush() {
		orderRepository.flush();
	}

	public Page<OrderEntity> findAll(Pageable pageable) {
		return orderRepository.findAll(pageable);
	}

	@Override
	public <S extends OrderEntity> S saveAndFlush(S entity) {
		return orderRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends OrderEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return orderRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<OrderEntity> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public List<OrderEntity> findAllById(Iterable<String> ids) {
		return orderRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<OrderEntity> entities) {
		orderRepository.deleteInBatch(entities);
	}

	public <S extends OrderEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return orderRepository.findAll(example, pageable);
	}

	@Override
	public Optional<OrderEntity> findById(String id) {
		return orderRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<OrderEntity> entities) {
		orderRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return orderRepository.existsById(id);
	}

	@Override
	public <S extends OrderEntity> long count(Example<S> example) {
		return orderRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		orderRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends OrderEntity> boolean exists(Example<S> example) {
		return orderRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		orderRepository.deleteAllInBatch();
	}

	@Override
	public OrderEntity getOne(String id) {
		return orderRepository.getOne(id);
	}

	@Override
	public <S extends OrderEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return orderRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return orderRepository.count();
	}

	@Override
	public void deleteById(String id) {
		orderRepository.deleteById(id);
	}

	@Override
	public OrderEntity getById(String id) {
		return orderRepository.getById(id);
	}

	@Override
	public void delete(OrderEntity entity) {
		orderRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		orderRepository.deleteAllById(ids);
	}

	@Override
	public OrderEntity getReferenceById(String id) {
		return orderRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends OrderEntity> entities) {
		orderRepository.deleteAll(entities);
	}

	@Override
	public <S extends OrderEntity> List<S> findAll(Example<S> example) {
		return orderRepository.findAll(example);
	}

	@Override
	public <S extends OrderEntity> List<S> findAll(Example<S> example, Sort sort) {
		return orderRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		orderRepository.deleteAll();
	}
	
}

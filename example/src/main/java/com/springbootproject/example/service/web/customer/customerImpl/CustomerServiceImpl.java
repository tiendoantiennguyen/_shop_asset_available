package com.springbootproject.example.service.web.customer.customerImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.customer.CustomerEntity;
import com.springbootproject.example.repository.web.customer.CustomerRepository;
import com.springbootproject.example.service.web.customer.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public <S extends CustomerEntity> S save(S entity) {
		return customerRepository.save(entity);
	}

	@Override
	public <S extends CustomerEntity> List<S> saveAll(Iterable<S> entities) {
		return customerRepository.saveAll(entities);
	}

	@Override
	public <S extends CustomerEntity> Optional<S> findOne(Example<S> example) {
		return customerRepository.findOne(example);
	}

	@Override
	public List<CustomerEntity> findAll(Sort sort) {
		return customerRepository.findAll(sort);
	}

	@Override
	public void flush() {
		customerRepository.flush();
	}

	@Override
	public <S extends CustomerEntity> S saveAndFlush(S entity) {
		return customerRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends CustomerEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return customerRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<CustomerEntity> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public List<CustomerEntity> findAllById(Iterable<String> ids) {
		return customerRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<CustomerEntity> entities) {
		customerRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<CustomerEntity> findById(String id) {
		return customerRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<CustomerEntity> entities) {
		customerRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return customerRepository.existsById(id);
	}

	@Override
	public <S extends CustomerEntity> long count(Example<S> example) {
		return customerRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		customerRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends CustomerEntity> boolean exists(Example<S> example) {
		return customerRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		customerRepository.deleteAllInBatch();
	}

	@Override
	public CustomerEntity getOne(String id) {
		return customerRepository.getOne(id);
	}

	@Override
	public <S extends CustomerEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return customerRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return customerRepository.count();
	}

	@Override
	public void deleteById(String id) {
		customerRepository.deleteById(id);
	}

	@Override
	public CustomerEntity getById(String id) {
		return customerRepository.getById(id);
	}

	@Override
	public void delete(CustomerEntity entity) {
		customerRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		customerRepository.deleteAllById(ids);
	}

	@Override
	public CustomerEntity getReferenceById(String id) {
		return customerRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends CustomerEntity> entities) {
		customerRepository.deleteAll(entities);
	}

	@Override
	public <S extends CustomerEntity> List<S> findAll(Example<S> example) {
		return customerRepository.findAll(example);
	}

	@Override
	public <S extends CustomerEntity> List<S> findAll(Example<S> example, Sort sort) {
		return customerRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		customerRepository.deleteAll();
	}
	
	

}

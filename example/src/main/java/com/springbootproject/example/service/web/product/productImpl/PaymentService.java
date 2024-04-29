package com.springbootproject.example.service.web.product.productImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootproject.example.entity.web.product.PaymentEntity;
import com.springbootproject.example.repository.web.product.PaymentRepository;
import com.springbootproject.example.service.web.product.IPaymentService;

@Service
public class PaymentService implements IPaymentService {
	
	private PaymentRepository paymentRepository;
	
	public PaymentService() {
		
	}

	public PaymentService(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@Override
	public <S extends PaymentEntity> S save(S entity) {
		return paymentRepository.save(entity);
	}

	@Override
	public <S extends PaymentEntity> List<S> saveAll(Iterable<S> entities) {
		return paymentRepository.saveAll(entities);
	}

	@Override
	public <S extends PaymentEntity> Optional<S> findOne(Example<S> example) {
		return paymentRepository.findOne(example);
	}

	@Override
	public List<PaymentEntity> findAll(Sort sort) {
		return paymentRepository.findAll(sort);
	}

	@Override
	public void flush() {
		paymentRepository.flush();
	}

	@Override
	public <S extends PaymentEntity> S saveAndFlush(S entity) {
		return paymentRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends PaymentEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return paymentRepository.saveAllAndFlush(entities);
	}

	@Override
	public List<PaymentEntity> findAll() {
		return paymentRepository.findAll();
	}

	@Override
	public List<PaymentEntity> findAllById(Iterable<String> ids) {
		return paymentRepository.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<PaymentEntity> entities) {
		paymentRepository.deleteInBatch(entities);
	}

	@Override
	public Optional<PaymentEntity> findById(String id) {
		return paymentRepository.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<PaymentEntity> entities) {
		paymentRepository.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return paymentRepository.existsById(id);
	}

	@Override
	public <S extends PaymentEntity> long count(Example<S> example) {
		return paymentRepository.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		paymentRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends PaymentEntity> boolean exists(Example<S> example) {
		return paymentRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		paymentRepository.deleteAllInBatch();
	}

	@Override
	public PaymentEntity getOne(String id) {
		return paymentRepository.getOne(id);
	}

	@Override
	public <S extends PaymentEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return paymentRepository.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return paymentRepository.count();
	}

	@Override
	public void deleteById(String id) {
		paymentRepository.deleteById(id);
	}

	@Override
	public PaymentEntity getById(String id) {
		return paymentRepository.getById(id);
	}

	@Override
	public void delete(PaymentEntity entity) {
		paymentRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		paymentRepository.deleteAllById(ids);
	}

	@Override
	public PaymentEntity getReferenceById(String id) {
		return paymentRepository.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends PaymentEntity> entities) {
		paymentRepository.deleteAll(entities);
	}

	@Override
	public <S extends PaymentEntity> List<S> findAll(Example<S> example) {
		return paymentRepository.findAll(example);
	}

	@Override
	public <S extends PaymentEntity> List<S> findAll(Example<S> example, Sort sort) {
		return paymentRepository.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		paymentRepository.deleteAll();
	}

}

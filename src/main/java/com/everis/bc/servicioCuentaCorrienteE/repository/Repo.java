package com.everis.bc.servicioCuentaCorrienteE.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.bc.servicioCuentaCorrienteE.model.CuentaCorrienteE;

import reactor.core.publisher.Mono;

public interface Repo extends ReactiveMongoRepository<CuentaCorrienteE, String>{
	@Query("{ 'titulares.doc': ?0 }")
	public Mono<CuentaCorrienteE> findByTitularesDoc(String doc);
	@Query("{ 'nro_cuenta': ?0 }")
	public Mono<CuentaCorrienteE> findByNro_cuenta(String nro_cuenta);
	

	
	//public boolean existByTitulares(String doc);
}

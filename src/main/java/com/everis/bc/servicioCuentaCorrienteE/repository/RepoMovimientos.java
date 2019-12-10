package com.everis.bc.servicioCuentaCorrienteE.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.bc.servicioCuentaCorrienteE.model.Movimientos;

public interface RepoMovimientos extends ReactiveMongoRepository<Movimientos, String>{

}

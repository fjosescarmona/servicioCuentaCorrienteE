package com.everis.bc.servicioCuentaCorrienteE.service;


import java.util.Map;

import com.everis.bc.servicioCuentaCorrienteE.model.CuentaCorrienteE;
import com.everis.bc.servicioCuentaCorrienteE.model.Movimientos;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceCta {
	
	public Mono<Map<String, Object>> saveData(CuentaCorrienteE cuenta);
	
	public Flux<CuentaCorrienteE> getData();
	
	public Flux<CuentaCorrienteE> getDataByDoc(String doc);

	public Mono<Map<String, Object>> getSaldo(String nro_cuenta);

	public Mono<Void> deleteData(String id);
	
	public Mono<CuentaCorrienteE> editData(String id, CuentaCorrienteE cuenta);
	
	public Mono<Map<String, Object>> saveMovimiento(Movimientos mov);
	
	public Flux<Movimientos> getMovimientos();
}

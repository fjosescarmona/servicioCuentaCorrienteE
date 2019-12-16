package com.everis.bc.servicioCuentaCorrienteE.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bc.servicioCuentaCorrienteE.model.CuentaCorrienteE;
import com.everis.bc.servicioCuentaCorrienteE.model.Movimientos;
import com.everis.bc.servicioCuentaCorrienteE.service.ServiceCta;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CuentaCorrienteEController {

	@Autowired
	private ServiceCta s_cuenta;

	@PostMapping("/saveCcorrienteEData")
	public Mono<Map<String, Object>> saveCcorrienteData(@RequestBody CuentaCorrienteE cuenta){
		return s_cuenta.saveData(cuenta);
	}
	
	@GetMapping("/getCcorrienteEData/{doc}")
	public Flux<CuentaCorrienteE> getCcorrienteData(@PathVariable("doc") String doc){
		return s_cuenta.getDataByDoc(doc);
	}
	
	@GetMapping("/getCcorrienteESaldo/{nro_cuenta}")
	public Mono<Map<String, Object>> getCcorrienteSaldo(@PathVariable("nro_cuenta") String nro_cuenta){
		return s_cuenta.getSaldo(nro_cuenta);
	}
	
	@PostMapping("/saveMovimientosCorrienteE")
	public Mono<Map<String, Object>> saveMovimientosCorriente(@RequestBody Movimientos movimiento){
		return s_cuenta.saveMovimiento(movimiento);
	}
	
	@GetMapping("/getMovimientosCorrienteE")
	public Flux<Movimientos> getMovimientosCorriente(){
		return s_cuenta.getMovimientos();
	}

}

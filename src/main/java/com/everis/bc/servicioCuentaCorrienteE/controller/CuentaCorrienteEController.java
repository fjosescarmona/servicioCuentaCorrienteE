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
	public Mono<CuentaCorrienteE> saveCcorrienteData(@RequestBody CuentaCorrienteE cuenta){
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
	
	@PostMapping("/savePagotdcEcorriente")
	public Mono<Movimientos> savePagotdcEcorriente(@RequestBody Movimientos movimiento){
		return s_cuenta.savePagotdc(movimiento);
	}
	
	@PostMapping("/saveDepositoEcorriente")
	public Mono<Movimientos> saveDepositoEcorriente(@RequestBody Movimientos movimiento){
		return s_cuenta.saveDeposito(movimiento);
	}
	
	@PostMapping("/saveRetiroEcorriente")
	public Mono<Movimientos> saveRetiroEcorriente(@RequestBody Movimientos movimiento){
		return s_cuenta.saveRetiro(movimiento);
	}
	
	@PostMapping("/getTransferEcorriente")
	public Mono<Movimientos> getTransferEcorriente(@RequestBody Movimientos movimiento){
		return s_cuenta.getTransfer(movimiento);
	}
	
	@PostMapping("/setTransferEcorriente")
	public Mono<Movimientos> setTransferEcorriente(@RequestBody Movimientos movimiento){
		return s_cuenta.setTransfer(movimiento);
	}
	
	@GetMapping("/getMovimientosCorrienteE/{nro_cuenta}")
	public Flux<Movimientos> getMovimientosCorriente(@PathVariable("nro_cuenta") String nro_cuenta){
		return s_cuenta.getMovimientos(nro_cuenta);
	}
	
	@GetMapping("/getRangeMovimientosEcorriente/{nro_cuenta}/{from}/{to}")
	public Flux<Movimientos> getRangeMovimientosEcorriente(@PathVariable("nro_cuenta") String nro_cuenta, @PathVariable("from") String from, @PathVariable("to") String to){
		return s_cuenta.getRangeMovimientos(nro_cuenta, from, to);
	}

}

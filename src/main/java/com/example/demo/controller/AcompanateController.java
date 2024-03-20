package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.util.AcompananteGuardar;
import com.example.demo.entity.util.AcompananteTable;
import com.example.demo.entity.util.PacienteGuardar;
import com.example.demo.services.AcompananteService;

@RestController
@RequestMapping("/acompanante")
public class AcompanateController {
	@Autowired
	AcompananteService acompananteService;
	
	@GetMapping(path = "/consultar/paciente")
	public ResponseEntity<List<AcompananteTable>> getAcompananteDocumento(
			@RequestParam(required = true) Integer pacienteId) {
		try {
			List<AcompananteTable> listAcompanate = acompananteService.listarPorIdPaciente(pacienteId);
			return new ResponseEntity<>(listAcompanate, HttpStatus.OK);

		} catch (Exception e) {
			String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
			System.out.println(errorMessage);

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	@PostMapping(path = "/guardar")
	public ResponseEntity<?> getListarAcompanante( @RequestBody AcompananteGuardar request) {
	    try {
	        if (request == null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El cuerpo de la solicitud está vacío.");
	        }

	        Integer tipoDocumento = request.getCod_tipo_documento();
	        String numDocuento = request.getNumero_documento();
	        String apeMaterno = request.getApe_materno();
	        String apePaterno = request.getApe_paterno();
	        String nombres = request.getNombres();
	        Integer parentescoId = request.getParentesco_id();
	        String numTelefono = request.getNum_telefono();
	        String direccion = request.getDireccion();
	        String codigoUbigeo = request.getCodigo_ubigeo();
	        Integer pacienteId = request.getPaciente_id() ;
	        String pacienteAcompananteId = request.getPaciente_acompanante_id();
	        
	        String fechaNacimientoString = request.getFecha_nacimiento();
	        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	        Date fechaNacimiento;	        
	        fechaNacimiento = formatoFecha.parse(fechaNacimientoString);

	        Boolean guardaAcompanate;
	        if (pacienteAcompananteId == null || pacienteAcompananteId.isEmpty() || pacienteAcompananteId == "") {
	        	guardaAcompanate = acompananteService.guardarAcompanante(
	            		pacienteId,
	            		tipoDocumento, numDocuento, 
	            		apePaterno, apeMaterno,
	                    nombres,
	                    parentescoId,
	                    fechaNacimiento,	                    
	                    numTelefono, direccion, codigoUbigeo, null);
	        } else {
	        	guardaAcompanate = acompananteService.guardarAcompanante(pacienteId,
	            		tipoDocumento, numDocuento, 
	            		apePaterno, apeMaterno,
	                    nombres,
	                    parentescoId,
	                    fechaNacimiento,	                    
	                    numTelefono, direccion, codigoUbigeo,pacienteAcompananteId);
	        }

	        return new ResponseEntity<>(guardaAcompanate, HttpStatus.OK);

	    } catch (Exception e) {
	        String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
	        System.out.println(errorMessage);

	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}
}

package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.util.PacienteGuardar;
import com.example.demo.entity.util.PacienteTable;
import com.example.demo.services.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	@Autowired
	PacienteService pacienteService;

	@GetMapping(path = "/consultar/documento")
	public ResponseEntity<List<PacienteTable>> getPacienteDocumento(
			@RequestParam(required = true) Integer idTipoDocumento,
			@RequestParam(required = true) String numDocumento) {
		try {
			List<PacienteTable> listPaciente = pacienteService.listarPacientePorTipoNumDoc(idTipoDocumento,
					numDocumento);
			return new ResponseEntity<>(listPaciente, HttpStatus.OK);

		} catch (Exception e) {
			String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
			System.out.println(errorMessage);

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@GetMapping(path = "/listar")
	public ResponseEntity<?> getListarPaciente(@RequestParam(required = false) String nombres,
			@RequestParam(required = false) String apellidos) {
		try {

			List<PacienteTable> listPaciente = pacienteService.listarPacientesPorNombreAp(nombres, apellidos);
			return new ResponseEntity<>(listPaciente, HttpStatus.OK);

		} catch (Exception e) {
			String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
			System.out.println(errorMessage);

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@PostMapping(path = "/guardar")
	public ResponseEntity<?> getListarPaciente( @RequestBody PacienteGuardar request) {
	    try {
	        if (request == null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El cuerpo de la solicitud está vacío.");
	        }

	        Integer tipoDocumento = request.getCod_tipo_documento();
	        String numDocuento = request.getNumero_documento();
	        String apeMaterno = request.getApe_materno();
	        String apePaterno = request.getApe_paterno();
	        String nombres = request.getNombres();
	        Integer codSexo = request.getCod_sexo();
	        String lugarNacimiento = request.getLugar_nacimiento();
	        String direccion = request.getDireccion();
	        String codigoUbigeo = request.getCodigo_ubigeo();
	        String pacienteId = request.getPaciente_id() ;
	        
	        String fechaNacimientoString = request.getFecha_nacimiento();
	        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	        Date fechaNacimiento;	        
	        fechaNacimiento = formatoFecha.parse(fechaNacimientoString);

	        List<Map<String, Object>> guardaPaciente;
	        if (pacienteId == null || pacienteId.isEmpty() || pacienteId == "") {
	            guardaPaciente = pacienteService.guardarPaciente(
	            		tipoDocumento, numDocuento, 
	            		apePaterno, apeMaterno,
	                    nombres, codSexo, 
	                    fechaNacimiento,
	                    lugarNacimiento, direccion, codigoUbigeo, null);
	        } else {
	            guardaPaciente = pacienteService.guardarPaciente(tipoDocumento, numDocuento, apePaterno, apeMaterno,
	                    nombres, codSexo, fechaNacimiento, lugarNacimiento, direccion, codigoUbigeo, pacienteId);
	        }

	        return new ResponseEntity<>(guardaPaciente, HttpStatus.OK);

	    } catch (Exception e) {
	        String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
	        System.out.println(errorMessage);

	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}


	// @PutMapping (path = "/guardar/{idpaciente}")
	// public ResponseEntity<String> actualizarPaciente(@PathVariable Integer
	// idpaciente, @RequestBody PacienteEntity request) {
	// System.out.println("funciona");
	// return new ResponseEntity<>("A", HttpStatus.OK);
	// }
}

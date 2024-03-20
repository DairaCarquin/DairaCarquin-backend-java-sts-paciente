package com.example.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.PacienteRepository;
import com.example.demo.entity.util.PacienteGuardar;
import com.example.demo.entity.util.PacienteTable;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepository repoPaciente;

	public List<PacienteTable> listarPacientesPorNombreAp(String nombres, String apellidos) {
		List<Map<String, Object>> resultadoPacientes = repoPaciente.listarPacientePorNombreAp(nombres, apellidos);
		List<PacienteTable> objPaciente = mapObject(resultadoPacientes);
		return objPaciente;
	}

	public List<PacienteTable> listarPacientePorTipoNumDoc(Integer idTipoDocumento, String numDocumento) {
		List<Map<String, Object>> resultadoPacientes = repoPaciente.listarPacientePorTipoNumDoc(idTipoDocumento,
				numDocumento);
		List<PacienteTable> objPaciente = mapObject(resultadoPacientes);
		return objPaciente;
	}

	public List<Map<String, Object>> guardarPaciente(Integer codTipoDocumento, String numeroDocumento, String apePaterno,
			String apeMaterno, String nombres, Integer codSexo, Date fechaNacimiento, String lugarNacimiento,
			String direccion, String codigoUbigeo, String idPaciente) {
		List<Map<String, Object>> guardarDatoPaciente;
		
		Integer codPaciente = idPaciente == null ? null : Integer.parseInt(idPaciente);
		
		guardarDatoPaciente = repoPaciente.guardarPaciente(
				codTipoDocumento, 
				numeroDocumento, 
				apePaterno,
				apeMaterno, 
				nombres, codSexo, 
				fechaNacimiento, lugarNacimiento, 
				direccion, codigoUbigeo, 
				codPaciente);

		System.out.println(guardarDatoPaciente);
		return guardarDatoPaciente;
	}

	private List<PacienteTable> mapObject(List<Map<String, Object>> resultados) {
		return resultados.stream().map(fila -> {
			String nombre_completo = (String) fila.get("nombre_completo");
			String ape_paterno = (String) fila.get("ape_paterno");
			String ape_materno = (String) fila.get("ape_materno");
			String nombres = (String) fila.get("nombres");
			Integer cod_tipo_documento = (Integer) fila.get("cod_tipo_documento");
			String des_tipo_documento = (String) fila.get("des_tipo_documento");
			String numero_documento = (String) fila.get("numero_documento");
			Integer cod_sexo = (Integer) fila.get("cod_sexo");
			String des_sexo = (String) fila.get("des_sexo");
			String fecha_nacimiento = (String) fila.get("fecha_nacimiento");
			String paciente_id = (String) fila.get("paciente_id");
			String lugar_nacimiento = (String) fila.get("lugar_nacimiento");
			String direccion = (String) fila.get("direccion");
			String codigo_ubigeo = (String) fila.get("codigo_ubigeo");
			return new PacienteTable(nombre_completo, ape_paterno, ape_materno, nombres,cod_tipo_documento, des_tipo_documento,
					numero_documento,cod_sexo, des_sexo, fecha_nacimiento, paciente_id, lugar_nacimiento, direccion,
					codigo_ubigeo);
		}).collect(Collectors.toList());
	}

}

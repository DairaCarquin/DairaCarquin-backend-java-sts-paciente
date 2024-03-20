package com.example.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PacienteAcompananteRepository;
import com.example.demo.entity.util.AcompananteTable;

@Service
public class AcompananteService {
	@Autowired
	private PacienteAcompananteRepository repoAcompanante;
	
	public List<AcompananteTable> listarPorIdPaciente(Integer pacienteId) {
		List<Object[]> resultadoAcompanante = repoAcompanante.listarPorIdPaciente(pacienteId);
		List<AcompananteTable> objAcompanante = mapObject(resultadoAcompanante);
		return objAcompanante;
	}
	
	public Boolean guardarAcompanante(
			Integer idPaciente, Integer codTipoDocumento,
			String numeroDocumento, String apePaterno,
			String apeMaterno, String nombres, 
			Integer parentescoId, Date fechaNacimiento,
			String numTelefono,
			String direccion, String codigoUbigeo, 
			String idPacienteParentescoId) {
		List<Map<String, Object>> guardarDatoAcompanante;
		
		Integer codPacienteAcompananteId = idPacienteParentescoId == null ? null : Integer.parseInt(idPacienteParentescoId);
		
		guardarDatoAcompanante = repoAcompanante.guardarAcomponanate(
				idPaciente,
				codTipoDocumento, 
				numeroDocumento, 
				apePaterno,
				apeMaterno, 
				nombres, 
				fechaNacimiento, 
				parentescoId, 
				numTelefono, 
				direccion, 
				codigoUbigeo, 
				codPacienteAcompananteId);

		System.out.println(guardarDatoAcompanante);
		return true;
	}
	
	
	private List<AcompananteTable> mapObject(List<Object[]> resultados) {
		return resultados.stream().map(fila -> {
			String nombre_completo = (String) fila[0];
			String ape_paterno = (String) fila[1];
			String ape_materno = (String) fila[2];
			String nombres = (String) fila[3];
			Integer cod_tipo_documento = (Integer) fila[4];
			String des_tipo_documento = (String) fila[5];
			String numero_documento = (String) fila[6];
			String fecha_nacimiento = (String) fila[7];
			Integer cod_parentesco = (Integer) fila[8];
			String parentesco = (String) fila [9];
			String telf_contacto = (String) fila[10];
			String direccion = (String) fila[11];			
			String codigo_ubigeo = (String) fila[12];
			Integer parentesco_paciente_id = (Integer) fila[13];
			return new AcompananteTable(nombre_completo,
					ape_paterno,ape_materno,nombres,
					cod_tipo_documento, des_tipo_documento, numero_documento,
					fecha_nacimiento, cod_parentesco, parentesco,
					telf_contacto, direccion, 
					codigo_ubigeo,
					parentesco_paciente_id);
		}).collect(Collectors.toList());
	}
	
}

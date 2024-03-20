package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PacienteAcompananteEntity;

@Repository
public interface PacienteAcompananteRepository extends JpaRepository<PacienteAcompananteEntity, Integer> {
	@Query(value = "SELECT * FROM \"Admision\".proc_get_acompanante_by_paciente(:paciente_id)", nativeQuery = true)
	List<Object[]> listarPorIdPaciente(@Param("paciente_id") Integer paciente_id);

	
	@Query(value = "SELECT * FROM \"Admision\".proc_guardar_acompanante(:paciente_id ,"
			+ ":cod_tipo_documento, :numero_documento, :ape_paterno, :ape_materno,"
			+ ":nombres, :fecha_nacimiento, :parentesco_id, :num_telefono, "
			+ ":direccion, :codigo_ubigeo, :paciente_acompanante_id)", nativeQuery = true)
	List<Map<String, Object>> guardarAcomponanate(
			@Param("paciente_id") Integer paciente_id,
			@Param("cod_tipo_documento") Integer cod_tipo_documento, 
			@Param("numero_documento") String  numero_documento,
			@Param("ape_paterno") String ape_paterno, 
			@Param("ape_materno") String ape_materno, 
			@Param("nombres") String nombres ,
			@Param("fecha_nacimiento") Date fecha_nacimiento, 
			@Param("parentesco_id") Integer parentesco_id, 
			@Param("num_telefono") String num_telefono ,
			@Param("direccion") String direccion,
			@Param("codigo_ubigeo") String codigo_ubigeo,
			@Param("paciente_acompanante_id") Integer paciente_acompanante_id
	);
}

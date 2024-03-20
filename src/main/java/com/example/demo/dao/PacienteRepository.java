package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PacienteEntity;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Integer>{
	@Query(value = "SELECT * FROM \"Admision\".proc_get_paciente_nom_ape(:nombre, :apellido)", nativeQuery = true)
	List<Map<String, Object>> listarPacientePorNombreAp(@Param("nombre") String nombre, @Param("apellido") String apellido);

	@Query(value = "SELECT * FROM \"Admision\".proc_get_paciente_documento(:id_tipo_documento, :num_documento)", nativeQuery = true)
	List<Map<String, Object>> listarPacientePorTipoNumDoc(@Param("id_tipo_documento") Integer id_tipo_documento, @Param("num_documento") String num_documento);
	
	
	
	@Query(value = "SELECT * FROM \"Admision\".proc_guardar_paciente("
			+ ":cod_tipo_documento, :numero_documento, :ape_paterno, :ape_materno,"
			+ ":nombres, :cod_sexo, :fecha_nacimiento, :lugar_nacimiento, "
			+ ":direccion, :codigo_ubigeo, :paciente_id)", nativeQuery = true)
	
	List<Map<String, Object>> guardarPaciente(
			@Param("cod_tipo_documento") Integer cod_tipo_documento, 
			@Param("numero_documento") String  numero_documento,			@Param("ape_paterno") String ape_paterno, @Param("ape_materno") String ape_materno, 
			@Param("nombres") String nombres , @Param("cod_sexo") Integer cod_sexo, 			@Param("fecha_nacimiento") Date fecha_nacimiento, 
			@Param("lugar_nacimiento") String lugar_nacimiento ,			@Param("direccion") String direccion,
			@Param("codigo_ubigeo") String codigo_ubigeo,
			@Param("paciente_id") Integer paciente_id
	);
}




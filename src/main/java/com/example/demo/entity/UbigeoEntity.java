package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tc_ubigeo")
public class UbigeoEntity {
	@Id
	@Column(name="codigo_ubigeo")
	private String codigo_ubigeo;
	
	@Column(name="descripcion_departamento")
	private String descripcion_departamento;
	
	@Column(name="descripcion_provincia")
	private String descripcion_provincia;
	
	@Column(name="descripcion_distrito")
	private String descripcion_distrito;

	@Column(name="fl_estado")
	private Integer fl_estado;
	
	@Column(name="codigo_departamento")
	private String codigo_departamento;
	
	@Column(name="codigo_provincia")
	private String codigo_provincia;
	
	@Column(name="codigo_distrito")
	private String codigo_distrito;
	
	@OneToMany(mappedBy = "ubicacionAcompanantes")
	private List<PacienteAcompananteEntity> listAcompanantes;
	
	@OneToMany(mappedBy = "ubigeoPaciente")
	private List<PacienteEntity> listPaciente;

	public String getDescripcion_departamento() {
		return descripcion_departamento;
	}

	public void setDescripcion_departamento(String descripcion_departamento) {
		this.descripcion_departamento = descripcion_departamento;
	}

	public String getDescripcion_provincia() {
		return descripcion_provincia;
	}

	public void setDescripcion_provincia(String descripcion_provincia) {
		this.descripcion_provincia = descripcion_provincia;
	}

	public String getDescripcion_distrito() {
		return descripcion_distrito;
	}

	public void setDescripcion_distrito(String descripcion_distrito) {
		this.descripcion_distrito = descripcion_distrito;
	}

	public Integer getFl_estado() {
		return fl_estado;
	}

	public void setFl_estado(Integer fl_estado) {
		this.fl_estado = fl_estado;
	}

	public String getCodigo_ubigeo() {
		return codigo_ubigeo;
	}

	public void setCodigo_ubigeo(String codigo_ubigeo) {
		this.codigo_ubigeo = codigo_ubigeo;
	}

	public String getCodigo_departamento() {
		return codigo_departamento;
	}

	public void setCodigo_departamento(String codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}

	public String getCodigo_provincia() {
		return codigo_provincia;
	}

	public void setCodigo_provincia(String codigo_provincia) {
		this.codigo_provincia = codigo_provincia;
	}

	public String getCodigo_distrito() {
		return codigo_distrito;
	}

	public void setCodigo_distrito(String codigo_distrito) {
		this.codigo_distrito = codigo_distrito;
	}

	public List<PacienteAcompananteEntity> getListAcompanantes() {
		return listAcompanantes;
	}

	public void setListAcompanantes(List<PacienteAcompananteEntity> listAcompanantes) {
		this.listAcompanantes = listAcompanantes;
	}

	public List<PacienteEntity> getListPaciente() {
		return listPaciente;
	}

	public void setListPaciente(List<PacienteEntity> listPaciente) {
		this.listPaciente = listPaciente;
	}
	
}


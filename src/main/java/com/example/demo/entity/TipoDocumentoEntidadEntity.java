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
@Table(name="tc_tipo_documento_identidad")
public class TipoDocumentoEntidadEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_documento_identidad")
	private Integer id_tipo_documento_identidad;
	
	@Column(name="descripcion_tipo_documento_identidad")
	private String descripcion_tipo_documento_identidad;
	
	@Column(name="codigo_ieds")
	private String codigo_ieds;
	
	@Column(name="fl_estado")
	private Boolean  fl_estado;
	
	@OneToMany(mappedBy = "tipoDocumentoAcompanante")
	private List<PacienteAcompananteEntity> listAcompanante;

	@OneToMany(mappedBy = "tipoDocumentoPaciente")
	private List<PacienteEntity> listPaciente;

	public Integer getId_tipo_documento() {
		return id_tipo_documento_identidad;
	}

	public void setId_tipo_documento(Integer id_tipo_documento_identidad) {
		this.id_tipo_documento_identidad = id_tipo_documento_identidad;
	}

	public String getDescription_tipo_documento_identidad() {
		return descripcion_tipo_documento_identidad;
	}

	public void setDescription_tipo_documento_identidad(String description_tipo_documento_identidad) {
		this.descripcion_tipo_documento_identidad = description_tipo_documento_identidad;
	}

	public String getCodigo_ieds() {
		return codigo_ieds;
	}

	public void setCodigo_ieds(String codigo_ieds) {
		this.codigo_ieds = codigo_ieds;
	}

	public Boolean  getFl_estado() {
		return fl_estado;
	}

	public void setFl_estado(Boolean  fl_estado) {
		this.fl_estado = fl_estado;
	}

	public List<PacienteAcompananteEntity> getListAcompanante() {
		return listAcompanante;
	}

	public void setListAcompanante(List<PacienteAcompananteEntity> listAcompanante) {
		this.listAcompanante = listAcompanante;
	}

	public List<PacienteEntity> getListPaciente() {
		return listPaciente;
	}

	public void setListPaciente(List<PacienteEntity> listPaciente) {
		this.listPaciente = listPaciente;
	}	

}

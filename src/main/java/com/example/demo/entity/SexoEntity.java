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
@Table(name = "tc_sexo")
public class SexoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_sexo")
	private Integer id_sexo;
	
	@Column(name="descripcion_sexo")
	private String descripcion_sexo;
	
	@Column(name="fl_estado")
	private String fl_estado;
	
	@OneToMany(mappedBy = "sexoPaciente")
	private List<PacienteEntity> listPaciente;

	public Integer getId_sexo() {
		return id_sexo;
	}

	public void setId_sexo(Integer id_sexo) {
		this.id_sexo = id_sexo;
	}

	public String getDescripcion_sexo() {
		return descripcion_sexo;
	}

	public void setDescripcion_sexo(String descripcion_sexo) {
		this.descripcion_sexo = descripcion_sexo;
	}

	public String  getFl_estado() {
		return fl_estado;
	}

	public void setFl_estado(String  fl_estado) {
		this.fl_estado = fl_estado;
	}

	public List<PacienteEntity> getListPaciente() {
		return listPaciente;
	}

	public void setListPaciente(List<PacienteEntity> listPaciente) {
		this.listPaciente = listPaciente;
	}

	
}

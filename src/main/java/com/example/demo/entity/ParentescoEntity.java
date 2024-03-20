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
@Table(name="tc_parentesco")
public class ParentescoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_parentesco")
	private Integer id_parentesco;
	
	@Column(name="no_parentesco")
	private String no_parentesco;
	
	@Column(name="il_activo")
	private Integer il_activo;

	@OneToMany(mappedBy = "parentescoAcompanante")
	private List<PacienteAcompananteEntity> listAcompante;

	public Integer getId_parentesco() {
		return id_parentesco;
	}

	public void setId_parentesco(Integer id_parentesco) {
		this.id_parentesco = id_parentesco;
	}

	public String getNo_parentesco() {
		return no_parentesco;
	}

	public void setNo_parentesco(String no_parentesco) {
		this.no_parentesco = no_parentesco;
	}

	public Integer getIl_activo() {
		return il_activo;
	}

	public void setIl_activo(Integer il_activo) {
		this.il_activo = il_activo;
	}

	public List<PacienteAcompananteEntity> getListAcompante() {
		return listAcompante;
	}

	public void setListAcompante(List<PacienteAcompananteEntity> listAcompante) {
		this.listAcompante = listAcompante;
	}	

}
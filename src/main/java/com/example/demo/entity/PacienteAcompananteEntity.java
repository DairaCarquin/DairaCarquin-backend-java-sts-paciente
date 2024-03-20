package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_paciente_acompanante")
public class PacienteAcompananteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_paciente_acompanante")
	private Integer id_paciente_acompañante;
	
	@Column(name="id_paciente")
	private Integer id_paciente;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_docide")
	private TipoDocumentoEntidadEntity tipoDocumentoAcompanante;
	
	@Column(name="no_apepat")
	private String no_apepat;
	
	@Column(name = "no_apemat")
	private String no_apemat;
			
	@Column(name = "no_nombres")
	private String no_nombres;
	
	@Column(name = "fe_nacimiento")
	private Date fe_nacimiento;
	
	//FK-maintoone
	@ManyToOne
	@JoinColumn(name = "id_parentesco")
	private ParentescoEntity parentescoAcompanante;
		
	@Column(name = "nu_telefo_contacto")
	private String nu_telefo_contacto;
	
	@Column(name = "no_direccion")
	private String no_direccion;

	//FK
	@ManyToOne
	@JoinColumn(name = "co_ubigeo")
	private UbigeoEntity ubicacionAcompanantes;

	public Integer getId_paciente_acompañante() {
		return id_paciente_acompañante;
	}

	public void setId_paciente_acompañante(Integer id_paciente_acompañante) {
		this.id_paciente_acompañante = id_paciente_acompañante;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public TipoDocumentoEntidadEntity getTipoDocumentoAcompanante() {
		return tipoDocumentoAcompanante;
	}

	public void setTipoDocumentoAcompanante(TipoDocumentoEntidadEntity tipoDocumentoAcompanante) {
		this.tipoDocumentoAcompanante = tipoDocumentoAcompanante;
	}

	public String getNo_apepat() {
		return no_apepat;
	}

	public void setNo_apepat(String no_apepat) {
		this.no_apepat = no_apepat;
	}

	public String getNo_apemat() {
		return no_apemat;
	}

	public void setNo_apemat(String no_apemat) {
		this.no_apemat = no_apemat;
	}

	public String getNo_nombres() {
		return no_nombres;
	}

	public void setNo_nombres(String no_nombres) {
		this.no_nombres = no_nombres;
	}

	public Date getFe_nacimiento() {
		return fe_nacimiento;
	}

	public void setFe_nacimiento(Date fe_nacimiento) {
		this.fe_nacimiento = fe_nacimiento;
	}

	public ParentescoEntity getParentescoAcompanante() {
		return parentescoAcompanante;
	}

	public void setParentescoAcompanante(ParentescoEntity parentescoAcompanante) {
		this.parentescoAcompanante = parentescoAcompanante;
	}

	public String getNu_telefo_contacto() {
		return nu_telefo_contacto;
	}

	public void setNu_telefo_contacto(String nu_telefo_contacto) {
		this.nu_telefo_contacto = nu_telefo_contacto;
	}

	public String getNo_direccion() {
		return no_direccion;
	}

	public void setNo_direccion(String no_direccion) {
		this.no_direccion = no_direccion;
	}

	public UbigeoEntity getUbicacionAcompanantes() {
		return ubicacionAcompanantes;
	}

	public void setUbicacionAcompanantes(UbigeoEntity ubicacionAcompanantes) {
		this.ubicacionAcompanantes = ubicacionAcompanantes;
	}
	
	
}

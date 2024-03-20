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
@Table(name = "tb_paciente")
public class PacienteEntity {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_paciente")
		private Integer id_paciente;

		@ManyToOne
		@JoinColumn(name = "id_tipo_docide")
		private TipoDocumentoEntidadEntity tipoDocumentoPaciente;
		
		@Column(name = "no_docide")
		private String no_docide;
		
		@Column(name = "no_apepat")
		private String no_apepat;
		
		@Column(name = "no_apemat")
		private String no_apemat;
				
		@Column(name = "no_nombres")
		private String no_nombres;

		@ManyToOne
		@JoinColumn(name = "id_sexo")
		private SexoEntity sexoPaciente;
		
		@Column(name = "fe_nacimiento")
		private Date fe_nacimiento;
		
		@Column(name = "no_lugar_nacimiento")
		private String no_lugar_nacimiento;
		
		@Column(name = "no_direccion")
		private String no_direccion;
		
		@ManyToOne
		@JoinColumn(name = "co_ubigeo")
		private UbigeoEntity ubigeoPaciente;

		public Integer getId_paciente() {
			return id_paciente;
		}

		public void setId_paciente(Integer id_paciente) {
			this.id_paciente = id_paciente;
		}

		public TipoDocumentoEntidadEntity getTipoDocumentoPaciente() {
			return tipoDocumentoPaciente;
		}

		public void setTipoDocumentoPaciente(TipoDocumentoEntidadEntity tipoDocumentoPaciente) {
			this.tipoDocumentoPaciente = tipoDocumentoPaciente;
		}

		public String getNo_docide() {
			return no_docide;
		}

		public void setNo_docide(String no_docide) {
			this.no_docide = no_docide;
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

		public SexoEntity getSexoPaciente() {
			return sexoPaciente;
		}

		public void setSexoPaciente(SexoEntity sexoPaciente) {
			this.sexoPaciente = sexoPaciente;
		}

		public Date getFe_nacimiento() {
			return fe_nacimiento;
		}

		public void setFe_nacimiento(Date fe_nacimiento) {
			this.fe_nacimiento = fe_nacimiento;
		}

		public String getNo_lugar_nacimiento() {
			return no_lugar_nacimiento;
		}

		public void setNo_lugar_nacimiento(String no_lugar_nacimiento) {
			this.no_lugar_nacimiento = no_lugar_nacimiento;
		}

		public String getNo_direccion() {
			return no_direccion;
		}

		public void setNo_direccion(String no_direccion) {
			this.no_direccion = no_direccion;
		}

		public UbigeoEntity getUbigeoPaciente() {
			return ubigeoPaciente;
		}

		public void setUbigeoPaciente(UbigeoEntity ubigeoPaciente) {
			this.ubigeoPaciente = ubigeoPaciente;
		}	
		

}

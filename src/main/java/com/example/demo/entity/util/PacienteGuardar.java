package com.example.demo.entity.util;

public class PacienteGuardar {	
	private Integer cod_tipo_documento;
	private String numero_documento;
	private String ape_paterno;
	private String ape_materno;
	private String nombres;
	private Integer cod_sexo;
	private String fecha_nacimiento;
	private String lugar_nacimiento;
	private String direccion;
	private String codigo_ubigeo;
	private String paciente_id;	
	
	
	public PacienteGuardar(Integer cod_tipo_documento, String numero_documento, String ape_paterno, String ape_materno,
			String nombres, Integer cod_sexo, String fecha_nacimiento, String lugar_nacimiento, String direccion,
			String codigo_ubigeo, String paciente_id) {
		super();
		this.cod_tipo_documento = cod_tipo_documento;
		this.numero_documento = numero_documento;
		this.ape_paterno = ape_paterno;
		this.ape_materno = ape_materno;
		this.nombres = nombres;
		this.cod_sexo = cod_sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.lugar_nacimiento = lugar_nacimiento;
		this.direccion = direccion;
		this.codigo_ubigeo = codigo_ubigeo;
		this.paciente_id = paciente_id;
	}
	public Integer getCod_tipo_documento() {
		return cod_tipo_documento;
	}
	public void setCod_tipo_documento(Integer cod_tipo_documento) {
		this.cod_tipo_documento = cod_tipo_documento;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public String getApe_paterno() {
		return ape_paterno;
	}
	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}
	public String getApe_materno() {
		return ape_materno;
	}
	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public Integer getCod_sexo() {
		return cod_sexo;
	}
	public void setCod_sexo(Integer cod_sexo) {
		this.cod_sexo = cod_sexo;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}
	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigo_ubigeo() {
		return codigo_ubigeo;
	}
	public void setCodigo_ubigeo(String codigo_ubigeo) {
		this.codigo_ubigeo = codigo_ubigeo;
	}
	public String getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(String paciente_id) {
		this.paciente_id = paciente_id;
	}

}

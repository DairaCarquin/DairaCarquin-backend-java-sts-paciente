package com.example.demo.entity.util;

public class AcompananteGuardar {
	private Integer paciente_id;
	private Integer cod_tipo_documento;
	private String numero_documento;
	private String ape_paterno;
	private String ape_materno;
	private String nombres;
	private String fecha_nacimiento;
	private Integer parentesco_id;
	private String num_telefono;
	private String direccion;
	private String codigo_ubigeo;
	private String paciente_acompanante_id;
	
	public AcompananteGuardar(Integer paciente_id, Integer cod_tipo_documento, String numero_documento, String ape_paterno,
			String ape_materno, String nombres, String fecha_nacimiento, Integer parentesco_id, String num_telefono,
			String direccion, String codigo_ubigeo, String paciente_acompanante_id) {
		super();
		this.paciente_id = paciente_id;
		this.cod_tipo_documento = cod_tipo_documento;
		this.numero_documento = numero_documento;
		this.ape_paterno = ape_paterno;
		this.ape_materno = ape_materno;
		this.nombres = nombres;
		this.fecha_nacimiento = fecha_nacimiento;
		this.parentesco_id = parentesco_id;
		this.num_telefono = num_telefono;
		this.direccion = direccion;
		this.codigo_ubigeo = codigo_ubigeo;
		this.paciente_acompanante_id = paciente_acompanante_id;
	}
	public Integer getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(Integer paciente_id) {
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
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getParentesco_id() {
		return parentesco_id;
	}
	public void setParentesco_id(Integer parentesco_id) {
		this.parentesco_id = parentesco_id;
	}
	public String getNum_telefono() {
		return num_telefono;
	}
	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
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
	public String getPaciente_acompanante_id() {
		return paciente_acompanante_id;
	}
	public void setPaciente_acompanante_id(String paciente_acompanante_id) {
		this.paciente_acompanante_id = paciente_acompanante_id;
	}
	
	
	

}

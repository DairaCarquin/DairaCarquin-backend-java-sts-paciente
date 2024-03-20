package com.example.demo.entity.util;

public class AcompananteTable {
	private String nombre_completo ;
    private String ape_paterno ;
    private String ape_materno ;
    private String nombres ;
    private Integer id_tipo_docide;
    private String des_tipo_documento ;
    private String numero_documento ;
    private String fecha_nacimiento ;
    private Integer cod_parentesco;
    private String parentesco ;
    private String telf_contacto ;
    private String direccion ;
    private String codigo_ubigeo ;
    private Integer acompanante_paciente_id;
	public AcompananteTable(String nombre_completo, String ape_paterno, String ape_materno, String nombres,
			Integer id_tipo_docide, String des_tipo_documento, String numero_documento, String fecha_nacimiento,
			Integer cod_parentesco, String parentesco, String telf_contacto, String direccion, String codigo_ubigeo,
			Integer acompanante_paciente_id) {
		super();
		this.nombre_completo = nombre_completo;
		this.ape_paterno = ape_paterno;
		this.ape_materno = ape_materno;
		this.nombres = nombres;
		this.id_tipo_docide = id_tipo_docide;
		this.des_tipo_documento = des_tipo_documento;
		this.numero_documento = numero_documento;
		this.fecha_nacimiento = fecha_nacimiento;
		this.cod_parentesco = cod_parentesco;
		this.parentesco = parentesco;
		this.telf_contacto = telf_contacto;
		this.direccion = direccion;
		this.codigo_ubigeo = codigo_ubigeo;
		this.acompanante_paciente_id = acompanante_paciente_id;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
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
	public Integer getId_tipo_docide() {
		return id_tipo_docide;
	}
	public void setId_tipo_docide(Integer id_tipo_docide) {
		this.id_tipo_docide = id_tipo_docide;
	}
	public String getDes_tipo_documento() {
		return des_tipo_documento;
	}
	public void setDes_tipo_documento(String des_tipo_documento) {
		this.des_tipo_documento = des_tipo_documento;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getCod_parentesco() {
		return cod_parentesco;
	}
	public void setCod_parentesco(Integer cod_parentesco) {
		this.cod_parentesco = cod_parentesco;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getTelf_contacto() {
		return telf_contacto;
	}
	public void setTelf_contacto(String telf_contacto) {
		this.telf_contacto = telf_contacto;
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
	public Integer getAcompanante_paciente_id() {
		return acompanante_paciente_id;
	}
	public void setAcompanante_paciente_id(Integer acompanante_paciente_id) {
		this.acompanante_paciente_id = acompanante_paciente_id;
	}
    
    
}

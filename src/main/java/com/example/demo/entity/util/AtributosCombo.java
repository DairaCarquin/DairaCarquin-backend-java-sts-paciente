package com.example.demo.entity.util;

public class AtributosCombo {
    private Integer codigo;
    private String descripcion;
    private String valor; 
    
    public AtributosCombo(Integer codigo, String descripcion, String valor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor = valor;
    }
    
    public AtributosCombo(Integer codigo, String descripcion) {
        this(codigo, descripcion, descripcion);
    }
	
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
    
}

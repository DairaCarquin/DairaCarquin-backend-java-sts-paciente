package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UbigeoRepository;
import com.example.demo.entity.util.UbigeoEntity;

@Service
public class UbigeoService {

	@Autowired
	private UbigeoRepository ubigeoRepository;

	public List<UbigeoEntity> listarUbigeo(String departamento, String provincia) {
		List<Object[]> objUbigeo = ubigeoRepository.listartUbigeo(departamento, provincia);
		List<UbigeoEntity> listUbigeo = mapObject(objUbigeo);
		return listUbigeo;
	}

	private List<UbigeoEntity> mapObject(List<Object[]> resultados) {
		return resultados.stream().map(fila -> {
			String codigo = (String) fila[0];
			String descripcion = (String) fila[1];
			return new UbigeoEntity(codigo, descripcion);
		}).collect(Collectors.toList());
	}

}

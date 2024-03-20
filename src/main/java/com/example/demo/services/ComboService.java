package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ParentescoRepository;
import com.example.demo.dao.SexoRepository;
import com.example.demo.dao.TipoDocumentoEntidadRepository;
import com.example.demo.entity.util.AtributosCombo;
import com.example.demo.entity.util.ComboEntity;

@Service
public class ComboService {

	@Autowired
	private ParentescoRepository repoParentesco;

	@Autowired
	private SexoRepository repoSexo;

	@Autowired
	private TipoDocumentoEntidadRepository repoTipoDocumento;

	public ComboEntity listarCombos() {
		ComboEntity objCombo = new ComboEntity();

		List<Object[]> resultadoParentesco = repoParentesco.listarTipoParentescoActivo();
		List<Object[]> resultadoSexo = repoSexo.listarSexoActivo();
		List<Object[]> resultadoTipoDocumento = repoTipoDocumento.listarTipoDocumentoActivo();

		objCombo.setListParentesco(mapObject(resultadoParentesco));
		objCombo.setListSexo(mapObject(resultadoSexo));
		objCombo.setListTipoDocumnento(mapObject(resultadoTipoDocumento));

		return objCombo;

	}

	private List<AtributosCombo> mapObject(List<Object[]> resultados) {
		return resultados.stream().map(fila -> {
			Integer codigo = (Integer) fila[0];
			String descripcion = (String) fila[1];
			String valor = fila.length > 2 ? (String) fila[2] : descripcion;
			return new AtributosCombo(codigo, descripcion, valor);
		}).collect(Collectors.toList());
	}

}

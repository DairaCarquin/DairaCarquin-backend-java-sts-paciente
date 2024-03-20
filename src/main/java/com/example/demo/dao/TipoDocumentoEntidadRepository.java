package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TipoDocumentoEntidadEntity;


@Repository
public interface TipoDocumentoEntidadRepository extends JpaRepository<TipoDocumentoEntidadEntity, Integer> {
 	@Query(value = "SELECT * FROM \"Admision\".proc_get_tipo_documento_activo()", nativeQuery = true)
	List<Object[]> listarTipoDocumentoActivo();
}

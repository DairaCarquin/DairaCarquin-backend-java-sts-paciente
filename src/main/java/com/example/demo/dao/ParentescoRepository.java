package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ParentescoEntity;


@Repository
public interface ParentescoRepository  extends JpaRepository<ParentescoEntity, Integer>{
	@Query(value = "SELECT * FROM \"Admision\".proc_get_parentesco_activo()", nativeQuery = true)
	List<Object[]> listarTipoParentescoActivo();
}

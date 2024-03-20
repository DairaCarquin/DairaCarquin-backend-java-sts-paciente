package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SexoEntity;

@Repository
public interface SexoRepository extends JpaRepository<SexoEntity, Integer> {
	@Query(value = "SELECT * FROM \"Admision\".proc_get_sexo_activo()", nativeQuery = true)
	List<Object[]> listarSexoActivo();
}

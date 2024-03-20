package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UbigeoEntity;

@Repository
public interface UbigeoRepository extends JpaRepository<UbigeoEntity, String> {
	@Query(value = "SELECT * FROM \"Admision\".proc_ubigeo(:departamento, :provincia)", nativeQuery = true)
	List<Object[]> listartUbigeo(@Param("departamento") String departamento, @Param("provincia") String provincia);

}

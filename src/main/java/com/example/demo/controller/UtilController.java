package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.util.AtributosCombo;
import com.example.demo.entity.util.ComboEntity;
import com.example.demo.entity.util.UbigeoEntity;
import com.example.demo.services.ComboService;
import com.example.demo.services.UbigeoService;

@RestController
@RequestMapping("/util")
public class UtilController {
    @Autowired
    ComboService objectService;
    
    @Autowired
    UbigeoService ubigeoService;  
    
    
    @GetMapping(path = "/combos")
    public ResponseEntity<ComboEntity> getAllSexo() {
    	try {
    		 ComboEntity listCombo = objectService.listarCombos();
             return new ResponseEntity<>(listCombo, HttpStatus.OK);

		} catch (Exception e) {
			 String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
			 System.out.println(errorMessage);
			 
		    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
    }
    
    @GetMapping(path = "/ubigeo")
    public ResponseEntity<?> getUbigeo(
            @RequestParam(required = false) String codDepartamento,
            @RequestParam(required = false) String codProvincia) {
    	try {
    		if (codDepartamento != null && (codProvincia == null || codProvincia.isEmpty())) {
    			List<UbigeoEntity> listUbigeo = ubigeoService.listarUbigeo(codDepartamento, null); // Listar Provincias
                return new ResponseEntity<>(listUbigeo, HttpStatus.OK);	
    		} else if (codDepartamento != null && codProvincia != null) {
    			List<UbigeoEntity> listUbigeo = ubigeoService.listarUbigeo(codDepartamento,codProvincia); // Listar  Distrito
                return new ResponseEntity<>(listUbigeo, HttpStatus.OK);	
    		} else if ((codDepartamento == null || codDepartamento.isEmpty()) && (codProvincia == null || codProvincia.isEmpty())) {
    			List<UbigeoEntity> listUbigeo = ubigeoService.listarUbigeo("", null); // Listar departamentos
                return new ResponseEntity<>(listUbigeo, HttpStatus.OK);	
    		} else {
    		    String errorMessage = "Error: Parámetros inválidos";
    		    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    		}

		} catch (Exception e) {
			 String errorMessage = "Ha ocurrido un error interno: " + e.getMessage();
			 System.out.println(errorMessage);
			 
		    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
    }
    
    
}

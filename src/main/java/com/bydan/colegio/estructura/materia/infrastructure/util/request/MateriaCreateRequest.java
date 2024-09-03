package com.bydan.colegio.estructura.materia.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.estructura.materia.domain.model.Materia;

@Getter
@Setter
@AllArgsConstructor
public class MateriaCreateRequest {
	
	/*Long id=0L;*/
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_at;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private String codigo;
	
	private String nombre;
	
	private Boolean activo;
	
	public MateriaCreateRequest() {
		
		/*super();*/
		
		this.created_at = new Date();
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.codigo="";
 		this.nombre="";
 		this.activo=false;
	}
	
	public static void setMateria(MateriaCreateRequest materia_create_request1,Materia materia1) {
		materia1.setCreated_at(materia_create_request1.getCreated_at());
		materia1.setUpdated_at(materia_create_request1.getUpdated_at());
		materia1.setCodigo(materia_create_request1.getCodigo());
		materia1.setNombre(materia_create_request1.getNombre());
		materia1.setActivo(materia_create_request1.getActivo());
	}
	
	public static void setMaterias(ArrayList<MateriaCreateRequest> materia_create_requests,ArrayList<Materia> materias) {
		Materia materia1;
		
		for(MateriaCreateRequest materia_create_request1 : materia_create_requests) {
			materia1 = new Materia();

			MateriaCreateRequest.setMateria(materia_create_request1,materia1);

			materias.add(materia1);
		}
	}
}

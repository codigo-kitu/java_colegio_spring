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
public class MateriaUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private String codigo;
	
	private String nombre;
	
	private Boolean activo;
	
	public MateriaUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.codigo="";
 		this.nombre="";
 		this.activo=false;
	}
	
	public static void setMateria(MateriaUpdateRequest materia_update_request1,Materia materia1) {
		materia1.setId(materia_update_request1.getId());
		/*CAMPOS*/
 		materia1.setUpdated_at(materia_update_request1.getUpdated_at());
 		materia1.setCodigo(materia_update_request1.getCodigo());
 		materia1.setNombre(materia_update_request1.getNombre());
 		materia1.setActivo(materia_update_request1.getActivo());
	}
	
	public static void setMaterias(ArrayList<MateriaUpdateRequest> materia_update_requests,ArrayList<Materia> materias) {
		Materia materia1;
				
		for(MateriaUpdateRequest materia_update_request1 : materia_update_requests) {
			materia1 = new Materia();

			MateriaUpdateRequest.setMateria(materia_update_request1,materia1);

			materias.add(materia1);
		}
	}
}

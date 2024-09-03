package com.bydan.colegio.estructura.docente_materia.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;

@Getter
@Setter
@AllArgsConstructor
public class Docente_materiaCreateRequest {
	
	/*Long id=0L;*/
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_at;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_docente;
	
	private Long id_materia;
	
	public Docente_materiaCreateRequest() {
		
		/*super();*/
		
		this.created_at = new Date();
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_docente=-1L;
 		this.id_materia=-1L;
	}
	
	public static void setDocente_materia(Docente_materiaCreateRequest docente_materia_create_request1,Docente_materia docente_materia1) {
		docente_materia1.setCreated_at(docente_materia_create_request1.getCreated_at());
		docente_materia1.setUpdated_at(docente_materia_create_request1.getUpdated_at());
		docente_materia1.setId_docente(docente_materia_create_request1.getId_docente());
		docente_materia1.setId_materia(docente_materia_create_request1.getId_materia());
	}
	
	public static void setDocente_materias(ArrayList<Docente_materiaCreateRequest> docente_materia_create_requests,ArrayList<Docente_materia> docente_materias) {
		Docente_materia docente_materia1;
		
		for(Docente_materiaCreateRequest docente_materia_create_request1 : docente_materia_create_requests) {
			docente_materia1 = new Docente_materia();

			Docente_materiaCreateRequest.setDocente_materia(docente_materia_create_request1,docente_materia1);

			docente_materias.add(docente_materia1);
		}
	}
}

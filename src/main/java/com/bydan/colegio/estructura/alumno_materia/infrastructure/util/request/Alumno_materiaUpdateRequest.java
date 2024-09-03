package com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;

@Getter
@Setter
@AllArgsConstructor
public class Alumno_materiaUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_alumno;
	
	private Long id_materia;
	
	public Alumno_materiaUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.id_materia=-1L;
	}
	
	public static void setAlumno_materia(Alumno_materiaUpdateRequest alumno_materia_update_request1,Alumno_materia alumno_materia1) {
		alumno_materia1.setId(alumno_materia_update_request1.getId());
		/*CAMPOS*/
 		alumno_materia1.setUpdated_at(alumno_materia_update_request1.getUpdated_at());
 		alumno_materia1.setId_alumno(alumno_materia_update_request1.getId_alumno());
 		alumno_materia1.setId_materia(alumno_materia_update_request1.getId_materia());
	}
	
	public static void setAlumno_materias(ArrayList<Alumno_materiaUpdateRequest> alumno_materia_update_requests,ArrayList<Alumno_materia> alumno_materias) {
		Alumno_materia alumno_materia1;
				
		for(Alumno_materiaUpdateRequest alumno_materia_update_request1 : alumno_materia_update_requests) {
			alumno_materia1 = new Alumno_materia();

			Alumno_materiaUpdateRequest.setAlumno_materia(alumno_materia_update_request1,alumno_materia1);

			alumno_materias.add(alumno_materia1);
		}
	}
}

package com.bydan.colegio.estructura.docente.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.estructura.docente.domain.model.Docente;

@Getter
@Setter
@AllArgsConstructor
public class DocenteUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private String nombre;
	
	private String apellido;
	
	private Date fecha_nacimiento;
	
	private Integer anios_experiencia;
	
	private Double nota_evaluacion;
	
	public DocenteUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.nombre="";
 		this.apellido="";
 		this.fecha_nacimiento=new Date();
 		this.anios_experiencia=0;
 		this.nota_evaluacion=0.0;
	}
	
	public static void setDocente(DocenteUpdateRequest docente_update_request1,Docente docente1) {
		docente1.setId(docente_update_request1.getId());
		/*CAMPOS*/
 		docente1.setUpdated_at(docente_update_request1.getUpdated_at());
 		docente1.setNombre(docente_update_request1.getNombre());
 		docente1.setApellido(docente_update_request1.getApellido());
 		docente1.setFecha_nacimiento(docente_update_request1.getFecha_nacimiento());
 		docente1.setAnios_experiencia(docente_update_request1.getAnios_experiencia());
 		docente1.setNota_evaluacion(docente_update_request1.getNota_evaluacion());
	}
	
	public static void setDocentes(ArrayList<DocenteUpdateRequest> docente_update_requests,ArrayList<Docente> docentes) {
		Docente docente1;
				
		for(DocenteUpdateRequest docente_update_request1 : docente_update_requests) {
			docente1 = new Docente();

			DocenteUpdateRequest.setDocente(docente_update_request1,docente1);

			docentes.add(docente1);
		}
	}
}

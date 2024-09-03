package com.bydan.colegio.estructura.alumno.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;

@Getter
@Setter
@AllArgsConstructor
public class AlumnoCreateRequest {
	
	/*Long id=0L;*/
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_at;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private String nombre;
	
	private String apellido;
	
	private Date fecha_nacimiento;
	
	public AlumnoCreateRequest() {
		
		/*super();*/
		
		this.created_at = new Date();
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.nombre="";
 		this.apellido="";
 		this.fecha_nacimiento=new Date();
	}
	
	public static void setAlumno(AlumnoCreateRequest alumno_create_request1,Alumno alumno1) {
		alumno1.setCreated_at(alumno_create_request1.getCreated_at());
		alumno1.setUpdated_at(alumno_create_request1.getUpdated_at());
		alumno1.setNombre(alumno_create_request1.getNombre());
		alumno1.setApellido(alumno_create_request1.getApellido());
		alumno1.setFecha_nacimiento(alumno_create_request1.getFecha_nacimiento());
	}
	
	public static void setAlumnos(ArrayList<AlumnoCreateRequest> alumno_create_requests,ArrayList<Alumno> alumnos) {
		Alumno alumno1;
		
		for(AlumnoCreateRequest alumno_create_request1 : alumno_create_requests) {
			alumno1 = new Alumno();

			AlumnoCreateRequest.setAlumno(alumno_create_request1,alumno1);

			alumnos.add(alumno1);
		}
	}
}

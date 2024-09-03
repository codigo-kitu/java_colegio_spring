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
public class AlumnoUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private String nombre;
	
	private String apellido;
	
	private Date fecha_nacimiento;
	
	public AlumnoUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.nombre="";
 		this.apellido="";
 		this.fecha_nacimiento=new Date();
	}
	
	public static void setAlumno(AlumnoUpdateRequest alumno_update_request1,Alumno alumno1) {
		alumno1.setId(alumno_update_request1.getId());
		/*CAMPOS*/
 		alumno1.setUpdated_at(alumno_update_request1.getUpdated_at());
 		alumno1.setNombre(alumno_update_request1.getNombre());
 		alumno1.setApellido(alumno_update_request1.getApellido());
 		alumno1.setFecha_nacimiento(alumno_update_request1.getFecha_nacimiento());
	}
	
	public static void setAlumnos(ArrayList<AlumnoUpdateRequest> alumno_update_requests,ArrayList<Alumno> alumnos) {
		Alumno alumno1;
				
		for(AlumnoUpdateRequest alumno_update_request1 : alumno_update_requests) {
			alumno1 = new Alumno();

			AlumnoUpdateRequest.setAlumno(alumno_update_request1,alumno1);

			alumnos.add(alumno1);
		}
	}
}

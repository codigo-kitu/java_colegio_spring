package com.bydan.colegio.estructura.alumno.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;
import com.bydan.colegio.estructura.alumno.infrastructure.util.request.AlumnoCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class AlumnoCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (alumno) ---*/
	
	private AlumnoCreateRequest alumno;
	
	public AlumnoCreateRequestGlobal() {
		this.alumno = new AlumnoCreateRequest();
	}	
	
	

	public static void setAlumno(AlumnoCreateRequest alumnoCreateRequest1,Alumno alumno1) {
		AlumnoCreateRequest.setAlumno(alumnoCreateRequest1,alumno1);
	}
	
	public static void setAlumnos(ArrayList<AlumnoCreateRequest> alumnoCreateRequests,ArrayList<Alumno> alumnos) {
		AlumnoCreateRequest.setAlumnos(alumnoCreateRequests,alumnos);
	}
	
}
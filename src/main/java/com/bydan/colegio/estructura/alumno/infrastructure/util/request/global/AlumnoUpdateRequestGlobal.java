package com.bydan.colegio.estructura.alumno.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;
import com.bydan.colegio.estructura.alumno.infrastructure.util.request.AlumnoUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class AlumnoUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (alumno) ---*/
	
	private AlumnoUpdateRequest alumno;
	
	public AlumnoUpdateRequestGlobal() {
		this.alumno = new AlumnoUpdateRequest();
	}	
	
	
		
	public static void setAlumno(AlumnoUpdateRequest alumnoUpdateRequest1,Alumno alumno1) {
		AlumnoUpdateRequest.setAlumno(alumnoUpdateRequest1,alumno1);
	}
	
	public static void setAlumnos(ArrayList<AlumnoUpdateRequest> alumnoUpdateRequests,ArrayList<Alumno> alumnos) {
		AlumnoUpdateRequest.setAlumnos(alumnoUpdateRequests,alumnos);
	}
	
}
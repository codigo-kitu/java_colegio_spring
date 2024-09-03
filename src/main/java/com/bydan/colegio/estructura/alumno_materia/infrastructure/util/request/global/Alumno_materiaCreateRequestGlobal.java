package com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;
import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.Alumno_materiaCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class Alumno_materiaCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (alumno_materia) ---*/
	
	private Alumno_materiaCreateRequest alumno_materia;
	
	public Alumno_materiaCreateRequestGlobal() {
		this.alumno_materia = new Alumno_materiaCreateRequest();
	}	
	
	

	public static void setAlumno_materia(Alumno_materiaCreateRequest alumno_materiaCreateRequest1,Alumno_materia alumno_materia1) {
		Alumno_materiaCreateRequest.setAlumno_materia(alumno_materiaCreateRequest1,alumno_materia1);
	}
	
	public static void setAlumno_materias(ArrayList<Alumno_materiaCreateRequest> alumno_materiaCreateRequests,ArrayList<Alumno_materia> alumno_materias) {
		Alumno_materiaCreateRequest.setAlumno_materias(alumno_materiaCreateRequests,alumno_materias);
	}
	
}
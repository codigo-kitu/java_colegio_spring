package com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;
import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.Alumno_materiaUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class Alumno_materiaUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (alumno_materia) ---*/
	
	private Alumno_materiaUpdateRequest alumno_materia;
	
	public Alumno_materiaUpdateRequestGlobal() {
		this.alumno_materia = new Alumno_materiaUpdateRequest();
	}	
	
	
		
	public static void setAlumno_materia(Alumno_materiaUpdateRequest alumno_materiaUpdateRequest1,Alumno_materia alumno_materia1) {
		Alumno_materiaUpdateRequest.setAlumno_materia(alumno_materiaUpdateRequest1,alumno_materia1);
	}
	
	public static void setAlumno_materias(ArrayList<Alumno_materiaUpdateRequest> alumno_materiaUpdateRequests,ArrayList<Alumno_materia> alumno_materias) {
		Alumno_materiaUpdateRequest.setAlumno_materias(alumno_materiaUpdateRequests,alumno_materias);
	}
	
}
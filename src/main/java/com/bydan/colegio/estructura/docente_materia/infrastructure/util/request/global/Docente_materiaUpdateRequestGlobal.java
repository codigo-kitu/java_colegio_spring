package com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;
import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.Docente_materiaUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class Docente_materiaUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (docente_materia) ---*/
	
	private Docente_materiaUpdateRequest docente_materia;
	
	public Docente_materiaUpdateRequestGlobal() {
		this.docente_materia = new Docente_materiaUpdateRequest();
	}	
	
	
		
	public static void setDocente_materia(Docente_materiaUpdateRequest docente_materiaUpdateRequest1,Docente_materia docente_materia1) {
		Docente_materiaUpdateRequest.setDocente_materia(docente_materiaUpdateRequest1,docente_materia1);
	}
	
	public static void setDocente_materias(ArrayList<Docente_materiaUpdateRequest> docente_materiaUpdateRequests,ArrayList<Docente_materia> docente_materias) {
		Docente_materiaUpdateRequest.setDocente_materias(docente_materiaUpdateRequests,docente_materias);
	}
	
}
package com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;
import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.Docente_materiaCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class Docente_materiaCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (docente_materia) ---*/
	
	private Docente_materiaCreateRequest docente_materia;
	
	public Docente_materiaCreateRequestGlobal() {
		this.docente_materia = new Docente_materiaCreateRequest();
	}	
	
	

	public static void setDocente_materia(Docente_materiaCreateRequest docente_materiaCreateRequest1,Docente_materia docente_materia1) {
		Docente_materiaCreateRequest.setDocente_materia(docente_materiaCreateRequest1,docente_materia1);
	}
	
	public static void setDocente_materias(ArrayList<Docente_materiaCreateRequest> docente_materiaCreateRequests,ArrayList<Docente_materia> docente_materias) {
		Docente_materiaCreateRequest.setDocente_materias(docente_materiaCreateRequests,docente_materias);
	}
	
}
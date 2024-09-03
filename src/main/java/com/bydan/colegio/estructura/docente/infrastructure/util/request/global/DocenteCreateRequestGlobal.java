package com.bydan.colegio.estructura.docente.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.docente.domain.model.Docente;
import com.bydan.colegio.estructura.docente.infrastructure.util.request.DocenteCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class DocenteCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (docente) ---*/
	
	private DocenteCreateRequest docente;
	
	public DocenteCreateRequestGlobal() {
		this.docente = new DocenteCreateRequest();
	}	
	
	

	public static void setDocente(DocenteCreateRequest docenteCreateRequest1,Docente docente1) {
		DocenteCreateRequest.setDocente(docenteCreateRequest1,docente1);
	}
	
	public static void setDocentes(ArrayList<DocenteCreateRequest> docenteCreateRequests,ArrayList<Docente> docentes) {
		DocenteCreateRequest.setDocentes(docenteCreateRequests,docentes);
	}
	
}
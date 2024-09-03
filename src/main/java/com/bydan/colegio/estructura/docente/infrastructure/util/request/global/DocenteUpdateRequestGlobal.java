package com.bydan.colegio.estructura.docente.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.docente.domain.model.Docente;
import com.bydan.colegio.estructura.docente.infrastructure.util.request.DocenteUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class DocenteUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (docente) ---*/
	
	private DocenteUpdateRequest docente;
	
	public DocenteUpdateRequestGlobal() {
		this.docente = new DocenteUpdateRequest();
	}	
	
	
		
	public static void setDocente(DocenteUpdateRequest docenteUpdateRequest1,Docente docente1) {
		DocenteUpdateRequest.setDocente(docenteUpdateRequest1,docente1);
	}
	
	public static void setDocentes(ArrayList<DocenteUpdateRequest> docenteUpdateRequests,ArrayList<Docente> docentes) {
		DocenteUpdateRequest.setDocentes(docenteUpdateRequests,docentes);
	}
	
}
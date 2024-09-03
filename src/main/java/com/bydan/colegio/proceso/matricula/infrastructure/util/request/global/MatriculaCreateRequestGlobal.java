package com.bydan.colegio.proceso.matricula.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;
import com.bydan.colegio.proceso.matricula.infrastructure.util.request.MatriculaCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class MatriculaCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (matricula) ---*/
	
	private MatriculaCreateRequest matricula;
	
	public MatriculaCreateRequestGlobal() {
		this.matricula = new MatriculaCreateRequest();
	}	
	
	

	public static void setMatricula(MatriculaCreateRequest matriculaCreateRequest1,Matricula matricula1) {
		MatriculaCreateRequest.setMatricula(matriculaCreateRequest1,matricula1);
	}
	
	public static void setMatriculas(ArrayList<MatriculaCreateRequest> matriculaCreateRequests,ArrayList<Matricula> matriculas) {
		MatriculaCreateRequest.setMatriculas(matriculaCreateRequests,matriculas);
	}
	
}
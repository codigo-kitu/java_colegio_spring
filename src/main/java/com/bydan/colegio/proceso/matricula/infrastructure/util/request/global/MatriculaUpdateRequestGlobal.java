package com.bydan.colegio.proceso.matricula.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;
import com.bydan.colegio.proceso.matricula.infrastructure.util.request.MatriculaUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class MatriculaUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (matricula) ---*/
	
	private MatriculaUpdateRequest matricula;
	
	public MatriculaUpdateRequestGlobal() {
		this.matricula = new MatriculaUpdateRequest();
	}	
	
	
		
	public static void setMatricula(MatriculaUpdateRequest matriculaUpdateRequest1,Matricula matricula1) {
		MatriculaUpdateRequest.setMatricula(matriculaUpdateRequest1,matricula1);
	}
	
	public static void setMatriculas(ArrayList<MatriculaUpdateRequest> matriculaUpdateRequests,ArrayList<Matricula> matriculas) {
		MatriculaUpdateRequest.setMatriculas(matriculaUpdateRequests,matriculas);
	}
	
}
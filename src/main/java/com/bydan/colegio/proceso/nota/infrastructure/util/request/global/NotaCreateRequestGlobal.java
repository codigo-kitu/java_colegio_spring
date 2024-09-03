package com.bydan.colegio.proceso.nota.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.proceso.nota.domain.model.Nota;
import com.bydan.colegio.proceso.nota.infrastructure.util.request.NotaCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class NotaCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (nota) ---*/
	
	private NotaCreateRequest nota;
	
	public NotaCreateRequestGlobal() {
		this.nota = new NotaCreateRequest();
	}	
	
	

	public static void setNota(NotaCreateRequest notaCreateRequest1,Nota nota1) {
		NotaCreateRequest.setNota(notaCreateRequest1,nota1);
	}
	
	public static void setNotas(ArrayList<NotaCreateRequest> notaCreateRequests,ArrayList<Nota> notas) {
		NotaCreateRequest.setNotas(notaCreateRequests,notas);
	}
	
}
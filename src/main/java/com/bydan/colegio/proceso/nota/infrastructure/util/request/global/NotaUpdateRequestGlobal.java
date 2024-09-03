package com.bydan.colegio.proceso.nota.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.proceso.nota.domain.model.Nota;
import com.bydan.colegio.proceso.nota.infrastructure.util.request.NotaUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class NotaUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (nota) ---*/
	
	private NotaUpdateRequest nota;
	
	public NotaUpdateRequestGlobal() {
		this.nota = new NotaUpdateRequest();
	}	
	
	
		
	public static void setNota(NotaUpdateRequest notaUpdateRequest1,Nota nota1) {
		NotaUpdateRequest.setNota(notaUpdateRequest1,nota1);
	}
	
	public static void setNotas(ArrayList<NotaUpdateRequest> notaUpdateRequests,ArrayList<Nota> notas) {
		NotaUpdateRequest.setNotas(notaUpdateRequests,notas);
	}
	
}
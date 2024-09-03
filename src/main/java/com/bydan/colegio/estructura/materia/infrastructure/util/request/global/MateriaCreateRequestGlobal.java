package com.bydan.colegio.estructura.materia.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.materia.domain.model.Materia;
import com.bydan.colegio.estructura.materia.infrastructure.util.request.MateriaCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class MateriaCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (materia) ---*/
	
	private MateriaCreateRequest materia;
	
	public MateriaCreateRequestGlobal() {
		this.materia = new MateriaCreateRequest();
	}	
	
	

	public static void setMateria(MateriaCreateRequest materiaCreateRequest1,Materia materia1) {
		MateriaCreateRequest.setMateria(materiaCreateRequest1,materia1);
	}
	
	public static void setMaterias(ArrayList<MateriaCreateRequest> materiaCreateRequests,ArrayList<Materia> materias) {
		MateriaCreateRequest.setMaterias(materiaCreateRequests,materias);
	}
	
}
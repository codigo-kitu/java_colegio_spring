package com.bydan.colegio.estructura.materia.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.estructura.materia.domain.model.Materia;
import com.bydan.colegio.estructura.materia.infrastructure.util.request.MateriaUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class MateriaUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (materia) ---*/
	
	private MateriaUpdateRequest materia;
	
	public MateriaUpdateRequestGlobal() {
		this.materia = new MateriaUpdateRequest();
	}	
	
	
		
	public static void setMateria(MateriaUpdateRequest materiaUpdateRequest1,Materia materia1) {
		MateriaUpdateRequest.setMateria(materiaUpdateRequest1,materia1);
	}
	
	public static void setMaterias(ArrayList<MateriaUpdateRequest> materiaUpdateRequests,ArrayList<Materia> materias) {
		MateriaUpdateRequest.setMaterias(materiaUpdateRequests,materias);
	}
	
}
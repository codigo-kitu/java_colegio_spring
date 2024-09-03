package com.bydan.colegio.financiero.sueldo.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;
import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.SueldoUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class SueldoUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (sueldo) ---*/
	
	private SueldoUpdateRequest sueldo;
	
	public SueldoUpdateRequestGlobal() {
		this.sueldo = new SueldoUpdateRequest();
	}	
	
	
		
	public static void setSueldo(SueldoUpdateRequest sueldoUpdateRequest1,Sueldo sueldo1) {
		SueldoUpdateRequest.setSueldo(sueldoUpdateRequest1,sueldo1);
	}
	
	public static void setSueldos(ArrayList<SueldoUpdateRequest> sueldoUpdateRequests,ArrayList<Sueldo> sueldos) {
		SueldoUpdateRequest.setSueldos(sueldoUpdateRequests,sueldos);
	}
	
}
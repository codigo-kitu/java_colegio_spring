package com.bydan.colegio.financiero.sueldo.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;
import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.SueldoCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class SueldoCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (sueldo) ---*/
	
	private SueldoCreateRequest sueldo;
	
	public SueldoCreateRequestGlobal() {
		this.sueldo = new SueldoCreateRequest();
	}	
	
	

	public static void setSueldo(SueldoCreateRequest sueldoCreateRequest1,Sueldo sueldo1) {
		SueldoCreateRequest.setSueldo(sueldoCreateRequest1,sueldo1);
	}
	
	public static void setSueldos(ArrayList<SueldoCreateRequest> sueldoCreateRequests,ArrayList<Sueldo> sueldos) {
		SueldoCreateRequest.setSueldos(sueldoCreateRequests,sueldos);
	}
	
}
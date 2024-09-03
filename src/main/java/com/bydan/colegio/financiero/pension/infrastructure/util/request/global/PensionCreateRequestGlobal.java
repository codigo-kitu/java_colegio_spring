package com.bydan.colegio.financiero.pension.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.financiero.pension.domain.model.Pension;
import com.bydan.colegio.financiero.pension.infrastructure.util.request.PensionCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class PensionCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (pension) ---*/
	
	private PensionCreateRequest pension;
	
	public PensionCreateRequestGlobal() {
		this.pension = new PensionCreateRequest();
	}	
	
	

	public static void setPension(PensionCreateRequest pensionCreateRequest1,Pension pension1) {
		PensionCreateRequest.setPension(pensionCreateRequest1,pension1);
	}
	
	public static void setPensions(ArrayList<PensionCreateRequest> pensionCreateRequests,ArrayList<Pension> pensions) {
		PensionCreateRequest.setPensions(pensionCreateRequests,pensions);
	}
	
}
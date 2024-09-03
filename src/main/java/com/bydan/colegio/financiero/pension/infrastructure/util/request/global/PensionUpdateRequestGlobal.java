package com.bydan.colegio.financiero.pension.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.financiero.pension.domain.model.Pension;
import com.bydan.colegio.financiero.pension.infrastructure.util.request.PensionUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class PensionUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (pension) ---*/
	
	private PensionUpdateRequest pension;
	
	public PensionUpdateRequestGlobal() {
		this.pension = new PensionUpdateRequest();
	}	
	
	
		
	public static void setPension(PensionUpdateRequest pensionUpdateRequest1,Pension pension1) {
		PensionUpdateRequest.setPension(pensionUpdateRequest1,pension1);
	}
	
	public static void setPensions(ArrayList<PensionUpdateRequest> pensionUpdateRequests,ArrayList<Pension> pensions) {
		PensionUpdateRequest.setPensions(pensionUpdateRequests,pensions);
	}
	
}
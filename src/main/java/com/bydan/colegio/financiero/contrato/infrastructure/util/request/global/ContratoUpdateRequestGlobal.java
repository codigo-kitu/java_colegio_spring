package com.bydan.colegio.financiero.contrato.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;
import com.bydan.colegio.financiero.contrato.infrastructure.util.request.ContratoUpdateRequest;

@Getter
@Setter
@AllArgsConstructor
public class ContratoUpdateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (contrato) ---*/
	
	private ContratoUpdateRequest contrato;
	
	public ContratoUpdateRequestGlobal() {
		this.contrato = new ContratoUpdateRequest();
	}	
	
	
		
	public static void setContrato(ContratoUpdateRequest contratoUpdateRequest1,Contrato contrato1) {
		ContratoUpdateRequest.setContrato(contratoUpdateRequest1,contrato1);
	}
	
	public static void setContratos(ArrayList<ContratoUpdateRequest> contratoUpdateRequests,ArrayList<Contrato> contratos) {
		ContratoUpdateRequest.setContratos(contratoUpdateRequests,contratos);
	}
	
}
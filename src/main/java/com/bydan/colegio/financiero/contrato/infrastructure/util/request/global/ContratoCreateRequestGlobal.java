package com.bydan.colegio.financiero.contrato.infrastructure.util.request.global;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;
import com.bydan.colegio.financiero.contrato.infrastructure.util.request.ContratoCreateRequest;

@Getter
@Setter
@AllArgsConstructor
public class ContratoCreateRequestGlobal {
	
	/*--- NOMBRE DEBE COINCIDIR CON NOMBRE DE JSON (contrato) ---*/
	
	private ContratoCreateRequest contrato;
	
	public ContratoCreateRequestGlobal() {
		this.contrato = new ContratoCreateRequest();
	}	
	
	

	public static void setContrato(ContratoCreateRequest contratoCreateRequest1,Contrato contrato1) {
		ContratoCreateRequest.setContrato(contratoCreateRequest1,contrato1);
	}
	
	public static void setContratos(ArrayList<ContratoCreateRequest> contratoCreateRequests,ArrayList<Contrato> contratos) {
		ContratoCreateRequest.setContratos(contratoCreateRequests,contratos);
	}
	
}
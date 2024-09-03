package com.bydan.colegio.financiero.contrato.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;

@Getter
@Setter
@AllArgsConstructor
public class ContratoUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Integer anio;
	
	private Double valor;
	
	private Date fecha;
	
	private Boolean firmado;
	
	public ContratoUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.anio=0;
 		this.valor=0.0;
 		this.fecha=new Date();
 		this.firmado=false;
	}
	
	public static void setContrato(ContratoUpdateRequest contrato_update_request1,Contrato contrato1) {
		contrato1.setId(contrato_update_request1.getId());
		/*CAMPOS*/
 		contrato1.setUpdated_at(contrato_update_request1.getUpdated_at());
 		contrato1.setAnio(contrato_update_request1.getAnio());
 		contrato1.setValor(contrato_update_request1.getValor());
 		contrato1.setFecha(contrato_update_request1.getFecha());
 		contrato1.setFirmado(contrato_update_request1.getFirmado());
	}
	
	public static void setContratos(ArrayList<ContratoUpdateRequest> contrato_update_requests,ArrayList<Contrato> contratos) {
		Contrato contrato1;
				
		for(ContratoUpdateRequest contrato_update_request1 : contrato_update_requests) {
			contrato1 = new Contrato();

			ContratoUpdateRequest.setContrato(contrato_update_request1,contrato1);

			contratos.add(contrato1);
		}
	}
}

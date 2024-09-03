package com.bydan.colegio.financiero.pension.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.financiero.pension.domain.model.Pension;

@Getter
@Setter
@AllArgsConstructor
public class PensionCreateRequest {
	
	/*Long id=0L;*/
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_at;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_alumno;
	
	private Integer anio;
	
	private Short mes;
	
	private Double valor;
	
	private Boolean cobrado;
	
	public PensionCreateRequest() {
		
		/*super();*/
		
		this.created_at = new Date();
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.anio=0;
 		this.mes=Short.parseShort("0");
 		this.valor=0.0;
 		this.cobrado=false;
	}
	
	public static void setPension(PensionCreateRequest pension_create_request1,Pension pension1) {
		pension1.setCreated_at(pension_create_request1.getCreated_at());
		pension1.setUpdated_at(pension_create_request1.getUpdated_at());
		pension1.setId_alumno(pension_create_request1.getId_alumno());
		pension1.setAnio(pension_create_request1.getAnio());
		pension1.setMes(pension_create_request1.getMes());
		pension1.setValor(pension_create_request1.getValor());
		pension1.setCobrado(pension_create_request1.getCobrado());
	}
	
	public static void setPensions(ArrayList<PensionCreateRequest> pension_create_requests,ArrayList<Pension> pensions) {
		Pension pension1;
		
		for(PensionCreateRequest pension_create_request1 : pension_create_requests) {
			pension1 = new Pension();

			PensionCreateRequest.setPension(pension_create_request1,pension1);

			pensions.add(pension1);
		}
	}
}

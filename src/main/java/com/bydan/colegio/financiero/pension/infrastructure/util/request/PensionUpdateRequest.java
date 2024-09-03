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
public class PensionUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_alumno;
	
	private Integer anio;
	
	private Short mes;
	
	private Double valor;
	
	private Boolean cobrado;
	
	public PensionUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.anio=0;
 		this.mes=Short.parseShort("0");
 		this.valor=0.0;
 		this.cobrado=false;
	}
	
	public static void setPension(PensionUpdateRequest pension_update_request1,Pension pension1) {
		pension1.setId(pension_update_request1.getId());
		/*CAMPOS*/
 		pension1.setUpdated_at(pension_update_request1.getUpdated_at());
 		pension1.setId_alumno(pension_update_request1.getId_alumno());
 		pension1.setAnio(pension_update_request1.getAnio());
 		pension1.setMes(pension_update_request1.getMes());
 		pension1.setValor(pension_update_request1.getValor());
 		pension1.setCobrado(pension_update_request1.getCobrado());
	}
	
	public static void setPensions(ArrayList<PensionUpdateRequest> pension_update_requests,ArrayList<Pension> pensions) {
		Pension pension1;
				
		for(PensionUpdateRequest pension_update_request1 : pension_update_requests) {
			pension1 = new Pension();

			PensionUpdateRequest.setPension(pension_update_request1,pension1);

			pensions.add(pension1);
		}
	}
}

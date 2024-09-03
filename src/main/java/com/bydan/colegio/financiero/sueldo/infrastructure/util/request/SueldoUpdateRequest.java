package com.bydan.colegio.financiero.sueldo.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;

@Getter
@Setter
@AllArgsConstructor
public class SueldoUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_docente;
	
	private Integer anio;
	
	private Short mes;
	
	private Double valor;
	
	private Boolean cobrado;
	
	public SueldoUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_docente=-1L;
 		this.anio=0;
 		this.mes=Short.parseShort("0");
 		this.valor=0.0;
 		this.cobrado=false;
	}
	
	public static void setSueldo(SueldoUpdateRequest sueldo_update_request1,Sueldo sueldo1) {
		sueldo1.setId(sueldo_update_request1.getId());
		/*CAMPOS*/
 		sueldo1.setUpdated_at(sueldo_update_request1.getUpdated_at());
 		sueldo1.setId_docente(sueldo_update_request1.getId_docente());
 		sueldo1.setAnio(sueldo_update_request1.getAnio());
 		sueldo1.setMes(sueldo_update_request1.getMes());
 		sueldo1.setValor(sueldo_update_request1.getValor());
 		sueldo1.setCobrado(sueldo_update_request1.getCobrado());
	}
	
	public static void setSueldos(ArrayList<SueldoUpdateRequest> sueldo_update_requests,ArrayList<Sueldo> sueldos) {
		Sueldo sueldo1;
				
		for(SueldoUpdateRequest sueldo_update_request1 : sueldo_update_requests) {
			sueldo1 = new Sueldo();

			SueldoUpdateRequest.setSueldo(sueldo_update_request1,sueldo1);

			sueldos.add(sueldo1);
		}
	}
}

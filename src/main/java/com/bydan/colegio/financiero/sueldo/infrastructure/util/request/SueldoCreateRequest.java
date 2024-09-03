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
public class SueldoCreateRequest {
	
	/*Long id=0L;*/
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_at;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_docente;
	
	private Integer anio;
	
	private Short mes;
	
	private Double valor;
	
	private Boolean cobrado;
	
	public SueldoCreateRequest() {
		
		/*super();*/
		
		this.created_at = new Date();
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_docente=-1L;
 		this.anio=0;
 		this.mes=Short.parseShort("0");
 		this.valor=0.0;
 		this.cobrado=false;
	}
	
	public static void setSueldo(SueldoCreateRequest sueldo_create_request1,Sueldo sueldo1) {
		sueldo1.setCreated_at(sueldo_create_request1.getCreated_at());
		sueldo1.setUpdated_at(sueldo_create_request1.getUpdated_at());
		sueldo1.setId_docente(sueldo_create_request1.getId_docente());
		sueldo1.setAnio(sueldo_create_request1.getAnio());
		sueldo1.setMes(sueldo_create_request1.getMes());
		sueldo1.setValor(sueldo_create_request1.getValor());
		sueldo1.setCobrado(sueldo_create_request1.getCobrado());
	}
	
	public static void setSueldos(ArrayList<SueldoCreateRequest> sueldo_create_requests,ArrayList<Sueldo> sueldos) {
		Sueldo sueldo1;
		
		for(SueldoCreateRequest sueldo_create_request1 : sueldo_create_requests) {
			sueldo1 = new Sueldo();

			SueldoCreateRequest.setSueldo(sueldo_create_request1,sueldo1);

			sueldos.add(sueldo1);
		}
	}
}

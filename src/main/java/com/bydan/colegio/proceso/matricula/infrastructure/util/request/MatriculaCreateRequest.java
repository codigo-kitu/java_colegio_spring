package com.bydan.colegio.proceso.matricula.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;

@Getter
@Setter
@AllArgsConstructor
public class MatriculaCreateRequest {
	
	/*Long id=0L;*/
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_at;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Integer anio;
	
	private Double costo;
	
	private Date fecha;
	
	private Boolean pagado;
	
	public MatriculaCreateRequest() {
		
		/*super();*/
		
		this.created_at = new Date();
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.anio=0;
 		this.costo=0.0;
 		this.fecha=new Date();
 		this.pagado=false;
	}
	
	public static void setMatricula(MatriculaCreateRequest matricula_create_request1,Matricula matricula1) {
		matricula1.setCreated_at(matricula_create_request1.getCreated_at());
		matricula1.setUpdated_at(matricula_create_request1.getUpdated_at());
		matricula1.setAnio(matricula_create_request1.getAnio());
		matricula1.setCosto(matricula_create_request1.getCosto());
		matricula1.setFecha(matricula_create_request1.getFecha());
		matricula1.setPagado(matricula_create_request1.getPagado());
	}
	
	public static void setMatriculas(ArrayList<MatriculaCreateRequest> matricula_create_requests,ArrayList<Matricula> matriculas) {
		Matricula matricula1;
		
		for(MatriculaCreateRequest matricula_create_request1 : matricula_create_requests) {
			matricula1 = new Matricula();

			MatriculaCreateRequest.setMatricula(matricula_create_request1,matricula1);

			matriculas.add(matricula1);
		}
	}
}

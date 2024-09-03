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
public class MatriculaUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Integer anio;
	
	private Double costo;
	
	private Date fecha;
	
	private Boolean pagado;
	
	public MatriculaUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.anio=0;
 		this.costo=0.0;
 		this.fecha=new Date();
 		this.pagado=false;
	}
	
	public static void setMatricula(MatriculaUpdateRequest matricula_update_request1,Matricula matricula1) {
		matricula1.setId(matricula_update_request1.getId());
		/*CAMPOS*/
 		matricula1.setUpdated_at(matricula_update_request1.getUpdated_at());
 		matricula1.setAnio(matricula_update_request1.getAnio());
 		matricula1.setCosto(matricula_update_request1.getCosto());
 		matricula1.setFecha(matricula_update_request1.getFecha());
 		matricula1.setPagado(matricula_update_request1.getPagado());
	}
	
	public static void setMatriculas(ArrayList<MatriculaUpdateRequest> matricula_update_requests,ArrayList<Matricula> matriculas) {
		Matricula matricula1;
				
		for(MatriculaUpdateRequest matricula_update_request1 : matricula_update_requests) {
			matricula1 = new Matricula();

			MatriculaUpdateRequest.setMatricula(matricula_update_request1,matricula1);

			matriculas.add(matricula1);
		}
	}
}

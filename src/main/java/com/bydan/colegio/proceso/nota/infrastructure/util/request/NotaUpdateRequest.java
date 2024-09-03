package com.bydan.colegio.proceso.nota.infrastructure.util.request;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.bydan.colegio.proceso.nota.domain.model.Nota;

@Getter
@Setter
@AllArgsConstructor
public class NotaUpdateRequest {
	
	Long id=0L;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated_at;
	
	/*CAMPOS*/
	
	private Long id_alumno;
	
	private Long id_materia;
	
	private Long id_docente;
	
	private Double nota_prueba;
	
	private Double nota_trabajo;
	
	private Double nota_examen;
	
	private Double nota_final;
	
	public NotaUpdateRequest() {
		
		//super();
		
		this.id=0L;
		this.updated_at = new Date();
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.id_materia=-1L;
 		this.id_docente=-1L;
 		this.nota_prueba=0.0;
 		this.nota_trabajo=0.0;
 		this.nota_examen=0.0;
 		this.nota_final=0.0;
	}
	
	public static void setNota(NotaUpdateRequest nota_update_request1,Nota nota1) {
		nota1.setId(nota_update_request1.getId());
		/*CAMPOS*/
 		nota1.setUpdated_at(nota_update_request1.getUpdated_at());
 		nota1.setId_alumno(nota_update_request1.getId_alumno());
 		nota1.setId_materia(nota_update_request1.getId_materia());
 		nota1.setId_docente(nota_update_request1.getId_docente());
 		nota1.setNota_prueba(nota_update_request1.getNota_prueba());
 		nota1.setNota_trabajo(nota_update_request1.getNota_trabajo());
 		nota1.setNota_examen(nota_update_request1.getNota_examen());
 		nota1.setNota_final(nota_update_request1.getNota_final());
	}
	
	public static void setNotas(ArrayList<NotaUpdateRequest> nota_update_requests,ArrayList<Nota> notas) {
		Nota nota1;
				
		for(NotaUpdateRequest nota_update_request1 : nota_update_requests) {
			nota1 = new Nota();

			NotaUpdateRequest.setNota(nota_update_request1,nota1);

			notas.add(nota1);
		}
	}
}

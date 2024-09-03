package com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;*/
import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.Alumno_materiaCreateRequest;
import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.Alumno_materiaUpdateRequest;

public class Alumno_materiaLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_alumno_materias;
	
	/*--- NEWs ---*/
	private ArrayList<Alumno_materiaCreateRequest> news_alumno_materias;
	
	/*--- UPDATEs ---*/	
	private ArrayList<Alumno_materiaUpdateRequest> updates_alumno_materias;
	private ArrayList<String> updates_columnas;
		
	public Alumno_materiaLoteCrudRequestGlobal() {
		this.ids_deletes_alumno_materias = new ArrayList<Long>();
		
		this.news_alumno_materias = new ArrayList<Alumno_materiaCreateRequest>();
		
		this.updates_alumno_materias = new ArrayList<Alumno_materiaUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_alumno_materias() {
		return this.ids_deletes_alumno_materias;
	}
	
	public void setIds_deletes_alumno_materias(ArrayList<Long> ids_deletes_alumno_materias) {
		this.ids_deletes_alumno_materias = ids_deletes_alumno_materias;
	}
	
	public ArrayList<Alumno_materiaCreateRequest> getNews_alumno_materias() {
		return this.news_alumno_materias;
	}
	
	public void setNews_alumno_materias(ArrayList<Alumno_materiaCreateRequest> news_alumno_materias) {
		this.news_alumno_materias = news_alumno_materias;
	}
	
	public ArrayList<Alumno_materiaUpdateRequest> getUpdates_alumno_materias() {
		return this.updates_alumno_materias;
	}
	
	public void setUpdates_alumno_materias(ArrayList<Alumno_materiaUpdateRequest> updates_alumno_materias) {
		this.updates_alumno_materias = updates_alumno_materias;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
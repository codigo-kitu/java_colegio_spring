package com.bydan.colegio.estructura.alumno.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.estructura.alumno.domain.model.Alumno;*/
import com.bydan.colegio.estructura.alumno.infrastructure.util.request.AlumnoCreateRequest;
import com.bydan.colegio.estructura.alumno.infrastructure.util.request.AlumnoUpdateRequest;

public class AlumnoLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_alumnos;
	
	/*--- NEWs ---*/
	private ArrayList<AlumnoCreateRequest> news_alumnos;
	
	/*--- UPDATEs ---*/	
	private ArrayList<AlumnoUpdateRequest> updates_alumnos;
	private ArrayList<String> updates_columnas;
		
	public AlumnoLoteCrudRequestGlobal() {
		this.ids_deletes_alumnos = new ArrayList<Long>();
		
		this.news_alumnos = new ArrayList<AlumnoCreateRequest>();
		
		this.updates_alumnos = new ArrayList<AlumnoUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_alumnos() {
		return this.ids_deletes_alumnos;
	}
	
	public void setIds_deletes_alumnos(ArrayList<Long> ids_deletes_alumnos) {
		this.ids_deletes_alumnos = ids_deletes_alumnos;
	}
	
	public ArrayList<AlumnoCreateRequest> getNews_alumnos() {
		return this.news_alumnos;
	}
	
	public void setNews_alumnos(ArrayList<AlumnoCreateRequest> news_alumnos) {
		this.news_alumnos = news_alumnos;
	}
	
	public ArrayList<AlumnoUpdateRequest> getUpdates_alumnos() {
		return this.updates_alumnos;
	}
	
	public void setUpdates_alumnos(ArrayList<AlumnoUpdateRequest> updates_alumnos) {
		this.updates_alumnos = updates_alumnos;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
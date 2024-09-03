package com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;*/
import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.Docente_materiaCreateRequest;
import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.Docente_materiaUpdateRequest;

public class Docente_materiaLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_docente_materias;
	
	/*--- NEWs ---*/
	private ArrayList<Docente_materiaCreateRequest> news_docente_materias;
	
	/*--- UPDATEs ---*/	
	private ArrayList<Docente_materiaUpdateRequest> updates_docente_materias;
	private ArrayList<String> updates_columnas;
		
	public Docente_materiaLoteCrudRequestGlobal() {
		this.ids_deletes_docente_materias = new ArrayList<Long>();
		
		this.news_docente_materias = new ArrayList<Docente_materiaCreateRequest>();
		
		this.updates_docente_materias = new ArrayList<Docente_materiaUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_docente_materias() {
		return this.ids_deletes_docente_materias;
	}
	
	public void setIds_deletes_docente_materias(ArrayList<Long> ids_deletes_docente_materias) {
		this.ids_deletes_docente_materias = ids_deletes_docente_materias;
	}
	
	public ArrayList<Docente_materiaCreateRequest> getNews_docente_materias() {
		return this.news_docente_materias;
	}
	
	public void setNews_docente_materias(ArrayList<Docente_materiaCreateRequest> news_docente_materias) {
		this.news_docente_materias = news_docente_materias;
	}
	
	public ArrayList<Docente_materiaUpdateRequest> getUpdates_docente_materias() {
		return this.updates_docente_materias;
	}
	
	public void setUpdates_docente_materias(ArrayList<Docente_materiaUpdateRequest> updates_docente_materias) {
		this.updates_docente_materias = updates_docente_materias;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
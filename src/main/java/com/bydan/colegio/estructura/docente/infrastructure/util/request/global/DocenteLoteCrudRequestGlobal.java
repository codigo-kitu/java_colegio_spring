package com.bydan.colegio.estructura.docente.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.estructura.docente.domain.model.Docente;*/
import com.bydan.colegio.estructura.docente.infrastructure.util.request.DocenteCreateRequest;
import com.bydan.colegio.estructura.docente.infrastructure.util.request.DocenteUpdateRequest;

public class DocenteLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_docentes;
	
	/*--- NEWs ---*/
	private ArrayList<DocenteCreateRequest> news_docentes;
	
	/*--- UPDATEs ---*/	
	private ArrayList<DocenteUpdateRequest> updates_docentes;
	private ArrayList<String> updates_columnas;
		
	public DocenteLoteCrudRequestGlobal() {
		this.ids_deletes_docentes = new ArrayList<Long>();
		
		this.news_docentes = new ArrayList<DocenteCreateRequest>();
		
		this.updates_docentes = new ArrayList<DocenteUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_docentes() {
		return this.ids_deletes_docentes;
	}
	
	public void setIds_deletes_docentes(ArrayList<Long> ids_deletes_docentes) {
		this.ids_deletes_docentes = ids_deletes_docentes;
	}
	
	public ArrayList<DocenteCreateRequest> getNews_docentes() {
		return this.news_docentes;
	}
	
	public void setNews_docentes(ArrayList<DocenteCreateRequest> news_docentes) {
		this.news_docentes = news_docentes;
	}
	
	public ArrayList<DocenteUpdateRequest> getUpdates_docentes() {
		return this.updates_docentes;
	}
	
	public void setUpdates_docentes(ArrayList<DocenteUpdateRequest> updates_docentes) {
		this.updates_docentes = updates_docentes;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
package com.bydan.colegio.estructura.materia.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.estructura.materia.domain.model.Materia;*/
import com.bydan.colegio.estructura.materia.infrastructure.util.request.MateriaCreateRequest;
import com.bydan.colegio.estructura.materia.infrastructure.util.request.MateriaUpdateRequest;

public class MateriaLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_materias;
	
	/*--- NEWs ---*/
	private ArrayList<MateriaCreateRequest> news_materias;
	
	/*--- UPDATEs ---*/	
	private ArrayList<MateriaUpdateRequest> updates_materias;
	private ArrayList<String> updates_columnas;
		
	public MateriaLoteCrudRequestGlobal() {
		this.ids_deletes_materias = new ArrayList<Long>();
		
		this.news_materias = new ArrayList<MateriaCreateRequest>();
		
		this.updates_materias = new ArrayList<MateriaUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_materias() {
		return this.ids_deletes_materias;
	}
	
	public void setIds_deletes_materias(ArrayList<Long> ids_deletes_materias) {
		this.ids_deletes_materias = ids_deletes_materias;
	}
	
	public ArrayList<MateriaCreateRequest> getNews_materias() {
		return this.news_materias;
	}
	
	public void setNews_materias(ArrayList<MateriaCreateRequest> news_materias) {
		this.news_materias = news_materias;
	}
	
	public ArrayList<MateriaUpdateRequest> getUpdates_materias() {
		return this.updates_materias;
	}
	
	public void setUpdates_materias(ArrayList<MateriaUpdateRequest> updates_materias) {
		this.updates_materias = updates_materias;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
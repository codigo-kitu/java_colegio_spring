package com.bydan.colegio.financiero.sueldo.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;*/
import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.SueldoCreateRequest;
import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.SueldoUpdateRequest;

public class SueldoLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_sueldos;
	
	/*--- NEWs ---*/
	private ArrayList<SueldoCreateRequest> news_sueldos;
	
	/*--- UPDATEs ---*/	
	private ArrayList<SueldoUpdateRequest> updates_sueldos;
	private ArrayList<String> updates_columnas;
		
	public SueldoLoteCrudRequestGlobal() {
		this.ids_deletes_sueldos = new ArrayList<Long>();
		
		this.news_sueldos = new ArrayList<SueldoCreateRequest>();
		
		this.updates_sueldos = new ArrayList<SueldoUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_sueldos() {
		return this.ids_deletes_sueldos;
	}
	
	public void setIds_deletes_sueldos(ArrayList<Long> ids_deletes_sueldos) {
		this.ids_deletes_sueldos = ids_deletes_sueldos;
	}
	
	public ArrayList<SueldoCreateRequest> getNews_sueldos() {
		return this.news_sueldos;
	}
	
	public void setNews_sueldos(ArrayList<SueldoCreateRequest> news_sueldos) {
		this.news_sueldos = news_sueldos;
	}
	
	public ArrayList<SueldoUpdateRequest> getUpdates_sueldos() {
		return this.updates_sueldos;
	}
	
	public void setUpdates_sueldos(ArrayList<SueldoUpdateRequest> updates_sueldos) {
		this.updates_sueldos = updates_sueldos;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
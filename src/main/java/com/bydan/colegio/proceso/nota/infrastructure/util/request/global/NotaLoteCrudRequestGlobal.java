package com.bydan.colegio.proceso.nota.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.proceso.nota.domain.model.Nota;*/
import com.bydan.colegio.proceso.nota.infrastructure.util.request.NotaCreateRequest;
import com.bydan.colegio.proceso.nota.infrastructure.util.request.NotaUpdateRequest;

public class NotaLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_notas;
	
	/*--- NEWs ---*/
	private ArrayList<NotaCreateRequest> news_notas;
	
	/*--- UPDATEs ---*/	
	private ArrayList<NotaUpdateRequest> updates_notas;
	private ArrayList<String> updates_columnas;
		
	public NotaLoteCrudRequestGlobal() {
		this.ids_deletes_notas = new ArrayList<Long>();
		
		this.news_notas = new ArrayList<NotaCreateRequest>();
		
		this.updates_notas = new ArrayList<NotaUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_notas() {
		return this.ids_deletes_notas;
	}
	
	public void setIds_deletes_notas(ArrayList<Long> ids_deletes_notas) {
		this.ids_deletes_notas = ids_deletes_notas;
	}
	
	public ArrayList<NotaCreateRequest> getNews_notas() {
		return this.news_notas;
	}
	
	public void setNews_notas(ArrayList<NotaCreateRequest> news_notas) {
		this.news_notas = news_notas;
	}
	
	public ArrayList<NotaUpdateRequest> getUpdates_notas() {
		return this.updates_notas;
	}
	
	public void setUpdates_notas(ArrayList<NotaUpdateRequest> updates_notas) {
		this.updates_notas = updates_notas;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
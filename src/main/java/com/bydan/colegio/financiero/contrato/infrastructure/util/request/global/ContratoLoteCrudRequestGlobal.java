package com.bydan.colegio.financiero.contrato.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.financiero.contrato.domain.model.Contrato;*/
import com.bydan.colegio.financiero.contrato.infrastructure.util.request.ContratoCreateRequest;
import com.bydan.colegio.financiero.contrato.infrastructure.util.request.ContratoUpdateRequest;

public class ContratoLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_contratos;
	
	/*--- NEWs ---*/
	private ArrayList<ContratoCreateRequest> news_contratos;
	
	/*--- UPDATEs ---*/	
	private ArrayList<ContratoUpdateRequest> updates_contratos;
	private ArrayList<String> updates_columnas;
		
	public ContratoLoteCrudRequestGlobal() {
		this.ids_deletes_contratos = new ArrayList<Long>();
		
		this.news_contratos = new ArrayList<ContratoCreateRequest>();
		
		this.updates_contratos = new ArrayList<ContratoUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_contratos() {
		return this.ids_deletes_contratos;
	}
	
	public void setIds_deletes_contratos(ArrayList<Long> ids_deletes_contratos) {
		this.ids_deletes_contratos = ids_deletes_contratos;
	}
	
	public ArrayList<ContratoCreateRequest> getNews_contratos() {
		return this.news_contratos;
	}
	
	public void setNews_contratos(ArrayList<ContratoCreateRequest> news_contratos) {
		this.news_contratos = news_contratos;
	}
	
	public ArrayList<ContratoUpdateRequest> getUpdates_contratos() {
		return this.updates_contratos;
	}
	
	public void setUpdates_contratos(ArrayList<ContratoUpdateRequest> updates_contratos) {
		this.updates_contratos = updates_contratos;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
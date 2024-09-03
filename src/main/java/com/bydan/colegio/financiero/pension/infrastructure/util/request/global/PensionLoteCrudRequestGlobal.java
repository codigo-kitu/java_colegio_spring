package com.bydan.colegio.financiero.pension.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.financiero.pension.domain.model.Pension;*/
import com.bydan.colegio.financiero.pension.infrastructure.util.request.PensionCreateRequest;
import com.bydan.colegio.financiero.pension.infrastructure.util.request.PensionUpdateRequest;

public class PensionLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_pensions;
	
	/*--- NEWs ---*/
	private ArrayList<PensionCreateRequest> news_pensions;
	
	/*--- UPDATEs ---*/	
	private ArrayList<PensionUpdateRequest> updates_pensions;
	private ArrayList<String> updates_columnas;
		
	public PensionLoteCrudRequestGlobal() {
		this.ids_deletes_pensions = new ArrayList<Long>();
		
		this.news_pensions = new ArrayList<PensionCreateRequest>();
		
		this.updates_pensions = new ArrayList<PensionUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_pensions() {
		return this.ids_deletes_pensions;
	}
	
	public void setIds_deletes_pensions(ArrayList<Long> ids_deletes_pensions) {
		this.ids_deletes_pensions = ids_deletes_pensions;
	}
	
	public ArrayList<PensionCreateRequest> getNews_pensions() {
		return this.news_pensions;
	}
	
	public void setNews_pensions(ArrayList<PensionCreateRequest> news_pensions) {
		this.news_pensions = news_pensions;
	}
	
	public ArrayList<PensionUpdateRequest> getUpdates_pensions() {
		return this.updates_pensions;
	}
	
	public void setUpdates_pensions(ArrayList<PensionUpdateRequest> updates_pensions) {
		this.updates_pensions = updates_pensions;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
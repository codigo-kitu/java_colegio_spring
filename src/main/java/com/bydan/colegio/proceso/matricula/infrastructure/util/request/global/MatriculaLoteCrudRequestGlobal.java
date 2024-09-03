package com.bydan.colegio.proceso.matricula.infrastructure.util.request.global;

import java.util.ArrayList;

/*import com.bydan.colegio.proceso.matricula.domain.model.Matricula;*/
import com.bydan.colegio.proceso.matricula.infrastructure.util.request.MatriculaCreateRequest;
import com.bydan.colegio.proceso.matricula.infrastructure.util.request.MatriculaUpdateRequest;

public class MatriculaLoteCrudRequestGlobal {
	/*--- DELETEs ---*/
	private ArrayList<Long> ids_deletes_matriculas;
	
	/*--- NEWs ---*/
	private ArrayList<MatriculaCreateRequest> news_matriculas;
	
	/*--- UPDATEs ---*/	
	private ArrayList<MatriculaUpdateRequest> updates_matriculas;
	private ArrayList<String> updates_columnas;
		
	public MatriculaLoteCrudRequestGlobal() {
		this.ids_deletes_matriculas = new ArrayList<Long>();
		
		this.news_matriculas = new ArrayList<MatriculaCreateRequest>();
		
		this.updates_matriculas = new ArrayList<MatriculaUpdateRequest>();
		this.updates_columnas = new ArrayList<String>();		
	}
	
	public ArrayList<Long> getIds_deletes_matriculas() {
		return this.ids_deletes_matriculas;
	}
	
	public void setIds_deletes_matriculas(ArrayList<Long> ids_deletes_matriculas) {
		this.ids_deletes_matriculas = ids_deletes_matriculas;
	}
	
	public ArrayList<MatriculaCreateRequest> getNews_matriculas() {
		return this.news_matriculas;
	}
	
	public void setNews_matriculas(ArrayList<MatriculaCreateRequest> news_matriculas) {
		this.news_matriculas = news_matriculas;
	}
	
	public ArrayList<MatriculaUpdateRequest> getUpdates_matriculas() {
		return this.updates_matriculas;
	}
	
	public void setUpdates_matriculas(ArrayList<MatriculaUpdateRequest> updates_matriculas) {
		this.updates_matriculas = updates_matriculas;
	}
	
	public ArrayList<String> getUpdates_columnas() {
		return this.updates_columnas;
	}
	
	public void setUpdates_columnas(ArrayList<String> updates_columnas) {
		this.updates_columnas = updates_columnas;
	}
}
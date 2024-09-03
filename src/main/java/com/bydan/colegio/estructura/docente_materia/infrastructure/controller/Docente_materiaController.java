package com.bydan.colegio.estructura.docente_materia.infrastructure.controller;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.web.bind.annotation.GetMapping;*/
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*///Get Params
import org.springframework.web.bind.annotation.RequestBody;//Post Params
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.CrossOrigin;

/*import com.bydan.colegio.base.application.logic.Pagination;*/
import com.bydan.colegio.base.application.logic.global.PaginationGlobal;
/*import com.bydan.colegio.base.util.Constantes;*/
import com.bydan.colegio.base.util.TipoAccionEnum;

/*
import {Constantes} from "../../util/constantes";
import {TipoAccionEnum} from "../../util/tipo_accion_enum";
import {GeneralEntityController} from "../../business/entity/general_entity_controller";
import {Pagination} from "../../business/logic/pagination";
*/

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;

import com.bydan.colegio.estructura.docente_materia.application.logic.Docente_materiaLogicI;
/*import com.bydan.colegio.estructura.docente_materia.infrastructure.data.Docente_materiaRepositoryI;*/

import com.bydan.colegio.estructura.docente_materia.infrastructure.util.returns.Docente_materiaReturnView;

import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.global.Docente_materiaCreateRequestGlobal;
import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.global.Docente_materiaUpdateRequestGlobal;
import com.bydan.colegio.estructura.docente_materia.infrastructure.util.request.global.Docente_materiaLoteCrudRequestGlobal;


//import {Docente_materiaFKReturnViewDto} from "./dto/docente_materia_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/estructura/docente_materia_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class Docente_materiaController { //extends GeneralEntityController
	/*
	@Autowired
	private Docente_materiaRepositoryI docente_materia_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Docente_materia docente_materia1;
	ArrayList<Docente_materia> docente_materias = new ArrayList<Docente_materia>();
	
	@Autowired
	private Docente_materiaLogicI docente_materiaLogicI;
	
	Docente_materiaReturnView docente_materiaReturnView;
	
	//Docente_materiaLogic docente_materiaLogicI;
		
	Object builder_object_docente_materia1;
	
	
	public Docente_materiaController() {
		/*super();*/
		
		this.docente_materia1 = new Docente_materia();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.docente_materiaLogicI = new Docente_materiaLogic();*/								
		/*this.docente_materiaLogicI.setDocente_materia_repository1(this.docente_materia_repositoryi1);*/
		
		this.docente_materiaReturnView = new Docente_materiaReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.docente_materia1 = this.docente_materiaLogicI.getDocente_materia1();		
		this.docente_materias = this.docente_materiaLogicI.getDocente_materias();
		*/
		
		this.docente_materiaReturnView.setReturnView(tipo_accion_enum1,this.docente_materia1,this.docente_materias);		
	}
	
	/*
	public void setToDataDocente_materiaRepositoryI() {
		this.docente_materiaLogicI.setDocente_materia_repository1(this.docente_materia_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public Docente_materiaReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.docente_materias = this.docente_materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public Docente_materiaReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.docente_materias = this.docente_materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public Docente_materiaReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true	
					,materia:true									
			};
			*/
			
			this.docente_materias = this.docente_materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public Docente_materiaReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true	
					,materia:true									
			};
			*/
			
			//this.builder_object_docente_materia1=this.docente_materiaLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.docente_materias = this.docente_materiaLogicI.getBuscar(this.builder_object_docente_materia1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public Docente_materiaReturnView getSeleccionar(@RequestBody 
												Docente_materia docente_materia1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true	
					,materia:true									
			};
			*/
			
			this.docente_materia1 = this.docente_materiaLogicI.getBuscarUno(docente_materia1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_docente_materia1=this.docente_materiaLogicI.getBuilderFunctionObjectParametroSeleccionar(docente_materia1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public Docente_materiaReturnView nuevo(@RequestBody 
										Docente_materiaCreateRequestGlobal docente_materia_create_request_global1) {
		try {   	
			Docente_materiaCreateRequestGlobal.setDocente_materia(docente_materia_create_request_global1.getDocente_materia(),this.docente_materia1);
			
			this.docente_materia1 = this.docente_materiaLogicI.nuevo(this.docente_materia1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public Docente_materiaReturnView actualizar(@RequestBody 
											Docente_materiaUpdateRequestGlobal docente_materia_update_request_global1) {
		try { 
			this.docente_materia1 = this.docente_materiaLogicI.getBuscarUno(docente_materia_update_request_global1.getDocente_materia().getId());
			
			Docente_materiaUpdateRequestGlobal.setDocente_materia(docente_materia_update_request_global1.getDocente_materia(),this.docente_materiaLogicI.getDocente_materia1());
			
			this.docente_materia1 = this.docente_materiaLogicI.actualizar(this.docente_materia1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public Docente_materiaReturnView eliminar(@RequestBody 
										Docente_materia docente_materia1) {
		try {		
			
			this.docente_materiaLogicI.eliminar(docente_materia1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public Docente_materiaReturnView nuevos(@RequestBody 
										Docente_materiaLoteCrudRequestGlobal docente_materia_lote_crud_request_global1) {
		try {   	
			this.docente_materias = new ArrayList<Docente_materia>();
			
			Docente_materiaCreateRequestGlobal.setDocente_materias(docente_materia_lote_crud_request_global1.getNews_docente_materias(),this.docente_materias);
			
			this.docente_materias = this.docente_materiaLogicI.nuevos(this.docente_materias);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public Docente_materiaReturnView eliminars(@RequestBody 
											Docente_materiaLoteCrudRequestGlobal docente_materia_lote_crud_request_global1) {
		try {	
			
			this.docente_materiaLogicI.eliminars(docente_materia_lote_crud_request_global1.getIds_deletes_docente_materias());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public Docente_materiaReturnView actualizars(@RequestBody 
											Docente_materiaLoteCrudRequestGlobal docente_materia_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Docente_materia> updates_docente_materias,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.docente_materias = new ArrayList<Docente_materia>();
			
			Docente_materiaUpdateRequestGlobal.setDocente_materias(docente_materia_lote_crud_request_global1.getUpdates_docente_materias(),this.docente_materias);
			
			this.docente_materiaLogicI.actualizars(this.docente_materias,docente_materia_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public Docente_materiaReturnView guardarCambios(@RequestBody 
												Docente_materiaLoteCrudRequestGlobal docente_materia_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Docente_materia> news_docente_materias,
				@RequestBody 
				ArrayList<Long> ids_deletes_docente_materias,
				@RequestBody 
				ArrayList<Docente_materia> updates_docente_materias,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.docente_materias = new ArrayList<Docente_materia>();
			Docente_materiaCreateRequestGlobal.setDocente_materias(docente_materia_lote_crud_request_global1.getNews_docente_materias(),this.docente_materias);			
			this.docente_materiaLogicI.nuevos(this.docente_materias);
			
			/*--- Deletes ---*/
			this.docente_materiaLogicI.eliminars(docente_materia_lote_crud_request_global1.getIds_deletes_docente_materias());
			
			/*--- Updates ---*/
			this.docente_materias = new ArrayList<Docente_materia>();
			Docente_materiaUpdateRequestGlobal.setDocente_materias(docente_materia_lote_crud_request_global1.getUpdates_docente_materias(),this.docente_materias);			
			this.docente_materiaLogicI.actualizars(this.docente_materias,docente_materia_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docente_materiaReturnView;
	}
	
	
}

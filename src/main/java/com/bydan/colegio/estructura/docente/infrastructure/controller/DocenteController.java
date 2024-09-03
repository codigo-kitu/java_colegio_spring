package com.bydan.colegio.estructura.docente.infrastructure.controller;

import java.util.ArrayList;

/*import java.util.Date;*/

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

import com.bydan.colegio.estructura.docente.domain.model.Docente;

import com.bydan.colegio.estructura.docente.application.logic.DocenteLogicI;
/*import com.bydan.colegio.estructura.docente.infrastructure.data.DocenteRepositoryI;*/

import com.bydan.colegio.estructura.docente.infrastructure.util.returns.DocenteReturnView;

import com.bydan.colegio.estructura.docente.infrastructure.util.request.global.DocenteCreateRequestGlobal;
import com.bydan.colegio.estructura.docente.infrastructure.util.request.global.DocenteUpdateRequestGlobal;
import com.bydan.colegio.estructura.docente.infrastructure.util.request.global.DocenteLoteCrudRequestGlobal;



@Controller
@RequestMapping(path="/api/colegio/estructura/docente_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class DocenteController { //extends GeneralEntityController
	/*
	@Autowired
	private DocenteRepositoryI docente_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Docente docente1;
	ArrayList<Docente> docentes = new ArrayList<Docente>();
	
	@Autowired
	private DocenteLogicI docenteLogicI;
	
	DocenteReturnView docenteReturnView;
	
	//DocenteLogic docenteLogicI;
		
	Object builder_object_docente1;
	
	
	public DocenteController() {
		/*super();*/
		
		this.docente1 = new Docente();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.docenteLogicI = new DocenteLogic();*/								
		/*this.docenteLogicI.setDocente_repository1(this.docente_repositoryi1);*/
		
		this.docenteReturnView = new DocenteReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.docente1 = this.docenteLogicI.getDocente1();		
		this.docentes = this.docenteLogicI.getDocentes();
		*/
		
		this.docenteReturnView.setReturnView(tipo_accion_enum1,this.docente1,this.docentes);		
	}
	
	/*
	public void setToDataDocenteRepositoryI() {
		this.docenteLogicI.setDocente_repository1(this.docente_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public DocenteReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.docentes = this.docenteLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public DocenteReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.docentes = this.docenteLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public DocenteReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.docentes = this.docenteLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public DocenteReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			//this.builder_object_docente1=this.docenteLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.docentes = this.docenteLogicI.getBuscar(this.builder_object_docente1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public DocenteReturnView getSeleccionar(@RequestBody 
												Docente docente1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			this.docente1 = this.docenteLogicI.getBuscarUno(docente1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_docente1=this.docenteLogicI.getBuilderFunctionObjectParametroSeleccionar(docente1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public DocenteReturnView nuevo(@RequestBody 
										DocenteCreateRequestGlobal docente_create_request_global1) {
		try {   	
			DocenteCreateRequestGlobal.setDocente(docente_create_request_global1.getDocente(),this.docente1);
			
			this.docente1 = this.docenteLogicI.nuevo(this.docente1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public DocenteReturnView actualizar(@RequestBody 
											DocenteUpdateRequestGlobal docente_update_request_global1) {
		try { 
			this.docente1 = this.docenteLogicI.getBuscarUno(docente_update_request_global1.getDocente().getId());
			
			DocenteUpdateRequestGlobal.setDocente(docente_update_request_global1.getDocente(),this.docenteLogicI.getDocente1());
			
			this.docente1 = this.docenteLogicI.actualizar(this.docente1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public DocenteReturnView eliminar(@RequestBody 
										Docente docente1) {
		try {		
			
			this.docenteLogicI.eliminar(docente1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public DocenteReturnView nuevos(@RequestBody 
										DocenteLoteCrudRequestGlobal docente_lote_crud_request_global1) {
		try {   	
			this.docentes = new ArrayList<Docente>();
			
			DocenteCreateRequestGlobal.setDocentes(docente_lote_crud_request_global1.getNews_docentes(),this.docentes);
			
			this.docentes = this.docenteLogicI.nuevos(this.docentes);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public DocenteReturnView eliminars(@RequestBody 
											DocenteLoteCrudRequestGlobal docente_lote_crud_request_global1) {
		try {	
			
			this.docenteLogicI.eliminars(docente_lote_crud_request_global1.getIds_deletes_docentes());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public DocenteReturnView actualizars(@RequestBody 
											DocenteLoteCrudRequestGlobal docente_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Docente> updates_docentes,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.docentes = new ArrayList<Docente>();
			
			DocenteUpdateRequestGlobal.setDocentes(docente_lote_crud_request_global1.getUpdates_docentes(),this.docentes);
			
			this.docenteLogicI.actualizars(this.docentes,docente_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public DocenteReturnView guardarCambios(@RequestBody 
												DocenteLoteCrudRequestGlobal docente_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Docente> news_docentes,
				@RequestBody 
				ArrayList<Long> ids_deletes_docentes,
				@RequestBody 
				ArrayList<Docente> updates_docentes,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.docentes = new ArrayList<Docente>();
			DocenteCreateRequestGlobal.setDocentes(docente_lote_crud_request_global1.getNews_docentes(),this.docentes);			
			this.docenteLogicI.nuevos(this.docentes);
			
			/*--- Deletes ---*/
			this.docenteLogicI.eliminars(docente_lote_crud_request_global1.getIds_deletes_docentes());
			
			/*--- Updates ---*/
			this.docentes = new ArrayList<Docente>();
			DocenteUpdateRequestGlobal.setDocentes(docente_lote_crud_request_global1.getUpdates_docentes(),this.docentes);			
			this.docenteLogicI.actualizars(this.docentes,docente_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	
	/*----- RELACIONES -----*/
	@PostMapping(path="/todos_relaciones")
	@ResponseBody
	public DocenteReturnView getTodosRelaciones(@RequestBody 
													PaginationGlobal pagination_global1) {
		try {
			/*
			this.relations1 = {
				//----- Relaciones -----
				
				docente_materias:true
				,sueldos:true
				,contrato:true
				,materias:true
				,notas:true
			};
			*/
			
			this.docentes = this.docenteLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
	
	@PostMapping(path="/seleccionar_relaciones")
	@ResponseBody
	public DocenteReturnView getSeleccionarRelaciones(@RequestBody 
														Docente docente1) {
		try {	
			
			/*
			this.relations1 = {
				
				//----- Relaciones -----
				
				docente_materias:true
				,sueldos:true
				,contrato:true
				,materias:true
				,notas:true
			};
			*/
			
			//this.builder_object_docente1=this.docenteLogicI.getBuilderFunctionObjectParametroSeleccionar(id);			
			
			this.docente1 = this.docenteLogicI.getBuscarUno(docente1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.docenteReturnView;
	}
}

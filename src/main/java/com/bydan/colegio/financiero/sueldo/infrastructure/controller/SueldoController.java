package com.bydan.colegio.financiero.sueldo.infrastructure.controller;

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

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;

import com.bydan.colegio.financiero.sueldo.application.logic.SueldoLogicI;
/*import com.bydan.colegio.financiero.sueldo.infrastructure.data.SueldoRepositoryI;*/

import com.bydan.colegio.financiero.sueldo.infrastructure.util.returns.SueldoReturnView;

import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.global.SueldoCreateRequestGlobal;
import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.global.SueldoUpdateRequestGlobal;
import com.bydan.colegio.financiero.sueldo.infrastructure.util.request.global.SueldoLoteCrudRequestGlobal;


//import {SueldoFKReturnViewDto} from "./dto/sueldo_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/financiero/sueldo_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class SueldoController { //extends GeneralEntityController
	/*
	@Autowired
	private SueldoRepositoryI sueldo_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Sueldo sueldo1;
	ArrayList<Sueldo> sueldos = new ArrayList<Sueldo>();
	
	@Autowired
	private SueldoLogicI sueldoLogicI;
	
	SueldoReturnView sueldoReturnView;
	
	//SueldoLogic sueldoLogicI;
		
	Object builder_object_sueldo1;
	
	
	public SueldoController() {
		/*super();*/
		
		this.sueldo1 = new Sueldo();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.sueldoLogicI = new SueldoLogic();*/								
		/*this.sueldoLogicI.setSueldo_repository1(this.sueldo_repositoryi1);*/
		
		this.sueldoReturnView = new SueldoReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.sueldo1 = this.sueldoLogicI.getSueldo1();		
		this.sueldos = this.sueldoLogicI.getSueldos();
		*/
		
		this.sueldoReturnView.setReturnView(tipo_accion_enum1,this.sueldo1,this.sueldos);		
	}
	
	/*
	public void setToDataSueldoRepositoryI() {
		this.sueldoLogicI.setSueldo_repository1(this.sueldo_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public SueldoReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.sueldos = this.sueldoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public SueldoReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.sueldos = this.sueldoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public SueldoReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true									
			};
			*/
			
			this.sueldos = this.sueldoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public SueldoReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true									
			};
			*/
			
			//this.builder_object_sueldo1=this.sueldoLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.sueldos = this.sueldoLogicI.getBuscar(this.builder_object_sueldo1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public SueldoReturnView getSeleccionar(@RequestBody 
												Sueldo sueldo1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true									
			};
			*/
			
			this.sueldo1 = this.sueldoLogicI.getBuscarUno(sueldo1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_sueldo1=this.sueldoLogicI.getBuilderFunctionObjectParametroSeleccionar(sueldo1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public SueldoReturnView nuevo(@RequestBody 
										SueldoCreateRequestGlobal sueldo_create_request_global1) {
		try {   	
			SueldoCreateRequestGlobal.setSueldo(sueldo_create_request_global1.getSueldo(),this.sueldo1);
			
			this.sueldo1 = this.sueldoLogicI.nuevo(this.sueldo1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public SueldoReturnView actualizar(@RequestBody 
											SueldoUpdateRequestGlobal sueldo_update_request_global1) {
		try { 
			this.sueldo1 = this.sueldoLogicI.getBuscarUno(sueldo_update_request_global1.getSueldo().getId());
			
			SueldoUpdateRequestGlobal.setSueldo(sueldo_update_request_global1.getSueldo(),this.sueldoLogicI.getSueldo1());
			
			this.sueldo1 = this.sueldoLogicI.actualizar(this.sueldo1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public SueldoReturnView eliminar(@RequestBody 
										Sueldo sueldo1) {
		try {		
			
			this.sueldoLogicI.eliminar(sueldo1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public SueldoReturnView nuevos(@RequestBody 
										SueldoLoteCrudRequestGlobal sueldo_lote_crud_request_global1) {
		try {   	
			this.sueldos = new ArrayList<Sueldo>();
			
			SueldoCreateRequestGlobal.setSueldos(sueldo_lote_crud_request_global1.getNews_sueldos(),this.sueldos);
			
			this.sueldos = this.sueldoLogicI.nuevos(this.sueldos);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public SueldoReturnView eliminars(@RequestBody 
											SueldoLoteCrudRequestGlobal sueldo_lote_crud_request_global1) {
		try {	
			
			this.sueldoLogicI.eliminars(sueldo_lote_crud_request_global1.getIds_deletes_sueldos());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public SueldoReturnView actualizars(@RequestBody 
											SueldoLoteCrudRequestGlobal sueldo_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Sueldo> updates_sueldos,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.sueldos = new ArrayList<Sueldo>();
			
			SueldoUpdateRequestGlobal.setSueldos(sueldo_lote_crud_request_global1.getUpdates_sueldos(),this.sueldos);
			
			this.sueldoLogicI.actualizars(this.sueldos,sueldo_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public SueldoReturnView guardarCambios(@RequestBody 
												SueldoLoteCrudRequestGlobal sueldo_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Sueldo> news_sueldos,
				@RequestBody 
				ArrayList<Long> ids_deletes_sueldos,
				@RequestBody 
				ArrayList<Sueldo> updates_sueldos,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.sueldos = new ArrayList<Sueldo>();
			SueldoCreateRequestGlobal.setSueldos(sueldo_lote_crud_request_global1.getNews_sueldos(),this.sueldos);			
			this.sueldoLogicI.nuevos(this.sueldos);
			
			/*--- Deletes ---*/
			this.sueldoLogicI.eliminars(sueldo_lote_crud_request_global1.getIds_deletes_sueldos());
			
			/*--- Updates ---*/
			this.sueldos = new ArrayList<Sueldo>();
			SueldoUpdateRequestGlobal.setSueldos(sueldo_lote_crud_request_global1.getUpdates_sueldos(),this.sueldos);			
			this.sueldoLogicI.actualizars(this.sueldos,sueldo_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.sueldoReturnView;
	}
	
	
}

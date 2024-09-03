package com.bydan.colegio.financiero.contrato.infrastructure.controller;

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

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;

import com.bydan.colegio.financiero.contrato.application.logic.ContratoLogicI;
/*import com.bydan.colegio.financiero.contrato.infrastructure.data.ContratoRepositoryI;*/

import com.bydan.colegio.financiero.contrato.infrastructure.util.returns.ContratoReturnView;

import com.bydan.colegio.financiero.contrato.infrastructure.util.request.global.ContratoCreateRequestGlobal;
import com.bydan.colegio.financiero.contrato.infrastructure.util.request.global.ContratoUpdateRequestGlobal;
import com.bydan.colegio.financiero.contrato.infrastructure.util.request.global.ContratoLoteCrudRequestGlobal;


//import {ContratoFKReturnViewDto} from "./dto/contrato_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/financiero/contrato_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class ContratoController { //extends GeneralEntityController
	/*
	@Autowired
	private ContratoRepositoryI contrato_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Contrato contrato1;
	ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	
	@Autowired
	private ContratoLogicI contratoLogicI;
	
	ContratoReturnView contratoReturnView;
	
	//ContratoLogic contratoLogicI;
		
	Object builder_object_contrato1;
	
	
	public ContratoController() {
		/*super();*/
		
		this.contrato1 = new Contrato();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.contratoLogicI = new ContratoLogic();*/								
		/*this.contratoLogicI.setContrato_repository1(this.contrato_repositoryi1);*/
		
		this.contratoReturnView = new ContratoReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.contrato1 = this.contratoLogicI.getContrato1();		
		this.contratos = this.contratoLogicI.getContratos();
		*/
		
		this.contratoReturnView.setReturnView(tipo_accion_enum1,this.contrato1,this.contratos);		
	}
	
	/*
	public void setToDataContratoRepositoryI() {
		this.contratoLogicI.setContrato_repository1(this.contrato_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public ContratoReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.contratos = this.contratoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public ContratoReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.contratos = this.contratoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public ContratoReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true									
			};
			*/
			
			this.contratos = this.contratoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public ContratoReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true									
			};
			*/
			
			//this.builder_object_contrato1=this.contratoLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.contratos = this.contratoLogicI.getBuscar(this.builder_object_contrato1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public ContratoReturnView getSeleccionar(@RequestBody 
												Contrato contrato1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					docente:true									
			};
			*/
			
			this.contrato1 = this.contratoLogicI.getBuscarUno(contrato1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_contrato1=this.contratoLogicI.getBuilderFunctionObjectParametroSeleccionar(contrato1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public ContratoReturnView nuevo(@RequestBody 
										ContratoCreateRequestGlobal contrato_create_request_global1) {
		try {   	
			ContratoCreateRequestGlobal.setContrato(contrato_create_request_global1.getContrato(),this.contrato1);
			
			this.contrato1 = this.contratoLogicI.nuevo(this.contrato1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public ContratoReturnView actualizar(@RequestBody 
											ContratoUpdateRequestGlobal contrato_update_request_global1) {
		try { 
			this.contrato1 = this.contratoLogicI.getBuscarUno(contrato_update_request_global1.getContrato().getId());
			
			ContratoUpdateRequestGlobal.setContrato(contrato_update_request_global1.getContrato(),this.contratoLogicI.getContrato1());
			
			this.contrato1 = this.contratoLogicI.actualizar(this.contrato1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public ContratoReturnView eliminar(@RequestBody 
										Contrato contrato1) {
		try {		
			
			this.contratoLogicI.eliminar(contrato1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public ContratoReturnView nuevos(@RequestBody 
										ContratoLoteCrudRequestGlobal contrato_lote_crud_request_global1) {
		try {   	
			this.contratos = new ArrayList<Contrato>();
			
			ContratoCreateRequestGlobal.setContratos(contrato_lote_crud_request_global1.getNews_contratos(),this.contratos);
			
			this.contratos = this.contratoLogicI.nuevos(this.contratos);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public ContratoReturnView eliminars(@RequestBody 
											ContratoLoteCrudRequestGlobal contrato_lote_crud_request_global1) {
		try {	
			
			this.contratoLogicI.eliminars(contrato_lote_crud_request_global1.getIds_deletes_contratos());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public ContratoReturnView actualizars(@RequestBody 
											ContratoLoteCrudRequestGlobal contrato_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Contrato> updates_contratos,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.contratos = new ArrayList<Contrato>();
			
			ContratoUpdateRequestGlobal.setContratos(contrato_lote_crud_request_global1.getUpdates_contratos(),this.contratos);
			
			this.contratoLogicI.actualizars(this.contratos,contrato_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public ContratoReturnView guardarCambios(@RequestBody 
												ContratoLoteCrudRequestGlobal contrato_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Contrato> news_contratos,
				@RequestBody 
				ArrayList<Long> ids_deletes_contratos,
				@RequestBody 
				ArrayList<Contrato> updates_contratos,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.contratos = new ArrayList<Contrato>();
			ContratoCreateRequestGlobal.setContratos(contrato_lote_crud_request_global1.getNews_contratos(),this.contratos);			
			this.contratoLogicI.nuevos(this.contratos);
			
			/*--- Deletes ---*/
			this.contratoLogicI.eliminars(contrato_lote_crud_request_global1.getIds_deletes_contratos());
			
			/*--- Updates ---*/
			this.contratos = new ArrayList<Contrato>();
			ContratoUpdateRequestGlobal.setContratos(contrato_lote_crud_request_global1.getUpdates_contratos(),this.contratos);			
			this.contratoLogicI.actualizars(this.contratos,contrato_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.contratoReturnView;
	}
	
	
}

package com.bydan.colegio.financiero.pension.infrastructure.controller;

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

import com.bydan.colegio.financiero.pension.domain.model.Pension;

import com.bydan.colegio.financiero.pension.application.logic.PensionLogicI;
/*import com.bydan.colegio.financiero.pension.infrastructure.data.PensionRepositoryI;*/

import com.bydan.colegio.financiero.pension.infrastructure.util.returns.PensionReturnView;

import com.bydan.colegio.financiero.pension.infrastructure.util.request.global.PensionCreateRequestGlobal;
import com.bydan.colegio.financiero.pension.infrastructure.util.request.global.PensionUpdateRequestGlobal;
import com.bydan.colegio.financiero.pension.infrastructure.util.request.global.PensionLoteCrudRequestGlobal;


//import {PensionFKReturnViewDto} from "./dto/pension_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/financiero/pension_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class PensionController { //extends GeneralEntityController
	/*
	@Autowired
	private PensionRepositoryI pension_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Pension pension1;
	ArrayList<Pension> pensions = new ArrayList<Pension>();
	
	@Autowired
	private PensionLogicI pensionLogicI;
	
	PensionReturnView pensionReturnView;
	
	//PensionLogic pensionLogicI;
		
	Object builder_object_pension1;
	
	
	public PensionController() {
		/*super();*/
		
		this.pension1 = new Pension();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.pensionLogicI = new PensionLogic();*/								
		/*this.pensionLogicI.setPension_repository1(this.pension_repositoryi1);*/
		
		this.pensionReturnView = new PensionReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.pension1 = this.pensionLogicI.getPension1();		
		this.pensions = this.pensionLogicI.getPensions();
		*/
		
		this.pensionReturnView.setReturnView(tipo_accion_enum1,this.pension1,this.pensions);		
	}
	
	/*
	public void setToDataPensionRepositoryI() {
		this.pensionLogicI.setPension_repository1(this.pension_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public PensionReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.pensions = this.pensionLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public PensionReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.pensions = this.pensionLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public PensionReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true									
			};
			*/
			
			this.pensions = this.pensionLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public PensionReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true									
			};
			*/
			
			//this.builder_object_pension1=this.pensionLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.pensions = this.pensionLogicI.getBuscar(this.builder_object_pension1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public PensionReturnView getSeleccionar(@RequestBody 
												Pension pension1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true									
			};
			*/
			
			this.pension1 = this.pensionLogicI.getBuscarUno(pension1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_pension1=this.pensionLogicI.getBuilderFunctionObjectParametroSeleccionar(pension1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public PensionReturnView nuevo(@RequestBody 
										PensionCreateRequestGlobal pension_create_request_global1) {
		try {   	
			PensionCreateRequestGlobal.setPension(pension_create_request_global1.getPension(),this.pension1);
			
			this.pension1 = this.pensionLogicI.nuevo(this.pension1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public PensionReturnView actualizar(@RequestBody 
											PensionUpdateRequestGlobal pension_update_request_global1) {
		try { 
			this.pension1 = this.pensionLogicI.getBuscarUno(pension_update_request_global1.getPension().getId());
			
			PensionUpdateRequestGlobal.setPension(pension_update_request_global1.getPension(),this.pensionLogicI.getPension1());
			
			this.pension1 = this.pensionLogicI.actualizar(this.pension1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public PensionReturnView eliminar(@RequestBody 
										Pension pension1) {
		try {		
			
			this.pensionLogicI.eliminar(pension1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public PensionReturnView nuevos(@RequestBody 
										PensionLoteCrudRequestGlobal pension_lote_crud_request_global1) {
		try {   	
			this.pensions = new ArrayList<Pension>();
			
			PensionCreateRequestGlobal.setPensions(pension_lote_crud_request_global1.getNews_pensions(),this.pensions);
			
			this.pensions = this.pensionLogicI.nuevos(this.pensions);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public PensionReturnView eliminars(@RequestBody 
											PensionLoteCrudRequestGlobal pension_lote_crud_request_global1) {
		try {	
			
			this.pensionLogicI.eliminars(pension_lote_crud_request_global1.getIds_deletes_pensions());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public PensionReturnView actualizars(@RequestBody 
											PensionLoteCrudRequestGlobal pension_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Pension> updates_pensions,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.pensions = new ArrayList<Pension>();
			
			PensionUpdateRequestGlobal.setPensions(pension_lote_crud_request_global1.getUpdates_pensions(),this.pensions);
			
			this.pensionLogicI.actualizars(this.pensions,pension_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public PensionReturnView guardarCambios(@RequestBody 
												PensionLoteCrudRequestGlobal pension_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Pension> news_pensions,
				@RequestBody 
				ArrayList<Long> ids_deletes_pensions,
				@RequestBody 
				ArrayList<Pension> updates_pensions,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.pensions = new ArrayList<Pension>();
			PensionCreateRequestGlobal.setPensions(pension_lote_crud_request_global1.getNews_pensions(),this.pensions);			
			this.pensionLogicI.nuevos(this.pensions);
			
			/*--- Deletes ---*/
			this.pensionLogicI.eliminars(pension_lote_crud_request_global1.getIds_deletes_pensions());
			
			/*--- Updates ---*/
			this.pensions = new ArrayList<Pension>();
			PensionUpdateRequestGlobal.setPensions(pension_lote_crud_request_global1.getUpdates_pensions(),this.pensions);			
			this.pensionLogicI.actualizars(this.pensions,pension_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.pensionReturnView;
	}
	
	
}

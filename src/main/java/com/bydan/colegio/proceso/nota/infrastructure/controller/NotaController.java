package com.bydan.colegio.proceso.nota.infrastructure.controller;

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

import com.bydan.colegio.proceso.nota.domain.model.Nota;

import com.bydan.colegio.proceso.nota.application.logic.NotaLogicI;
/*import com.bydan.colegio.proceso.nota.infrastructure.data.NotaRepositoryI;*/

import com.bydan.colegio.proceso.nota.infrastructure.util.returns.NotaReturnView;

import com.bydan.colegio.proceso.nota.infrastructure.util.request.global.NotaCreateRequestGlobal;
import com.bydan.colegio.proceso.nota.infrastructure.util.request.global.NotaUpdateRequestGlobal;
import com.bydan.colegio.proceso.nota.infrastructure.util.request.global.NotaLoteCrudRequestGlobal;


//import {NotaFKReturnViewDto} from "./dto/nota_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/proceso/nota_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class NotaController { //extends GeneralEntityController
	/*
	@Autowired
	private NotaRepositoryI nota_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Nota nota1;
	ArrayList<Nota> notas = new ArrayList<Nota>();
	
	@Autowired
	private NotaLogicI notaLogicI;
	
	NotaReturnView notaReturnView;
	
	//NotaLogic notaLogicI;
		
	Object builder_object_nota1;
	
	
	public NotaController() {
		/*super();*/
		
		this.nota1 = new Nota();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.notaLogicI = new NotaLogic();*/								
		/*this.notaLogicI.setNota_repository1(this.nota_repositoryi1);*/
		
		this.notaReturnView = new NotaReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.nota1 = this.notaLogicI.getNota1();		
		this.notas = this.notaLogicI.getNotas();
		*/
		
		this.notaReturnView.setReturnView(tipo_accion_enum1,this.nota1,this.notas);		
	}
	
	/*
	public void setToDataNotaRepositoryI() {
		this.notaLogicI.setNota_repository1(this.nota_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public NotaReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.notas = this.notaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public NotaReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.notas = this.notaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public NotaReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true	
					,materia:true	
					,docente:true									
			};
			*/
			
			this.notas = this.notaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public NotaReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true	
					,materia:true	
					,docente:true									
			};
			*/
			
			//this.builder_object_nota1=this.notaLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.notas = this.notaLogicI.getBuscar(this.builder_object_nota1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public NotaReturnView getSeleccionar(@RequestBody 
												Nota nota1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true	
					,materia:true	
					,docente:true									
			};
			*/
			
			this.nota1 = this.notaLogicI.getBuscarUno(nota1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_nota1=this.notaLogicI.getBuilderFunctionObjectParametroSeleccionar(nota1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public NotaReturnView nuevo(@RequestBody 
										NotaCreateRequestGlobal nota_create_request_global1) {
		try {   	
			NotaCreateRequestGlobal.setNota(nota_create_request_global1.getNota(),this.nota1);
			
			this.nota1 = this.notaLogicI.nuevo(this.nota1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public NotaReturnView actualizar(@RequestBody 
											NotaUpdateRequestGlobal nota_update_request_global1) {
		try { 
			this.nota1 = this.notaLogicI.getBuscarUno(nota_update_request_global1.getNota().getId());
			
			NotaUpdateRequestGlobal.setNota(nota_update_request_global1.getNota(),this.notaLogicI.getNota1());
			
			this.nota1 = this.notaLogicI.actualizar(this.nota1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public NotaReturnView eliminar(@RequestBody 
										Nota nota1) {
		try {		
			
			this.notaLogicI.eliminar(nota1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public NotaReturnView nuevos(@RequestBody 
										NotaLoteCrudRequestGlobal nota_lote_crud_request_global1) {
		try {   	
			this.notas = new ArrayList<Nota>();
			
			NotaCreateRequestGlobal.setNotas(nota_lote_crud_request_global1.getNews_notas(),this.notas);
			
			this.notas = this.notaLogicI.nuevos(this.notas);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public NotaReturnView eliminars(@RequestBody 
											NotaLoteCrudRequestGlobal nota_lote_crud_request_global1) {
		try {	
			
			this.notaLogicI.eliminars(nota_lote_crud_request_global1.getIds_deletes_notas());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public NotaReturnView actualizars(@RequestBody 
											NotaLoteCrudRequestGlobal nota_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Nota> updates_notas,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.notas = new ArrayList<Nota>();
			
			NotaUpdateRequestGlobal.setNotas(nota_lote_crud_request_global1.getUpdates_notas(),this.notas);
			
			this.notaLogicI.actualizars(this.notas,nota_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public NotaReturnView guardarCambios(@RequestBody 
												NotaLoteCrudRequestGlobal nota_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Nota> news_notas,
				@RequestBody 
				ArrayList<Long> ids_deletes_notas,
				@RequestBody 
				ArrayList<Nota> updates_notas,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.notas = new ArrayList<Nota>();
			NotaCreateRequestGlobal.setNotas(nota_lote_crud_request_global1.getNews_notas(),this.notas);			
			this.notaLogicI.nuevos(this.notas);
			
			/*--- Deletes ---*/
			this.notaLogicI.eliminars(nota_lote_crud_request_global1.getIds_deletes_notas());
			
			/*--- Updates ---*/
			this.notas = new ArrayList<Nota>();
			NotaUpdateRequestGlobal.setNotas(nota_lote_crud_request_global1.getUpdates_notas(),this.notas);			
			this.notaLogicI.actualizars(this.notas,nota_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.notaReturnView;
	}
	
	
}

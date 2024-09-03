package com.bydan.colegio.estructura.alumno_materia.infrastructure.controller;

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

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;

import com.bydan.colegio.estructura.alumno_materia.application.logic.Alumno_materiaLogicI;
/*import com.bydan.colegio.estructura.alumno_materia.infrastructure.data.Alumno_materiaRepositoryI;*/

import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.returns.Alumno_materiaReturnView;

import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.global.Alumno_materiaCreateRequestGlobal;
import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.global.Alumno_materiaUpdateRequestGlobal;
import com.bydan.colegio.estructura.alumno_materia.infrastructure.util.request.global.Alumno_materiaLoteCrudRequestGlobal;


//import {Alumno_materiaFKReturnViewDto} from "./dto/alumno_materia_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/estructura/alumno_materia_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class Alumno_materiaController { //extends GeneralEntityController
	/*
	@Autowired
	private Alumno_materiaRepositoryI alumno_materia_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Alumno_materia alumno_materia1;
	ArrayList<Alumno_materia> alumno_materias = new ArrayList<Alumno_materia>();
	
	@Autowired
	private Alumno_materiaLogicI alumno_materiaLogicI;
	
	Alumno_materiaReturnView alumno_materiaReturnView;
	
	//Alumno_materiaLogic alumno_materiaLogicI;
		
	Object builder_object_alumno_materia1;
	
	
	public Alumno_materiaController() {
		/*super();*/
		
		this.alumno_materia1 = new Alumno_materia();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.alumno_materiaLogicI = new Alumno_materiaLogic();*/								
		/*this.alumno_materiaLogicI.setAlumno_materia_repository1(this.alumno_materia_repositoryi1);*/
		
		this.alumno_materiaReturnView = new Alumno_materiaReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.alumno_materia1 = this.alumno_materiaLogicI.getAlumno_materia1();		
		this.alumno_materias = this.alumno_materiaLogicI.getAlumno_materias();
		*/
		
		this.alumno_materiaReturnView.setReturnView(tipo_accion_enum1,this.alumno_materia1,this.alumno_materias);		
	}
	
	/*
	public void setToDataAlumno_materiaRepositoryI() {
		this.alumno_materiaLogicI.setAlumno_materia_repository1(this.alumno_materia_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public Alumno_materiaReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.alumno_materias = this.alumno_materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public Alumno_materiaReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.alumno_materias = this.alumno_materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public Alumno_materiaReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true	
					,materia:true									
			};
			*/
			
			this.alumno_materias = this.alumno_materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public Alumno_materiaReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true	
					,materia:true									
			};
			*/
			
			//this.builder_object_alumno_materia1=this.alumno_materiaLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.alumno_materias = this.alumno_materiaLogicI.getBuscar(this.builder_object_alumno_materia1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public Alumno_materiaReturnView getSeleccionar(@RequestBody 
												Alumno_materia alumno_materia1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true	
					,materia:true									
			};
			*/
			
			this.alumno_materia1 = this.alumno_materiaLogicI.getBuscarUno(alumno_materia1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_alumno_materia1=this.alumno_materiaLogicI.getBuilderFunctionObjectParametroSeleccionar(alumno_materia1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public Alumno_materiaReturnView nuevo(@RequestBody 
										Alumno_materiaCreateRequestGlobal alumno_materia_create_request_global1) {
		try {   	
			Alumno_materiaCreateRequestGlobal.setAlumno_materia(alumno_materia_create_request_global1.getAlumno_materia(),this.alumno_materia1);
			
			this.alumno_materia1 = this.alumno_materiaLogicI.nuevo(this.alumno_materia1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public Alumno_materiaReturnView actualizar(@RequestBody 
											Alumno_materiaUpdateRequestGlobal alumno_materia_update_request_global1) {
		try { 
			this.alumno_materia1 = this.alumno_materiaLogicI.getBuscarUno(alumno_materia_update_request_global1.getAlumno_materia().getId());
			
			Alumno_materiaUpdateRequestGlobal.setAlumno_materia(alumno_materia_update_request_global1.getAlumno_materia(),this.alumno_materiaLogicI.getAlumno_materia1());
			
			this.alumno_materia1 = this.alumno_materiaLogicI.actualizar(this.alumno_materia1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public Alumno_materiaReturnView eliminar(@RequestBody 
										Alumno_materia alumno_materia1) {
		try {		
			
			this.alumno_materiaLogicI.eliminar(alumno_materia1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public Alumno_materiaReturnView nuevos(@RequestBody 
										Alumno_materiaLoteCrudRequestGlobal alumno_materia_lote_crud_request_global1) {
		try {   	
			this.alumno_materias = new ArrayList<Alumno_materia>();
			
			Alumno_materiaCreateRequestGlobal.setAlumno_materias(alumno_materia_lote_crud_request_global1.getNews_alumno_materias(),this.alumno_materias);
			
			this.alumno_materias = this.alumno_materiaLogicI.nuevos(this.alumno_materias);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public Alumno_materiaReturnView eliminars(@RequestBody 
											Alumno_materiaLoteCrudRequestGlobal alumno_materia_lote_crud_request_global1) {
		try {	
			
			this.alumno_materiaLogicI.eliminars(alumno_materia_lote_crud_request_global1.getIds_deletes_alumno_materias());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public Alumno_materiaReturnView actualizars(@RequestBody 
											Alumno_materiaLoteCrudRequestGlobal alumno_materia_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Alumno_materia> updates_alumno_materias,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.alumno_materias = new ArrayList<Alumno_materia>();
			
			Alumno_materiaUpdateRequestGlobal.setAlumno_materias(alumno_materia_lote_crud_request_global1.getUpdates_alumno_materias(),this.alumno_materias);
			
			this.alumno_materiaLogicI.actualizars(this.alumno_materias,alumno_materia_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public Alumno_materiaReturnView guardarCambios(@RequestBody 
												Alumno_materiaLoteCrudRequestGlobal alumno_materia_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Alumno_materia> news_alumno_materias,
				@RequestBody 
				ArrayList<Long> ids_deletes_alumno_materias,
				@RequestBody 
				ArrayList<Alumno_materia> updates_alumno_materias,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.alumno_materias = new ArrayList<Alumno_materia>();
			Alumno_materiaCreateRequestGlobal.setAlumno_materias(alumno_materia_lote_crud_request_global1.getNews_alumno_materias(),this.alumno_materias);			
			this.alumno_materiaLogicI.nuevos(this.alumno_materias);
			
			/*--- Deletes ---*/
			this.alumno_materiaLogicI.eliminars(alumno_materia_lote_crud_request_global1.getIds_deletes_alumno_materias());
			
			/*--- Updates ---*/
			this.alumno_materias = new ArrayList<Alumno_materia>();
			Alumno_materiaUpdateRequestGlobal.setAlumno_materias(alumno_materia_lote_crud_request_global1.getUpdates_alumno_materias(),this.alumno_materias);			
			this.alumno_materiaLogicI.actualizars(this.alumno_materias,alumno_materia_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumno_materiaReturnView;
	}
	
	
}

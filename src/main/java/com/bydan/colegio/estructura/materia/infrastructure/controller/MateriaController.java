package com.bydan.colegio.estructura.materia.infrastructure.controller;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.web.bind.annotation.GetMapping;*/
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*///Get Params
import org.springframework.web.bind.annotation.RequestBody;//Post Params
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.CrossOrigin;

import com.bydan.colegio.base.application.logic.Pagination;
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

import com.bydan.colegio.estructura.materia.domain.model.Materia;

import com.bydan.colegio.estructura.materia.application.logic.MateriaLogicI;
/*import com.bydan.colegio.estructura.materia.infrastructure.data.MateriaRepositoryI;*/

import com.bydan.colegio.estructura.materia.infrastructure.util.returns.MateriaReturnView;

import com.bydan.colegio.estructura.materia.infrastructure.util.request.global.MateriaCreateRequestGlobal;
import com.bydan.colegio.estructura.materia.infrastructure.util.request.global.MateriaUpdateRequestGlobal;
import com.bydan.colegio.estructura.materia.infrastructure.util.request.global.MateriaLoteCrudRequestGlobal;



@Controller
@RequestMapping(path="/api/colegio/estructura/materia_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class MateriaController { //extends GeneralEntityController
	/*
	@Autowired
	private MateriaRepositoryI materia_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Materia materia1;
	ArrayList<Materia> materias = new ArrayList<Materia>();
	
	@Autowired
	private MateriaLogicI materiaLogicI;
	
	MateriaReturnView materiaReturnView;
	
	//MateriaLogic materiaLogicI;
		
	Object builder_object_materia1;
	
	
	public MateriaController() {
		/*super();*/
		
		this.materia1 = new Materia();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.materiaLogicI = new MateriaLogic();*/								
		/*this.materiaLogicI.setMateria_repository1(this.materia_repositoryi1);*/
		
		this.materiaReturnView = new MateriaReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.materia1 = this.materiaLogicI.getMateria1();		
		this.materias = this.materiaLogicI.getMaterias();
		*/
		
		this.materiaReturnView.setReturnView(tipo_accion_enum1,this.materia1,this.materias);		
	}
	
	/*
	public void setToDataMateriaRepositoryI() {
		this.materiaLogicI.setMateria_repository1(this.materia_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public MateriaReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.materias = this.materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public MateriaReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.materias = this.materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@GetMapping(path="/index_get")
	@ResponseBody
	public MateriaReturnView getIndexGet() {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.materias = this.materiaLogicI.getTodos(new Pagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public MateriaReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.materias = this.materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public MateriaReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			//this.builder_object_materia1=this.materiaLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.materias = this.materiaLogicI.getBuscar(this.builder_object_materia1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public MateriaReturnView getSeleccionar(@RequestBody 
												Materia materia1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			this.materia1 = this.materiaLogicI.getBuscarUno(materia1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_materia1=this.materiaLogicI.getBuilderFunctionObjectParametroSeleccionar(materia1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public MateriaReturnView nuevo(@RequestBody 
										MateriaCreateRequestGlobal materia_create_request_global1) {
		try {   	
			MateriaCreateRequestGlobal.setMateria(materia_create_request_global1.getMateria(),this.materia1);
			
			this.materia1 = this.materiaLogicI.nuevo(this.materia1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public MateriaReturnView actualizar(@RequestBody 
											MateriaUpdateRequestGlobal materia_update_request_global1) {
		try { 
			this.materia1 = this.materiaLogicI.getBuscarUno(materia_update_request_global1.getMateria().getId());
			
			MateriaUpdateRequestGlobal.setMateria(materia_update_request_global1.getMateria(),this.materiaLogicI.getMateria1());
			
			this.materia1 = this.materiaLogicI.actualizar(this.materia1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public MateriaReturnView eliminar(@RequestBody 
										Materia materia1) {
		try {		
			
			this.materiaLogicI.eliminar(materia1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public MateriaReturnView nuevos(@RequestBody 
										MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1) {
		try {   	
			this.materias = new ArrayList<Materia>();
			
			MateriaCreateRequestGlobal.setMaterias(materia_lote_crud_request_global1.getNews_materias(),this.materias);
			
			this.materias = this.materiaLogicI.nuevos(this.materias);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public MateriaReturnView eliminars(@RequestBody 
											MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1) {
		try {	
			
			this.materiaLogicI.eliminars(materia_lote_crud_request_global1.getIds_deletes_materias());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public MateriaReturnView actualizars(@RequestBody 
											MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Materia> updates_materias,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.materias = new ArrayList<Materia>();
			
			MateriaUpdateRequestGlobal.setMaterias(materia_lote_crud_request_global1.getUpdates_materias(),this.materias);
			
			this.materiaLogicI.actualizars(this.materias,materia_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public MateriaReturnView guardarCambios(@RequestBody 
												MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Materia> news_materias,
				@RequestBody 
				ArrayList<Long> ids_deletes_materias,
				@RequestBody 
				ArrayList<Materia> updates_materias,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.materias = new ArrayList<Materia>();
			MateriaCreateRequestGlobal.setMaterias(materia_lote_crud_request_global1.getNews_materias(),this.materias);			
			this.materiaLogicI.nuevos(this.materias);
			
			/*--- Deletes ---*/
			this.materiaLogicI.eliminars(materia_lote_crud_request_global1.getIds_deletes_materias());
			
			/*--- Updates ---*/
			this.materias = new ArrayList<Materia>();
			MateriaUpdateRequestGlobal.setMaterias(materia_lote_crud_request_global1.getUpdates_materias(),this.materias);			
			this.materiaLogicI.actualizars(this.materias,materia_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	
	/*----- RELACIONES -----*/
	@PostMapping(path="/todos_relaciones")
	@ResponseBody
	public MateriaReturnView getTodosRelaciones(@RequestBody 
													PaginationGlobal pagination_global1) {
		try {
			/*
			this.relations1 = {
				//----- Relaciones -----
				
				docente_materias:true
				,docentes:true
				,alumnos:true
				,notas:true
				,alumno_materias:true
			};
			*/
			
			this.materias = this.materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
	
	@PostMapping(path="/seleccionar_relaciones")
	@ResponseBody
	public MateriaReturnView getSeleccionarRelaciones(@RequestBody 
														Materia materia1) {
		try {	
			
			/*
			this.relations1 = {
				
				//----- Relaciones -----
				
				docente_materias:true
				,docentes:true
				,alumnos:true
				,notas:true
				,alumno_materias:true
			};
			*/
			
			//this.builder_object_materia1=this.materiaLogicI.getBuilderFunctionObjectParametroSeleccionar(id);			
			
			this.materia1 = this.materiaLogicI.getBuscarUno(materia1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.materiaReturnView;
	}
}

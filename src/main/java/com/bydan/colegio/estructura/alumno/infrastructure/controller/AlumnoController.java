package com.bydan.colegio.estructura.alumno.infrastructure.controller;

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

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;

import com.bydan.colegio.estructura.alumno.application.logic.AlumnoLogicI;
/*import com.bydan.colegio.estructura.alumno.infrastructure.data.AlumnoRepositoryI;*/

import com.bydan.colegio.estructura.alumno.infrastructure.util.returns.AlumnoReturnView;

import com.bydan.colegio.estructura.alumno.infrastructure.util.request.global.AlumnoCreateRequestGlobal;
import com.bydan.colegio.estructura.alumno.infrastructure.util.request.global.AlumnoUpdateRequestGlobal;
import com.bydan.colegio.estructura.alumno.infrastructure.util.request.global.AlumnoLoteCrudRequestGlobal;



@Controller
@RequestMapping(path="/api/colegio/estructura/alumno_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class AlumnoController { //extends GeneralEntityController
	/*
	@Autowired
	private AlumnoRepositoryI alumno_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Alumno alumno1;
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Autowired
	private AlumnoLogicI alumnoLogicI;
	
	AlumnoReturnView alumnoReturnView;
	
	//AlumnoLogic alumnoLogicI;
		
	Object builder_object_alumno1;
	
	
	public AlumnoController() {
		/*super();*/
		
		this.alumno1 = new Alumno();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.alumnoLogicI = new AlumnoLogic();*/								
		/*this.alumnoLogicI.setAlumno_repository1(this.alumno_repositoryi1);*/
		
		this.alumnoReturnView = new AlumnoReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.alumno1 = this.alumnoLogicI.getAlumno1();		
		this.alumnos = this.alumnoLogicI.getAlumnos();
		*/
		
		this.alumnoReturnView.setReturnView(tipo_accion_enum1,this.alumno1,this.alumnos);		
	}
	
	/*
	public void setToDataAlumnoRepositoryI() {
		this.alumnoLogicI.setAlumno_repository1(this.alumno_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public AlumnoReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.alumnos = this.alumnoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public AlumnoReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.alumnos = this.alumnoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public AlumnoReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.alumnos = this.alumnoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public AlumnoReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			//this.builder_object_alumno1=this.alumnoLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.alumnos = this.alumnoLogicI.getBuscar(this.builder_object_alumno1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public AlumnoReturnView getSeleccionar(@RequestBody 
												Alumno alumno1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			this.alumno1 = this.alumnoLogicI.getBuscarUno(alumno1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_alumno1=this.alumnoLogicI.getBuilderFunctionObjectParametroSeleccionar(alumno1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public AlumnoReturnView nuevo(@RequestBody 
										AlumnoCreateRequestGlobal alumno_create_request_global1) {
		try {   	
			AlumnoCreateRequestGlobal.setAlumno(alumno_create_request_global1.getAlumno(),this.alumno1);
			
			this.alumno1 = this.alumnoLogicI.nuevo(this.alumno1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public AlumnoReturnView actualizar(@RequestBody 
											AlumnoUpdateRequestGlobal alumno_update_request_global1) {
		try { 
			this.alumno1 = this.alumnoLogicI.getBuscarUno(alumno_update_request_global1.getAlumno().getId());
			
			AlumnoUpdateRequestGlobal.setAlumno(alumno_update_request_global1.getAlumno(),this.alumnoLogicI.getAlumno1());
			
			this.alumno1 = this.alumnoLogicI.actualizar(this.alumno1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public AlumnoReturnView eliminar(@RequestBody 
										Alumno alumno1) {
		try {		
			
			this.alumnoLogicI.eliminar(alumno1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public AlumnoReturnView nuevos(@RequestBody 
										AlumnoLoteCrudRequestGlobal alumno_lote_crud_request_global1) {
		try {   	
			this.alumnos = new ArrayList<Alumno>();
			
			AlumnoCreateRequestGlobal.setAlumnos(alumno_lote_crud_request_global1.getNews_alumnos(),this.alumnos);
			
			this.alumnos = this.alumnoLogicI.nuevos(this.alumnos);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public AlumnoReturnView eliminars(@RequestBody 
											AlumnoLoteCrudRequestGlobal alumno_lote_crud_request_global1) {
		try {	
			
			this.alumnoLogicI.eliminars(alumno_lote_crud_request_global1.getIds_deletes_alumnos());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public AlumnoReturnView actualizars(@RequestBody 
											AlumnoLoteCrudRequestGlobal alumno_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Alumno> updates_alumnos,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.alumnos = new ArrayList<Alumno>();
			
			AlumnoUpdateRequestGlobal.setAlumnos(alumno_lote_crud_request_global1.getUpdates_alumnos(),this.alumnos);
			
			this.alumnoLogicI.actualizars(this.alumnos,alumno_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public AlumnoReturnView guardarCambios(@RequestBody 
												AlumnoLoteCrudRequestGlobal alumno_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Alumno> news_alumnos,
				@RequestBody 
				ArrayList<Long> ids_deletes_alumnos,
				@RequestBody 
				ArrayList<Alumno> updates_alumnos,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.alumnos = new ArrayList<Alumno>();
			AlumnoCreateRequestGlobal.setAlumnos(alumno_lote_crud_request_global1.getNews_alumnos(),this.alumnos);			
			this.alumnoLogicI.nuevos(this.alumnos);
			
			/*--- Deletes ---*/
			this.alumnoLogicI.eliminars(alumno_lote_crud_request_global1.getIds_deletes_alumnos());
			
			/*--- Updates ---*/
			this.alumnos = new ArrayList<Alumno>();
			AlumnoUpdateRequestGlobal.setAlumnos(alumno_lote_crud_request_global1.getUpdates_alumnos(),this.alumnos);			
			this.alumnoLogicI.actualizars(this.alumnos,alumno_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	
	/*----- RELACIONES -----*/
	@PostMapping(path="/todos_relaciones")
	@ResponseBody
	public AlumnoReturnView getTodosRelaciones(@RequestBody 
													PaginationGlobal pagination_global1) {
		try {
			/*
			this.relations1 = {
				//----- Relaciones -----
				
				matricula:true
				,materias:true
				,pensions:true
				,notas:true
				,alumno_materias:true
			};
			*/
			
			this.alumnos = this.alumnoLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
	
	@PostMapping(path="/seleccionar_relaciones")
	@ResponseBody
	public AlumnoReturnView getSeleccionarRelaciones(@RequestBody 
														Alumno alumno1) {
		try {	
			
			/*
			this.relations1 = {
				
				//----- Relaciones -----
				
				matricula:true
				,materias:true
				,pensions:true
				,notas:true
				,alumno_materias:true
			};
			*/
			
			//this.builder_object_alumno1=this.alumnoLogicI.getBuilderFunctionObjectParametroSeleccionar(id);			
			
			this.alumno1 = this.alumnoLogicI.getBuscarUno(alumno1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.alumnoReturnView;
	}
}

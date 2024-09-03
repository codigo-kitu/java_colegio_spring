package com.bydan.colegio.proceso.matricula.infrastructure.controller;

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

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;

import com.bydan.colegio.proceso.matricula.application.logic.MatriculaLogicI;
/*import com.bydan.colegio.proceso.matricula.infrastructure.data.MatriculaRepositoryI;*/

import com.bydan.colegio.proceso.matricula.infrastructure.util.returns.MatriculaReturnView;

import com.bydan.colegio.proceso.matricula.infrastructure.util.request.global.MatriculaCreateRequestGlobal;
import com.bydan.colegio.proceso.matricula.infrastructure.util.request.global.MatriculaUpdateRequestGlobal;
import com.bydan.colegio.proceso.matricula.infrastructure.util.request.global.MatriculaLoteCrudRequestGlobal;


//import {MatriculaFKReturnViewDto} from "./dto/matricula_fk_return_view.dto";

@Controller
@RequestMapping(path="/api/colegio/proceso/matricula_api") 
//@CrossOrigin(origins = "http://localhost:8080")
public class MatriculaController { //extends GeneralEntityController
	/*
	@Autowired
	private MatriculaRepositoryI matricula_repositoryi1;
	*/
	
	/*PaginationGlobal pagination_global1;*/
	ArrayList<String> relations1;
	
	Matricula matricula1;
	ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	@Autowired
	private MatriculaLogicI matriculaLogicI;
	
	MatriculaReturnView matriculaReturnView;
	
	//MatriculaLogic matriculaLogicI;
		
	Object builder_object_matricula1;
	
	
	public MatriculaController() {
		/*super();*/
		
		this.matricula1 = new Matricula();
		
		/*pagination_global1 = new PaginationGlobal();*/
		/*this.matriculaLogicI = new MatriculaLogic();*/								
		/*this.matriculaLogicI.setMatricula_repository1(this.matricula_repositoryi1);*/
		
		this.matriculaReturnView = new MatriculaReturnView();
		
		
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1) {
		/*
		this.matricula1 = this.matriculaLogicI.getMatricula1();		
		this.matriculas = this.matriculaLogicI.getMatriculas();
		*/
		
		this.matriculaReturnView.setReturnView(tipo_accion_enum1,this.matricula1,this.matriculas);		
	}
	
	/*
	public void setToDataMatriculaRepositoryI() {
		this.matriculaLogicI.setMatricula_repository1(this.matricula_repositoryi1);	
	}
	*/
	
	//------------------------------ APIs ---------------------------------------
	
	@PostMapping(path="/")
	@ResponseBody
	public MatriculaReturnView getDefault(@RequestBody 
											PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.matriculas = this.matriculaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="/index")
	@ResponseBody
	public MatriculaReturnView getIndex(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			this.matriculas = this.matriculaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="/todos")
	@ResponseBody
	public MatriculaReturnView getTodos(@RequestBody 
										 PaginationGlobal pagination_global1) {		
		try {
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true									
			};
			*/
			
			this.matriculas = this.matriculaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="/buscar")
	@ResponseBody
	public MatriculaReturnView getBuscar(@RequestBody 
										  PaginationGlobal pagination_global1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true									
			};
			*/
			
			//this.builder_object_matricula1=this.matriculaLogicI.getBuilderFunctionObjectParametroBuscar(req);			
			
			this.matriculas = this.matriculaLogicI.getBuscar(this.builder_object_matricula1,pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="/seleccionar")
	@ResponseBody
	public MatriculaReturnView getSeleccionar(@RequestBody 
												Matricula matricula1) {
		try {		
			/*
			this.relations1 = {
				//----- FKs -----
				
					alumno:true									
			};
			*/
			
			this.matricula1 = this.matriculaLogicI.getBuscarUno(matricula1.getId());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_matricula1=this.matriculaLogicI.getBuilderFunctionObjectParametroSeleccionar(matricula1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="/nuevo")
	@ResponseBody
	public MatriculaReturnView nuevo(@RequestBody 
										MatriculaCreateRequestGlobal matricula_create_request_global1) {
		try {   	
			MatriculaCreateRequestGlobal.setMatricula(matricula_create_request_global1.getMatricula(),this.matricula1);
			
			this.matricula1 = this.matriculaLogicI.nuevo(this.matricula1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}

	@PutMapping(path="/actualizar")
	@ResponseBody
	public MatriculaReturnView actualizar(@RequestBody 
											MatriculaUpdateRequestGlobal matricula_update_request_global1) {
		try { 
			this.matricula1 = this.matriculaLogicI.getBuscarUno(matricula_update_request_global1.getMatricula().getId());
			
			MatriculaUpdateRequestGlobal.setMatricula(matricula_update_request_global1.getMatricula(),this.matriculaLogicI.getMatricula1());
			
			this.matricula1 = this.matriculaLogicI.actualizar(this.matricula1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@DeleteMapping(path="/eliminar")
	@ResponseBody
	public MatriculaReturnView eliminar(@RequestBody 
										Matricula matricula1) {
		try {		
			
			this.matriculaLogicI.eliminar(matricula1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="/nuevos")
	@ResponseBody
	public MatriculaReturnView nuevos(@RequestBody 
										MatriculaLoteCrudRequestGlobal matricula_lote_crud_request_global1) {
		try {   	
			this.matriculas = new ArrayList<Matricula>();
			
			MatriculaCreateRequestGlobal.setMatriculas(matricula_lote_crud_request_global1.getNews_matriculas(),this.matriculas);
			
			this.matriculas = this.matriculaLogicI.nuevos(this.matriculas);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@DeleteMapping(path="eliminars")
	@ResponseBody
	public MatriculaReturnView eliminars(@RequestBody 
											MatriculaLoteCrudRequestGlobal matricula_lote_crud_request_global1) {
		try {	
			
			this.matriculaLogicI.eliminars(matricula_lote_crud_request_global1.getIds_deletes_matriculas());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PutMapping(path="actualizars")
	@ResponseBody
	public MatriculaReturnView actualizars(@RequestBody 
											MatriculaLoteCrudRequestGlobal matricula_lote_crud_request_global1) {
		try {
			/*
			console.log(updates_columnas);
			
			@RequestBody 
			ArrayList<Matricula> updates_matriculas,
			@RequestParam(name="updates_columnas"
			ArrayList<String> updates_columnas
			*/
			
			this.matriculas = new ArrayList<Matricula>();
			
			MatriculaUpdateRequestGlobal.setMatriculas(matricula_lote_crud_request_global1.getUpdates_matriculas(),this.matriculas);
			
			this.matriculaLogicI.actualizars(this.matriculas,matricula_lote_crud_request_global1.getUpdates_columnas());			
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	@PostMapping(path="guardar_cambios")
	@ResponseBody
	public MatriculaReturnView guardarCambios(@RequestBody 
												MatriculaLoteCrudRequestGlobal matricula_lote_crud_request_global1) {	
		try {
			
			/*
				@RequestBody 
				ArrayList<Matricula> news_matriculas,
				@RequestBody 
				ArrayList<Long> ids_deletes_matriculas,
				@RequestBody 
				ArrayList<Matricula> updates_matriculas,
				@RequestBody 
				ArrayList<String> updates_columnas
			*/
						
			/*--- Inserts ---*/
			this.matriculas = new ArrayList<Matricula>();
			MatriculaCreateRequestGlobal.setMatriculas(matricula_lote_crud_request_global1.getNews_matriculas(),this.matriculas);			
			this.matriculaLogicI.nuevos(this.matriculas);
			
			/*--- Deletes ---*/
			this.matriculaLogicI.eliminars(matricula_lote_crud_request_global1.getIds_deletes_matriculas());
			
			/*--- Updates ---*/
			this.matriculas = new ArrayList<Matricula>();
			MatriculaUpdateRequestGlobal.setMatriculas(matricula_lote_crud_request_global1.getUpdates_matriculas(),this.matriculas);			
			this.matriculaLogicI.actualizars(this.matriculas,matricula_lote_crud_request_global1.getUpdates_columnas());
						
			this.setReturnView(TipoAccionEnum.GUARDAR_CAMBIOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		return this.matriculaReturnView;
	}
	
	
}

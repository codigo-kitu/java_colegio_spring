package com.bydan.colegio.estructura.materia.infrastructure.controller;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*///Get Params
import org.springframework.web.bind.annotation.RequestBody;//Post Params
/*import org.springframework.web.bind.annotation.ResponseBody;*/
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.ui.Model;

/*import com.bydan.colegio.base.application.logic.Pagination;*/
import com.bydan.colegio.base.application.logic.global.PaginationGlobal;
import com.bydan.colegio.base.domain.entity.global.GeneralEntityGlobal;
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
@RequestMapping(path="/colegio/estructura/materia") 
//@CrossOrigin(origins = "http://localhost:8080")
public class MateriaMvcController { //extends GeneralEntityController
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
	
	
	public static String URL_BASE = "http://localhost:3000/colegio/estructura/materia";
	
	public String accion_busqueda = "todos";
	
	public String display = "table-row";
	public String style_id_column = "table-row";
	public String display_actualizar = "none";
	public String display_nuevo = "none";
	public Integer text_id_aux = -1;
	
	public MateriaMvcController() {
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
	
	@GetMapping(path="/")
	public String getDefault(Model model1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			PaginationGlobal pagination_global1 = new PaginationGlobal();
			
			this.materias = this.materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
					
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/View/MateriaView";
	}
	
	public void loadParamsView(Model model1) {
		
		model1.addAttribute("title", "Materia");
		model1.addAttribute("url_base", MateriaMvcController.URL_BASE);
		model1.addAttribute("accion_busqueda", this.accion_busqueda);
		model1.addAttribute("text_id_aux", this.text_id_aux);
		model1.addAttribute("display", this.display);
		model1.addAttribute("style_id_column", this.style_id_column);
		model1.addAttribute("display_actualizar", this.display_actualizar);
		model1.addAttribute("display_nuevo", this.display_nuevo);
		model1.addAttribute("materia", this.materia1);
		model1.addAttribute("materia_parametro_view", this.materiaReturnView);
	}
	
	public void displayForm(Boolean con_display) {
		
		if(con_display) {
			this.display = "table-row";
			this.style_id_column = "table-row";
			
		} else {
			this.display = "none";
			this.style_id_column = "table-row";
		}
	}
	
	@GetMapping(path="/index")
	public String getIndex(Model model1) {		
		try {
			/*
			this.relations1 = {
			};
			*/
			
			PaginationGlobal pagination_global1 = new PaginationGlobal();
			
			this.materias = this.materiaLogicI.getTodos(pagination_global1.getPagination());
			
			this.setReturnView(TipoAccionEnum.BUSCAR_TODOS);
		
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/View/MateriaView";
	}
	
	@PostMapping(path="/todos")
	public String getTodos(@RequestBody 
							PaginationGlobal pagination_global1, 
							Model model1) {		
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
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	@PostMapping(path="/buscar")
	public String getBuscar(@RequestBody 
							PaginationGlobal pagination_global1, 
							Model model1) {
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
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	@PostMapping(path="/seleccionar")
	public String getSeleccionar(@RequestBody 
								GeneralEntityGlobal generalEntityGlobal1, 
								Model model1) {
		try {		
			/*
			this.relations1 = {
			};
			*/
			
			this.materia1 = this.materiaLogicI.getBuscarUno(generalEntityGlobal1.getId_table());
			
			this.setReturnView(TipoAccionEnum.SELECCIONAR);
			
			//this.builder_object_materia1=this.materiaLogicI.getBuilderFunctionObjectParametroSeleccionar(materia1.getId());			
			
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}
	
	@PostMapping(path="/nuevo_preparar")
	public String getSeleccionar(Model model1) {
		try {		
			
			this.materia1 = new Materia();
			
			this.setReturnView(TipoAccionEnum.NUEVO_PREPARAR);
			
			this.display_actualizar = "none";
			this.display_nuevo = "table-row";
			
			this.displayForm(true);
			
			this.loadParamsView(model1);
		
		} catch(Exception e) {
			throw e;
		}
				
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}
	
	@PostMapping(path="/cancelar")
	public String cancelar(Model model1) {
		try {		
			
			this.materia1 = new Materia();
			
			this.setReturnView(TipoAccionEnum.CANCELAR);
			
			this.displayForm(false);
			
			this.loadParamsView(model1);
		
		} catch(Exception e) {
			throw e;
		}
				
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}
	
	@PostMapping(path="/nuevo")
	public String nuevo(@RequestBody 
						MateriaCreateRequestGlobal materia_create_request_global1, 
						Model model1) {
		try {   	
			MateriaCreateRequestGlobal.setMateria(materia_create_request_global1.getMateria(),this.materia1);
			
			this.materia1 = this.materiaLogicI.nuevo(this.materia1);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}

	@PutMapping(path="/actualizar")
	public String actualizar(@RequestBody 
							MateriaUpdateRequestGlobal materia_update_request_global1, 
							Model model1) {
		try { 
			this.materia1 = this.materiaLogicI.getBuscarUno(materia_update_request_global1.getMateria().getId());
			
			MateriaUpdateRequestGlobal.setMateria(materia_update_request_global1.getMateria(),this.materiaLogicI.getMateria1());
			
			this.materia1 = this.materiaLogicI.actualizar(this.materia1);
			
			this.setReturnView(TipoAccionEnum.ACTUALIZAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}
	
	@DeleteMapping(path="/eliminar")
	public String eliminar(@RequestBody 
							Materia materia1, 
							Model model1) {
		try {		
			
			this.materiaLogicI.eliminar(materia1.getId());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}
	
	@PostMapping(path="/nuevos")
	public String nuevos(@RequestBody 
						MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1, 
						Model model1) {
		try {   	
			this.materias = new ArrayList<Materia>();
			
			MateriaCreateRequestGlobal.setMaterias(materia_lote_crud_request_global1.getNews_materias(),this.materias);
			
			this.materias = this.materiaLogicI.nuevos(this.materias);
			
			this.setReturnView(TipoAccionEnum.NUEVO);
			
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	@DeleteMapping(path="eliminars")
	public String eliminars(@RequestBody 
							MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1, 
							Model model1) {
		try {	
			
			this.materiaLogicI.eliminars(materia_lote_crud_request_global1.getIds_deletes_materias());
			
			this.setReturnView(TipoAccionEnum.ELIMINAR);
			
		} catch(Exception e) {
			throw e;
		}
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	@PutMapping(path="actualizars")
	public String actualizars(@RequestBody 
								MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1, 
								Model model1) {
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
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	@PostMapping(path="guardar_cambios")
	public String guardarCambios(@RequestBody 
								MateriaLoteCrudRequestGlobal materia_lote_crud_request_global1, 
								Model model1) {	
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
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	
	/*----- RELACIONES -----*/
	@PostMapping(path="/todos_relaciones")
	public String getTodosRelaciones(@RequestBody 
									PaginationGlobal pagination_global1, 
									Model model1) {
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
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaTableComp";
	}
	
	@PostMapping(path="/seleccionar_relaciones")
	public String getSeleccionarRelaciones(@RequestBody 
											Materia materia1, 
											Model model1) {
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
		
		this.loadParamsView(model1);
		
		return "Estructura/Materia/Application/Component/MateriaFormComp";
	}
}

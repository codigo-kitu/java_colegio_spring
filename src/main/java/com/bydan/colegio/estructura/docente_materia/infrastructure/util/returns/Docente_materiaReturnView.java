package com.bydan.colegio.estructura.docente_materia.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;


@Getter
@Setter
@AllArgsConstructor
public class Docente_materiaReturnView {
	String title = ""; 
	ArrayList<Docente_materia> docente_materias;
	Docente_materia docente_materia1;
	String action="";
	String action_title="";
	
	public Docente_materiaReturnView() {
		this.title = "";
		this.docente_materias = new ArrayList<Docente_materia>();
		this.docente_materia1 = new Docente_materia();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Docente_materia docente_materia1,ArrayList<Docente_materia> docente_materias) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String docente_materia_return_view_dto:Docente_materiaReturnView;
		
        switch(tipo_accion_enum1) {
			
			case SELECCIONAR: {
                pre_titulo="Datos";
				post_titulo="Seleccionar";
				break;
            }
            case BUSCAR_TODOS: {
                pre_titulo="Datos";
				post_titulo="Buscar_Todos";
				break;
            }
			case BUSCAR: {
                pre_titulo="Datos";
				post_titulo="Buscar";
				break;
            }
			case NUEVO: {
				pre_titulo="";
                post_titulo="Nuevo";
				action_form="nuevo";
				break;
            }
			case ACTUALIZAR: {
				pre_titulo="";
                post_titulo="Actualizar";
				action_form="actualizar";
				break;
            }
			case ELIMINAR: {
				pre_titulo="";
                post_titulo="Eliminar";
				action_form="eliminar";
				break;
            }
			case GUARDAR_CAMBIOS: {
				pre_titulo="";
                post_titulo="Guardar Cambios";
				action_form="guardar_cambios";
				break;
            }
            default: {
                break;
            }
        }
		
		 
		this.setTitle(pre_titulo + " Docente Materia " + post_titulo);
		this.setDocente_materia1(docente_materia1);		
		this.setDocente_materias(docente_materias);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.docente_materia_return_view_dto;
	}		
}


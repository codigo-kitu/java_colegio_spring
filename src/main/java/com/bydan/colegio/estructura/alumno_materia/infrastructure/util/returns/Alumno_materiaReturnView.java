package com.bydan.colegio.estructura.alumno_materia.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;


@Getter
@Setter
@AllArgsConstructor
public class Alumno_materiaReturnView {
	String title = ""; 
	ArrayList<Alumno_materia> alumno_materias;
	Alumno_materia alumno_materia1;
	String action="";
	String action_title="";
	
	public Alumno_materiaReturnView() {
		this.title = "";
		this.alumno_materias = new ArrayList<Alumno_materia>();
		this.alumno_materia1 = new Alumno_materia();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Alumno_materia alumno_materia1,ArrayList<Alumno_materia> alumno_materias) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String alumno_materia_return_view_dto:Alumno_materiaReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Alumno Materia " + post_titulo);
		this.setAlumno_materia1(alumno_materia1);		
		this.setAlumno_materias(alumno_materias);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.alumno_materia_return_view_dto;
	}		
}


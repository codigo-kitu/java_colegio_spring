package com.bydan.colegio.estructura.alumno.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;


@Getter
@Setter
@AllArgsConstructor
public class AlumnoReturnView {
	String title = ""; 
	ArrayList<Alumno> alumnos;
	Alumno alumno1;
	String action="";
	String action_title="";
	
	public AlumnoReturnView() {
		this.title = "";
		this.alumnos = new ArrayList<Alumno>();
		this.alumno1 = new Alumno();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Alumno alumno1,ArrayList<Alumno> alumnos) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String alumno_return_view_dto:AlumnoReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Alumno " + post_titulo);
		this.setAlumno1(alumno1);		
		this.setAlumnos(alumnos);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.alumno_return_view_dto;
	}		
}


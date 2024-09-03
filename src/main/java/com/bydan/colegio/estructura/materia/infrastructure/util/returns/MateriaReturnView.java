package com.bydan.colegio.estructura.materia.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.materia.domain.model.Materia;


@Getter
@Setter
@AllArgsConstructor
public class MateriaReturnView {
	String title = ""; 
	ArrayList<Materia> materias;
	Materia materia1;
	String action="";
	String action_title="";
	
	public MateriaReturnView() {
		this.title = "";
		this.materias = new ArrayList<Materia>();
		this.materia1 = new Materia();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Materia materia1,ArrayList<Materia> materias) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String materia_return_view_dto:MateriaReturnView;
		
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
			case NUEVO_PREPARAR: {
				pre_titulo="";
                post_titulo="Nuevo Preparar";
				action_form="nuevo_preparar";
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
			case CANCELAR: {
				pre_titulo="";
                post_titulo="Cancelar";
				action_form="cancelar";
				break;
            }
			case GUARDAR_CAMBIOS: {
				pre_titulo="";
                post_titulo="Guardar Cambios";
				action_form="guardar_cambios";
				break;
            }
            default: {
				pre_titulo="";
                post_titulo="Otro";
				action_form="otro";
                break;
            }
        }
		
		 
		this.setTitle(pre_titulo + " Materia " + post_titulo);
		this.setMateria1(materia1);		
		this.setMaterias(materias);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.materia_return_view_dto;
	}		
}


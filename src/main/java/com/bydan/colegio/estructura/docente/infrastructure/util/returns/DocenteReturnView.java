package com.bydan.colegio.estructura.docente.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.docente.domain.model.Docente;


@Getter
@Setter
@AllArgsConstructor
public class DocenteReturnView {
	String title = ""; 
	ArrayList<Docente> docentes;
	Docente docente1;
	String action="";
	String action_title="";
	
	public DocenteReturnView() {
		this.title = "";
		this.docentes = new ArrayList<Docente>();
		this.docente1 = new Docente();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Docente docente1,ArrayList<Docente> docentes) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String docente_return_view_dto:DocenteReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Docente " + post_titulo);
		this.setDocente1(docente1);		
		this.setDocentes(docentes);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.docente_return_view_dto;
	}		
}


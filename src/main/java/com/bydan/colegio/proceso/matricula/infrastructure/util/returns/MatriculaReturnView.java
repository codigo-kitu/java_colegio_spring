package com.bydan.colegio.proceso.matricula.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;


@Getter
@Setter
@AllArgsConstructor
public class MatriculaReturnView {
	String title = ""; 
	ArrayList<Matricula> matriculas;
	Matricula matricula1;
	String action="";
	String action_title="";
	
	public MatriculaReturnView() {
		this.title = "";
		this.matriculas = new ArrayList<Matricula>();
		this.matricula1 = new Matricula();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Matricula matricula1,ArrayList<Matricula> matriculas) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String matricula_return_view_dto:MatriculaReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Matricula " + post_titulo);
		this.setMatricula1(matricula1);		
		this.setMatriculas(matriculas);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.matricula_return_view_dto;
	}		
}


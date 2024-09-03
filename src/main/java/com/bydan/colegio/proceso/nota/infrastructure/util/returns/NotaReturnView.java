package com.bydan.colegio.proceso.nota.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.proceso.nota.domain.model.Nota;


@Getter
@Setter
@AllArgsConstructor
public class NotaReturnView {
	String title = ""; 
	ArrayList<Nota> notas;
	Nota nota1;
	String action="";
	String action_title="";
	
	public NotaReturnView() {
		this.title = "";
		this.notas = new ArrayList<Nota>();
		this.nota1 = new Nota();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Nota nota1,ArrayList<Nota> notas) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String nota_return_view_dto:NotaReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Nota " + post_titulo);
		this.setNota1(nota1);		
		this.setNotas(notas);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.nota_return_view_dto;
	}		
}


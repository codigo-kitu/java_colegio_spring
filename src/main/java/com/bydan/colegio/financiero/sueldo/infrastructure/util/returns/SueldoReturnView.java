package com.bydan.colegio.financiero.sueldo.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;


@Getter
@Setter
@AllArgsConstructor
public class SueldoReturnView {
	String title = ""; 
	ArrayList<Sueldo> sueldos;
	Sueldo sueldo1;
	String action="";
	String action_title="";
	
	public SueldoReturnView() {
		this.title = "";
		this.sueldos = new ArrayList<Sueldo>();
		this.sueldo1 = new Sueldo();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Sueldo sueldo1,ArrayList<Sueldo> sueldos) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String sueldo_return_view_dto:SueldoReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Sueldo " + post_titulo);
		this.setSueldo1(sueldo1);		
		this.setSueldos(sueldos);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.sueldo_return_view_dto;
	}		
}


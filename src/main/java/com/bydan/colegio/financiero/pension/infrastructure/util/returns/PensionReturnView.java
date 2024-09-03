package com.bydan.colegio.financiero.pension.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.financiero.pension.domain.model.Pension;


@Getter
@Setter
@AllArgsConstructor
public class PensionReturnView {
	String title = ""; 
	ArrayList<Pension> pensions;
	Pension pension1;
	String action="";
	String action_title="";
	
	public PensionReturnView() {
		this.title = "";
		this.pensions = new ArrayList<Pension>();
		this.pension1 = new Pension();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Pension pension1,ArrayList<Pension> pensions) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String pension_return_view_dto:PensionReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Pension " + post_titulo);
		this.setPension1(pension1);		
		this.setPensions(pensions);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.pension_return_view_dto;
	}		
}


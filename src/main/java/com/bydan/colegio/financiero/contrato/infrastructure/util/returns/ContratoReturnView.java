package com.bydan.colegio.financiero.contrato.infrastructure.util.returns;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.bydan.colegio.base.util.TipoAccionEnum;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;


@Getter
@Setter
@AllArgsConstructor
public class ContratoReturnView {
	String title = ""; 
	ArrayList<Contrato> contratos;
	Contrato contrato1;
	String action="";
	String action_title="";
	
	public ContratoReturnView() {
		this.title = "";
		this.contratos = new ArrayList<Contrato>();
		this.contrato1 = new Contrato();
		this.action = "";
		this.action_title = "";
	}
	
	public void setReturnView(TipoAccionEnum tipo_accion_enum1,Contrato contrato1,ArrayList<Contrato> contratos) {
		String pre_titulo="Datos";
		String post_titulo="Ejecutada";
		String action_form="";
		//String contrato_return_view_dto:ContratoReturnView;
		
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
		
		 
		this.setTitle(pre_titulo + " Contrato " + post_titulo);
		this.setContrato1(contrato1);		
		this.setContratos(contratos);
		this.setAction(action_form);
		this.setAction_title(post_titulo);
				
		//return this.contrato_return_view_dto;
	}		
}


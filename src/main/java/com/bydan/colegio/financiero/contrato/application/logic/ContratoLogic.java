package com.bydan.colegio.financiero.contrato.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.contrato.domain.model.ContratoReturnViewDto;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;

import com.bydan.colegio.financiero.contrato.infrastructure.data.ContratoDataI;


@Component
public class ContratoLogic extends GeneralEntityLogic implements ContratoLogicI {
	
	@Autowired
	public ContratoDataI contratoDataI;
		
    Contrato contrato1 = null;
    ArrayList<Contrato> contratos = new ArrayList<Contrato>();
		
		
	public ContratoLogic() {
		super();
		
		//this.contratoDataI = new ContratoDataI();
		
        //this.connexion1=new Connexion(); 		
		this.contrato1 = null;
    	this.contratos = new ArrayList<Contrato>();
				
	}		
	
	public ArrayList<Contrato> getTodos(Pagination pagination1) {  
        return this.contratoDataI.getTodos(pagination1);
    }
	
	public ArrayList<Contrato> getBuscar(Object builder_object_contrato1,Pagination pagination1) {  
       return this.contratoDataI.getBuscar(builder_object_contrato1,pagination1);
    }
	
	public ArrayList<Contrato> getBuscarGeneral(Object builder_object_contrato1,Pagination pagination1) {  
        return this.contratoDataI.getBuscarGeneral(builder_object_contrato1,pagination1);
    }
	
	public Contrato getBuscarUno(Long id) {  
        return this.contratoDataI.getBuscarUno(id);
    }
	
    public Contrato nuevo(Contrato contrato1) {
        return this.contratoDataI.nuevo(contrato1);
    }
	
	public Contrato actualizar(Contrato contrato1) {  
       return this.contratoDataI.actualizar(contrato1);
    }
	
	public void eliminar(Long id) {  
        this.contratoDataI.eliminar(id);
    }	
	
	public ArrayList<Contrato> nuevos(ArrayList<Contrato> contratos) {
        return this.contratoDataI.nuevos(contratos);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.contratoDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Contrato> updates_contratos,ArrayList<String> updates_columnas) {  
        this.contratoDataI.actualizars(updates_contratos,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.contratoDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.contratoDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Contrato getContrato1() {
		return this.contratoDataI.getContrato1();	
	}
	
	public ArrayList<Contrato> getContratos() {
		return this.contratoDataI.getContratos();	
	}
	
	public void setContrato1(Contrato contrato1) {
		this.contratoDataI.setContrato1(contrato1);
	}
	
	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratoDataI.setContratos(contratos);
	}
}


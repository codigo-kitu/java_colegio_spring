package com.bydan.colegio.financiero.sueldo.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.sueldo.domain.model.SueldoReturnViewDto;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;

import com.bydan.colegio.financiero.sueldo.infrastructure.data.SueldoDataI;


@Component
public class SueldoLogic extends GeneralEntityLogic implements SueldoLogicI {
	
	@Autowired
	public SueldoDataI sueldoDataI;
		
    Sueldo sueldo1 = null;
    ArrayList<Sueldo> sueldos = new ArrayList<Sueldo>();
		
		
	public SueldoLogic() {
		super();
		
		//this.sueldoDataI = new SueldoDataI();
		
        //this.connexion1=new Connexion(); 		
		this.sueldo1 = null;
    	this.sueldos = new ArrayList<Sueldo>();
				
	}		
	
	public ArrayList<Sueldo> getTodos(Pagination pagination1) {  
        return this.sueldoDataI.getTodos(pagination1);
    }
	
	public ArrayList<Sueldo> getBuscar(Object builder_object_sueldo1,Pagination pagination1) {  
       return this.sueldoDataI.getBuscar(builder_object_sueldo1,pagination1);
    }
	
	public ArrayList<Sueldo> getBuscarGeneral(Object builder_object_sueldo1,Pagination pagination1) {  
        return this.sueldoDataI.getBuscarGeneral(builder_object_sueldo1,pagination1);
    }
	
	public Sueldo getBuscarUno(Long id) {  
        return this.sueldoDataI.getBuscarUno(id);
    }
	
    public Sueldo nuevo(Sueldo sueldo1) {
        return this.sueldoDataI.nuevo(sueldo1);
    }
	
	public Sueldo actualizar(Sueldo sueldo1) {  
       return this.sueldoDataI.actualizar(sueldo1);
    }
	
	public void eliminar(Long id) {  
        this.sueldoDataI.eliminar(id);
    }	
	
	public ArrayList<Sueldo> nuevos(ArrayList<Sueldo> sueldos) {
        return this.sueldoDataI.nuevos(sueldos);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.sueldoDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Sueldo> updates_sueldos,ArrayList<String> updates_columnas) {  
        this.sueldoDataI.actualizars(updates_sueldos,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.sueldoDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.sueldoDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Sueldo getSueldo1() {
		return this.sueldoDataI.getSueldo1();	
	}
	
	public ArrayList<Sueldo> getSueldos() {
		return this.sueldoDataI.getSueldos();	
	}
	
	public void setSueldo1(Sueldo sueldo1) {
		this.sueldoDataI.setSueldo1(sueldo1);
	}
	
	public void setSueldos(ArrayList<Sueldo> sueldos) {
		this.sueldoDataI.setSueldos(sueldos);
	}
}


package com.bydan.colegio.financiero.pension.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.pension.domain.model.PensionReturnViewDto;

import com.bydan.colegio.financiero.pension.domain.model.Pension;

import com.bydan.colegio.financiero.pension.infrastructure.data.PensionDataI;


@Component
public class PensionLogic extends GeneralEntityLogic implements PensionLogicI {
	
	@Autowired
	public PensionDataI pensionDataI;
		
    Pension pension1 = null;
    ArrayList<Pension> pensions = new ArrayList<Pension>();
		
		
	public PensionLogic() {
		super();
		
		//this.pensionDataI = new PensionDataI();
		
        //this.connexion1=new Connexion(); 		
		this.pension1 = null;
    	this.pensions = new ArrayList<Pension>();
				
	}		
	
	public ArrayList<Pension> getTodos(Pagination pagination1) {  
        return this.pensionDataI.getTodos(pagination1);
    }
	
	public ArrayList<Pension> getBuscar(Object builder_object_pension1,Pagination pagination1) {  
       return this.pensionDataI.getBuscar(builder_object_pension1,pagination1);
    }
	
	public ArrayList<Pension> getBuscarGeneral(Object builder_object_pension1,Pagination pagination1) {  
        return this.pensionDataI.getBuscarGeneral(builder_object_pension1,pagination1);
    }
	
	public Pension getBuscarUno(Long id) {  
        return this.pensionDataI.getBuscarUno(id);
    }
	
    public Pension nuevo(Pension pension1) {
        return this.pensionDataI.nuevo(pension1);
    }
	
	public Pension actualizar(Pension pension1) {  
       return this.pensionDataI.actualizar(pension1);
    }
	
	public void eliminar(Long id) {  
        this.pensionDataI.eliminar(id);
    }	
	
	public ArrayList<Pension> nuevos(ArrayList<Pension> pensions) {
        return this.pensionDataI.nuevos(pensions);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.pensionDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Pension> updates_pensions,ArrayList<String> updates_columnas) {  
        this.pensionDataI.actualizars(updates_pensions,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.pensionDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.pensionDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Pension getPension1() {
		return this.pensionDataI.getPension1();	
	}
	
	public ArrayList<Pension> getPensions() {
		return this.pensionDataI.getPensions();	
	}
	
	public void setPension1(Pension pension1) {
		this.pensionDataI.setPension1(pension1);
	}
	
	public void setPensions(ArrayList<Pension> pensions) {
		this.pensionDataI.setPensions(pensions);
	}
}


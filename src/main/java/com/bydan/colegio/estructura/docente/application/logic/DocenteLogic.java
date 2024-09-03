package com.bydan.colegio.estructura.docente.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.docente.domain.model.DocenteReturnViewDto;

import com.bydan.colegio.estructura.docente.domain.model.Docente;

import com.bydan.colegio.estructura.docente.infrastructure.data.DocenteDataI;


@Component
public class DocenteLogic extends GeneralEntityLogic implements DocenteLogicI {
	
	@Autowired
	public DocenteDataI docenteDataI;
		
    Docente docente1 = null;
    ArrayList<Docente> docentes = new ArrayList<Docente>();
		
		
	public DocenteLogic() {
		super();
		
		//this.docenteDataI = new DocenteDataI();
		
        //this.connexion1=new Connexion(); 		
		this.docente1 = null;
    	this.docentes = new ArrayList<Docente>();
				
	}		
	
	public ArrayList<Docente> getTodos(Pagination pagination1) {  
        return this.docenteDataI.getTodos(pagination1);
    }
	
	public ArrayList<Docente> getBuscar(Object builder_object_docente1,Pagination pagination1) {  
       return this.docenteDataI.getBuscar(builder_object_docente1,pagination1);
    }
	
	public ArrayList<Docente> getBuscarGeneral(Object builder_object_docente1,Pagination pagination1) {  
        return this.docenteDataI.getBuscarGeneral(builder_object_docente1,pagination1);
    }
	
	public Docente getBuscarUno(Long id) {  
        return this.docenteDataI.getBuscarUno(id);
    }
	
    public Docente nuevo(Docente docente1) {
        return this.docenteDataI.nuevo(docente1);
    }
	
	public Docente actualizar(Docente docente1) {  
       return this.docenteDataI.actualizar(docente1);
    }
	
	public void eliminar(Long id) {  
        this.docenteDataI.eliminar(id);
    }	
	
	public ArrayList<Docente> nuevos(ArrayList<Docente> docentes) {
        return this.docenteDataI.nuevos(docentes);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.docenteDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Docente> updates_docentes,ArrayList<String> updates_columnas) {  
        this.docenteDataI.actualizars(updates_docentes,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.docenteDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.docenteDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Docente getDocente1() {
		return this.docenteDataI.getDocente1();	
	}
	
	public ArrayList<Docente> getDocentes() {
		return this.docenteDataI.getDocentes();	
	}
	
	public void setDocente1(Docente docente1) {
		this.docenteDataI.setDocente1(docente1);
	}
	
	public void setDocentes(ArrayList<Docente> docentes) {
		this.docenteDataI.setDocentes(docentes);
	}
}


package com.bydan.colegio.estructura.docente_materia.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materiaReturnViewDto;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;

import com.bydan.colegio.estructura.docente_materia.infrastructure.data.Docente_materiaDataI;


@Component
public class Docente_materiaLogic extends GeneralEntityLogic implements Docente_materiaLogicI {
	
	@Autowired
	public Docente_materiaDataI docente_materiaDataI;
		
    Docente_materia docente_materia1 = null;
    ArrayList<Docente_materia> docente_materias = new ArrayList<Docente_materia>();
		
		
	public Docente_materiaLogic() {
		super();
		
		//this.docente_materiaDataI = new Docente_materiaDataI();
		
        //this.connexion1=new Connexion(); 		
		this.docente_materia1 = null;
    	this.docente_materias = new ArrayList<Docente_materia>();
				
	}		
	
	public ArrayList<Docente_materia> getTodos(Pagination pagination1) {  
        return this.docente_materiaDataI.getTodos(pagination1);
    }
	
	public ArrayList<Docente_materia> getBuscar(Object builder_object_docente_materia1,Pagination pagination1) {  
       return this.docente_materiaDataI.getBuscar(builder_object_docente_materia1,pagination1);
    }
	
	public ArrayList<Docente_materia> getBuscarGeneral(Object builder_object_docente_materia1,Pagination pagination1) {  
        return this.docente_materiaDataI.getBuscarGeneral(builder_object_docente_materia1,pagination1);
    }
	
	public Docente_materia getBuscarUno(Long id) {  
        return this.docente_materiaDataI.getBuscarUno(id);
    }
	
    public Docente_materia nuevo(Docente_materia docente_materia1) {
        return this.docente_materiaDataI.nuevo(docente_materia1);
    }
	
	public Docente_materia actualizar(Docente_materia docente_materia1) {  
       return this.docente_materiaDataI.actualizar(docente_materia1);
    }
	
	public void eliminar(Long id) {  
        this.docente_materiaDataI.eliminar(id);
    }	
	
	public ArrayList<Docente_materia> nuevos(ArrayList<Docente_materia> docente_materias) {
        return this.docente_materiaDataI.nuevos(docente_materias);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.docente_materiaDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Docente_materia> updates_docente_materias,ArrayList<String> updates_columnas) {  
        this.docente_materiaDataI.actualizars(updates_docente_materias,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.docente_materiaDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.docente_materiaDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Docente_materia getDocente_materia1() {
		return this.docente_materiaDataI.getDocente_materia1();	
	}
	
	public ArrayList<Docente_materia> getDocente_materias() {
		return this.docente_materiaDataI.getDocente_materias();	
	}
	
	public void setDocente_materia1(Docente_materia docente_materia1) {
		this.docente_materiaDataI.setDocente_materia1(docente_materia1);
	}
	
	public void setDocente_materias(ArrayList<Docente_materia> docente_materias) {
		this.docente_materiaDataI.setDocente_materias(docente_materias);
	}
}


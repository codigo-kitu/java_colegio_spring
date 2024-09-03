package com.bydan.colegio.estructura.alumno_materia.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materiaReturnViewDto;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;

import com.bydan.colegio.estructura.alumno_materia.infrastructure.data.Alumno_materiaDataI;


@Component
public class Alumno_materiaLogic extends GeneralEntityLogic implements Alumno_materiaLogicI {
	
	@Autowired
	public Alumno_materiaDataI alumno_materiaDataI;
		
    Alumno_materia alumno_materia1 = null;
    ArrayList<Alumno_materia> alumno_materias = new ArrayList<Alumno_materia>();
		
		
	public Alumno_materiaLogic() {
		super();
		
		//this.alumno_materiaDataI = new Alumno_materiaDataI();
		
        //this.connexion1=new Connexion(); 		
		this.alumno_materia1 = null;
    	this.alumno_materias = new ArrayList<Alumno_materia>();
				
	}		
	
	public ArrayList<Alumno_materia> getTodos(Pagination pagination1) {  
        return this.alumno_materiaDataI.getTodos(pagination1);
    }
	
	public ArrayList<Alumno_materia> getBuscar(Object builder_object_alumno_materia1,Pagination pagination1) {  
       return this.alumno_materiaDataI.getBuscar(builder_object_alumno_materia1,pagination1);
    }
	
	public ArrayList<Alumno_materia> getBuscarGeneral(Object builder_object_alumno_materia1,Pagination pagination1) {  
        return this.alumno_materiaDataI.getBuscarGeneral(builder_object_alumno_materia1,pagination1);
    }
	
	public Alumno_materia getBuscarUno(Long id) {  
        return this.alumno_materiaDataI.getBuscarUno(id);
    }
	
    public Alumno_materia nuevo(Alumno_materia alumno_materia1) {
        return this.alumno_materiaDataI.nuevo(alumno_materia1);
    }
	
	public Alumno_materia actualizar(Alumno_materia alumno_materia1) {  
       return this.alumno_materiaDataI.actualizar(alumno_materia1);
    }
	
	public void eliminar(Long id) {  
        this.alumno_materiaDataI.eliminar(id);
    }	
	
	public ArrayList<Alumno_materia> nuevos(ArrayList<Alumno_materia> alumno_materias) {
        return this.alumno_materiaDataI.nuevos(alumno_materias);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.alumno_materiaDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Alumno_materia> updates_alumno_materias,ArrayList<String> updates_columnas) {  
        this.alumno_materiaDataI.actualizars(updates_alumno_materias,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.alumno_materiaDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.alumno_materiaDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Alumno_materia getAlumno_materia1() {
		return this.alumno_materiaDataI.getAlumno_materia1();	
	}
	
	public ArrayList<Alumno_materia> getAlumno_materias() {
		return this.alumno_materiaDataI.getAlumno_materias();	
	}
	
	public void setAlumno_materia1(Alumno_materia alumno_materia1) {
		this.alumno_materiaDataI.setAlumno_materia1(alumno_materia1);
	}
	
	public void setAlumno_materias(ArrayList<Alumno_materia> alumno_materias) {
		this.alumno_materiaDataI.setAlumno_materias(alumno_materias);
	}
}


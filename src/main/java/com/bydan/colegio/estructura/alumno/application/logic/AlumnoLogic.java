package com.bydan.colegio.estructura.alumno.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.alumno.domain.model.AlumnoReturnViewDto;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;

import com.bydan.colegio.estructura.alumno.infrastructure.data.AlumnoDataI;


@Component
public class AlumnoLogic extends GeneralEntityLogic implements AlumnoLogicI {
	
	@Autowired
	public AlumnoDataI alumnoDataI;
		
    Alumno alumno1 = null;
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		
	public AlumnoLogic() {
		super();
		
		//this.alumnoDataI = new AlumnoDataI();
		
        //this.connexion1=new Connexion(); 		
		this.alumno1 = null;
    	this.alumnos = new ArrayList<Alumno>();
				
	}		
	
	public ArrayList<Alumno> getTodos(Pagination pagination1) {  
        return this.alumnoDataI.getTodos(pagination1);
    }
	
	public ArrayList<Alumno> getBuscar(Object builder_object_alumno1,Pagination pagination1) {  
       return this.alumnoDataI.getBuscar(builder_object_alumno1,pagination1);
    }
	
	public ArrayList<Alumno> getBuscarGeneral(Object builder_object_alumno1,Pagination pagination1) {  
        return this.alumnoDataI.getBuscarGeneral(builder_object_alumno1,pagination1);
    }
	
	public Alumno getBuscarUno(Long id) {  
        return this.alumnoDataI.getBuscarUno(id);
    }
	
    public Alumno nuevo(Alumno alumno1) {
        return this.alumnoDataI.nuevo(alumno1);
    }
	
	public Alumno actualizar(Alumno alumno1) {  
       return this.alumnoDataI.actualizar(alumno1);
    }
	
	public void eliminar(Long id) {  
        this.alumnoDataI.eliminar(id);
    }	
	
	public ArrayList<Alumno> nuevos(ArrayList<Alumno> alumnos) {
        return this.alumnoDataI.nuevos(alumnos);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.alumnoDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Alumno> updates_alumnos,ArrayList<String> updates_columnas) {  
        this.alumnoDataI.actualizars(updates_alumnos,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.alumnoDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.alumnoDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Alumno getAlumno1() {
		return this.alumnoDataI.getAlumno1();	
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return this.alumnoDataI.getAlumnos();	
	}
	
	public void setAlumno1(Alumno alumno1) {
		this.alumnoDataI.setAlumno1(alumno1);
	}
	
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnoDataI.setAlumnos(alumnos);
	}
}


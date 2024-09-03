package com.bydan.colegio.estructura.materia.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.materia.domain.model.MateriaReturnViewDto;

import com.bydan.colegio.estructura.materia.domain.model.Materia;

import com.bydan.colegio.estructura.materia.infrastructure.data.MateriaDataI;


@Component
public class MateriaLogic extends GeneralEntityLogic implements MateriaLogicI {
	
	@Autowired
	public MateriaDataI materiaDataI;
		
    Materia materia1 = null;
    ArrayList<Materia> materias = new ArrayList<Materia>();
		
		
	public MateriaLogic() {
		super();
		
		//this.materiaDataI = new MateriaDataI();
		
        //this.connexion1=new Connexion(); 		
		this.materia1 = null;
    	this.materias = new ArrayList<Materia>();
				
	}		
	
	
	
	public MateriaDataI getMateriaDataI() {
		return materiaDataI;
	}

	public void setMateriaDataI(MateriaDataI materiaDataI) {
		this.materiaDataI = materiaDataI;
	}

	public ArrayList<Materia> getTodos(Pagination pagination1) {  
        return this.materiaDataI.getTodos(pagination1);
    }
	
	public ArrayList<Materia> getBuscar(Object builder_object_materia1,Pagination pagination1) {  
       return this.materiaDataI.getBuscar(builder_object_materia1,pagination1);
    }
	
	public ArrayList<Materia> getBuscarGeneral(Object builder_object_materia1,Pagination pagination1) {  
        return this.materiaDataI.getBuscarGeneral(builder_object_materia1,pagination1);
    }
	
	public Materia getBuscarUno(Long id) {  
        return this.materiaDataI.getBuscarUno(id);
    }
	
    public Materia nuevo(Materia materia1) {
        return this.materiaDataI.nuevo(materia1);
    }
	
	public Materia actualizar(Materia materia1) {  
       return this.materiaDataI.actualizar(materia1);
    }
	
	public void eliminar(Long id) {  
        this.materiaDataI.eliminar(id);
    }	
	
	public ArrayList<Materia> nuevos(ArrayList<Materia> materias) {
        return this.materiaDataI.nuevos(materias);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.materiaDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Materia> updates_materias,ArrayList<String> updates_columnas) {  
        this.materiaDataI.actualizars(updates_materias,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.materiaDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.materiaDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Materia getMateria1() {
		return this.materiaDataI.getMateria1();	
	}
	
	public ArrayList<Materia> getMaterias() {
		return this.materiaDataI.getMaterias();	
	}
	
	public void setMateria1(Materia materia1) {
		this.materiaDataI.setMateria1(materia1);
	}
	
	public void setMaterias(ArrayList<Materia> materias) {
		this.materiaDataI.setMaterias(materias);
	}
}


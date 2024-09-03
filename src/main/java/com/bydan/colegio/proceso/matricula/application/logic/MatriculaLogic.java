package com.bydan.colegio.proceso.matricula.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.proceso.matricula.domain.model.MatriculaReturnViewDto;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;

import com.bydan.colegio.proceso.matricula.infrastructure.data.MatriculaDataI;


@Component
public class MatriculaLogic extends GeneralEntityLogic implements MatriculaLogicI {
	
	@Autowired
	public MatriculaDataI matriculaDataI;
		
    Matricula matricula1 = null;
    ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
		
		
	public MatriculaLogic() {
		super();
		
		//this.matriculaDataI = new MatriculaDataI();
		
        //this.connexion1=new Connexion(); 		
		this.matricula1 = null;
    	this.matriculas = new ArrayList<Matricula>();
				
	}		
	
	public ArrayList<Matricula> getTodos(Pagination pagination1) {  
        return this.matriculaDataI.getTodos(pagination1);
    }
	
	public ArrayList<Matricula> getBuscar(Object builder_object_matricula1,Pagination pagination1) {  
       return this.matriculaDataI.getBuscar(builder_object_matricula1,pagination1);
    }
	
	public ArrayList<Matricula> getBuscarGeneral(Object builder_object_matricula1,Pagination pagination1) {  
        return this.matriculaDataI.getBuscarGeneral(builder_object_matricula1,pagination1);
    }
	
	public Matricula getBuscarUno(Long id) {  
        return this.matriculaDataI.getBuscarUno(id);
    }
	
    public Matricula nuevo(Matricula matricula1) {
        return this.matriculaDataI.nuevo(matricula1);
    }
	
	public Matricula actualizar(Matricula matricula1) {  
       return this.matriculaDataI.actualizar(matricula1);
    }
	
	public void eliminar(Long id) {  
        this.matriculaDataI.eliminar(id);
    }	
	
	public ArrayList<Matricula> nuevos(ArrayList<Matricula> matriculas) {
        return this.matriculaDataI.nuevos(matriculas);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.matriculaDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Matricula> updates_matriculas,ArrayList<String> updates_columnas) {  
        this.matriculaDataI.actualizars(updates_matriculas,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.matriculaDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.matriculaDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Matricula getMatricula1() {
		return this.matriculaDataI.getMatricula1();	
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return this.matriculaDataI.getMatriculas();	
	}
	
	public void setMatricula1(Matricula matricula1) {
		this.matriculaDataI.setMatricula1(matricula1);
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculaDataI.setMatriculas(matriculas);
	}
}


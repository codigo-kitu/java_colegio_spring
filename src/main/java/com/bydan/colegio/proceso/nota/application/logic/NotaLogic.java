package com.bydan.colegio.proceso.nota.application.logic;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.GeneralEntityLogic;
import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.proceso.nota.domain.model.NotaReturnViewDto;

import com.bydan.colegio.proceso.nota.domain.model.Nota;

import com.bydan.colegio.proceso.nota.infrastructure.data.NotaDataI;


@Component
public class NotaLogic extends GeneralEntityLogic implements NotaLogicI {
	
	@Autowired
	public NotaDataI notaDataI;
		
    Nota nota1 = null;
    ArrayList<Nota> notas = new ArrayList<Nota>();
		
		
	public NotaLogic() {
		super();
		
		//this.notaDataI = new NotaDataI();
		
        //this.connexion1=new Connexion(); 		
		this.nota1 = null;
    	this.notas = new ArrayList<Nota>();
				
	}		
	
	public ArrayList<Nota> getTodos(Pagination pagination1) {  
        return this.notaDataI.getTodos(pagination1);
    }
	
	public ArrayList<Nota> getBuscar(Object builder_object_nota1,Pagination pagination1) {  
       return this.notaDataI.getBuscar(builder_object_nota1,pagination1);
    }
	
	public ArrayList<Nota> getBuscarGeneral(Object builder_object_nota1,Pagination pagination1) {  
        return this.notaDataI.getBuscarGeneral(builder_object_nota1,pagination1);
    }
	
	public Nota getBuscarUno(Long id) {  
        return this.notaDataI.getBuscarUno(id);
    }
	
    public Nota nuevo(Nota nota1) {
        return this.notaDataI.nuevo(nota1);
    }
	
	public Nota actualizar(Nota nota1) {  
       return this.notaDataI.actualizar(nota1);
    }
	
	public void eliminar(Long id) {  
        this.notaDataI.eliminar(id);
    }	
	
	public ArrayList<Nota> nuevos(ArrayList<Nota> notas) {
        return this.notaDataI.nuevos(notas);
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        this.notaDataI.eliminars(ids);
    }
	
	public void actualizars(ArrayList<Nota> updates_notas,ArrayList<String> updates_columnas) {  
        this.notaDataI.actualizars(updates_notas,updates_columnas);
    }
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {										
		return this.notaDataI.getBuilderFunctionObjectParametroSeleccionar(id);
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {								
		return this.notaDataI.getBuilderFunctionObjectParametroBuscar(req);
	}
	
	
	public Nota getNota1() {
		return this.notaDataI.getNota1();	
	}
	
	public ArrayList<Nota> getNotas() {
		return this.notaDataI.getNotas();	
	}
	
	public void setNota1(Nota nota1) {
		this.notaDataI.setNota1(nota1);
	}
	
	public void setNotas(ArrayList<Nota> notas) {
		this.notaDataI.setNotas(notas);
	}
}


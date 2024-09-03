package com.bydan.colegio.financiero.sueldo.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.sueldo.domain.entity.SueldoReturnViewDto;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;


@Component
public class SueldoData implements SueldoDataI {

	static String TITULO = "Sueldo";    
	
	Iterable<Sueldo> sueldoModels;
	Optional<Sueldo> sueldoModel1;
		
    Sueldo sueldo1 = null;
    ArrayList<Sueldo> sueldos = new ArrayList<Sueldo>();
	
	//SueldoReturnViewDto sueldo_return_view_dto;
	
	
	@Autowired
	private SueldoRepositoryI sueldo_repositoryi1;
	
	public SueldoData() {
		
        //this.connexion1=new Connexion(); 		
		this.sueldo1 = null;
    	this.sueldos = new ArrayList<Sueldo>();
		
		//this.sueldo_return_view_dto = new SueldoReturnViewDto();
		
	}
	
	public ArrayList<Sueldo> getTodos(Pagination pagination1) {  
        try	{			
            
			this.sueldoModels = this.sueldo_repositoryi1.findAll();				
						
			this.sueldos = this.getEntitiesFromModels(this.sueldoModels);
			
			return this.sueldos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Sueldo> getBuscar(Object builder_object_sueldo1,Pagination pagination1) {  
        try	{						
			
            this.sueldoModels = this.sueldo_repositoryi1.findAll();
			
			this.sueldos = this.getEntitiesFromModels(this.sueldoModels);	
			
			return this.sueldos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Sueldo> getBuscarGeneral(Object builder_object_sueldo1,Pagination pagination1) {  
        try	{						
			
            this.sueldoModels = this.sueldo_repositoryi1.findAll();
			
			this.sueldos = this.getEntitiesFromModels(this.sueldoModels);	
			
			return this.sueldos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Sueldo getBuscarUno(Long id) {  
        try	{			
			
            this.sueldoModel1 = this.sueldo_repositoryi1.findById(id);
			
			this.sueldo1 = this.getEntityFromModel(this.sueldoModel1.get());
			
			return this.sueldo1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Sueldo nuevo(Sueldo sueldo1) {
        try	{			           
			Sueldo sueldoModel2 = this.setModelFromEntity(sueldo1);
			
			sueldoModel2 = this.sueldo_repositoryi1.save(sueldoModel2);
			
			this.sueldo1 = this.getEntityFromModel(sueldoModel2);
			
			return this.sueldo1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Sueldo actualizar(Sueldo sueldo1) {  
        try	{			           
			Sueldo sueldoModel2 = this.setModelFromEntity(sueldo1);
			
			sueldoModel2 = this.sueldo_repositoryi1.save(sueldoModel2);
			
			this.sueldo1 = this.getEntityFromModel(sueldoModel2);
			
			return this.sueldo1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.sueldo_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Sueldo> nuevos(ArrayList<Sueldo> sueldos) {
        try	{		
			
			ArrayList<Sueldo> sueldoModels2 = this.setModelsFromEntities(sueldos);
			
			this.sueldoModels = this.sueldo_repositoryi1.saveAll(sueldoModels2);
			
			this.sueldos = this.getEntitiesFromModels(this.sueldoModels);
			
			return this.sueldos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.sueldo_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Sueldo> updates_sueldos,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.sueldoModels = this.sueldo_repositoryi1.update('id',updates_sueldos);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Sueldo> getEntitiesFromModels(Iterable<Sueldo> sueldoModelIterables) {
		ArrayList<Sueldo> sueldos = new ArrayList<Sueldo>();
		Sueldo sueldo2 = new Sueldo();
		
		for(Sueldo sueldoModel2 : sueldoModelIterables) {
			sueldo2 = this.getEntityFromModel(sueldoModel2);
			
			sueldos.add(sueldo2);
		}
		
		return sueldos;
		
		/*
		ArrayList<SueldoModel> sueldoModels = new ArrayList<SueldoModel>();
		sueldoModelIterables.forEach(sueldoModels::add);		
		*/
	}
	
	public Sueldo getEntityFromModel(Sueldo sueldoModel1) {
		Sueldo sueldo1 = new Sueldo();
		
		sueldo1.setId(sueldoModel1.getId());
		
 		
 		sueldo1.setCreated_at(sueldoModel1.getCreated_at());
 		sueldo1.setUpdated_at(sueldoModel1.getUpdated_at());
 		sueldo1.setId_docente(sueldoModel1.getId_docente());
 		sueldo1.setAnio(sueldoModel1.getAnio());
 		sueldo1.setMes(sueldoModel1.getMes());
 		sueldo1.setValor(sueldoModel1.getValor());
 		sueldo1.setCobrado(sueldoModel1.getCobrado());
		
		return sueldo1;
		
		/*
		SueldoModel sueldoModel1 = new SueldoModel();		
		sueldoModel1 = sueldoModelOptional1.get();		
		*/
	}
	
	public ArrayList<Sueldo> setModelsFromEntities(ArrayList<Sueldo> sueldos) {
		ArrayList<Sueldo> sueldoModels = new ArrayList<Sueldo>();
		Sueldo sueldoModel2 = new Sueldo();
		
		for(Sueldo sueldo2 : sueldos) {
			sueldoModel2 = this.setModelFromEntity(sueldo2);
			
			sueldoModels.add(sueldoModel2);
		}
		
		return sueldoModels;
	}
	
	public Sueldo setModelFromEntity(Sueldo sueldo1) {
		Sueldo sueldoModel1 = new Sueldo();
		
		sueldoModel1.setId(sueldo1.getId());
		
 		
 		sueldoModel1.setCreated_at(sueldo1.getCreated_at());
 		sueldoModel1.setUpdated_at(sueldo1.getUpdated_at());
 		sueldoModel1.setId_docente(sueldo1.getId_docente());
 		sueldoModel1.setAnio(sueldo1.getAnio());
 		sueldoModel1.setMes(sueldo1.getMes());
 		sueldoModel1.setValor(sueldo1.getValor());
 		sueldoModel1.setCobrado(sueldo1.getCobrado());
		
		return sueldoModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jsueldo1 = new Object();
		
		/*
		jsueldo1 = {
			id : id
		};		
		*/
				
		return jsueldo1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jsueldo1 = new Object();
		
		/*
		jsueldo1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			id_docente : req.body.id_docente, 
			anio : req.body.anio, 
			mes : req.body.mes, 
			valor : req.body.valor, 
			cobrado : req.body.cobrado, 
		};								
		*/
		
		return jsueldo1;
	}
	
	
	public Sueldo getSueldo1() {
		return this.sueldo1;	
	}
	
	public ArrayList<Sueldo> getSueldos() {
		return this.sueldos;	
	}
	
	public void setSueldo1(Sueldo sueldo1) {
		this.sueldo1 = sueldo1;	
	}
	
	public void setSueldos(ArrayList<Sueldo> sueldos) {
		this.sueldos = sueldos;	
	}
	
	public SueldoRepositoryI getSueldoRepositoryI1() {
		return this.sueldo_repositoryi1;	
	}
	
	public void setSueldoRepositoryI1(SueldoRepositoryI sueldo_repositoryi1) {
		this.sueldo_repositoryi1 = sueldo_repositoryi1;
	}
}


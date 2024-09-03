package com.bydan.colegio.financiero.pension.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.pension.domain.entity.PensionReturnViewDto;

import com.bydan.colegio.financiero.pension.domain.model.Pension;


@Component
public class PensionData implements PensionDataI {

	static String TITULO = "Pension";    
	
	Iterable<Pension> pensionModels;
	Optional<Pension> pensionModel1;
		
    Pension pension1 = null;
    ArrayList<Pension> pensions = new ArrayList<Pension>();
	
	//PensionReturnViewDto pension_return_view_dto;
	
	
	@Autowired
	private PensionRepositoryI pension_repositoryi1;
	
	public PensionData() {
		
        //this.connexion1=new Connexion(); 		
		this.pension1 = null;
    	this.pensions = new ArrayList<Pension>();
		
		//this.pension_return_view_dto = new PensionReturnViewDto();
		
	}
	
	public ArrayList<Pension> getTodos(Pagination pagination1) {  
        try	{			
            
			this.pensionModels = this.pension_repositoryi1.findAll();				
						
			this.pensions = this.getEntitiesFromModels(this.pensionModels);
			
			return this.pensions;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Pension> getBuscar(Object builder_object_pension1,Pagination pagination1) {  
        try	{						
			
            this.pensionModels = this.pension_repositoryi1.findAll();
			
			this.pensions = this.getEntitiesFromModels(this.pensionModels);	
			
			return this.pensions;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Pension> getBuscarGeneral(Object builder_object_pension1,Pagination pagination1) {  
        try	{						
			
            this.pensionModels = this.pension_repositoryi1.findAll();
			
			this.pensions = this.getEntitiesFromModels(this.pensionModels);	
			
			return this.pensions;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Pension getBuscarUno(Long id) {  
        try	{			
			
            this.pensionModel1 = this.pension_repositoryi1.findById(id);
			
			this.pension1 = this.getEntityFromModel(this.pensionModel1.get());
			
			return this.pension1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Pension nuevo(Pension pension1) {
        try	{			           
			Pension pensionModel2 = this.setModelFromEntity(pension1);
			
			pensionModel2 = this.pension_repositoryi1.save(pensionModel2);
			
			this.pension1 = this.getEntityFromModel(pensionModel2);
			
			return this.pension1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Pension actualizar(Pension pension1) {  
        try	{			           
			Pension pensionModel2 = this.setModelFromEntity(pension1);
			
			pensionModel2 = this.pension_repositoryi1.save(pensionModel2);
			
			this.pension1 = this.getEntityFromModel(pensionModel2);
			
			return this.pension1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.pension_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Pension> nuevos(ArrayList<Pension> pensions) {
        try	{		
			
			ArrayList<Pension> pensionModels2 = this.setModelsFromEntities(pensions);
			
			this.pensionModels = this.pension_repositoryi1.saveAll(pensionModels2);
			
			this.pensions = this.getEntitiesFromModels(this.pensionModels);
			
			return this.pensions;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.pension_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Pension> updates_pensions,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.pensionModels = this.pension_repositoryi1.update('id',updates_pensions);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Pension> getEntitiesFromModels(Iterable<Pension> pensionModelIterables) {
		ArrayList<Pension> pensions = new ArrayList<Pension>();
		Pension pension2 = new Pension();
		
		for(Pension pensionModel2 : pensionModelIterables) {
			pension2 = this.getEntityFromModel(pensionModel2);
			
			pensions.add(pension2);
		}
		
		return pensions;
		
		/*
		ArrayList<PensionModel> pensionModels = new ArrayList<PensionModel>();
		pensionModelIterables.forEach(pensionModels::add);		
		*/
	}
	
	public Pension getEntityFromModel(Pension pensionModel1) {
		Pension pension1 = new Pension();
		
		pension1.setId(pensionModel1.getId());
		
 		
 		pension1.setCreated_at(pensionModel1.getCreated_at());
 		pension1.setUpdated_at(pensionModel1.getUpdated_at());
 		pension1.setId_alumno(pensionModel1.getId_alumno());
 		pension1.setAnio(pensionModel1.getAnio());
 		pension1.setMes(pensionModel1.getMes());
 		pension1.setValor(pensionModel1.getValor());
 		pension1.setCobrado(pensionModel1.getCobrado());
		
		return pension1;
		
		/*
		PensionModel pensionModel1 = new PensionModel();		
		pensionModel1 = pensionModelOptional1.get();		
		*/
	}
	
	public ArrayList<Pension> setModelsFromEntities(ArrayList<Pension> pensions) {
		ArrayList<Pension> pensionModels = new ArrayList<Pension>();
		Pension pensionModel2 = new Pension();
		
		for(Pension pension2 : pensions) {
			pensionModel2 = this.setModelFromEntity(pension2);
			
			pensionModels.add(pensionModel2);
		}
		
		return pensionModels;
	}
	
	public Pension setModelFromEntity(Pension pension1) {
		Pension pensionModel1 = new Pension();
		
		pensionModel1.setId(pension1.getId());
		
 		
 		pensionModel1.setCreated_at(pension1.getCreated_at());
 		pensionModel1.setUpdated_at(pension1.getUpdated_at());
 		pensionModel1.setId_alumno(pension1.getId_alumno());
 		pensionModel1.setAnio(pension1.getAnio());
 		pensionModel1.setMes(pension1.getMes());
 		pensionModel1.setValor(pension1.getValor());
 		pensionModel1.setCobrado(pension1.getCobrado());
		
		return pensionModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jpension1 = new Object();
		
		/*
		jpension1 = {
			id : id
		};		
		*/
				
		return jpension1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jpension1 = new Object();
		
		/*
		jpension1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			id_alumno : req.body.id_alumno, 
			anio : req.body.anio, 
			mes : req.body.mes, 
			valor : req.body.valor, 
			cobrado : req.body.cobrado, 
		};								
		*/
		
		return jpension1;
	}
	
	
	public Pension getPension1() {
		return this.pension1;	
	}
	
	public ArrayList<Pension> getPensions() {
		return this.pensions;	
	}
	
	public void setPension1(Pension pension1) {
		this.pension1 = pension1;	
	}
	
	public void setPensions(ArrayList<Pension> pensions) {
		this.pensions = pensions;	
	}
	
	public PensionRepositoryI getPensionRepositoryI1() {
		return this.pension_repositoryi1;	
	}
	
	public void setPensionRepositoryI1(PensionRepositoryI pension_repositoryi1) {
		this.pension_repositoryi1 = pension_repositoryi1;
	}
}


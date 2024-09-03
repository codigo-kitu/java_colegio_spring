package com.bydan.colegio.financiero.contrato.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.contrato.domain.entity.ContratoReturnViewDto;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;


@Component
public class ContratoData implements ContratoDataI {

	static String TITULO = "Contrato";    
	
	Iterable<Contrato> contratoModels;
	Optional<Contrato> contratoModel1;
		
    Contrato contrato1 = null;
    ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	
	//ContratoReturnViewDto contrato_return_view_dto;
	
	
	@Autowired
	private ContratoRepositoryI contrato_repositoryi1;
	
	public ContratoData() {
		
        //this.connexion1=new Connexion(); 		
		this.contrato1 = null;
    	this.contratos = new ArrayList<Contrato>();
		
		//this.contrato_return_view_dto = new ContratoReturnViewDto();
		
	}
	
	public ArrayList<Contrato> getTodos(Pagination pagination1) {  
        try	{			
            
			this.contratoModels = this.contrato_repositoryi1.findAll();				
						
			this.contratos = this.getEntitiesFromModels(this.contratoModels);
			
			return this.contratos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Contrato> getBuscar(Object builder_object_contrato1,Pagination pagination1) {  
        try	{						
			
            this.contratoModels = this.contrato_repositoryi1.findAll();
			
			this.contratos = this.getEntitiesFromModels(this.contratoModels);	
			
			return this.contratos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Contrato> getBuscarGeneral(Object builder_object_contrato1,Pagination pagination1) {  
        try	{						
			
            this.contratoModels = this.contrato_repositoryi1.findAll();
			
			this.contratos = this.getEntitiesFromModels(this.contratoModels);	
			
			return this.contratos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Contrato getBuscarUno(Long id) {  
        try	{			
			
            this.contratoModel1 = this.contrato_repositoryi1.findById(id);
			
			this.contrato1 = this.getEntityFromModel(this.contratoModel1.get());
			
			return this.contrato1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Contrato nuevo(Contrato contrato1) {
        try	{			           
			Contrato contratoModel2 = this.setModelFromEntity(contrato1);
			
			contratoModel2 = this.contrato_repositoryi1.save(contratoModel2);
			
			this.contrato1 = this.getEntityFromModel(contratoModel2);
			
			return this.contrato1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Contrato actualizar(Contrato contrato1) {  
        try	{			           
			Contrato contratoModel2 = this.setModelFromEntity(contrato1);
			
			contratoModel2 = this.contrato_repositoryi1.save(contratoModel2);
			
			this.contrato1 = this.getEntityFromModel(contratoModel2);
			
			return this.contrato1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.contrato_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Contrato> nuevos(ArrayList<Contrato> contratos) {
        try	{		
			
			ArrayList<Contrato> contratoModels2 = this.setModelsFromEntities(contratos);
			
			this.contratoModels = this.contrato_repositoryi1.saveAll(contratoModels2);
			
			this.contratos = this.getEntitiesFromModels(this.contratoModels);
			
			return this.contratos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.contrato_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Contrato> updates_contratos,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.contratoModels = this.contrato_repositoryi1.update('id',updates_contratos);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Contrato> getEntitiesFromModels(Iterable<Contrato> contratoModelIterables) {
		ArrayList<Contrato> contratos = new ArrayList<Contrato>();
		Contrato contrato2 = new Contrato();
		
		for(Contrato contratoModel2 : contratoModelIterables) {
			contrato2 = this.getEntityFromModel(contratoModel2);
			
			contratos.add(contrato2);
		}
		
		return contratos;
		
		/*
		ArrayList<ContratoModel> contratoModels = new ArrayList<ContratoModel>();
		contratoModelIterables.forEach(contratoModels::add);		
		*/
	}
	
	public Contrato getEntityFromModel(Contrato contratoModel1) {
		Contrato contrato1 = new Contrato();
		
		contrato1.setId(contratoModel1.getId());
		
 		
 		contrato1.setCreated_at(contratoModel1.getCreated_at());
 		contrato1.setUpdated_at(contratoModel1.getUpdated_at());
 		contrato1.setAnio(contratoModel1.getAnio());
 		contrato1.setValor(contratoModel1.getValor());
 		contrato1.setFecha(contratoModel1.getFecha());
 		contrato1.setFirmado(contratoModel1.getFirmado());
		
		return contrato1;
		
		/*
		ContratoModel contratoModel1 = new ContratoModel();		
		contratoModel1 = contratoModelOptional1.get();		
		*/
	}
	
	public ArrayList<Contrato> setModelsFromEntities(ArrayList<Contrato> contratos) {
		ArrayList<Contrato> contratoModels = new ArrayList<Contrato>();
		Contrato contratoModel2 = new Contrato();
		
		for(Contrato contrato2 : contratos) {
			contratoModel2 = this.setModelFromEntity(contrato2);
			
			contratoModels.add(contratoModel2);
		}
		
		return contratoModels;
	}
	
	public Contrato setModelFromEntity(Contrato contrato1) {
		Contrato contratoModel1 = new Contrato();
		
		contratoModel1.setId(contrato1.getId());
		
 		
 		contratoModel1.setCreated_at(contrato1.getCreated_at());
 		contratoModel1.setUpdated_at(contrato1.getUpdated_at());
 		contratoModel1.setAnio(contrato1.getAnio());
 		contratoModel1.setValor(contrato1.getValor());
 		contratoModel1.setFecha(contrato1.getFecha());
 		contratoModel1.setFirmado(contrato1.getFirmado());
		
		return contratoModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jcontrato1 = new Object();
		
		/*
		jcontrato1 = {
			id : id
		};		
		*/
				
		return jcontrato1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jcontrato1 = new Object();
		
		/*
		jcontrato1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			anio : req.body.anio, 
			valor : req.body.valor, 
			fecha : req.body.fecha, 
			firmado : req.body.firmado, 
		};								
		*/
		
		return jcontrato1;
	}
	
	
	public Contrato getContrato1() {
		return this.contrato1;	
	}
	
	public ArrayList<Contrato> getContratos() {
		return this.contratos;	
	}
	
	public void setContrato1(Contrato contrato1) {
		this.contrato1 = contrato1;	
	}
	
	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratos = contratos;	
	}
	
	public ContratoRepositoryI getContratoRepositoryI1() {
		return this.contrato_repositoryi1;	
	}
	
	public void setContratoRepositoryI1(ContratoRepositoryI contrato_repositoryi1) {
		this.contrato_repositoryi1 = contrato_repositoryi1;
	}
}


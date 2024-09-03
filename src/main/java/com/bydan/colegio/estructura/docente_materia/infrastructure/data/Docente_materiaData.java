package com.bydan.colegio.estructura.docente_materia.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.docente_materia.domain.entity.Docente_materiaReturnViewDto;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;


@Component
public class Docente_materiaData implements Docente_materiaDataI {

	static String TITULO = "Docente Materia";    
	
	Iterable<Docente_materia> docente_materiaModels;
	Optional<Docente_materia> docente_materiaModel1;
		
    Docente_materia docente_materia1 = null;
    ArrayList<Docente_materia> docente_materias = new ArrayList<Docente_materia>();
	
	//Docente_materiaReturnViewDto docente_materia_return_view_dto;
	
	
	@Autowired
	private Docente_materiaRepositoryI docente_materia_repositoryi1;
	
	public Docente_materiaData() {
		
        //this.connexion1=new Connexion(); 		
		this.docente_materia1 = null;
    	this.docente_materias = new ArrayList<Docente_materia>();
		
		//this.docente_materia_return_view_dto = new Docente_materiaReturnViewDto();
		
	}
	
	public ArrayList<Docente_materia> getTodos(Pagination pagination1) {  
        try	{			
            
			this.docente_materiaModels = this.docente_materia_repositoryi1.findAll();				
						
			this.docente_materias = this.getEntitiesFromModels(this.docente_materiaModels);
			
			return this.docente_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Docente_materia> getBuscar(Object builder_object_docente_materia1,Pagination pagination1) {  
        try	{						
			
            this.docente_materiaModels = this.docente_materia_repositoryi1.findAll();
			
			this.docente_materias = this.getEntitiesFromModels(this.docente_materiaModels);	
			
			return this.docente_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Docente_materia> getBuscarGeneral(Object builder_object_docente_materia1,Pagination pagination1) {  
        try	{						
			
            this.docente_materiaModels = this.docente_materia_repositoryi1.findAll();
			
			this.docente_materias = this.getEntitiesFromModels(this.docente_materiaModels);	
			
			return this.docente_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Docente_materia getBuscarUno(Long id) {  
        try	{			
			
            this.docente_materiaModel1 = this.docente_materia_repositoryi1.findById(id);
			
			this.docente_materia1 = this.getEntityFromModel(this.docente_materiaModel1.get());
			
			return this.docente_materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Docente_materia nuevo(Docente_materia docente_materia1) {
        try	{			           
			Docente_materia docente_materiaModel2 = this.setModelFromEntity(docente_materia1);
			
			docente_materiaModel2 = this.docente_materia_repositoryi1.save(docente_materiaModel2);
			
			this.docente_materia1 = this.getEntityFromModel(docente_materiaModel2);
			
			return this.docente_materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Docente_materia actualizar(Docente_materia docente_materia1) {  
        try	{			           
			Docente_materia docente_materiaModel2 = this.setModelFromEntity(docente_materia1);
			
			docente_materiaModel2 = this.docente_materia_repositoryi1.save(docente_materiaModel2);
			
			this.docente_materia1 = this.getEntityFromModel(docente_materiaModel2);
			
			return this.docente_materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.docente_materia_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Docente_materia> nuevos(ArrayList<Docente_materia> docente_materias) {
        try	{		
			
			ArrayList<Docente_materia> docente_materiaModels2 = this.setModelsFromEntities(docente_materias);
			
			this.docente_materiaModels = this.docente_materia_repositoryi1.saveAll(docente_materiaModels2);
			
			this.docente_materias = this.getEntitiesFromModels(this.docente_materiaModels);
			
			return this.docente_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.docente_materia_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Docente_materia> updates_docente_materias,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.docente_materiaModels = this.docente_materia_repositoryi1.update('id',updates_docente_materias);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Docente_materia> getEntitiesFromModels(Iterable<Docente_materia> docente_materiaModelIterables) {
		ArrayList<Docente_materia> docente_materias = new ArrayList<Docente_materia>();
		Docente_materia docente_materia2 = new Docente_materia();
		
		for(Docente_materia docente_materiaModel2 : docente_materiaModelIterables) {
			docente_materia2 = this.getEntityFromModel(docente_materiaModel2);
			
			docente_materias.add(docente_materia2);
		}
		
		return docente_materias;
		
		/*
		ArrayList<Docente_materiaModel> docente_materiaModels = new ArrayList<Docente_materiaModel>();
		docente_materiaModelIterables.forEach(docente_materiaModels::add);		
		*/
	}
	
	public Docente_materia getEntityFromModel(Docente_materia docente_materiaModel1) {
		Docente_materia docente_materia1 = new Docente_materia();
		
		docente_materia1.setId(docente_materiaModel1.getId());
		
 		
 		docente_materia1.setCreated_at(docente_materiaModel1.getCreated_at());
 		docente_materia1.setUpdated_at(docente_materiaModel1.getUpdated_at());
 		docente_materia1.setId_docente(docente_materiaModel1.getId_docente());
 		docente_materia1.setId_materia(docente_materiaModel1.getId_materia());
		
		return docente_materia1;
		
		/*
		Docente_materiaModel docente_materiaModel1 = new Docente_materiaModel();		
		docente_materiaModel1 = docente_materiaModelOptional1.get();		
		*/
	}
	
	public ArrayList<Docente_materia> setModelsFromEntities(ArrayList<Docente_materia> docente_materias) {
		ArrayList<Docente_materia> docente_materiaModels = new ArrayList<Docente_materia>();
		Docente_materia docente_materiaModel2 = new Docente_materia();
		
		for(Docente_materia docente_materia2 : docente_materias) {
			docente_materiaModel2 = this.setModelFromEntity(docente_materia2);
			
			docente_materiaModels.add(docente_materiaModel2);
		}
		
		return docente_materiaModels;
	}
	
	public Docente_materia setModelFromEntity(Docente_materia docente_materia1) {
		Docente_materia docente_materiaModel1 = new Docente_materia();
		
		docente_materiaModel1.setId(docente_materia1.getId());
		
 		
 		docente_materiaModel1.setCreated_at(docente_materia1.getCreated_at());
 		docente_materiaModel1.setUpdated_at(docente_materia1.getUpdated_at());
 		docente_materiaModel1.setId_docente(docente_materia1.getId_docente());
 		docente_materiaModel1.setId_materia(docente_materia1.getId_materia());
		
		return docente_materiaModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jdocente_materia1 = new Object();
		
		/*
		jdocente_materia1 = {
			id : id
		};		
		*/
				
		return jdocente_materia1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jdocente_materia1 = new Object();
		
		/*
		jdocente_materia1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			id_docente : req.body.id_docente, 
			id_materia : req.body.id_materia, 
		};								
		*/
		
		return jdocente_materia1;
	}
	
	
	public Docente_materia getDocente_materia1() {
		return this.docente_materia1;	
	}
	
	public ArrayList<Docente_materia> getDocente_materias() {
		return this.docente_materias;	
	}
	
	public void setDocente_materia1(Docente_materia docente_materia1) {
		this.docente_materia1 = docente_materia1;	
	}
	
	public void setDocente_materias(ArrayList<Docente_materia> docente_materias) {
		this.docente_materias = docente_materias;	
	}
	
	public Docente_materiaRepositoryI getDocente_materiaRepositoryI1() {
		return this.docente_materia_repositoryi1;	
	}
	
	public void setDocente_materiaRepositoryI1(Docente_materiaRepositoryI docente_materia_repositoryi1) {
		this.docente_materia_repositoryi1 = docente_materia_repositoryi1;
	}
}


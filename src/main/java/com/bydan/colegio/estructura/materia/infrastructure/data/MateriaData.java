package com.bydan.colegio.estructura.materia.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.materia.domain.entity.MateriaReturnViewDto;

import com.bydan.colegio.estructura.materia.domain.model.Materia;


@Component
public class MateriaData implements MateriaDataI {

	static String TITULO = "Materia";    
	
	Iterable<Materia> materiaModels;
	Optional<Materia> materiaModel1;
		
    Materia materia1 = null;
    ArrayList<Materia> materias = new ArrayList<Materia>();
	
	Pageable pageable1;
	
	//MateriaReturnViewDto materia_return_view_dto;
	
	
	@Autowired
	private MateriaRepositoryI materia_repositoryi1;
	
	public MateriaData() {
		
        //this.connexion1=new Connexion(); 		
		this.materia1 = null;
    	this.materias = new ArrayList<Materia>();
		
		//this.materia_return_view_dto = new MateriaReturnViewDto();
		
	}
	
	public ArrayList<Materia> getTodos(Pagination pagination1) {  
        try	{			
            
			this.pageable1 = PageRequest.of(pagination1.getSkip(), pagination1.getLimit());
			
			this.materiaModels = this.materia_repositoryi1.findAll(this.pageable1);				
						
			this.materias = this.getEntitiesFromModels(this.materiaModels);
			
			return this.materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Materia> getBuscar(Object builder_object_materia1,Pagination pagination1) {  
        try	{						
			
			this.pageable1 = PageRequest.of(pagination1.getSkip(), pagination1.getLimit());
			
            this.materiaModels = this.materia_repositoryi1.findAll(this.pageable1);
			
			this.materias = this.getEntitiesFromModels(this.materiaModels);	
			
			return this.materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Materia> getBuscarGeneral(Object builder_object_materia1,Pagination pagination1) {  
        try	{						
			
			this.pageable1 = PageRequest.of(pagination1.getSkip(), pagination1.getLimit());
			
            this.materiaModels = this.materia_repositoryi1.findAll(this.pageable1);
			
			this.materias = this.getEntitiesFromModels(this.materiaModels);	
			
			return this.materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Materia getBuscarUno(Long id) {  
        try	{			
			
            this.materiaModel1 = this.materia_repositoryi1.findById(id);
			
			this.materia1 = this.getEntityFromModel(this.materiaModel1.get());
			
			return this.materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Materia nuevo(Materia materia1) {
        try	{			           
			Materia materiaModel2 = this.setModelFromEntity(materia1);
			
			materiaModel2 = this.materia_repositoryi1.save(materiaModel2);
			
			this.materia1 = this.getEntityFromModel(materiaModel2);
			
			return this.materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Materia actualizar(Materia materia1) {  
        try	{			           
			Materia materiaModel2 = this.setModelFromEntity(materia1);
			
			materiaModel2 = this.materia_repositoryi1.save(materiaModel2);
			
			this.materia1 = this.getEntityFromModel(materiaModel2);
			
			return this.materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.materia_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Materia> nuevos(ArrayList<Materia> materias) {
        try	{		
			
			ArrayList<Materia> materiaModels2 = this.setModelsFromEntities(materias);
			
			this.materiaModels = this.materia_repositoryi1.saveAll(materiaModels2);
			
			this.materias = this.getEntitiesFromModels(this.materiaModels);
			
			return this.materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.materia_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Materia> updates_materias,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.materiaModels = this.materia_repositoryi1.update('id',updates_materias);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Materia> getEntitiesFromModels(Iterable<Materia> materiaModelIterables) {
		ArrayList<Materia> materias = new ArrayList<Materia>();
		Materia materia2 = new Materia();
		
		for(Materia materiaModel2 : materiaModelIterables) {
			materia2 = this.getEntityFromModel(materiaModel2);
			
			materias.add(materia2);
		}
		
		return materias;
		
		/*
		ArrayList<MateriaModel> materiaModels = new ArrayList<MateriaModel>();
		materiaModelIterables.forEach(materiaModels::add);		
		*/
	}
	
	public Materia getEntityFromModel(Materia materiaModel1) {
		Materia materia1 = new Materia();
		
		materia1.setId(materiaModel1.getId());
		
 		
 		materia1.setCreated_at(materiaModel1.getCreated_at());
 		materia1.setUpdated_at(materiaModel1.getUpdated_at());
 		materia1.setCodigo(materiaModel1.getCodigo());
 		materia1.setNombre(materiaModel1.getNombre());
 		materia1.setActivo(materiaModel1.getActivo());
		
		return materia1;
		
		/*
		MateriaModel materiaModel1 = new MateriaModel();		
		materiaModel1 = materiaModelOptional1.get();		
		*/
	}
	
	public ArrayList<Materia> setModelsFromEntities(ArrayList<Materia> materias) {
		ArrayList<Materia> materiaModels = new ArrayList<Materia>();
		Materia materiaModel2 = new Materia();
		
		for(Materia materia2 : materias) {
			materiaModel2 = this.setModelFromEntity(materia2);
			
			materiaModels.add(materiaModel2);
		}
		
		return materiaModels;
	}
	
	public Materia setModelFromEntity(Materia materia1) {
		Materia materiaModel1 = new Materia();
		
		materiaModel1.setId(materia1.getId());
		
 		
 		materiaModel1.setCreated_at(materia1.getCreated_at());
 		materiaModel1.setUpdated_at(materia1.getUpdated_at());
 		materiaModel1.setCodigo(materia1.getCodigo());
 		materiaModel1.setNombre(materia1.getNombre());
 		materiaModel1.setActivo(materia1.getActivo());
		
		return materiaModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jmateria1 = new Object();
		
		/*
		jmateria1 = {
			id : id
		};		
		*/
				
		return jmateria1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jmateria1 = new Object();
		
		/*
		jmateria1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			codigo : req.body.codigo, 
			nombre : req.body.nombre, 
			activo : req.body.activo, 
		};								
		*/
		
		return jmateria1;
	}
	
	
	public Materia getMateria1() {
		return this.materia1;	
	}
	
	public ArrayList<Materia> getMaterias() {
		return this.materias;	
	}
	
	public void setMateria1(Materia materia1) {
		this.materia1 = materia1;	
	}
	
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;	
	}
	
	public MateriaRepositoryI getMateriaRepositoryI1() {
		return this.materia_repositoryi1;	
	}
	
	public void setMateriaRepositoryI1(MateriaRepositoryI materia_repositoryi1) {
		this.materia_repositoryi1 = materia_repositoryi1;
	}
}


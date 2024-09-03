package com.bydan.colegio.estructura.alumno_materia.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.alumno_materia.domain.entity.Alumno_materiaReturnViewDto;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;


@Component
public class Alumno_materiaData implements Alumno_materiaDataI {

	static String TITULO = "Alumno Materia";    
	
	Iterable<Alumno_materia> alumno_materiaModels;
	Optional<Alumno_materia> alumno_materiaModel1;
		
    Alumno_materia alumno_materia1 = null;
    ArrayList<Alumno_materia> alumno_materias = new ArrayList<Alumno_materia>();
	
	//Alumno_materiaReturnViewDto alumno_materia_return_view_dto;
	
	
	@Autowired
	private Alumno_materiaRepositoryI alumno_materia_repositoryi1;
	
	public Alumno_materiaData() {
		
        //this.connexion1=new Connexion(); 		
		this.alumno_materia1 = null;
    	this.alumno_materias = new ArrayList<Alumno_materia>();
		
		//this.alumno_materia_return_view_dto = new Alumno_materiaReturnViewDto();
		
	}
	
	public ArrayList<Alumno_materia> getTodos(Pagination pagination1) {  
        try	{			
            
			this.alumno_materiaModels = this.alumno_materia_repositoryi1.findAll();				
						
			this.alumno_materias = this.getEntitiesFromModels(this.alumno_materiaModels);
			
			return this.alumno_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Alumno_materia> getBuscar(Object builder_object_alumno_materia1,Pagination pagination1) {  
        try	{						
			
            this.alumno_materiaModels = this.alumno_materia_repositoryi1.findAll();
			
			this.alumno_materias = this.getEntitiesFromModels(this.alumno_materiaModels);	
			
			return this.alumno_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Alumno_materia> getBuscarGeneral(Object builder_object_alumno_materia1,Pagination pagination1) {  
        try	{						
			
            this.alumno_materiaModels = this.alumno_materia_repositoryi1.findAll();
			
			this.alumno_materias = this.getEntitiesFromModels(this.alumno_materiaModels);	
			
			return this.alumno_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Alumno_materia getBuscarUno(Long id) {  
        try	{			
			
            this.alumno_materiaModel1 = this.alumno_materia_repositoryi1.findById(id);
			
			this.alumno_materia1 = this.getEntityFromModel(this.alumno_materiaModel1.get());
			
			return this.alumno_materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Alumno_materia nuevo(Alumno_materia alumno_materia1) {
        try	{			           
			Alumno_materia alumno_materiaModel2 = this.setModelFromEntity(alumno_materia1);
			
			alumno_materiaModel2 = this.alumno_materia_repositoryi1.save(alumno_materiaModel2);
			
			this.alumno_materia1 = this.getEntityFromModel(alumno_materiaModel2);
			
			return this.alumno_materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Alumno_materia actualizar(Alumno_materia alumno_materia1) {  
        try	{			           
			Alumno_materia alumno_materiaModel2 = this.setModelFromEntity(alumno_materia1);
			
			alumno_materiaModel2 = this.alumno_materia_repositoryi1.save(alumno_materiaModel2);
			
			this.alumno_materia1 = this.getEntityFromModel(alumno_materiaModel2);
			
			return this.alumno_materia1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.alumno_materia_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Alumno_materia> nuevos(ArrayList<Alumno_materia> alumno_materias) {
        try	{		
			
			ArrayList<Alumno_materia> alumno_materiaModels2 = this.setModelsFromEntities(alumno_materias);
			
			this.alumno_materiaModels = this.alumno_materia_repositoryi1.saveAll(alumno_materiaModels2);
			
			this.alumno_materias = this.getEntitiesFromModels(this.alumno_materiaModels);
			
			return this.alumno_materias;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.alumno_materia_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Alumno_materia> updates_alumno_materias,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.alumno_materiaModels = this.alumno_materia_repositoryi1.update('id',updates_alumno_materias);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Alumno_materia> getEntitiesFromModels(Iterable<Alumno_materia> alumno_materiaModelIterables) {
		ArrayList<Alumno_materia> alumno_materias = new ArrayList<Alumno_materia>();
		Alumno_materia alumno_materia2 = new Alumno_materia();
		
		for(Alumno_materia alumno_materiaModel2 : alumno_materiaModelIterables) {
			alumno_materia2 = this.getEntityFromModel(alumno_materiaModel2);
			
			alumno_materias.add(alumno_materia2);
		}
		
		return alumno_materias;
		
		/*
		ArrayList<Alumno_materiaModel> alumno_materiaModels = new ArrayList<Alumno_materiaModel>();
		alumno_materiaModelIterables.forEach(alumno_materiaModels::add);		
		*/
	}
	
	public Alumno_materia getEntityFromModel(Alumno_materia alumno_materiaModel1) {
		Alumno_materia alumno_materia1 = new Alumno_materia();
		
		alumno_materia1.setId(alumno_materiaModel1.getId());
		
 		
 		alumno_materia1.setCreated_at(alumno_materiaModel1.getCreated_at());
 		alumno_materia1.setUpdated_at(alumno_materiaModel1.getUpdated_at());
 		alumno_materia1.setId_alumno(alumno_materiaModel1.getId_alumno());
 		alumno_materia1.setId_materia(alumno_materiaModel1.getId_materia());
		
		return alumno_materia1;
		
		/*
		Alumno_materiaModel alumno_materiaModel1 = new Alumno_materiaModel();		
		alumno_materiaModel1 = alumno_materiaModelOptional1.get();		
		*/
	}
	
	public ArrayList<Alumno_materia> setModelsFromEntities(ArrayList<Alumno_materia> alumno_materias) {
		ArrayList<Alumno_materia> alumno_materiaModels = new ArrayList<Alumno_materia>();
		Alumno_materia alumno_materiaModel2 = new Alumno_materia();
		
		for(Alumno_materia alumno_materia2 : alumno_materias) {
			alumno_materiaModel2 = this.setModelFromEntity(alumno_materia2);
			
			alumno_materiaModels.add(alumno_materiaModel2);
		}
		
		return alumno_materiaModels;
	}
	
	public Alumno_materia setModelFromEntity(Alumno_materia alumno_materia1) {
		Alumno_materia alumno_materiaModel1 = new Alumno_materia();
		
		alumno_materiaModel1.setId(alumno_materia1.getId());
		
 		
 		alumno_materiaModel1.setCreated_at(alumno_materia1.getCreated_at());
 		alumno_materiaModel1.setUpdated_at(alumno_materia1.getUpdated_at());
 		alumno_materiaModel1.setId_alumno(alumno_materia1.getId_alumno());
 		alumno_materiaModel1.setId_materia(alumno_materia1.getId_materia());
		
		return alumno_materiaModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jalumno_materia1 = new Object();
		
		/*
		jalumno_materia1 = {
			id : id
		};		
		*/
				
		return jalumno_materia1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jalumno_materia1 = new Object();
		
		/*
		jalumno_materia1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			id_alumno : req.body.id_alumno, 
			id_materia : req.body.id_materia, 
		};								
		*/
		
		return jalumno_materia1;
	}
	
	
	public Alumno_materia getAlumno_materia1() {
		return this.alumno_materia1;	
	}
	
	public ArrayList<Alumno_materia> getAlumno_materias() {
		return this.alumno_materias;	
	}
	
	public void setAlumno_materia1(Alumno_materia alumno_materia1) {
		this.alumno_materia1 = alumno_materia1;	
	}
	
	public void setAlumno_materias(ArrayList<Alumno_materia> alumno_materias) {
		this.alumno_materias = alumno_materias;	
	}
	
	public Alumno_materiaRepositoryI getAlumno_materiaRepositoryI1() {
		return this.alumno_materia_repositoryi1;	
	}
	
	public void setAlumno_materiaRepositoryI1(Alumno_materiaRepositoryI alumno_materia_repositoryi1) {
		this.alumno_materia_repositoryi1 = alumno_materia_repositoryi1;
	}
}


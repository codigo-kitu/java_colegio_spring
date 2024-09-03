package com.bydan.colegio.estructura.alumno.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.alumno.domain.entity.AlumnoReturnViewDto;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;


@Component
public class AlumnoData implements AlumnoDataI {

	static String TITULO = "Alumno";    
	
	Iterable<Alumno> alumnoModels;
	Optional<Alumno> alumnoModel1;
		
    Alumno alumno1 = null;
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	//AlumnoReturnViewDto alumno_return_view_dto;
	
	
	@Autowired
	private AlumnoRepositoryI alumno_repositoryi1;
	
	public AlumnoData() {
		
        //this.connexion1=new Connexion(); 		
		this.alumno1 = null;
    	this.alumnos = new ArrayList<Alumno>();
		
		//this.alumno_return_view_dto = new AlumnoReturnViewDto();
		
	}
	
	public ArrayList<Alumno> getTodos(Pagination pagination1) {  
        try	{			
            
			this.alumnoModels = this.alumno_repositoryi1.findAll();				
						
			this.alumnos = this.getEntitiesFromModels(this.alumnoModels);
			
			return this.alumnos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Alumno> getBuscar(Object builder_object_alumno1,Pagination pagination1) {  
        try	{						
			
            this.alumnoModels = this.alumno_repositoryi1.findAll();
			
			this.alumnos = this.getEntitiesFromModels(this.alumnoModels);	
			
			return this.alumnos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Alumno> getBuscarGeneral(Object builder_object_alumno1,Pagination pagination1) {  
        try	{						
			
            this.alumnoModels = this.alumno_repositoryi1.findAll();
			
			this.alumnos = this.getEntitiesFromModels(this.alumnoModels);	
			
			return this.alumnos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Alumno getBuscarUno(Long id) {  
        try	{			
			
            this.alumnoModel1 = this.alumno_repositoryi1.findById(id);
			
			this.alumno1 = this.getEntityFromModel(this.alumnoModel1.get());
			
			return this.alumno1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Alumno nuevo(Alumno alumno1) {
        try	{			           
			Alumno alumnoModel2 = this.setModelFromEntity(alumno1);
			
			alumnoModel2 = this.alumno_repositoryi1.save(alumnoModel2);
			
			this.alumno1 = this.getEntityFromModel(alumnoModel2);
			
			return this.alumno1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Alumno actualizar(Alumno alumno1) {  
        try	{			           
			Alumno alumnoModel2 = this.setModelFromEntity(alumno1);
			
			alumnoModel2 = this.alumno_repositoryi1.save(alumnoModel2);
			
			this.alumno1 = this.getEntityFromModel(alumnoModel2);
			
			return this.alumno1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.alumno_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Alumno> nuevos(ArrayList<Alumno> alumnos) {
        try	{		
			
			ArrayList<Alumno> alumnoModels2 = this.setModelsFromEntities(alumnos);
			
			this.alumnoModels = this.alumno_repositoryi1.saveAll(alumnoModels2);
			
			this.alumnos = this.getEntitiesFromModels(this.alumnoModels);
			
			return this.alumnos;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.alumno_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Alumno> updates_alumnos,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.alumnoModels = this.alumno_repositoryi1.update('id',updates_alumnos);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Alumno> getEntitiesFromModels(Iterable<Alumno> alumnoModelIterables) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno alumno2 = new Alumno();
		
		for(Alumno alumnoModel2 : alumnoModelIterables) {
			alumno2 = this.getEntityFromModel(alumnoModel2);
			
			alumnos.add(alumno2);
		}
		
		return alumnos;
		
		/*
		ArrayList<AlumnoModel> alumnoModels = new ArrayList<AlumnoModel>();
		alumnoModelIterables.forEach(alumnoModels::add);		
		*/
	}
	
	public Alumno getEntityFromModel(Alumno alumnoModel1) {
		Alumno alumno1 = new Alumno();
		
		alumno1.setId(alumnoModel1.getId());
		
 		
 		alumno1.setCreated_at(alumnoModel1.getCreated_at());
 		alumno1.setUpdated_at(alumnoModel1.getUpdated_at());
 		alumno1.setNombre(alumnoModel1.getNombre());
 		alumno1.setApellido(alumnoModel1.getApellido());
 		alumno1.setFecha_nacimiento(alumnoModel1.getFecha_nacimiento());
		
		return alumno1;
		
		/*
		AlumnoModel alumnoModel1 = new AlumnoModel();		
		alumnoModel1 = alumnoModelOptional1.get();		
		*/
	}
	
	public ArrayList<Alumno> setModelsFromEntities(ArrayList<Alumno> alumnos) {
		ArrayList<Alumno> alumnoModels = new ArrayList<Alumno>();
		Alumno alumnoModel2 = new Alumno();
		
		for(Alumno alumno2 : alumnos) {
			alumnoModel2 = this.setModelFromEntity(alumno2);
			
			alumnoModels.add(alumnoModel2);
		}
		
		return alumnoModels;
	}
	
	public Alumno setModelFromEntity(Alumno alumno1) {
		Alumno alumnoModel1 = new Alumno();
		
		alumnoModel1.setId(alumno1.getId());
		
 		
 		alumnoModel1.setCreated_at(alumno1.getCreated_at());
 		alumnoModel1.setUpdated_at(alumno1.getUpdated_at());
 		alumnoModel1.setNombre(alumno1.getNombre());
 		alumnoModel1.setApellido(alumno1.getApellido());
 		alumnoModel1.setFecha_nacimiento(alumno1.getFecha_nacimiento());
		
		return alumnoModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jalumno1 = new Object();
		
		/*
		jalumno1 = {
			id : id
		};		
		*/
				
		return jalumno1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jalumno1 = new Object();
		
		/*
		jalumno1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			nombre : req.body.nombre, 
			apellido : req.body.apellido, 
			fecha_nacimiento : req.body.fecha_nacimiento, 
		};								
		*/
		
		return jalumno1;
	}
	
	
	public Alumno getAlumno1() {
		return this.alumno1;	
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return this.alumnos;	
	}
	
	public void setAlumno1(Alumno alumno1) {
		this.alumno1 = alumno1;	
	}
	
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;	
	}
	
	public AlumnoRepositoryI getAlumnoRepositoryI1() {
		return this.alumno_repositoryi1;	
	}
	
	public void setAlumnoRepositoryI1(AlumnoRepositoryI alumno_repositoryi1) {
		this.alumno_repositoryi1 = alumno_repositoryi1;
	}
}


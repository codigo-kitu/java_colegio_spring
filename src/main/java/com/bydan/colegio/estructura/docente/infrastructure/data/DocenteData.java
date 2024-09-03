package com.bydan.colegio.estructura.docente.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.docente.domain.entity.DocenteReturnViewDto;

import com.bydan.colegio.estructura.docente.domain.model.Docente;


@Component
public class DocenteData implements DocenteDataI {

	static String TITULO = "Docente";    
	
	Iterable<Docente> docenteModels;
	Optional<Docente> docenteModel1;
		
    Docente docente1 = null;
    ArrayList<Docente> docentes = new ArrayList<Docente>();
	
	//DocenteReturnViewDto docente_return_view_dto;
	
	
	@Autowired
	private DocenteRepositoryI docente_repositoryi1;
	
	public DocenteData() {
		
        //this.connexion1=new Connexion(); 		
		this.docente1 = null;
    	this.docentes = new ArrayList<Docente>();
		
		//this.docente_return_view_dto = new DocenteReturnViewDto();
		
	}
	
	public ArrayList<Docente> getTodos(Pagination pagination1) {  
        try	{			
            
			this.docenteModels = this.docente_repositoryi1.findAll();				
						
			this.docentes = this.getEntitiesFromModels(this.docenteModels);
			
			return this.docentes;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Docente> getBuscar(Object builder_object_docente1,Pagination pagination1) {  
        try	{						
			
            this.docenteModels = this.docente_repositoryi1.findAll();
			
			this.docentes = this.getEntitiesFromModels(this.docenteModels);	
			
			return this.docentes;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Docente> getBuscarGeneral(Object builder_object_docente1,Pagination pagination1) {  
        try	{						
			
            this.docenteModels = this.docente_repositoryi1.findAll();
			
			this.docentes = this.getEntitiesFromModels(this.docenteModels);	
			
			return this.docentes;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Docente getBuscarUno(Long id) {  
        try	{			
			
            this.docenteModel1 = this.docente_repositoryi1.findById(id);
			
			this.docente1 = this.getEntityFromModel(this.docenteModel1.get());
			
			return this.docente1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Docente nuevo(Docente docente1) {
        try	{			           
			Docente docenteModel2 = this.setModelFromEntity(docente1);
			
			docenteModel2 = this.docente_repositoryi1.save(docenteModel2);
			
			this.docente1 = this.getEntityFromModel(docenteModel2);
			
			return this.docente1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Docente actualizar(Docente docente1) {  
        try	{			           
			Docente docenteModel2 = this.setModelFromEntity(docente1);
			
			docenteModel2 = this.docente_repositoryi1.save(docenteModel2);
			
			this.docente1 = this.getEntityFromModel(docenteModel2);
			
			return this.docente1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.docente_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Docente> nuevos(ArrayList<Docente> docentes) {
        try	{		
			
			ArrayList<Docente> docenteModels2 = this.setModelsFromEntities(docentes);
			
			this.docenteModels = this.docente_repositoryi1.saveAll(docenteModels2);
			
			this.docentes = this.getEntitiesFromModels(this.docenteModels);
			
			return this.docentes;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.docente_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Docente> updates_docentes,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.docenteModels = this.docente_repositoryi1.update('id',updates_docentes);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Docente> getEntitiesFromModels(Iterable<Docente> docenteModelIterables) {
		ArrayList<Docente> docentes = new ArrayList<Docente>();
		Docente docente2 = new Docente();
		
		for(Docente docenteModel2 : docenteModelIterables) {
			docente2 = this.getEntityFromModel(docenteModel2);
			
			docentes.add(docente2);
		}
		
		return docentes;
		
		/*
		ArrayList<DocenteModel> docenteModels = new ArrayList<DocenteModel>();
		docenteModelIterables.forEach(docenteModels::add);		
		*/
	}
	
	public Docente getEntityFromModel(Docente docenteModel1) {
		Docente docente1 = new Docente();
		
		docente1.setId(docenteModel1.getId());
		
 		
 		docente1.setCreated_at(docenteModel1.getCreated_at());
 		docente1.setUpdated_at(docenteModel1.getUpdated_at());
 		docente1.setNombre(docenteModel1.getNombre());
 		docente1.setApellido(docenteModel1.getApellido());
 		docente1.setFecha_nacimiento(docenteModel1.getFecha_nacimiento());
 		docente1.setAnios_experiencia(docenteModel1.getAnios_experiencia());
 		docente1.setNota_evaluacion(docenteModel1.getNota_evaluacion());
		
		return docente1;
		
		/*
		DocenteModel docenteModel1 = new DocenteModel();		
		docenteModel1 = docenteModelOptional1.get();		
		*/
	}
	
	public ArrayList<Docente> setModelsFromEntities(ArrayList<Docente> docentes) {
		ArrayList<Docente> docenteModels = new ArrayList<Docente>();
		Docente docenteModel2 = new Docente();
		
		for(Docente docente2 : docentes) {
			docenteModel2 = this.setModelFromEntity(docente2);
			
			docenteModels.add(docenteModel2);
		}
		
		return docenteModels;
	}
	
	public Docente setModelFromEntity(Docente docente1) {
		Docente docenteModel1 = new Docente();
		
		docenteModel1.setId(docente1.getId());
		
 		
 		docenteModel1.setCreated_at(docente1.getCreated_at());
 		docenteModel1.setUpdated_at(docente1.getUpdated_at());
 		docenteModel1.setNombre(docente1.getNombre());
 		docenteModel1.setApellido(docente1.getApellido());
 		docenteModel1.setFecha_nacimiento(docente1.getFecha_nacimiento());
 		docenteModel1.setAnios_experiencia(docente1.getAnios_experiencia());
 		docenteModel1.setNota_evaluacion(docente1.getNota_evaluacion());
		
		return docenteModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jdocente1 = new Object();
		
		/*
		jdocente1 = {
			id : id
		};		
		*/
				
		return jdocente1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jdocente1 = new Object();
		
		/*
		jdocente1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			nombre : req.body.nombre, 
			apellido : req.body.apellido, 
			fecha_nacimiento : req.body.fecha_nacimiento, 
			anios_experiencia : req.body.anios_experiencia, 
			nota_evaluacion : req.body.nota_evaluacion, 
		};								
		*/
		
		return jdocente1;
	}
	
	
	public Docente getDocente1() {
		return this.docente1;	
	}
	
	public ArrayList<Docente> getDocentes() {
		return this.docentes;	
	}
	
	public void setDocente1(Docente docente1) {
		this.docente1 = docente1;	
	}
	
	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;	
	}
	
	public DocenteRepositoryI getDocenteRepositoryI1() {
		return this.docente_repositoryi1;	
	}
	
	public void setDocenteRepositoryI1(DocenteRepositoryI docente_repositoryi1) {
		this.docente_repositoryi1 = docente_repositoryi1;
	}
}


package com.bydan.colegio.proceso.nota.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.proceso.nota.domain.entity.NotaReturnViewDto;

import com.bydan.colegio.proceso.nota.domain.model.Nota;


@Component
public class NotaData implements NotaDataI {

	static String TITULO = "Nota";    
	
	Iterable<Nota> notaModels;
	Optional<Nota> notaModel1;
		
    Nota nota1 = null;
    ArrayList<Nota> notas = new ArrayList<Nota>();
	
	//NotaReturnViewDto nota_return_view_dto;
	
	
	@Autowired
	private NotaRepositoryI nota_repositoryi1;
	
	public NotaData() {
		
        //this.connexion1=new Connexion(); 		
		this.nota1 = null;
    	this.notas = new ArrayList<Nota>();
		
		//this.nota_return_view_dto = new NotaReturnViewDto();
		
	}
	
	public ArrayList<Nota> getTodos(Pagination pagination1) {  
        try	{			
            
			this.notaModels = this.nota_repositoryi1.findAll();				
						
			this.notas = this.getEntitiesFromModels(this.notaModels);
			
			return this.notas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Nota> getBuscar(Object builder_object_nota1,Pagination pagination1) {  
        try	{						
			
            this.notaModels = this.nota_repositoryi1.findAll();
			
			this.notas = this.getEntitiesFromModels(this.notaModels);	
			
			return this.notas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Nota> getBuscarGeneral(Object builder_object_nota1,Pagination pagination1) {  
        try	{						
			
            this.notaModels = this.nota_repositoryi1.findAll();
			
			this.notas = this.getEntitiesFromModels(this.notaModels);	
			
			return this.notas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Nota getBuscarUno(Long id) {  
        try	{			
			
            this.notaModel1 = this.nota_repositoryi1.findById(id);
			
			this.nota1 = this.getEntityFromModel(this.notaModel1.get());
			
			return this.nota1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Nota nuevo(Nota nota1) {
        try	{			           
			Nota notaModel2 = this.setModelFromEntity(nota1);
			
			notaModel2 = this.nota_repositoryi1.save(notaModel2);
			
			this.nota1 = this.getEntityFromModel(notaModel2);
			
			return this.nota1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Nota actualizar(Nota nota1) {  
        try	{			           
			Nota notaModel2 = this.setModelFromEntity(nota1);
			
			notaModel2 = this.nota_repositoryi1.save(notaModel2);
			
			this.nota1 = this.getEntityFromModel(notaModel2);
			
			return this.nota1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.nota_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Nota> nuevos(ArrayList<Nota> notas) {
        try	{		
			
			ArrayList<Nota> notaModels2 = this.setModelsFromEntities(notas);
			
			this.notaModels = this.nota_repositoryi1.saveAll(notaModels2);
			
			this.notas = this.getEntitiesFromModels(this.notaModels);
			
			return this.notas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.nota_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Nota> updates_notas,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.notaModels = this.nota_repositoryi1.update('id',updates_notas);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Nota> getEntitiesFromModels(Iterable<Nota> notaModelIterables) {
		ArrayList<Nota> notas = new ArrayList<Nota>();
		Nota nota2 = new Nota();
		
		for(Nota notaModel2 : notaModelIterables) {
			nota2 = this.getEntityFromModel(notaModel2);
			
			notas.add(nota2);
		}
		
		return notas;
		
		/*
		ArrayList<NotaModel> notaModels = new ArrayList<NotaModel>();
		notaModelIterables.forEach(notaModels::add);		
		*/
	}
	
	public Nota getEntityFromModel(Nota notaModel1) {
		Nota nota1 = new Nota();
		
		nota1.setId(notaModel1.getId());
		
 		
 		nota1.setCreated_at(notaModel1.getCreated_at());
 		nota1.setUpdated_at(notaModel1.getUpdated_at());
 		nota1.setId_alumno(notaModel1.getId_alumno());
 		nota1.setId_materia(notaModel1.getId_materia());
 		nota1.setId_docente(notaModel1.getId_docente());
 		nota1.setNota_prueba(notaModel1.getNota_prueba());
 		nota1.setNota_trabajo(notaModel1.getNota_trabajo());
 		nota1.setNota_examen(notaModel1.getNota_examen());
 		nota1.setNota_final(notaModel1.getNota_final());
		
		return nota1;
		
		/*
		NotaModel notaModel1 = new NotaModel();		
		notaModel1 = notaModelOptional1.get();		
		*/
	}
	
	public ArrayList<Nota> setModelsFromEntities(ArrayList<Nota> notas) {
		ArrayList<Nota> notaModels = new ArrayList<Nota>();
		Nota notaModel2 = new Nota();
		
		for(Nota nota2 : notas) {
			notaModel2 = this.setModelFromEntity(nota2);
			
			notaModels.add(notaModel2);
		}
		
		return notaModels;
	}
	
	public Nota setModelFromEntity(Nota nota1) {
		Nota notaModel1 = new Nota();
		
		notaModel1.setId(nota1.getId());
		
 		
 		notaModel1.setCreated_at(nota1.getCreated_at());
 		notaModel1.setUpdated_at(nota1.getUpdated_at());
 		notaModel1.setId_alumno(nota1.getId_alumno());
 		notaModel1.setId_materia(nota1.getId_materia());
 		notaModel1.setId_docente(nota1.getId_docente());
 		notaModel1.setNota_prueba(nota1.getNota_prueba());
 		notaModel1.setNota_trabajo(nota1.getNota_trabajo());
 		notaModel1.setNota_examen(nota1.getNota_examen());
 		notaModel1.setNota_final(nota1.getNota_final());
		
		return notaModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jnota1 = new Object();
		
		/*
		jnota1 = {
			id : id
		};		
		*/
				
		return jnota1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jnota1 = new Object();
		
		/*
		jnota1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			id_alumno : req.body.id_alumno, 
			id_materia : req.body.id_materia, 
			id_docente : req.body.id_docente, 
			nota_prueba : req.body.nota_prueba, 
			nota_trabajo : req.body.nota_trabajo, 
			nota_examen : req.body.nota_examen, 
			nota_final : req.body.nota_final, 
		};								
		*/
		
		return jnota1;
	}
	
	
	public Nota getNota1() {
		return this.nota1;	
	}
	
	public ArrayList<Nota> getNotas() {
		return this.notas;	
	}
	
	public void setNota1(Nota nota1) {
		this.nota1 = nota1;	
	}
	
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;	
	}
	
	public NotaRepositoryI getNotaRepositoryI1() {
		return this.nota_repositoryi1;	
	}
	
	public void setNotaRepositoryI1(NotaRepositoryI nota_repositoryi1) {
		this.nota_repositoryi1 = nota_repositoryi1;
	}
}


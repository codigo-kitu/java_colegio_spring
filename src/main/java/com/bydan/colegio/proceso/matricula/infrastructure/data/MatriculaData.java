package com.bydan.colegio.proceso.matricula.infrastructure.data;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.proceso.matricula.domain.entity.MatriculaReturnViewDto;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;


@Component
public class MatriculaData implements MatriculaDataI {

	static String TITULO = "Matricula";    
	
	Iterable<Matricula> matriculaModels;
	Optional<Matricula> matriculaModel1;
		
    Matricula matricula1 = null;
    ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	//MatriculaReturnViewDto matricula_return_view_dto;
	
	
	@Autowired
	private MatriculaRepositoryI matricula_repositoryi1;
	
	public MatriculaData() {
		
        //this.connexion1=new Connexion(); 		
		this.matricula1 = null;
    	this.matriculas = new ArrayList<Matricula>();
		
		//this.matricula_return_view_dto = new MatriculaReturnViewDto();
		
	}
	
	public ArrayList<Matricula> getTodos(Pagination pagination1) {  
        try	{			
            
			this.matriculaModels = this.matricula_repositoryi1.findAll();				
						
			this.matriculas = this.getEntitiesFromModels(this.matriculaModels);
			
			return this.matriculas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Matricula> getBuscar(Object builder_object_matricula1,Pagination pagination1) {  
        try	{						
			
            this.matriculaModels = this.matricula_repositoryi1.findAll();
			
			this.matriculas = this.getEntitiesFromModels(this.matriculaModels);	
			
			return this.matriculas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Matricula> getBuscarGeneral(Object builder_object_matricula1,Pagination pagination1) {  
        try	{						
			
            this.matriculaModels = this.matricula_repositoryi1.findAll();
			
			this.matriculas = this.getEntitiesFromModels(this.matriculaModels);	
			
			return this.matriculas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Matricula getBuscarUno(Long id) {  
        try	{			
			
            this.matriculaModel1 = this.matricula_repositoryi1.findById(id);
			
			this.matricula1 = this.getEntityFromModel(this.matriculaModel1.get());
			
			return this.matricula1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
    public Matricula nuevo(Matricula matricula1) {
        try	{			           
			Matricula matriculaModel2 = this.setModelFromEntity(matricula1);
			
			matriculaModel2 = this.matricula_repositoryi1.save(matriculaModel2);
			
			this.matricula1 = this.getEntityFromModel(matriculaModel2);
			
			return this.matricula1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public Matricula actualizar(Matricula matricula1) {  
        try	{			           
			Matricula matriculaModel2 = this.setModelFromEntity(matricula1);
			
			matriculaModel2 = this.matricula_repositoryi1.save(matriculaModel2);
			
			this.matricula1 = this.getEntityFromModel(matriculaModel2);
			
			return this.matricula1;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminar(Long id) {  
        try	{			          
			this.matricula_repositoryi1.deleteById(id);
		
		} catch(Exception ex) {
            throw ex;
        }
    }	
	
	public ArrayList<Matricula> nuevos(ArrayList<Matricula> matriculas) {
        try	{		
			
			ArrayList<Matricula> matriculaModels2 = this.setModelsFromEntities(matriculas);
			
			this.matriculaModels = this.matricula_repositoryi1.saveAll(matriculaModels2);
			
			this.matriculas = this.getEntitiesFromModels(this.matriculaModels);
			
			return this.matriculas;
			
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void eliminars(ArrayList<Long> ids) {  
        try	{			          
			this.matricula_repositoryi1.deleteAllById(ids);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public void actualizars(ArrayList<Matricula> updates_matriculas,ArrayList<String> updates_columnas) {  
        try	{			           
			//console.log(updates_columnas);
			//this.matriculaModels = this.matricula_repositoryi1.update('id',updates_matriculas);
		
		} catch(Exception ex) {
            throw ex;
        }
    }
	
	public ArrayList<Matricula> getEntitiesFromModels(Iterable<Matricula> matriculaModelIterables) {
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
		Matricula matricula2 = new Matricula();
		
		for(Matricula matriculaModel2 : matriculaModelIterables) {
			matricula2 = this.getEntityFromModel(matriculaModel2);
			
			matriculas.add(matricula2);
		}
		
		return matriculas;
		
		/*
		ArrayList<MatriculaModel> matriculaModels = new ArrayList<MatriculaModel>();
		matriculaModelIterables.forEach(matriculaModels::add);		
		*/
	}
	
	public Matricula getEntityFromModel(Matricula matriculaModel1) {
		Matricula matricula1 = new Matricula();
		
		matricula1.setId(matriculaModel1.getId());
		
 		
 		matricula1.setCreated_at(matriculaModel1.getCreated_at());
 		matricula1.setUpdated_at(matriculaModel1.getUpdated_at());
 		matricula1.setAnio(matriculaModel1.getAnio());
 		matricula1.setCosto(matriculaModel1.getCosto());
 		matricula1.setFecha(matriculaModel1.getFecha());
 		matricula1.setPagado(matriculaModel1.getPagado());
		
		return matricula1;
		
		/*
		MatriculaModel matriculaModel1 = new MatriculaModel();		
		matriculaModel1 = matriculaModelOptional1.get();		
		*/
	}
	
	public ArrayList<Matricula> setModelsFromEntities(ArrayList<Matricula> matriculas) {
		ArrayList<Matricula> matriculaModels = new ArrayList<Matricula>();
		Matricula matriculaModel2 = new Matricula();
		
		for(Matricula matricula2 : matriculas) {
			matriculaModel2 = this.setModelFromEntity(matricula2);
			
			matriculaModels.add(matriculaModel2);
		}
		
		return matriculaModels;
	}
	
	public Matricula setModelFromEntity(Matricula matricula1) {
		Matricula matriculaModel1 = new Matricula();
		
		matriculaModel1.setId(matricula1.getId());
		
 		
 		matriculaModel1.setCreated_at(matricula1.getCreated_at());
 		matriculaModel1.setUpdated_at(matricula1.getUpdated_at());
 		matriculaModel1.setAnio(matricula1.getAnio());
 		matriculaModel1.setCosto(matricula1.getCosto());
 		matriculaModel1.setFecha(matricula1.getFecha());
 		matriculaModel1.setPagado(matricula1.getPagado());
		
		return matriculaModel1;
	}
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id) {				
		Object jmatricula1 = new Object();
		
		/*
		jmatricula1 = {
			id : id
		};		
		*/
				
		return jmatricula1;
	}
	
	public Object getBuilderFunctionObjectParametroBuscar(Object req) {				
		Object jmatricula1 = new Object();
		
		/*
		jmatricula1 = {
			created_at : req.body.created_at, 
			updated_at : req.body.updated_at, 
			anio : req.body.anio, 
			costo : req.body.costo, 
			fecha : req.body.fecha, 
			pagado : req.body.pagado, 
		};								
		*/
		
		return jmatricula1;
	}
	
	
	public Matricula getMatricula1() {
		return this.matricula1;	
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return this.matriculas;	
	}
	
	public void setMatricula1(Matricula matricula1) {
		this.matricula1 = matricula1;	
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;	
	}
	
	public MatriculaRepositoryI getMatriculaRepositoryI1() {
		return this.matricula_repositoryi1;	
	}
	
	public void setMatriculaRepositoryI1(MatriculaRepositoryI matricula_repositoryi1) {
		this.matricula_repositoryi1 = matricula_repositoryi1;
	}
}


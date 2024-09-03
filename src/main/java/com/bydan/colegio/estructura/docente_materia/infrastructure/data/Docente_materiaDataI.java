package com.bydan.colegio.estructura.docente_materia.infrastructure.data;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;
//import com.bydan.colegio.estructura.docente_materia.domain.entity.Docente_materiaReturnViewDto;

public interface Docente_materiaDataI {					

	public ArrayList<Docente_materia> getTodos(Pagination pagination1);	
	public ArrayList<Docente_materia> getBuscar(Object builder_object_docente_materia1,Pagination pagination1);	
	public ArrayList<Docente_materia> getBuscarGeneral(Object builder_object_docente_materia1,Pagination pagination1);	
	public Docente_materia getBuscarUno(Long id);
	
    public Docente_materia nuevo(Docente_materia docente_materia1);	
	public Docente_materia actualizar(Docente_materia docente_materia1);	
	public void eliminar(Long id);
	
	public ArrayList<Docente_materia> nuevos(ArrayList<Docente_materia> docente_materias);
	public void actualizars(ArrayList<Docente_materia> updates_docente_materias,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
	
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Docente_materia getDocente_materia1();	
	public ArrayList<Docente_materia> getDocente_materias();	
	public void setDocente_materia1(Docente_materia docente_materia1);	
	public void setDocente_materias(ArrayList<Docente_materia> docente_materias);	
	public Docente_materiaRepositoryI getDocente_materiaRepositoryI1();	
	public void setDocente_materiaRepositoryI1(Docente_materiaRepositoryI docente_materia_repositoryi1);	
}

package com.bydan.colegio.estructura.alumno_materia.application.logic;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materiaReturnViewDto;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;

public interface Alumno_materiaLogicI {					

	public ArrayList<Alumno_materia> getTodos(Pagination pagination1);	
	public ArrayList<Alumno_materia> getBuscar(Object builder_object_alumno_materia1,Pagination pagination1);	
	public ArrayList<Alumno_materia> getBuscarGeneral(Object builder_object_alumno_materia1,Pagination pagination1);	
	public Alumno_materia getBuscarUno(Long id);
	
    public Alumno_materia nuevo(Alumno_materia alumno_materia1);	
	public Alumno_materia actualizar(Alumno_materia alumno_materia1);	
	public void eliminar(Long id);
	
	public ArrayList<Alumno_materia> nuevos(ArrayList<Alumno_materia> alumno_materias);
	public void actualizars(ArrayList<Alumno_materia> updates_alumno_materias,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
			
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Alumno_materia getAlumno_materia1();	
	public ArrayList<Alumno_materia> getAlumno_materias();	
	public void setAlumno_materia1(Alumno_materia alumno_materia1);	
	public void setAlumno_materias(ArrayList<Alumno_materia> alumno_materias);		
}

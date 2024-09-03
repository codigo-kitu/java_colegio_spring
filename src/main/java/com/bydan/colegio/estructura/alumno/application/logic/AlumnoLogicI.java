package com.bydan.colegio.estructura.alumno.application.logic;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.estructura.alumno.domain.model.AlumnoReturnViewDto;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;

public interface AlumnoLogicI {					

	public ArrayList<Alumno> getTodos(Pagination pagination1);	
	public ArrayList<Alumno> getBuscar(Object builder_object_alumno1,Pagination pagination1);	
	public ArrayList<Alumno> getBuscarGeneral(Object builder_object_alumno1,Pagination pagination1);	
	public Alumno getBuscarUno(Long id);
	
    public Alumno nuevo(Alumno alumno1);	
	public Alumno actualizar(Alumno alumno1);	
	public void eliminar(Long id);
	
	public ArrayList<Alumno> nuevos(ArrayList<Alumno> alumnos);
	public void actualizars(ArrayList<Alumno> updates_alumnos,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
			
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Alumno getAlumno1();	
	public ArrayList<Alumno> getAlumnos();	
	public void setAlumno1(Alumno alumno1);	
	public void setAlumnos(ArrayList<Alumno> alumnos);		
}

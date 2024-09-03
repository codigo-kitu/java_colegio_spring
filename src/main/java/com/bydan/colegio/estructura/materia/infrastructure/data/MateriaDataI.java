package com.bydan.colegio.estructura.materia.infrastructure.data;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.materia.domain.model.Materia;
//import com.bydan.colegio.estructura.materia.domain.entity.MateriaReturnViewDto;

public interface MateriaDataI {					

	public ArrayList<Materia> getTodos(Pagination pagination1);	
	public ArrayList<Materia> getBuscar(Object builder_object_materia1,Pagination pagination1);	
	public ArrayList<Materia> getBuscarGeneral(Object builder_object_materia1,Pagination pagination1);	
	public Materia getBuscarUno(Long id);
	
    public Materia nuevo(Materia materia1);	
	public Materia actualizar(Materia materia1);	
	public void eliminar(Long id);
	
	public ArrayList<Materia> nuevos(ArrayList<Materia> materias);
	public void actualizars(ArrayList<Materia> updates_materias,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
	
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Materia getMateria1();	
	public ArrayList<Materia> getMaterias();	
	public void setMateria1(Materia materia1);	
	public void setMaterias(ArrayList<Materia> materias);	
	public MateriaRepositoryI getMateriaRepositoryI1();	
	public void setMateriaRepositoryI1(MateriaRepositoryI materia_repositoryi1);	
}

package com.bydan.colegio.financiero.sueldo.infrastructure.data;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;
//import com.bydan.colegio.financiero.sueldo.domain.entity.SueldoReturnViewDto;

public interface SueldoDataI {					

	public ArrayList<Sueldo> getTodos(Pagination pagination1);	
	public ArrayList<Sueldo> getBuscar(Object builder_object_sueldo1,Pagination pagination1);	
	public ArrayList<Sueldo> getBuscarGeneral(Object builder_object_sueldo1,Pagination pagination1);	
	public Sueldo getBuscarUno(Long id);
	
    public Sueldo nuevo(Sueldo sueldo1);	
	public Sueldo actualizar(Sueldo sueldo1);	
	public void eliminar(Long id);
	
	public ArrayList<Sueldo> nuevos(ArrayList<Sueldo> sueldos);
	public void actualizars(ArrayList<Sueldo> updates_sueldos,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
	
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Sueldo getSueldo1();	
	public ArrayList<Sueldo> getSueldos();	
	public void setSueldo1(Sueldo sueldo1);	
	public void setSueldos(ArrayList<Sueldo> sueldos);	
	public SueldoRepositoryI getSueldoRepositoryI1();	
	public void setSueldoRepositoryI1(SueldoRepositoryI sueldo_repositoryi1);	
}

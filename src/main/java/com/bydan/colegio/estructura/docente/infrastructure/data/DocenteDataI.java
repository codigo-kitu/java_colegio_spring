package com.bydan.colegio.estructura.docente.infrastructure.data;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

import com.bydan.colegio.estructura.docente.domain.model.Docente;
//import com.bydan.colegio.estructura.docente.domain.entity.DocenteReturnViewDto;

public interface DocenteDataI {					

	public ArrayList<Docente> getTodos(Pagination pagination1);	
	public ArrayList<Docente> getBuscar(Object builder_object_docente1,Pagination pagination1);	
	public ArrayList<Docente> getBuscarGeneral(Object builder_object_docente1,Pagination pagination1);	
	public Docente getBuscarUno(Long id);
	
    public Docente nuevo(Docente docente1);	
	public Docente actualizar(Docente docente1);	
	public void eliminar(Long id);
	
	public ArrayList<Docente> nuevos(ArrayList<Docente> docentes);
	public void actualizars(ArrayList<Docente> updates_docentes,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
	
	
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Docente getDocente1();	
	public ArrayList<Docente> getDocentes();	
	public void setDocente1(Docente docente1);	
	public void setDocentes(ArrayList<Docente> docentes);	
	public DocenteRepositoryI getDocenteRepositoryI1();	
	public void setDocenteRepositoryI1(DocenteRepositoryI docente_repositoryi1);	
}

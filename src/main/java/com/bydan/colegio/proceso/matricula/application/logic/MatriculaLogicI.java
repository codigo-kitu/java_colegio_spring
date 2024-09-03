package com.bydan.colegio.proceso.matricula.application.logic;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.proceso.matricula.domain.model.MatriculaReturnViewDto;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;

public interface MatriculaLogicI {					

	public ArrayList<Matricula> getTodos(Pagination pagination1);	
	public ArrayList<Matricula> getBuscar(Object builder_object_matricula1,Pagination pagination1);	
	public ArrayList<Matricula> getBuscarGeneral(Object builder_object_matricula1,Pagination pagination1);	
	public Matricula getBuscarUno(Long id);
	
    public Matricula nuevo(Matricula matricula1);	
	public Matricula actualizar(Matricula matricula1);	
	public void eliminar(Long id);
	
	public ArrayList<Matricula> nuevos(ArrayList<Matricula> matriculas);
	public void actualizars(ArrayList<Matricula> updates_matriculas,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
			
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Matricula getMatricula1();	
	public ArrayList<Matricula> getMatriculas();	
	public void setMatricula1(Matricula matricula1);	
	public void setMatriculas(ArrayList<Matricula> matriculas);		
}

package com.bydan.colegio.proceso.nota.application.logic;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.proceso.nota.domain.model.NotaReturnViewDto;

import com.bydan.colegio.proceso.nota.domain.model.Nota;

public interface NotaLogicI {					

	public ArrayList<Nota> getTodos(Pagination pagination1);	
	public ArrayList<Nota> getBuscar(Object builder_object_nota1,Pagination pagination1);	
	public ArrayList<Nota> getBuscarGeneral(Object builder_object_nota1,Pagination pagination1);	
	public Nota getBuscarUno(Long id);
	
    public Nota nuevo(Nota nota1);	
	public Nota actualizar(Nota nota1);	
	public void eliminar(Long id);
	
	public ArrayList<Nota> nuevos(ArrayList<Nota> notas);
	public void actualizars(ArrayList<Nota> updates_notas,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
			
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Nota getNota1();	
	public ArrayList<Nota> getNotas();	
	public void setNota1(Nota nota1);	
	public void setNotas(ArrayList<Nota> notas);		
}

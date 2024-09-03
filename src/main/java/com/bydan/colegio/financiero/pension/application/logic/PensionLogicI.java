package com.bydan.colegio.financiero.pension.application.logic;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.pension.domain.model.PensionReturnViewDto;

import com.bydan.colegio.financiero.pension.domain.model.Pension;

public interface PensionLogicI {					

	public ArrayList<Pension> getTodos(Pagination pagination1);	
	public ArrayList<Pension> getBuscar(Object builder_object_pension1,Pagination pagination1);	
	public ArrayList<Pension> getBuscarGeneral(Object builder_object_pension1,Pagination pagination1);	
	public Pension getBuscarUno(Long id);
	
    public Pension nuevo(Pension pension1);	
	public Pension actualizar(Pension pension1);	
	public void eliminar(Long id);
	
	public ArrayList<Pension> nuevos(ArrayList<Pension> pensions);
	public void actualizars(ArrayList<Pension> updates_pensions,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
			
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Pension getPension1();	
	public ArrayList<Pension> getPensions();	
	public void setPension1(Pension pension1);	
	public void setPensions(ArrayList<Pension> pensions);		
}

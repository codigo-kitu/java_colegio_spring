package com.bydan.colegio.financiero.contrato.application.logic;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

//import com.bydan.colegio.financiero.contrato.domain.model.ContratoReturnViewDto;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;

public interface ContratoLogicI {					

	public ArrayList<Contrato> getTodos(Pagination pagination1);	
	public ArrayList<Contrato> getBuscar(Object builder_object_contrato1,Pagination pagination1);	
	public ArrayList<Contrato> getBuscarGeneral(Object builder_object_contrato1,Pagination pagination1);	
	public Contrato getBuscarUno(Long id);
	
    public Contrato nuevo(Contrato contrato1);	
	public Contrato actualizar(Contrato contrato1);	
	public void eliminar(Long id);
	
	public ArrayList<Contrato> nuevos(ArrayList<Contrato> contratos);
	public void actualizars(ArrayList<Contrato> updates_contratos,ArrayList<String> updates_columnas);	
	public void eliminars(ArrayList<Long> ids);
			
	public Object getBuilderFunctionObjectParametroSeleccionar(Long id);	
	public Object getBuilderFunctionObjectParametroBuscar(Object req);
	
	public Contrato getContrato1();	
	public ArrayList<Contrato> getContratos();	
	public void setContrato1(Contrato contrato1);	
	public void setContratos(ArrayList<Contrato> contratos);		
}

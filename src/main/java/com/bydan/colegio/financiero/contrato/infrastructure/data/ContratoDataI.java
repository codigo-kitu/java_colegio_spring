package com.bydan.colegio.financiero.contrato.infrastructure.data;

import java.util.ArrayList;
/*import java.util.Optional;*/

import com.bydan.colegio.base.application.logic.Pagination;
//import com.bydan.base.util.TipoAccionEnum;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;
//import com.bydan.colegio.financiero.contrato.domain.entity.ContratoReturnViewDto;

public interface ContratoDataI {					

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
	public ContratoRepositoryI getContratoRepositoryI1();	
	public void setContratoRepositoryI1(ContratoRepositoryI contrato_repositoryi1);	
}

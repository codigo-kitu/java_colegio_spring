package com.bydan.colegio.base.domain.entity.global;

public class GeneralEntityGlobal {
	
	//_id: number;
    public Long id_table;

    public GeneralEntityGlobal() {
        //this._id=0;
        this.id_table = 0L;
    }

    public Long getId_table() {
        return this.id_table;
    }
    
    public void setId_table(Long id_table) {
        this.id_table = id_table;
    }
}
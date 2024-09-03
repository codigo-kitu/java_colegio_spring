package com.bydan.colegio.base.application.logic;

import com.bydan.colegio.base.util.Constantes;

public class Pagination {
	
	private Integer skip=0;
    private Integer limit=0;

    public Pagination() {
        this.skip = 0;
        this.limit = Constantes.LIMIT;
    }

    public Integer getSkip() {
        return this.skip;
    }

    public void setSkip(Integer skip1) {
        this.skip = skip1;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit1) {
        this.limit = limit1;
    }

    @Override
    public String toString() {        
        return this.skip+","+this.limit;
    }
}
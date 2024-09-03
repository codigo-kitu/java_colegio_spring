package com.bydan.colegio.base.application.logic.global;

import com.bydan.colegio.base.application.logic.Pagination;

public class PaginationGlobal {
	
	private Pagination pagination;    

    public PaginationGlobal() {
        this.pagination = new Pagination();        
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public void setPagination(Pagination pagination1) {
        this.pagination = pagination1;
    }

    @Override
    public String toString() {        
        return this.pagination.getSkip()+","+this.pagination.getLimit();
    }
}
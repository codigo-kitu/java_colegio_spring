package com.bydan.colegio.estructura.materia.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.bydan.colegio.estructura.materia.domain.model.Materia;

import com.bydan.colegio.estructura.materia.application.logic.MateriaLogicI;
import com.bydan.colegio.estructura.materia.infrastructure.data.MateriaDataI;
import com.bydan.colegio.estructura.materia.infrastructure.data.MateriaRepositoryI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
//@SpringBootTest
class MateriaIntegrationTest {
	
	//@Autowired
    //TestEntityManager entityManager;
	
	Materia materia0;
		
	@Autowired
	private MateriaRepositoryI materia_repositoryi1;	
		
	@Autowired
	MateriaLogicI materia_logici1;
	
	//@Autowired
	//MateriaDataI materia_datai1;
	
	@Test
    public void test_repository() {
		
        this.materia0 = new Materia(); 		
        materia0.setId(1L);
        
        Optional<Materia> materia1 = materia_repositoryi1.findById(1L);
        
		assertEquals(this.materia0.getId(),materia1.get().getId());						
    }
	
	@Test
    public void test_logic() {
		
		this.materia0 = new Materia(); 		
        materia0.setId(1L);
        		
		Materia materia3 = this.materia_logici1.getBuscarUno(1L);
        
		assertEquals(this.materia0.getId(),materia3.getId());
	}
	
	/*
	@Test
    public void test_data() {
		
		this.materia0 = new Materia(); 		
        materia0.setId(1L);
        
		//this.materia_data1 = new MateriaData();		
		//this.materia_data1.setMateriaRepositoryI1(materia_repositoryi1);
		
		Materia materia2 = this.materia_datai1.getBuscarUno(1L);
        
		assertEquals(this.materia0.getId(),materia2.getId());
	}
	*/
	
	//test_logic()
	
	//this.materia_logic1 = new MateriaLogic();		
	//this.materia_logic1.setMateriaDataI(new MateriaData());		
	//this.materia_logic1.getMateriaDataI().setMateriaRepositoryI1(materia_repositoryi1);
		
	//./gradlew test
}
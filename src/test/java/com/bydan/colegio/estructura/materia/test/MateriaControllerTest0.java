package com.bydan.colegio.estructura.materia.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.Optional;

/*import org.springframework.boot.test.context.SpringBootTest;*/

//@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(MateriaController.class)
class MateriaControllerTest0 {
	
	@Autowired
    MockMvc mockMvc;
		
	//@MockBean
	//private MateriaLogicI materia_logicI;	
	
	@Test
    public void test_general() throws Exception {
		
		/*
		ArrayList<Materia> materias = new ArrayList<Materia>();
		materias.add(new Materia());						
		
        Mockito.when(materia_logicI.getTodos(new Pagination())).thenReturn(materias);
        */
        
        MvcResult mvcResult = mockMvc.perform(get("/api/colegio/estructura/materia_api/index_get")).andReturn();
        
        System.out.println("---------> " + mvcResult.getResponse().getStatus());
        
        assertEquals(200,mvcResult.getResponse().getStatus());
    }
	
	//./gradlew test
}
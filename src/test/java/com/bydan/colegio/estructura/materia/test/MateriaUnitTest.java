package com.bydan.colegio.estructura.materia.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*import org.springframework.boot.test.context.SpringBootTest;*/

import com.bydan.colegio.estructura.materia.domain.model.Materia;

/*@SpringBootTest*/
class MateriaUnitTest {
	
	@Test
    public void test_general() {
        String name = "Java";
		
		assertEquals("Java",name);
    }
	
	@Test
    public void test_materia() {
        Materia materia1 = new Materia();
		
		materia1.setId(5L);
		
		assertEquals(5L,materia1.getId());
    }
	
	//./gradlew test
}
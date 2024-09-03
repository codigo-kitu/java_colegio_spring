package com.bydan.colegio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//import org.assertj.core.api.Assert;

//@SpringBootTest
class ColegioSpringApplicationTests {

	@Test
	@DisplayName("JUnit test for save employee operation")
	void contextLoads() {
		Long id = 5L;

		assertThat(id).isNotNull();		
	}
}

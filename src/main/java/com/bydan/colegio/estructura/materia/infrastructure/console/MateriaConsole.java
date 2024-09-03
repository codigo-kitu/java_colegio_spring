package com.bydan.colegio.estructura.materia.infrastructure.console;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
/*import org.springframework.boot.autoconfigure.SpringBootApplication;*/

/*@SpringBootApplication*/
public class MateriaConsole implements CommandLineRunner {
	
    private static Logger LOG = LoggerFactory.getLogger(MateriaConsole.class);
	
	public static void main(String[] args) {
		
		LOG.info("STARTING THE APPLICATION");
		
		/* WEB SERVER START */
        SpringApplication.run(MateriaConsole.class, args);
        
        LOG.info("APPLICATION FINISHED");
	}
	
	@Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
        
        List<Integer> list1 = Arrays.asList(1, 2, 3,4,5);
		
        int j=0;
        
        for(int i : list1) {
            LOG.info("list1[{}]: {}", j++, i);
        }
    }
}
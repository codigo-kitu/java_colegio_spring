package com.bydan.colegio.estructura.alumno_materia.domain.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

/*FKs*/

/*RELACIONES*/

@Entity
@Table(name = "alumno_materia")
@Getter
@Setter
@AllArgsConstructor
public class Alumno_materia {
	//extends general_entity 	
	public static String ALUMNO_MATERIA="alumno_materia";
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "created_at")
	@CreatedDate
	private Date created_at;
	
	@Column(name = "updated_at")
	@LastModifiedDate
	private Date updated_at;
	
	/*CAMPOS*/
	
	@Column(name = "id_alumno")
	private Long id_alumno;	
	
	@Column(name = "id_materia")
	private Long id_materia;	
	
	public Alumno_materia() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.id_materia=-1L;
	}
	
	//FKs
	
	//RELACIONES
}


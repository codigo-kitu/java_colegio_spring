package com.bydan.colegio.estructura.alumno.domain.model;

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
@Table(name = "alumno")
@Getter
@Setter
@AllArgsConstructor
public class Alumno {
	//extends general_entity 	
	public static String ALUMNO="alumno";
	
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
	
	@Column(name = "nombre")
	private String nombre;	
	
	@Column(name = "apellido")
	private String apellido;	
	
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;	
	
	public Alumno() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.nombre="";
 		this.apellido="";
 		this.fecha_nacimiento=new Date();
	}
	
	//FKs
	
	//RELACIONES
}


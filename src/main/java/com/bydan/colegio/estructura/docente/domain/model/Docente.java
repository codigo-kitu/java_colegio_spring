package com.bydan.colegio.estructura.docente.domain.model;

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
@Table(name = "docente")
@Getter
@Setter
@AllArgsConstructor
public class Docente {
	//extends general_entity 	
	public static String DOCENTE="docente";
	
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
	
	@Column(name = "anios_experiencia")
	private Integer anios_experiencia;	
	
	@Column(name = "nota_evaluacion")
	private Double nota_evaluacion;	
	
	public Docente() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.nombre="";
 		this.apellido="";
 		this.fecha_nacimiento=new Date();
 		this.anios_experiencia=0;
 		this.nota_evaluacion=0.0;
	}
	
	//FKs
	
	//RELACIONES
}


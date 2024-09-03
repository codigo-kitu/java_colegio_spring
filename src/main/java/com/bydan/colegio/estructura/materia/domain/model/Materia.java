package com.bydan.colegio.estructura.materia.domain.model;

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
@Table(name = "materia")
@Getter
@Setter
@AllArgsConstructor
public class Materia {
	//extends general_entity 	
	public static String MATERIA="materia";
	
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
	
	@Column(name = "codigo")
	private String codigo;	
	
	@Column(name = "nombre")
	private String nombre;	
	
	@Column(name = "activo")
	private Boolean activo;	
	
	public Materia() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.codigo="";
 		this.nombre="";
 		this.activo=false;
	}
	
	//FKs
	
	//RELACIONES
}


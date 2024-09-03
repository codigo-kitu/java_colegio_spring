package com.bydan.colegio.financiero.sueldo.domain.model;

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
@Table(name = "sueldo")
@Getter
@Setter
@AllArgsConstructor
public class Sueldo {
	//extends general_entity 	
	public static String SUELDO="sueldo";
	
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
	
	@Column(name = "id_docente")
	private Long id_docente;	
	
	@Column(name = "anio")
	private Integer anio;	
	
	@Column(name = "mes")
	private Short mes;	
	
	@Column(name = "valor")
	private Double valor;	
	
	@Column(name = "cobrado")
	private Boolean cobrado;	
	
	public Sueldo() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.id_docente=-1L;
 		this.anio=0;
 		this.mes=Short.parseShort("0");
 		this.valor=0.0;
 		this.cobrado=false;
	}
	
	//FKs
	
	//RELACIONES
}


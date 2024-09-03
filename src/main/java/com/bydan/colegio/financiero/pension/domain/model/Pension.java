package com.bydan.colegio.financiero.pension.domain.model;

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
@Table(name = "pension")
@Getter
@Setter
@AllArgsConstructor
public class Pension {
	//extends general_entity 	
	public static String PENSION="pension";
	
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
	
	@Column(name = "anio")
	private Integer anio;	
	
	@Column(name = "mes")
	private Short mes;	
	
	@Column(name = "valor")
	private Double valor;	
	
	@Column(name = "cobrado")
	private Boolean cobrado;	
	
	public Pension() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.anio=0;
 		this.mes=Short.parseShort("0");
 		this.valor=0.0;
 		this.cobrado=false;
	}
	
	//FKs
	
	//RELACIONES
}


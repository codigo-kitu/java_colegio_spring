package com.bydan.colegio.financiero.contrato.domain.model;

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
@Table(name = "contrato")
@Getter
@Setter
@AllArgsConstructor
public class Contrato {
	//extends general_entity 	
	public static String CONTRATO="contrato";
	
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
	
	@Column(name = "anio")
	private Integer anio;	
	
	@Column(name = "valor")
	private Double valor;	
	
	@Column(name = "fecha")
	private Date fecha;	
	
	@Column(name = "firmado")
	private Boolean firmado;	
	
	public Contrato() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.anio=0;
 		this.valor=0.0;
 		this.fecha=new Date();
 		this.firmado=false;
	}
	
	//FKs
	
	//RELACIONES
}


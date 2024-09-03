package com.bydan.colegio.proceso.nota.domain.model;

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
@Table(name = "nota")
@Getter
@Setter
@AllArgsConstructor
public class Nota {
	//extends general_entity 	
	public static String NOTA="nota";
	
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
	
	@Column(name = "id_docente")
	private Long id_docente;	
	
	@Column(name = "nota_prueba")
	private Double nota_prueba;	
	
	@Column(name = "nota_trabajo")
	private Double nota_trabajo;	
	
	@Column(name = "nota_examen")
	private Double nota_examen;	
	
	@Column(name = "nota_final")
	private Double nota_final;	
	
	public Nota() {
		//super();
		
		this.id=0L;
		
		/*CAMPOS*/
 		this.id_alumno=-1L;
 		this.id_materia=-1L;
 		this.id_docente=-1L;
 		this.nota_prueba=0.0;
 		this.nota_trabajo=0.0;
 		this.nota_examen=0.0;
 		this.nota_final=0.0;
	}
	
	//FKs
	
	//RELACIONES
}


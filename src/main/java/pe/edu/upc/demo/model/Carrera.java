package pe.edu.upc.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carreras")
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
	private List<Estudiante> estudiantes;
	
	@ManyToMany(mappedBy = "carreras")
	private List<Sede> sedes;
	
	public Carrera() {
		this.estudiantes = new ArrayList<>();
		this.sedes = new ArrayList<>();
	}
}




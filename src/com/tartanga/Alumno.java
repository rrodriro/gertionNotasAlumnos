package com.tartanga;

public class Alumno {
	
	private String nomAlumno;
	private float notaAlumno;
	
	
	public Alumno(String nomAlumno, float notaAlumno) {
		super();
		this.nomAlumno = nomAlumno;
		this.notaAlumno = notaAlumno;
	}
	
	public Alumno() {
		this.nomAlumno = "";
		this.notaAlumno = 0;
	}

	public String getNomAlumno() {
		return nomAlumno;
	}

	public void setNomAlumno(String nomAlumno) {
		this.nomAlumno = nomAlumno;
	}

	public float getNotaAlumno() {
		return notaAlumno;
	}

	public void setNotaAlumno(float notaAlumno) {
		this.notaAlumno = notaAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [nomAlumno=" + nomAlumno + ", notaAlumno=" + notaAlumno + "]";
	}

	
}

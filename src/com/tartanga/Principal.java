package com.tartanga;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//Creo varios alumnos
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		
		Alumno nuevo = new Alumno("Paco", 5);	
		listaAlumnos.add(nuevo);
	
		listaAlumnos.add(new Alumno("Laura", 10));
		listaAlumnos.add(new Alumno("Paula", 8));
		listaAlumnos.add(new Alumno("Raul", 4));
		listaAlumnos.add(new Alumno("Alain", 3));
		listaAlumnos.add(new Alumno("Alain", 3));
		
		for (Alumno p:listaAlumnos) {
			
			System.out.println(p.toString());
			
		}

	}

}

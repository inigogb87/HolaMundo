package com.ipartek.formacion.holamundo.pruebas;

import com.ipartek.formacion.holamundo.pojo.Alumno;

public class ParImpar {
	
	public static void main(String[]args){
	System.out.println("ejercicio ParImpar");
	
	for(int i=0;i<=10;i++){
		if(i%2==0){
			System.out.println("el numero " + i + " es par");
		}
		else{
			System.out.println("el numero " + i + " es inpar");
		
		
		}
	}
	
	
	System.out.println("terminar ParImpar");
	
	Alumno a1 = new Alumno("manolo");
	Alumno a2 = new Alumno("manolita");
	Alumno a3 = new Alumno("eufrasio");
	System.out.println(a1.toString());
	System.out.println(a1.getNombre() + " despues de cambiarde nombre y apellido");
	a1.setNombre("manoli");
	a1.setApellidos("livingston");
	System.out.println(a1.toString());
	
	
	
	
	
	
}
	}


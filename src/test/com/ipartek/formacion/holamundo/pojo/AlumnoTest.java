package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;

import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
	
		Alumno a = new Alumno();		
				assertTrue ("No coincide nombre", Alumno.NOMBRE_ANONIMO.equals( a.getNombre() ) ); 
				assertEquals ("No coincide nombre", Alumno.NOMBRE_ANONIMO,  a.getNombre()  ); 
				assertEquals ("Apellido deberia ser vacio", "" ,  a.getApellidos()  );
				assertFalse ( "No deberia ser becado",a.isBecado() );
				assertEquals ("No es la edad correcta", Alumno.EDAD_INICIAL ,  a.getEdad()  );
				assertEquals ("No el sexo correcto", Alumno.SEXO_INDEFINIDO, a.getSexo() );
	}
	@Test
	public void ConstructorConParametros() {
		
		
		Alumno a = new Alumno("manolo");	
				assertEquals ("No coincide nombre", "Manolo",  a.getNombre()  ); //get para strings
				assertEquals ("Apellido deberia ser vacio", "" ,  a.getApellidos()  );
				assertFalse ( "No deberia ser becado",a.isBecado() );//is para booleanos
				assertEquals ("No es la edad correcta", Alumno.EDAD_INICIAL ,  a.getEdad()  );
				assertEquals ("No el sexo correcto", Alumno.SEXO_INDEFINIDO, a.getSexo() );
		 		
				a = new Alumno(null);	
				assertEquals ("No coincide nombre", Alumno.NOMBRE_SIN_DEFINIR ,  a.getNombre()  ); 
				
				a = new Alumno("");	
				assertEquals ("No coincide nombre", Alumno.NOMBRE_SIN_DEFINIR ,  a.getNombre()  );
		 		
		
	}

	@Test
	public void testSetNombre() {
		Alumno a = new Alumno();
		a.setNombre("manolito");
		assertEquals("no coincide nombre", "Manolito", a.getNombre() );
		
		a.setNombre(null);
		assertEquals("no coincide nombre",Alumno.NOMBRE_SIN_DEFINIR , a.getNombre() );
		
		a.setNombre("");
		assertEquals("no coincide nombre", Alumno.NOMBRE_SIN_DEFINIR , a.getNombre() );
		
	}

	@Test
	public void testIsMayorEdad() {
		Alumno a = new Alumno();
		
		a.setEdad(-7);
		assertFalse (a.isMayorEdad());
		
		a.setEdad(7);
		assertFalse (a.isMayorEdad());
		
		a.setEdad(18);
		assertTrue (a.isMayorEdad());
		
		a.setEdad(22);
		assertTrue (a.isMayorEdad());
		
	}

}

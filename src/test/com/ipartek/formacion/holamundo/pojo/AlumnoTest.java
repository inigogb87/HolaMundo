package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;

import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
	
	Alumno a = new Alumno();
	assertTrue("no coincide nombre",Alumno.NOMBRE_ANONIMO.equals(a.getNombre() ) );
	//assertTrue(a.getApellidos());
	assertFalse(a.isBecado());
	assertTrue(a.getEdad()==0);
	assertTrue(a.getSexo()==Alumno.SEXO_INDEFINIDO);
	
	}
	@Ignore
	public void testAlumnoString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
	}

}

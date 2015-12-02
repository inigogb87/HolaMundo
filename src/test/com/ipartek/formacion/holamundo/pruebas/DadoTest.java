package com.ipartek.formacion.holamundo.pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DadoTest {
	

	public void testGenerarNumero(){
		int numAle =-1;
		for (int i = 0; i < 1000; i++) {
			
			numAle=Dado.generarNumero();
			if( numAle == Dado.Numero_Alumnos){
				fail("debe ser un numero menor");
				
			}
			assertTrue(numAle>=0 && numAle<=Dado.Numero_Alumnos);
		}
	}
	
}

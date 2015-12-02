package com.ipartek.formacion.holamundo.pruebas;

import java.util.Random;

/**
 * clase java para simular un dado y sacar un alumno de modo aleatorio
 * @author Curso
 *
 */

public class Dado {
	/**
	 * variable para representar el numero de alumnos
	 * static: solo se reserva memoria una vez
	 * final: no es modificable
	 * int: tipo integer, numero entero
	 * 
	 */
	public static final int Numero_Alumnos =15;
	public static final String Nombre_Alumnos[]={
													"david ibarzabal",
													"Oscar",
													"Gorka",
													"Ariane",
													"Gontzal",
													"Aitor",
													"Santi",
													"Raul",
													"David Ortiz",
													"Sergio",
													"David Barbudo",
													"Edorta",
													"Asier",
													"Alberto",
													"Iñigo"}; 
		/**
		 * Muestra por consola todos los alumnos de variable <code>Nombre_Alumnos</code>.<br>
		 * ejemplo
		 * <ul>
		 * <li>[0]david ibarzabal
		 * <li>[1]Oscar
		 * <li>[x].......
		 * <li>[x].......
		 * <li>[x].......
		 * <li>[14]Iñigo
		 * </ul>
		 */
	
	public static void mostrarAlumnos(){
		
		//todo implementar metodo
		for(int i=0; i < Nombre_Alumnos.length;i++){
		
			System.out.println("["+ i +"]"+ Nombre_Alumnos[i]);
			
			
		}//end for
		
	}
	
	/**
	 * genera numero aleatorio entre 0 y <code>NUMERO_ALUMNOS</CODE>
	 * @return numero entero, si falla -1
	 */
	public static int generarNumero(){
		int resul=-1;
		//todo implementar metodo
		Random random= new Random();
		
		resul = random.nextInt(Numero_Alumnos);
		
		return resul;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarAlumnos();
	mostrarAfortunado();
	
	}
/**
 * Obtenemos un afortunado o voluntario para leer de forma aleatoria
 * @return Nombre del afortunado, en caso e fallo de retorno
 * 
	public static String mostrarAfortunado(){
		String resul="No hay afortunado";
		resul=NOMBRES_ALUMNOS[numAleatorio];
		return resul;
	}
/**	
 * Obtenemos un afortunado de forma aleatoria segun el numero que pasamos por parametros
 * @param numeroAleatorio<code> int</code> numero aleatorio que debe estar dentro del rango 0-(<code>NUMERO_ALUMNOS</CODE>
 * @return Nombre del afortunado, en caso e fallo de retorno
 * 
 
	public static String mostrarAfortunado(int numeroAleatorio){
		String resul="No hay afortunado";
		resul=NOMBRES_ALUMNOS[numAleatorio];
		return resul;
	}
	*/
	
	public static void mostrarAfortunado() {
		System.out.println("el afortunado en leer es:");
		
		//TODO obtener numero aleatorio
		int alumnoAfortunado=generarNumero();
		/**alumnoAfortunado=6;*/
		System.out.println(Nombre_Alumnos[alumnoAfortunado]);
	}

}

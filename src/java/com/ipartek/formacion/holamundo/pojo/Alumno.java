package com.ipartek.formacion.holamundo.pojo;
import java.util.*;
import com.sun.java_cup.internal.runtime.Scanner;

/**
 * 
 * Clase instanciable de tipo POJO o BEAN para representar a un <code>Alumno</code>de un curso
 * 
 * @author Curso
 *
 */
public class Alumno {
public static final String NOMBRE_ANONIMO  ="Anonimo" ;
public static final String NOMBRE_SIN_DEFINIR  ="Anonimo" ;

public static final int EDAD_INICIAL=0;
public static final int EDAD_MINIMA=18;

public static final char SEXO_HOMBRE  ='H';
public static final char SEXO_MUJER  ='M';
public static final char SEXO_INDEFINIDO  ='I';
//atributos

	
	private String nombre;
	private String apellidos;
	private boolean becado;
	private int edad;
	private char sexo;//"h":hombre "M":mujer, "i":indefinido
	
	/**
	//constructores
	public Alumno(String pnombre) {
		super();
		this.nombre = pnombre;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	

	
	//otras funciones
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	}*/
	
	//constructores
	
	/**
	 * Un <code>alumno</code>recien instanciado tendra los siguientes valores:
	 * <ul>
	 * <li><code>nombre</code> NOMBRE_ANONIMO</li>
	 * <li><code>apellidos</code> </li>
	 * <li><code>becado</code> NOMBRE_ANONIMO</li>
	 * <li><code>edad</code> </li>
	 * <li><code>sexo</code> </li>
	 */
		public Alumno() {
			super();
			this.nombre = NOMBRE_ANONIMO;
			this.apellidos="";	
			this.sexo=SEXO_INDEFINIDO;
			this.becado=false;
		}

		public Alumno(String nombre) {
			this();
			setNombre(nombre);
		}
		
		//getters y setters
		public String getNombre() {
			return nombre;
		}
		/**
		 * Guardamos eel nombre con la primera inicial en mayusculas<br>
		 * si el nombre es null o cadena vacia guardar "sin definir"
		 * @param nombre <string>nombre de la persona a guardar
		 */

		public void setNombre(String nombre) {
			if(nombre==null || "".equals(nombre)){
				this.nombre=NOMBRE_SIN_DEFINIR;
			}else{
			//primera inicial mayusculas
				
				//1.convertir en array de caracteres
				char[]  caracteres= nombre.toCharArray();
				
				//2.convertir el primer caracter
				caracteres[0] = Character.toUpperCase(caracteres[0]);
				
				//3.Volver a convertir a string el array de caracteres
				this.nombre = String.valueOf(caracteres);
			}
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public boolean isBecado() {
			return becado;
		}

		public void setBecado(boolean becado) {
			this.becado = becado;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		//otras funciones

		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", becado=" + becado + ", edad=" + edad
					+ ", sexo=" + sexo + "]";
			
		}
		/**
		 * Comprueba si es mayor de edad
		 * @return si>18, false en caso contrario
		 */
		public boolean isMayorEdad(){
			boolean resul =false;
		    if (this.edad >=EDAD_MINIMA){
		    	   resul=true;
		       }
		return resul;	
		}
		
		
}
	

		
		
		

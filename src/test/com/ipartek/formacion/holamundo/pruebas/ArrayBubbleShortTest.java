package com.ipartek.formacion.holamundo.pruebas;

import java.util.Arrays;

public class ArrayBubbleShortTest {

 public static void main(String args[]){
		
	/**	int numeros[] = {5,10,3,0,7,-3};
		                System.out.println("sin ordenar");
		                for( int numero:numeros)
		                  System.out.print(numero+" ");
		               Arrays.sort(numeros);
		                 System.out.println("\nordenados");
		                 for(int numero:numeros)
		                     System.out.print(numero + " ");*/
	 
	

     int intArray[] = new int[]{5,10,3,0,7,-3};
    
     System.out.println("desordenado");
     for(int i=0; i < intArray.length; i++){
             System.out.print(intArray[i] + " ");
     }
    ArrayBubbleSort(intArray);
  System.out.println("\nordenado");
     for(int i=0; i < intArray.length; i++){
             System.out.print(intArray[i] + " ");
     }

}

private static void ArrayBubbleSort(int[] intArray) {
int n = intArray.length;
     int aux = 0;
    for(int i=0; i < n; i++){
             for(int j=1; j < (n-i); j++){
                    if(intArray[j-1] > intArray[j]){//si el de la izkierda es mayor que el de la derecha
                              aux = intArray[j-1];//y repetimos en un bucle hasta ordenar
                             intArray[j-1] = intArray[j];
                             intArray[j] = aux;
                     }
                    
             }
     }    
	 
		                
		                
		  
		
 }	
	}


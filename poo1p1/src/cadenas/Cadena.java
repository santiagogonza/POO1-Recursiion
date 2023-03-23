/**************************************
 * Autor: Gonzalo Santiago Garcia	  *
 * Fecha Creación: 23/03/2023		  *
 * Fecha Actualizacón: 23/03/2023	  *
 * Descripción:operaciones con cadenas*
 **************************************/
package cadenas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cadena {
	
	public static void main(String[] args) {
		//tres tipos d objetos en java
		//1.- String
		//2.- StringBuilder
		//3.- arreglo de chars
		
		String cadena = "Programación OO";
		System.out.println("Cadena:" +cadena);
		
		//Método 1 toUpperCase
		System.out.println("convertir a Mayusula: "+ cadena.toUpperCase());
		
		//Método 2 toLowerCase
		System.out.println("convertir en minuscula: "+cadena.toLowerCase());
		//System.out.println("Cadena: "+cadena);
		
		//Método 3 length
		System.out.println("Tamaño cadena: "+cadena.length());
		
		//Método 4 equals
		System.out.println("Comparar cadena: "+cadena.equals("Programación OO"));
		System.out.println("Comparar cadena: "+cadena.equals("Programación O"));
		
		//Método 5 compareto
		System.out.println("Compara: "+cadena.compareTo("Programación OO"));
		
		//Método 6 equalsIgnoreCase
		System.out.println("Comparar sin importar M o m: "+cadena.equalsIgnoreCase("Programación OO"));
		
		//Método 7 contains  compara si tiene un texto o una letra
		System.out.println("Contiene: "+cadena.contains("Prog"));
		
		//Método 8 indexOf
		System.out.println("Retorna una posisción: "+cadena.indexOf(114)); // puede ser un numero o un caracter 'm'
		
		//Método 9 lastIndexof
		System.out.println("Retorna Posición: "+cadena.lastIndexOf('a'));
		
		//Método 10 charAt | extrae un caracter
		System.out.println("Extraer caracter: "+cadena.charAt(10));
		
		//Método 11 getChar
		char arrayChar[] = new char [12];
		cadena.getChars(0, 12, arrayChar, 0);
		
		System.out.println("Extraer caracteres: "+Arrays.toString(arrayChar));

		//Método 12 subString
		System.out.println("Extraer cadenas: "+cadena.substring(13,15));
		
		
	}

}

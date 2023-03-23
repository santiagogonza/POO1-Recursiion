/**************************************
 * Autor: Gonzalo Santiago Garcia	  *
 * Fecha Creación: 17/03/2023		  *
 * Fecha Actualizacón: 17/03/2023	  *
 * Descripción: recorrido de un 	  *
 * 				arreglo unidimensinal *
 **************************************/
package arreglos;

public class Arreglos {
	private byte arregloByte[] = {7,6,5,4,3,2,1,0};
	private short arregloShort[] = {2,4,6,8,10};
	private char arregloChar[] = {'H','O','L','A','J','A','V','A'};
	private int arregloInt[] =new int[10];
	private long arregloLong[] = new long[3];
	
	private static char arregloPal[] = {'a','n','i','t','a','l','a','v','a','l','a','t','i','n','a'};
	private static boolean esPalindromo = true;	
	
	public static void main(String[] args) {
		 for(int i =0,j= 14; i<7; i++, j--) {
			 
			 if(arregloPal[i] !=arregloPal[j]) {
				 esPalindromo = false;
				break;	
			}
	}
		 
		 if (esPalindromo) {
			System.out.println("es palindromo.");
		}else {
			System.out.println("no es palindromo.");
		}
	
	}
}
 
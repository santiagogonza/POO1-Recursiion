package ejercicio1;

import java.util.Scanner;

public class EntradaSalidaDatos {
	//Atributos de la clase
	
	//El constructor de la clase 
		
	//Metodos 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Mi primer código de java\n");
		
		System.out.print("Ingresa un dato de tipo  byte\n");
		byte valByte = entrada.nextByte();
		
		System.out.print("Ingresa un dato de tipo  short");
		short valShort = entrada.nextShort();
		
		System.out.print("Ingresa un dato de tipo  int");
		int valInt= entrada.nextInt();
		
		System.out.print("Ingresa un dato de tipo  long");
		long valLong = entrada.nextLong();
		
		System.out.print("Ingresa un dato de tipo float");
		float valFloat = entrada.nextFloat();
		
		System.out.print("Ingresa un dato de tipo  double");
		double valDouble = entrada.nextDouble();
		
		System.out.print("Ingresa un dato de tipo  char");
		char valChar = entrada.next().charAt(0);
		
		System.out.print("Ingresa un dato de tipo  boolean");
		boolean valBoolean = entrada.nextBoolean();
		
		System.out.print("byte:" +valByte);
		System.out.print("short:" +valShort);
		System.out.print("int:" +valInt);
		System.out.print("long:" +valLong);
		System.out.print("float:" +valFloat);
		System.out.print("Double:" +valDouble);
		System.out.print("char:" +valChar);
		System.out.print("boolean:" +valBoolean);
		
		
	/**
	 * 	Tipo 	Tamaño 	Valor mínimo 	Valor máximo
		byte 	8 bits 	-128 	127
		short 	16 bits 	-32768 	32767
		int 	32 bits 	-2147483648 	2147483647
		long 	64 bits 	-9223372036854775808 	9223372036854775807
		float 	32 bits 	-3.402823e38 	3.402823e38
		double 	64 bits 	-1.79769313486232e308 	1.79769313486232e308
		char 	16 bits 	'\u0000' 	'\uffff
	 */
		
		
	}

}

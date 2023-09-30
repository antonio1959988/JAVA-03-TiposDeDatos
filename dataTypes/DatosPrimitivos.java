package dataTypes;

public class DatosPrimitivos {
	
	public static void main(String[] args) {
		
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
		
		//System.out.println(); //sysout + ctrl + space
		//System.out.println(); //syso + ctrl + space
		
		//BYTE - Valor minimo y valor maximo
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor minimo de byte es: " + minByte);
		System.out.println("El valor maximo de byte es: " + maxByte);
		
		//SHORT - Valor minimo y valor maximo
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor minimo de short es: " + minShort);
		System.out.println("El valor maximo de short es: " + maxShort);
		
		//CHAR - Valor minimo y valor maximo
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de char es: " + minChar);
		System.out.println("El valor maximo de char es: " + maxChar);
		
		
		//INT - Valor minimo y valor maximo
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor minimo de int es: " + minInt);
		System.out.println("El valor maximo de int es: " + maxInt);
		
		//long
		long isbn = 9788499169019L;
		System.out.println(isbn);
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor minimo de long es: " + minLong);
		System.out.println("El valor maximo de long es: " + maxLong);
				
		//float
		float salary = 15000f;
		System.out.println(salary);
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor minimo de float es: " + minFloat);
		System.out.println("El valor maximo de float es" + maxFloat);
				
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor minimo de double es: " + minDouble);
		System.out.println("El valor maximo de double es: " + maxDouble);
		
		char valorChar1 = 64; //Sin comillas es su codigo
		char valorChar2 = '3'; //Comillas forzan la impresion de caracter
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		//Casting - Conversion de tipos en java
		/* -- Automatico (dato mas pequeño a un dato mas grande)
		 * -- Manual (tipo de dato mas grande a tipo de dato mas pequeño)
		 */
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		// -- Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
	}
}

package dataTypes;

public class DatosEstructurados {
	public static void main(String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String. Los String en java se consideran objetos
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)
*/
		String myString = "Hola soy un String";
		System.out.println(myString);
		
		String helloString = new String("Hola soy un segundo String");
		System.out.println(helloString);
		
		//Metodos para Strings
		/* 
		 * 
		 * */
		String texto = "ASDihiuHJiLÑ";
		//-- String length. Metodo que permite medir la longitud de mi cadena de caracteres
		System.out.println("La longitud de la variable texto de tipo String es: " + texto.length());
		
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el metodo length
		 * int metodoLength = texto.length();
		 * -- Output: 10
		 * Imprimimos en consola la nueva variable
		 * System.out.println(metodoLength)
		 */
		
		// -- String: toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el metodo toUpperCase: " + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el metodo toLowerCase: " + lowerCase);
		
		//-- indexOf. Devuelve el indice de la primera aparicion de un texto especifico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal"); //output: 8
		System.out.println("La palabra 'temporal' inicia en el indice: " + indexOf);
		
		//-- Concatenacion
		String firstName = "Antonio ";
		String lastName = "Torres";
		
		String userName = firstName + " " + lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		//--Metodos de conversion (parseo)
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseado = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " +  presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseado + " que ahora es de tipo " + ((Object)parseado).getClass().getSimpleName());
		
		/*
		 * Arrays. Conocidos como arreglos, se trata de una colección de datos del mismo tipo donde cada elemento corresponde a una posición identificada por índices numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz
		 */
		
		String[] cars = {"Volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars[0]);
		
		/*
		 * Variable por tipo de declaración
		 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
		 * 
		 */
		
		//Variables dinamicas
		float gastosMensuales = 35684.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales = 42699.20f;
		System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
		
		//Variables finales o constantes
		final int SALARIO = 15000;
		System.out.println(SALARIO);
		
		
		
		
		
		
	}
}

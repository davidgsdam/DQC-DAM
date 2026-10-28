/* Esto es un comentario
* La clase se debe llamar como el archivo usanco PascalCase
*/

class Repaso {
	// Comentario de una línea
	// Esta es la funcion principal
	public static void main(String args[]) {
		System.out.println("Escribe en pantalla");
		// Todas las lineas acaban en ;
		System.out.print("No salta de linea");
		System.out.println("Salta de linea");
		// Se pueden definir variables 
		int variable1 = 3;
		// Variables en camelCase
		//Variable 1 es un entero (nº sin decimales)
		variable1 = variable1 * 2;
		System.out.println("El valor es : " + variable1);
		// Poner variable1 = variable1 * 2;
		// Es lo mismo que:
		variable1 *= 2;
		System.out.println("El valor de forma corta es :" + variable1);
		// Tambien existen:
		variable1 += 2;
		variable1 -= 2;
		variable1 /= 2;
		System.out.println("El valor es :" + variable1); 
		
		// Operadores ++ y -- SOLO PARA ENTEROS
		int prueba = 2;
		prueba++;// Pruebas = 3 ahora
		prueba--;// Pruebas = 2 ahora
		// ++ suma 1
		// -- resta 1
		int incremento = 1;
		int valor = ++incremento;
		System.out.println("Valor es : " + valor);
		System.out.println("Incremento es : " + incremento);
		// int valor = ++incremento;
		// Es lo mismo que:
		// Incremento += 1;
		// int valor = incremento;
		// 
		// int valor = incremento++;
		// Es lo mismo que:
		// int valor = incremento;
		// incremento += 1;
		// Esto solo aparece con el ++ y --

		// El resto %: 
		// sirve para obtener el resto de una division.
		// Solo funciona con numeros enteros
		int resto1 = 10 % 2; // Esto vale 0
		int resto2 = 11 % 2; // Esto vale 1
		
		// Número con decimales:
		// Float o double.

		double pi = 3.14;
		double radio = 2.0;
		double area = pi * radio * radio;
		// +, -, * y /

		// String:
		// Son cadenas de caracteres
		String hola = "Hola mundo";
		// Solo tienen la operacion +
		// Se llama concatenacion
		String adios = "Adios mundo";
		String sumaCadenas = hola + adios;
		System.out.println(sumaCadenas);
		// "Hola mundoadios mundo"

		// Casting:
		// Sirve para transformar unos tipos en otros
		int x = 10;
		int y = 7;
		double divisionXY = x / y;
		System.out.println(divisionXY); // 1.0
		// Como x e y son enteros se come los decimales
		double divsionXY2 = (float)x / (double)y;
		System.out.println(divsionXY2);
		// Casting funciona poniendo: 
		// (tipo final)variable
		// Por ejemplo:
		// (float)x -> Transforma x en float
		// (double)y -> Transforma y en double

	}
}
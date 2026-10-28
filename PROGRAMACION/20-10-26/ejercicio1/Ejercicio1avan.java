import java.util.Scanner;

class Ejercicio1 {
	public static void main(String args[]) {

		System.out.println("A continuacion tecle un numero que le guste sin que sea decimal\n despues presione enter y vuelva a introducir otro numero");

		Scanner tecladoInputN1 = new Scanner(System.in);
		Scanner tecladoInputN2 = new Scanner(System.in);

		n1 = tecladoInputN1.nextint();
		n2 = tecladoInputN2.nextint();


		int x = tecladoInputN1;
		int y = TecladoInputN2;

		System.out.println("La suma de " + x + " y de " + y + " es " + (x + y));
		System.out.println("La resta de " + x + " y de " + y + " es " + (x - y));
		System.out.println("La division de " + x + " y de " + y + " es " + (x / y));
		System.out.println("La multiplicacion de " + x + " y de " + y + " es " + (x * y));


	}
}
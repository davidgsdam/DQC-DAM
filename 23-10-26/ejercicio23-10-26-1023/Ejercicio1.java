import java.util.Scanner;

class Ejercicio1 {
	public static void main(String arg[]) {

		Scanner inputTeclado = new Scanner(System.in);

		System.out.print("Introduce un numero y te dire si es divisible entre 2 5 o 15 con fizz y buzz> ");
		
		int n1 = Integer.parseInt(inputTeclado.nextLine().trim());

		if(n1 % 15 == 0) {
			System.out.print("fizzbuzz");
		} else if(n1 % 5 == 0) {
			System.out.print("buzz");
		} else if(n1 % 3 == 0) {
			System.out.print("fizz");
		} else {
			System.out.print(n1);
		}
	}
}
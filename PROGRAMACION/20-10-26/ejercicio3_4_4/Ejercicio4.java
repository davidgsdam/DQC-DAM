import java.util.Scanner;

class Ejercicio4 {
	public static void main(String arg[]) {

		Scanner inputTeclado = new Scanner(System.in);
		
		System.out.print("Dime tu primer numero> ");
		double numeroPrimeroLeido = Double.parseDouble(inputTeclado.nextLine().trim());
		System.out.println("Este es tu primer numero seleccionado> " + numeroPrimeroLeido);
		System.out.print("Dime tu segundo numero> ");
		double numeroSegundoLeido = Double.parseDouble(inputTeclado.nextLine().trim());
		System.out.println("Este es tu segundo numero seleccionado> " + numeroSegundoLeido);

		System.out.println("Esta es la multiplicacion de ambos numeros: " + (numeroPrimeroLeido * numeroSegundoLeido));
		System.out.println("Esta es la resta de ambos numeros: " + (numeroPrimeroLeido - numeroSegundoLeido));
		System.out.println("Esta es la suma de ambos numeros: " + (numeroPrimeroLeido + numeroSegundoLeido));
		System.out.println("Esta es la division de ambos numeros: " + (numeroPrimeroLeido / numeroSegundoLeido));
	}
}
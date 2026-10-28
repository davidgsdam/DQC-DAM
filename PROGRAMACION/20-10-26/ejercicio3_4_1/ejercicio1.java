import java.util.Scanner;

class ejercicio1 {
	public static void main(String arg[]) {
	
		Scanner inputTeclado = new Scanner(System.in);
		
		System.out.print("Dime tu primer numero> ");
		int numeroPrimeroLeido = Integer.parseInt(inputTeclado.nextLine().trim());
		System.out.println("Este es tu primer numero seleccionado> " + numeroPrimeroLeido);
		System.out.print("Dime tu segundo numero> ");
		int numeroSegundoLeido = Integer.parseInt(inputTeclado.nextLine().trim());
		System.out.println("Este es tu segundo numero seleccionado> " + numeroSegundoLeido);

		System.out.print("Esta es la multiplicacion de ambos numeros: " + (numeroPrimeroLeido * numeroSegundoLeido));
	}
}
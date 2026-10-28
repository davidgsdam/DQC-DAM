import java.util.Scanner;

class ejercicio2 {
	public static void main(String arg[]) {

		Scanner inputTeclado = new Scanner(System.in);
		
		System.out.print("Convertiremos de euros a pesetas asi que dime cuantos centimos de euro tienes> ");
		int centimosEuro = Integer.parseInt(inputTeclado.nextLine().trim());
		double euros = centimosEuro / 100.0;
		double conversionEurosPesetas = euros * 166.0;
		
		System.out.println("Tienes un total de: " + euros + "\nEn pesetas son: " + conversionEurosPesetas);

		System.out.println("A continuacion lo haremos de manera inversa es decir de pesetas a euros");
		
		System.out.print("Cuantas pesetas tienes> ");
		int pesetas = Integer.parseInt(inputTeclado.nextLine().trim());
		double conversionPesetasEuros = pesetas / 166.0;
		System.out.println("Tienes " + pesetas + " pesetas o lo que es lo mismo " + conversionPesetasEuros + " euros");
	}
}
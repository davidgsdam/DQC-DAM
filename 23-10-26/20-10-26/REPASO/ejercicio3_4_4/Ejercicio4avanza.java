import java.util.Scanner;

class Ejercicio4avanza {
	public static void main(String arg[]) {

		System.out.println("  _______ ___ __   __ _______ ___     _______   _______ _______ ___     _______ \n" +
						   " |       |   |  |_|  |       |   |   |       | |       |   _   |   |   |       |\n" +
						   " |  _____|   |       |    _  |   |   |    ___| |       |  |_|  |   |   |       |\n" +
						   " | |_____|   |       |   |_| |   |   |   |___  |       |       |   |   |       |\n" +
						   " |_____  |   |       |    ___|   |___|    ___| |      _|       |   |___|      _|\n" +
						   "  _____| |   | ||_|| |   |   |       |   |___  |     |_|   _   |       |     |_\n" +
						   " |_______|___|_|  _______|_____________________________|__| |__|_______|_______|\n" +
						   " |  | |  |   |   |   _   |       |       |    _ |\n" +
						   " |  | |  |   |   |  |_|  |_     _|   _   |   | ||\n" +
						   " |  |_|  |   |   |       | |   | |  | |  |   |_||_\n" +
						   " |       |   |___|       | |   | |  |_|  |    __  |\n" +
						   " |       |       |   _   | |   | |       |   |  | |\n" +
						   " |_______|_______|__| |__| |___| |_______|___|  |_|");

		Scanner inputTeclado = new Scanner(System.in);
		
		while (true) {

			System.out.println("Te voy a pedir dos numero tu elijes que hacer cada vez");
		
			System.out.print("Dime tu primer numero> ");
			double numeroPrimeroLeido = Double.parseDouble(inputTeclado.nextLine().trim());
			System.out.println("Este es tu primer numero seleccionado> " + numeroPrimeroLeido);
			System.out.print("Dime tu segundo numero> ");
			double numeroSegundoLeido = Double.parseDouble(inputTeclado.nextLine().trim());
			System.out.println("Este es tu segundo numero seleccionado> " + numeroSegundoLeido);


			System.out.print("Elije que quieres hacer \n1-----Suma\n2-----Resta\n3-----Multiplicacion\n4-----Division\n5-----EXIT\n");

			int opcion = Integer.parseInt(inputTeclado.nextLine().trim());

			if (opcion == 1) {
				System.out.println("Esta es la Suma: " + (numeroPrimeroLeido + numeroSegundoLeido));
			}
			else if (opcion == 2) {
				System.out.println("Esta es la Resta: " + (numeroPrimeroLeido - numeroSegundoLeido));
			}
			else if (opcion == 3) {
				System.out.println("Esta es la Multiplicacion: " + (numeroPrimeroLeido * numeroSegundoLeido));
			}
			else if (opcion == 4) {
				System.out.println("Esta es la Division: " + (numeroPrimeroLeido / numeroSegundoLeido));
			}
			else if (opcion == 5) {
				System.out.println("Hasta pronto");
				break;
			}
		}
	}
}

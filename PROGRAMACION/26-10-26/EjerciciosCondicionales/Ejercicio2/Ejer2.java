import java.util.Scanner;

class Ejer2 {
	public static void main(String arg[]) {

		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Introduce una letra y te dire si es vocal o no> ");
	
		String letra = tecladoInput.nextLine().toLowerCase().trim();

		if (letra.length() != 1) {
			System.out.println("Debe ser un solo caracter");
		} else if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println(letra + " Es vocal");
		} else {
			System.out.println(letra + " No es una vocal");
		}
	}
}
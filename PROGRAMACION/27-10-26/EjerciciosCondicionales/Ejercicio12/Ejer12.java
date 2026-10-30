import java.util.Scanner;

class Ejer12 {
	public static void main(String arg[]) {
		
		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Cual es tu nombre> ");
		String nombreInputCliente = tecladoInput.nextLine().trim();
		
		System.out.print("Cuantos articulos vas a comprar> ");
		int articulosInputCliente = Integer.parseInt(tecladoInput.nextLine().trim());

		if (articulosInputCliente < 5) {
			System.out.println(nombreInputCliente + " Pagara en efectivo");
		} else if(articulosInputCliente >= 5 && articulosInputCliente < 12) {
			System.out.println(nombreInputCliente + " Pagara con tarjeta");
		} else if(articulosInputCliente > 13) {
			System.out.println(nombreInputCliente + " Pagara con cheque");
		}
	}
}
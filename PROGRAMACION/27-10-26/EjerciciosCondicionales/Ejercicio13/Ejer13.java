import java.util.Scanner;

class Ejer13 {
	public static void main(String args[]) {
	
		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Cual es tu nombre> ");		
		String nombreClienteInput = tecladoInput.nextLine().trim();

		System.out.print("Cuantas llantas vas a comprar> ");
		int nLlantasInput = Integer.parseInt(tecladoInput.nextLine().trim());

		

		Double precioFinal;

		precioFinal = nLlantasInput < 12 ? (300.0 * nLlantasInput) : (280.0 * nLlantasInput);
		System.out.print(nombreClienteInput + " su factura a pagar es de: " + precioFinal); 
	}
}
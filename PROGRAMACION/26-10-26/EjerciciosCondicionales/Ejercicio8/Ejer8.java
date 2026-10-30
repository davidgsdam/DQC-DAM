import java.util.Scanner;

class Ejer8 {
	public static void main(String arg[]) {
		
		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Dime tu importe> ");
		Double importeBrutoInput = Double.parseDouble(tecladoInput.nextLine().trim());
	
		if(importeBrutoInput > 15000.00) {
			System.out.println("Debido a que ganas mas de 15000.00 se te aplica un 16 % de impuestos");
			System.out.print("Tu importe neto es de: " + (importeBrutoInput - (importeBrutoInput * 0.16)));
			
		} else {
			System.out.println("Debido a que ganas menos de 15000.00 se te aplica un 10% de impuestos");
			System.out.print("Tu importe neto es de: " + (importeBrutoInput - (importeBrutoInput * 0.16)));			
		}
	}
}
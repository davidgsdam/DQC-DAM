import java.util.Scanner;

class Ejer7 {
	public static void main(String arg[]) {
		
		Scanner tecladoInput = new Scanner(System.in);

		while (true) {

			System.out.print("\n1 ---- Equilatero\n2 ---- Isoceles\n3 ---- Escaleno\n");
			System.out.print("Elije una opcion por su numero > ");
			
			int opcion = Integer.parseInt(tecladoInput.nextLine().trim());
			
			if(opcion == 1) {
				System.out.print("Introduce la longitud de sus lados> ");
				Double equilateroLInput = Double.parseDouble(tecladoInput.nextLine().trim());
				Double perimetroEquilatero = equilateroLInput * 3;
				System.out.print("El perimetro de tu triangulo Equilatero es: " + perimetroEquilatero);
			} else if (opcion == 2) {
				System.out.print("Introduce la longitud de sus lados> ");
				Double isocelesLInput = Double.parseDouble(tecladoInput.nextLine().trim());
				
				System.out.print("Introduce la longitud de su base> ");
				Double isocelesBInput = Double.parseDouble(tecladoInput.nextLine().trim());
				
				Double perimetroIsoceles = (2 * isocelesLInput) + isocelesBInput;
			
				System.out.print("El perimetro de tu triangulo isoceles es: " + perimetroIsoceles);
			} else if (opcion == 3) {
				System.out.print("Dime el primer lado de tu triangulo Escaleno> ");
				Double escalenoL1Input = Double.parseDouble(tecladoInput.nextLine().trim());
				
				System.out.print("Dime el segundo lado de tu triangulo Escaleno> ");
				Double escalenoL2Input = Double.parseDouble(tecladoInput.nextLine().trim());


				System.out.print("Dime el tercer lado de tu triangulo Escaleno> ");
				Double escalenoL3Input = Double.parseDouble(tecladoInput.nextLine().trim());

				Double perimetroEscaleno = escalenoL1Input + escalenoL2Input + escalenoL3Input;
				System.out.print("El perimetro de tu triangulo escaleno es: " + perimetroEscaleno);
			}
		}
	}
}
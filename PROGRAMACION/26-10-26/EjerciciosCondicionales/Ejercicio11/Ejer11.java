import java.util.Scanner;

class Ejer11 {
	public static void main(String args[]) {
		
		Scanner tecladoInput = new Scanner(System.in);
		
		System.out.print("Dime una nota> ");
		Double nota1Input = Double.parseDouble(tecladoInput.nextLine().trim());

		System.out.print("Dime  ota nota> ");
		Double nota2Input = Double.parseDouble(tecladoInput.nextLine().trim());

		System.out.print("Dime otra nota> ");
		Double nota3Input = Double.parseDouble(tecladoInput.nextLine().trim());

		System.out.print("Dime otra nota> ");
		Double nota4Input = Double.parseDouble(tecladoInput.nextLine().trim());

		Double promedioNotas = (nota1Input + nota2Input + nota3Input + nota4Input) / 4;
		
		if(promedioNotas >= 5) System.out.print("Estas aprobado, tu promedio es de: " + promedioNotas);
		else System.out.print("Estas suspenso");
	}
}
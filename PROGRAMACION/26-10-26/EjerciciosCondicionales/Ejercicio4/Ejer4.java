import java.util.Scanner;

class Ejer4 {
	public static void main(String arg[]) {
		
		Scanner tecladoInput = new Scanner(System.in);
		
		System.out.print("Dime tu primer numero> ");

		Double n1 = Double.parseDouble(tecladoInput.nextLine().trim());

		System.out.print("Dime tu segundo numero> ");

		Double n2 = Double.parseDouble(tecladoInput.nextLine().trim());

		System.out.print("Dime tu segundo numero> ");

		Double n3 = Double.parseDouble(tecladoInput.nextLine().trim());

		System.out.print("Dime tu tercer numero> ");

		if(n3 == (n1 + n2)) System.out.println("la suma de " + n1 +  " y " + n2 + " es igaul a " + n3 + " Es decir tu primer y segundo numero sumados dan el tercero");
		else System.out.println("la suma de " + n1 +  " y " + n2 + " no es igaul a " + n3 + " Es decir tu primer y segundo numero sumados no dan el tercero");
	}
}
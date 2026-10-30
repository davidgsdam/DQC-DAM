import java.util.Scanner;

class Ejer3 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Dime tu primer numero sin decimales> ");
		
		int n1 = Integer.parseInt(tecladoInput.nextLine().trim());

		System.out.print("Dime tu segundo numero sin decimales> ");

		int n2 = Integer.parseInt(tecladoInput.nextLine().trim());

		System.out.print("Dime tu Tercer numero sin decimales> ");

		int n3 = Integer.parseInt(tecladoInput.nextLine().trim());


				

		if( n1 < n2 && n2 < n3) {
			System.out.println("Tus numeros introducidos estan en orden creciente");
		} else {
			System.out.println("Tus numeros no estan introducidos en orden creciente");
		}
	}
}
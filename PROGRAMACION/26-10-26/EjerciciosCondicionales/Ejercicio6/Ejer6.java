import java.util.Scanner;

class Ejer6 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Introduce tu primer numero > ");
		
		int n1 = Integer.parseInt(tecladoInput.nextLine().trim());

		System.out.print("Introduce tu segundo numero > ");

		int n2 = Integer.parseInt(tecladoInput.nextLine().trim());

		if(n1 % 2 == 0) {
			System.out.println(n1 + " Es par");
		} else if(n1 % 2 != 0) {
			System.out.println(n1 + " No es par");
		}
		if(n2 % 2 == 0) {
			System.out.println(n2 + " Es par");
		} else if(n2 % 2 != 0) {
			System.out.println(n1 + " No es par");
		}else {
			System.out.print("NI IDEA");
		}
	}
}
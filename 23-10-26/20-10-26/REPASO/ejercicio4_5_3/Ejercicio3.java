import java.util.Scanner;

class Ejercicio3 {
	public static void main(String args[]) {
		
		Scanner inputTeclado = new Scanner(System.in);

		System.out.print("Dime un numero entre el 1 y 7 y te dire el dia de la semana> ");
		int numeroDiaInput = Integer.parseInt(inputTeclado.nextLine().trim());
		
		if (numeroDiaInput == 1) {
			System.out.println("Lunes");
		}
		if (numeroDiaInput == 2) {
			System.out.println("Martes");
		}
		if (numeroDiaInput == 3) {
			System.out.println("Miercoles");
		}
		if (numeroDiaInput == 4) {
			System.out.println("Jueves");
		}
		if (numeroDiaInput == 5) {
			System.out.println("Viernes");
		}
		if (numeroDiaInput == 6) {
			System.out.println("Sabado");
		}
		if (numeroDiaInput == 7) {
			System.out.println("Domingo");
		}
	
		switch (numeroDiaInput) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
		}
	}
}
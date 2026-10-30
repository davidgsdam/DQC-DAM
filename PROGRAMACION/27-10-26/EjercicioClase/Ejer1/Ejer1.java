import java.util.Scanner;

class Ejer1 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Dime un numero y te dire el dia de la semana> ");
		int diaInput = Integer.parseInt(tecladoInput.nextLine().trim());

		switch (diaInput){
			case 1:
				System.out.print("Lunes");
				break;
			case 2:
				System.out.print("Martes");
				break;
			case 3:
				System.out.print("Miercoles");
				break;
			case 4:
				System.out.print("Jueves");
				break;
			case 5:
				System.out.print("Viernes");
				break;
			case 6:
				System.out.print("Sabado");
				break;
			case 7:
				System.out.print("Domingo");
				break;
		}
	}
}
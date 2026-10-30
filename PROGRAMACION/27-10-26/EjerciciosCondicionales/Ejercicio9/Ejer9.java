import java.util.Scanner;

class Ejer9 {
	public static void main(String arg[]) {
		
		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Dame un numero que sera una hora ejemplo: 18> ");
		int horasInput = Integer.parseInt(tecladoInput.nextLine().trim());

		System.out.print("Dame un numero que sera unos minutos ejemplo: 32> ");
		int minutosInput = Integer.parseInt(tecladoInput.nextLine().trim());

		System.out.print("Dame un numero que sera unos segundos ejemplo: 60> ");
		int segundosInput = Integer.parseInt(tecladoInput.nextLine().trim());

		if(minutosInput > 60) {
			horasInput = horasInput + (minutosInput / 60);
			minutosInput = minutosInput % 60;
		} if(segundosInput > 60) {
			minutosInput = minutosInput + (segundosInput / 60);
			segundosInput = segundosInput % 60;
		}

		System.out.print(horasInput + " horas " + minutosInput + " minutos " + segundosInput + " segundos");

	}
}
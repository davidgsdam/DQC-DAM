import java.util.Scanner;

class Ejercicio1 {
	public static void main(String arg[]) {
	

		Scanner inputTeclado = new Scanner(System.in);

		System.out.print("Escribe un numero y te dire si es par o no> ");

		int n1 = Integer.parseInt(inputTeclado.nextLine().trim());
		
		if(n1 % 2 == 0) {
			System.out.print("Es par");
		} else {
			System.out.print("Es impar");
		}
		
		boolean par = n1 % 2 == 0;
		System.out.println("\nTe dire si es verdad o falso que tu numero sea par >> " + par);
	}
}
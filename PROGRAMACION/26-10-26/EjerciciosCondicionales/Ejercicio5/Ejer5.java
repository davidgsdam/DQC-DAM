import java.util.Scanner;

class Ejer5 {
 public static void main(String arg[]) {

		Scanner tecladoInput = new Scanner(System.in);

		while (true) {

			System.out.print("1 ---- Archivo\n2 ---- Buscar\n3 ---- Salir");
			
			System.out.print("\nIntroduce una opcion por su numero> ");
			int opcion = Integer.parseInt(tecladoInput.nextLine().trim());
			
			if(opcion == 1) {
				System.out.println("has elegido la opcion archivo");
			} else if(opcion == 2) {
				System.out.println("has elegido la opcion buscar");
			}else if(opcion == 3) {
				System.out.println("has elegido la opcion salir");
				break;
			}else {
				System.out.println("Creo que has introducido mal la opcion revisalo porque has introducido : " + opcion);
			}

		}
	}
}
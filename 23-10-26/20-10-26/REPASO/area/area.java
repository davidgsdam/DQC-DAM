import java.util.Scanner;

class area {
	public static void main (String arg[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la base> ");
		String base = scanner.nextLine();
		System.out.print("Introduce la altura> ");
		
		String altura = scanner.nextLine();
		double baseNumero = Double.parseDouble(base.trim());
		double alturaNumero = Double.parseDouble(altura.trim());
		System.out.println("Area: " + (baseNumero * alturaNumero));
	}
}
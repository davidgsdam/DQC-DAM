import java.util.Scanner;

class Ejer1 {
    public static void main(String arg[]) {
        
	Scanner tecladoInput = new Scanner(System.in);

	System.out.print("Introduce el numero que quieras y te dire si es mayor a 100> ");
	
	double n1 = Double.parseDouble(tecladoInput.nextLine().trim());

	if(n1 > 100) System.out.println( n1 + " Es mayor que 100");
	else System.out.println( n1 + " Es menor que 100");
    }
}
import java.util.Scanner;

class Ejer10 {
	public static void main(String arg[]) {

		Scanner tecladoInput = new Scanner(System.in);
		System.out.print("Cuantos annos llevas en la empresa> ");
		int annosEnEmpresaInput = Integer.parseInt(tecladoInput.nextLine().trim());

		Double sueldo = 40000.00;
		Double sueldoAumentado = 0.0;

		if(annosEnEmpresaInput > 10) {
			sueldoAumentado = sueldo + (sueldo * 0.10);
		} else if(annosEnEmpresaInput < 10 && annosEnEmpresaInput >= 5) {
			sueldoAumentado = sueldo + (sueldo * 0.07);
		} else if(annosEnEmpresaInput < 5 && annosEnEmpresaInput >= 3) {
			sueldoAumentado = sueldo + (sueldo * 0.05);
		}else if(annosEnEmpresaInput < 3) {
			sueldoAumentado = sueldo + (sueldo * 0.03);
		}
		
		System.out.print("Este es tu sueldo con tu aumento: " + sueldoAumentado);
	}
}
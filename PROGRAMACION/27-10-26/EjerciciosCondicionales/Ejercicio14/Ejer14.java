import java.util.Scanner;

class Ejer14 {
	public static void main(String arg[]) {
		
		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Cual es tu nombre> ");
		String nombreClienteInput = tecladoInput.nextLine().trim();


		int auxInputCondicion = 0;
		int cantidadProductoInput = 0;
		double precioCompra = 0.0;

		if(nombreClienteInput != null && !nombreClienteInput.isEmpty()){
			auxInputCondicion ++;
		// Con != null comprobamos que sea diferente a que no sea valida o erronea
		// Con .isEmpty() comprobamos que almenos tenga un caracter
			while(auxInputCondicion == 1) {

			System.out.print("\n1 ---- Seccion carnica\n2 ---- Seccion frutas\n3 ---- Seccion verduras\n4 ---- Seccion abarrotes\n");

			System.out.print("Selecione una seccion " + nombreClienteInput + " > ");
			int opcion = Integer.parseInt(tecladoInput.nextLine().trim());

			switch(opcion) {
				case 1:
					System.out.print("\n1 ---- Solomillo de pollo 1kg/3€\n2 ---- Contramuslo de pollo 1kg/2.50€\n3 ---- Salir\n");
					System.out.print(nombreClienteInput + "Seleccione su producto> ");
					int opcionCarnes = Integer.parseInt(tecladoInput.nextLine().trim());
					
					if(opcionCarnes == 1) {
						System.out.print("Cuantos paquetes de 1kg desea comprar de Solomillo de pollo> ");
						cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

						precioCompra = cantidadProductoInput * 3;
						System.out.print("El total de su compra son: " + precioCompra + " euros");
					} else if(opcionCarnes == 2) {
						System.out.print("Cuantos paquetes de 1kg desea comprar de contramuslo de pollo> ");
						cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

						precioCompra = cantidadProductoInput * 2.50;
						System.out.print("El total de su compra son: " + precioCompra + " euros");
					} else {
						System.out.print("Hasta pronto " + nombreClienteInput);
						break;
					}
				
				case 2:
					System.out.print("\n1 ---- Manzana 1kg/4.50€\n2 ---- Pera 1kg/3.45\n3 ---- Salir\n");
					System.out.print(nombreClienteInput + "Seleccione su producto> ");
					int opcionFrutas = Integer.parseInt(tecladoInput.nextLine().trim());

					switch (opcionFrutas) {
						case 1:
							System.out.print("Cuantos paquetes de 1 kg manzanas quieres" + nombreClienteInput + " > ");
							cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

							precioCompra = cantidadProductoInput * 4.50;

							if(precioCompra > 1000) System.out.print("El precio a pagar son: " + precioCompra + " \ndescuento de: " + (precioCompra * 0.20) + " \nTotal a pagar:" + (precioCompra - (precioCompra * 0.20)));
							break;
					
						case 2:
							System.out.print("Cuantos paquetes de 1 kg peras quieres" + nombreClienteInput + " > ");
							cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

							precioCompra = cantidadProductoInput * 3.45;

							if(precioCompra > 1000) System.out.print("El precio a pagar son: " + precioCompra + " \ndescuento de: " + (precioCompra * 0.20) + " \nTotal a pagar:" + (precioCompra - (precioCompra * 0.20)));
							break;
						
						case 3:
							System.out.print("Hasta luego " + nombreClienteInput);
							break;
					}
				case 3:
					System.out.print("\n1 ---- Espinacas 1kg/7.50€\n2 ---- Brocoli 1kg/0.45\n3 ---- Salir\n");
					System.out.print(nombreClienteInput + "Seleccione su producto> ");
					int opcionVerduras = Integer.parseInt(tecladoInput.nextLine().trim());

					switch (opcionVerduras) {
						case 1:
							System.out.print("Cuantos paquetes de 1 kg de Espinacas quieres" + nombreClienteInput + " > ");
							cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

							precioCompra = cantidadProductoInput * 7.50;

							if(precioCompra > 1000) System.out.print("El precio a pagar son: " + precioCompra + " \ndescuento de: " + (precioCompra * 0.20) + " \nTotal a pagar:" + (precioCompra - (precioCompra * 0.20)));
							break;
					
						case 2:
							System.out.print("Cuantos paquetes de 1 kg Brocoli quieres" + nombreClienteInput + " > ");
							cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

							precioCompra = cantidadProductoInput * 0.45;

							if(precioCompra > 1000) System.out.print("El precio a pagar son: " + precioCompra + " \ndescuento de: " + (precioCompra * 0.20) + " \nTotal a pagar:" + (precioCompra - (precioCompra * 0.20)));
							break;
						
						case 3:
							System.out.print("Hasta luego " + nombreClienteInput);
							break;
					}
				case 4:
					System.out.print("\n1 ---- Arroz 1kg/1.0€\n2 ---- Frijoles 1kg/2.45\n3 ---- Salir\n");
					System.out.print(nombreClienteInput + "Seleccione su producto> ");
					int opcionAbarrotes = Integer.parseInt(tecladoInput.nextLine().trim());

					switch (opcionAbarrotes) {
						case 1:
							System.out.print("Cuantos paquetes de 1 kg de arroz quieres" + nombreClienteInput + " > ");
							cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

							precioCompra = cantidadProductoInput * 1.0;

							if(precioCompra > 1000) System.out.print("El precio a pagar son: " + precioCompra + " \ndescuento de: " + (precioCompra * 0.20) + " \nTotal a pagar:" + (precioCompra - (precioCompra * 0.20)));
							break;
					
						case 2:
							System.out.print("Cuantos paquetes de 1 kg de frijoles quieres" + nombreClienteInput + " > ");
							cantidadProductoInput = Integer.parseInt(tecladoInput.nextLine().trim());

							precioCompra = cantidadProductoInput * 3.45;

							if(precioCompra > 1000) System.out.print("El precio a pagar son: " + precioCompra + " \ndescuento de: " + (precioCompra * 0.20) + " \nTotal a pagar:" + (precioCompra - (precioCompra * 0.20)));
							break;
						
						case 3:
							System.out.print("Hasta luego " + nombreClienteInput);
							break;
					}
				}
			}
		}
	}
}
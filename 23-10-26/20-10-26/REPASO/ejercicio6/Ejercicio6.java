class Ejercicio6 {
	public static void main(String arg[]) {

		final double IVA = 1.21;
		
		double precio1 = 1500.15;
		double precio2 = 76.90;
		double precio3 = 99.99;
		
		double facturaSinIva = precio1 + precio2 + precio3;
		double facturaIva = (precio1 + precio2 + precio3) * IVA;
		
		System.out.println("Tu factura final sin IVA es de : " + facturaSinIva);
		System.out.println("Tu factura final con IVA es de : " + facturaIva);		
	}
}
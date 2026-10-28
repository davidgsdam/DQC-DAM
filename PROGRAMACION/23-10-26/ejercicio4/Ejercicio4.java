class Ejercicio4 {
	public static void main(String args[]) {
	
		double euros = 17.5;
		double conversor = euros * 166.0;
		double pesetas = conversor;
		System.out.println(pesetas);
		System.out.println("A continuacion haremos la inversa es decir de pesetas a euros");
		double conversorInve = pesetas / 166;
		double eurosInve = conversorInve;
		System.out.println("La conversior inversa es: " + conversorInve);
	}
}

/**
 * Coloreado de texto
 */

public class Colores {
    public static void main(String[] args){

        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        System.out.print(naranja + "Mandarina" + verde + "Hierba");
        System.out.print(naranja + "Saltamontes" + rojo + "Tomate");
        System.out.print(blanco + "Sabanas" + azul + "Cielo");
        System.out.print(morado + "Nazareno" + azul + "Mar");
    }
}
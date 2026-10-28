/**
 * En este ejercicio modificaremos el programa anterior para añadir colores
 * asi puediendo mostrar cada asignatura de un color
 */

public class Ejercicio_5 {
    public static void main(String[] args) {

        String rojo = "\033[31m";
        String verde = "\033[32m";
        String azul = "\033[34m";
        String purpura = "\033[35m";

        System.out.println("Sistemas informaticos" + "\t8:15-10:55");
        System.out.println(rojo + "Programacion" + "\t10:05-10:55");
        System.out.println(verde + "Recreo\t10:55-11:25");
        System.out.println(purpura + "Programacion\t11:25-12:15");
        System.out.println(azul + "Base de datos\t12:15-14:10");
    }
}
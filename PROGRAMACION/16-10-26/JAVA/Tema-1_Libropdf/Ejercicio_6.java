/**
 * Escribe un programa que pinte por pantalla una piramide rellena a base de asteriscos
 * La base de la piramide debe estar formada por 9 asteriscos
 */

public class Ejercicio_6 {
    public static void main(String[] args) {

        String pico3 = "        *";
        String pico2 = "       ***";
        String pico1 = "      *****";
        String medio3 = "    *******";
        String medio2 = "   *********";
        String medio1 = "  ***********";
        String base3 = "  *************";
        String base2 = " ***************"; 
        String base1 = "*****************";

        System.out.println(pico3);
        System.out.println(pico2);
        System.out.println(pico1);
        System.out.println(medio3 + "\n" + medio2);
        System.out.println(medio1);
        System.out.println(base3);
        System.out.println(base2);
        System.out.println(base1);

    System.out.println("        *");
    System.out.println("       ***");
    System.out.println("      *****");
    System.out.println("     *******");
    System.out.println("    *********");
    System.out.println( "   ***********");
    System.out.println("  *************");
    System.out.println(" ***************");
    System.out.println("*****************");    
    }
}
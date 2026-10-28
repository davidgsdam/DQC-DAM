//Importamos la clase Scanner para su posterior uso
import java.util.Scanner;

public class reto_c {
    public static void main(String[] args) {

        //Se creoa el objeto scanner que esta conectado a la entrada de la consola por el System.in
        Scanner Teclado_input = new Scanner(System.in);


        //Bloque de Constantes: Password
        final String PASSWORD_USR1 = "123467";

        //Bloque de variables
        String name_usr1 = "usr1";

        //Bloque input nombre de usuario

        System.out.printf("Cual es tu usuario?\n");
        String input_nombre_user = Teclado_input.nextLine();//Gracias al metodo nextLine leemos todo hasta espacios en blanco hasta que el user le de al enter
//        if (input_nombre_user == name_usr1) {
// Esta mal debido a que == lo que hace es comparar si son el mismo objeto en memoria no si tienen la mismas letras
//            System.out.println("Perfecto usuario: ", name_usr1, "Ahora teclea tu contraseña y ya podras acceder al sistema");
        if (input_nombre_user.equals(name_usr1)) {
            System.out.printf("\nPerfecto usuario: " + name_usr1 + " Ahora teclea tu contraseña y ya podras acceder al sistema"); 
            System.out.printf("\n Introduce tu contraseña\n");
            int input_contraseña_usr = Teclado_input.nextLine();
            
                if (input_contraseña_usr == PASSWORD_USR1) {
                    System.out.printf("Contraseña correcta. Bienvenido de vuelta " + name_usr1);
                }   else {
                    System.out.printf("\nContraseña incorrecta vuelvelo a intentar\n");
                }
            }  else {
                System.out.printf("\nUsuario: "  + input_nombre_user + " no encontrado lo sentimos vuelva a intentarlo");
            }
        
    }
}
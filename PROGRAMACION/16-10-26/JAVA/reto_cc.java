//Importamos la clase Scanner para su posterior uso
import java.util.Scanner;

public class reto_cc {
    public static void main(String[] args) {

        //Se creoa el objeto scanner que esta conectado a la entrada de la consola por el System.in
        Scanner Teclado_input = new Scanner(System.in);


        //Bloque de Constantes: Password
        final String PASSWORD_USR1 = "1234";

        //Bloque de variables
        String name_usr1 = "usr1";
        int intentos = 0;

        //Bloque input nombre de usuario
        
        while (true) {

            if (intentos >=3) {
                System.out.println("Has alcanzado el maximo numero de intentos deberas esperar 15 segundos para volverlo a intentar");
                // Por lo que entendi try es cuando se intenta algo que puede petar el programa 
                try {
                    Thread.sleep(15000);
                    //Thread.sleep sirbe àra decorñe añ hilo que ejecuta el codigo que debe congelarse/dormir durante x milisegundos
                }
                //Catch es por si el try explota y esto hace que java cancele inmediatamente lo que hace en la zona try asi evitando que pete el programa
                catch (InterruptedException e) {
                    //InterruptedException es el nombre tecnico que da java para cuando alguien intenta forzar a despertar el hilo por la fuerza
                    //e es simplemente la variable de error que nombramos para esto ya que asi java dentro de esa variable mete los detalles tecnicos de porque ocurrio la interrupcion
                }
                intentos = 0;
                continue;
            }

            System.out.printf("Cual es tu usuario?\n");


            String input_nombre_user = Teclado_input.nextLine();

            System.out.printf("Cual es tu contraseña?\n");

            String input_password_user = Teclado_input.nextLine();


            if (!input_nombre_user.equals(name_usr1)) {
                System.out.println("Este usuario es incorrecto intentelo otra vez");
                intentos = intentos + 1;
            }
            else if (!input_password_user.equals(PASSWORD_USR1)) {
                System.out.println("Esta contraseña es incorrecta");
                intentos = intentos + 1;
            }
            else {
                System.out.printf("Bienvenido " + input_nombre_user + " Estamos preparando todo para ti");
                break;
            }
        }
    }
}

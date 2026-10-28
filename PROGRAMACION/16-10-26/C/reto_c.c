#include <stdio.h>
#include <string.h>
#include <unistd.h>

int main() {
//Segun lo que entendi se debe poner [] para indicar que son varios caracteres juntos y no uno solo ya que no existen en c las string
// Se debe poner contra barra n debido a que asi contamos con el enter y le el mismo numeros de caracteres que el enter del input
    char name_usr1[] = "usr1\n";

    //const char PASSWORD_USR1[] = "1234\n";
    #define PASSWORD_USR1 "1234\n"

    int intentos = 0;


    //Estp seran la varoables de los input que fijamos como maximo 20 caracteres por algo de la memoria he leido
    char input_nombre_user[20];
    char input_password_user[20];




// Mal debido a que se comparan direcciones fisicas de memoria 

    //if (input_nombre_user != name_usr1)
    //{
    //    printf("Usuario incorrecto vuelva a intentarlo porfavor");
    //}

    while (1)
    {
        if (intentos >= 3)
        {
            printf("Debera esperar 15 segundos demasiados intentos");
            sleep(15);
            intentos = 0;
            continue;
        }
        

        printf("Cual es tu usuaario\n");
        fgets(input_nombre_user, 20, stdin);
    // esto guarda el dato en la variable input_nombre_user y le dice tienes un espacio de 20  el stdin dice que es entrada estandar es decir el teclado
    //fgets lo que hace es simplemente la funcion para leer textos obtenidos atraves de un input

        printf("Cual es su contraseña\n");
        fgets(input_password_user, 20, stdin);

        if (strcmp(input_nombre_user, name_usr1) !=0)
        //strcmp compara los textos si son iguales nos dara un 0 si son diferentes un 1 entonces con esto decimos que si no es 0 entonces 
        {
            printf("Nombre de usuario incorrecto vuelva a intentarlo porfavor\n");
            intentos = intentos + 1;
        }

        else if (strcmp(input_password_user, PASSWORD_USR1) !=0)
        {
            printf("Contraseña incorrecta vuelva a intentarlo porfavor\n");
            intentos = intentos + 1;
        }
        else
        {
            printf("Bienvenido %s Te estaba esperando estamos preparando todo para ti", input_nombre_user);
            //printf("Bienvenido " + input_nombre_user + " Te estaba esperando estamos preparando todo para ti");
            break;
        }
    }
}
import sys
import time
#Bloque de constantes
PASSWORD = "1234"

#Bloque de variables
user1 = "usr1"
intentos = 0


#Comprobacion de usuario y contraseña
while True:

    if intentos >= 3:
        print ("Se ha alcanzado el maximo numero de intentos debera volver a intentarlo en 15 segundos")
        time.sleep(15) #pausa el programa por 15 segundos
        intentos = 0
        continue #vuelve a empezar el bucle

    user_input = str(input("\n\tIngrese su nombre de usuario\n"))
    password_input = str(input("\n\tIngrese su contaseña\n"))

    if user_input != user1:
        print ("Usuario incorrecto debe poner su nombre de usuario ")
        intentos = intentos + 1
    elif password_input != PASSWORD:
        print ("Contraseña incorrecta")
        intentos = intentos + 1
    elif user_input == user1 and password_input == PASSWORD:
        print ("Bienvenido usuario 1")
        break

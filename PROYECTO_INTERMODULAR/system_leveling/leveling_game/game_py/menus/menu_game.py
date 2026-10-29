def main_menu_game():

    while True:
        print("1 ===== Continuar partida")
        print("2 ===== Nueva partida")
        print("3 ===== salir")


        try:
            opcion_menugame = int(input("Elije una opcion"))
        except ValueError:
            print("Opcion invalida intentalo de nuevo")
            continue

        if opcion_menugame == 1:
            #aun no completado
            print("En desarrollo")
        elif opcion_menugame == 2:
            #aun no completado
            print("En desarrallo")
        elif opcion_menugame == 3:
            break

main_menu_game()
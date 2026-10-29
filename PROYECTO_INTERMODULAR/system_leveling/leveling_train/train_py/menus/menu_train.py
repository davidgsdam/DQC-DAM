def main_menu_train():

    while True:
        print("1 ======= Iniciar entrenamiento")
        print("2 ======= Registrar comida")
        print("3 ======= Estadisticas")
        print("4 ======= Salir")

        try:
            opcion_menugym = int(input("Elije una opcion"))
        except ValueError:
            print("Opcion invalida intentalo de nuevo")
            continue

        if opcion_menugym == 1:
            #ir a submenu x
            print("En desarrollo")
        elif opcion_menugym == 2:
            #ir a submenu y
            print("En desarrollo")
        elif opcion_menugym == 3:
            #ir a submenu z
            print("En desarrollo")
        elif opcion_menugym == 4:
            break

main_menu_train()
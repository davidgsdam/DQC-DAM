def settings_menu():

    while True:
        print("1 ===== Cambiar idioma")
        print("2 ===== Salir")

        try:
            opcion_menusettings = int(input("Elije una opcion"))
        except ValueError:
            print("Opcion invalida intentalo de nuevo")
            continue

        if opcion_menusettings == 1:
            print("En desarrollo")
        elif opcion_menusettings == 2:
            break

settings_menu()
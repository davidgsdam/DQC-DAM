from leveling_train.train_py.menus.menu_train import main_menu_train as main_menu_train
from leveling_game.game_py.menus.menu_game import main_menu_game as main_menu_game
from core.core_py.settings import settings_menu as settings_menu

def main_menu():

    while True:
        print("1 ======== GYM")
        print("2 ======== GAME")
        print("3 ======== AJUSTES")
        print("4 ======== SALIR")

        try:
            opcion_main_menu = int(input("Elije una opcion"))
        except ValueError:
            print("Opcion invalida intentalo de nuevo")
            continue

        if opcion_main_menu == 1:
            main_menu_train()
        elif opcion_main_menu == 2:
            main_menu_game()
        elif opcion_main_menu == 3:
            settings_menu()
        elif opcion_main_menu == 4:
            print("Hasta luego")
            break

main_menu()
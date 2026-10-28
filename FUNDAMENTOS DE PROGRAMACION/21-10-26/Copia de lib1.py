#Bloque de importaciones
import math
import random
import datetime
#Bloque de variables blogables
radio = random.randint(1,7623)


def calcAreaCirc (radio):
    """
    Función para calcular el area de un circulo
    param (float radio)
    return float
    """
    calculo = (2 * math.pi) * math.pow(radio, 2)
    return  calculo

print(calcAreaCirc(radio))

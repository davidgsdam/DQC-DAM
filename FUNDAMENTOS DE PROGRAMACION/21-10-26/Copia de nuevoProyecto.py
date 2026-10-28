#Bloque de constantes
STRING_TOTAL_FACTURA = "El total de la factura (LEY / 34) es "
STRING_DIVISA_EUR = "€"
#Bloque de variables
item_1 = 50.5
item_2 = 10
total_factura = item_1 + float(item_2)

item_1 = 80
total_factura = item_1 + float(item_2)

alta_cliente_1 = False
alta_cliente_2 = True
stock_item_1 = False
stock_item_2 = True

resultado_condicional = alta_cliente_2 and stock_item_1
resultado_condiciona2 = (alta_cliente_2 and stock_item_1) or (alta_cliente_2) and not (stock_item_1) #Ni idea
resultado_condicional3 = alta_cliente_2 and (stock_item_1 or stock_item_2) #Ni idea
print(resultado_condicional3)
print(resultado_condiciona2)

print(resultado_condicional)

print("El total de la factura es " + str(50.5 + 10))
print(STRING_TOTAL_FACTURA + str(item_1 + item_2))
print(STRING_TOTAL_FACTURA + str(total_factura) + STRING_DIVISA_EUR)
#print(f"{STRING_TOTAL_FACTURA} {total_factura}{STRING_DIVISA_EUR}")

def funcion_primera():
    print("Primera funcion")

funcion_primera()

#def print(texto):
    #Tdodo codigo imprimir pantalla
    #print("hola")

#print("asda")

a = 5

def segunda_funcion():
    a = 2
    print(a)

def tercera_funcion(parametro):
    impuesto = 5 + parametro
    #tercera_funcion(parametro)
    a = 11
    return impuesto

total = tercera_funcion(10)

print(total)

def saludar_usuario(nombre):
    a = 6
    segunda_funcion()
    tercera_funcion()
    print("Hola, " + nombre + ". Bienvenido " + str(a) )

def tercera_funcion():
    print("Elefante")

saludar_usuario("David")


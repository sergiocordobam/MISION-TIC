def entrada():
    valor1 = int(input("Ingrese un entero: "))
    print("El valor de la variable es:", valor1)

    valor2 = float(input("Ingrese otro entero: "))
    print("El valor con iva es de: ", (valor2*0.19))
entrada()

def promedio():
    edad1 = int(input("Ingrese la edad 1: "))
    edad2 = int(input("Ingrese la edad 2: "))
    edad3 = int(input("Ingrese la edad 3: "))
    edad4 = int(input("Ingrese la edad 4: "))
    edad5 = int(input("Ingrese la edad 5: "))
    edad6 = int(input("Ingrese la edad 6: "))

    suma = int(edad1+edad2+edad3+edad4+edad5+edad6)
    print("La suma de las edades es:",suma)
    promedio = suma/6
    print("El promedio de la edades es: ",promedio)
promedio()
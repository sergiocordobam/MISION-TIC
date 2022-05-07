def solucion(b,n):
    intentos = 0
    while True:
        numero = int(input("Ingrese un número: "))
        if numero >= 0 and numero <= b:
            if numero > n:
                intentos += 1
                print("¡Ups! Te pasaste")
            elif numero < n:
                intentos += 1
                print("¡Ups! Estás por debajo")
            else:
                intentos += 1
                print(f"¡LO LOGRASTE! Usaste {intentos} intentos")
                break
        else: 
            print("¡Te saliste del intervalo!")
solucion(25,15)


def solucion():
    subtotal = [0]
    while True:
        valorUnitario = int(input("Ingrese el valor unitario: "))
        iva = input("¿El producto cuenta con IVA?: ")
        cantidad = int(input("Ingrese la cantidad que lleva el cliente del producto a registrar: "))
        if iva == "S":
            print("IVA incluído")
            precio = valorUnitario*cantidad
            ivaProducto = precio*0.19
            subtotal[0] = subtotal[0] + (precio + ivaProducto)
            print(f"SUBTOTAL: {subtotal[0]}")
        elif iva == "N":
            print("PRODUCTO SIN IVA")
            subtotal[0] = subtotal[0] + (valorUnitario*cantidad) 
            print(f"SUBTOTAL: {subtotal[0]}")
        faltanProductos = input("¿Faltan productos por cobrar?: ")
        if faltanProductos != "S":
            print(f"TOTAL A COBRAR: {subtotal[0]}")
            break
solucion()

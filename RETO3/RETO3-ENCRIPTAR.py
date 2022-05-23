import numpy as np
import random

def encriptado(texto):
    longitud = len(texto)
    n = longitud ** (1/2)
    if n//1 == n:
        pass
    else:
        n = (n//1) + 1
    n = int(n)

    for i in range(len(texto), n**2):
        texto += "_"
    texto = list(texto)
    
    clave = []
    for i in range(len(texto)):
        clave.append(i)
    random.shuffle(clave)

    sinOrden = []
    for i in clave:
        sinOrden.append(ord(texto[i]))
    array_final = np.array(sinOrden).reshape(n,n)
    return array_final, clave

def desencriptado(array_encriptado, clave):
    lista = array_encriptado.ravel().tolist() # .ravel() sirve para aplanar la matriz
    texto_final = []
    for i in range (len(lista)):
        indice = clave.index(i)
        texto_final.append(chr(lista[indice]))
    texto = "".join(texto_final)
    texto = texto.replace("_", "")
    return texto 
a, b = encriptado("Today is Caturday!")
print(desencriptado(a,b))


texto = ['Usted', 'forma', 'parte', 'de', 'un', 'equipo', 'que', 'se', 'dedica', 'a', 'analizar', 'textos', 
'pequeños', 'para', 'conocer', 'su', 'composición.', 'Los', 'compañeros', 'de', 'equipo', 'han', 'creado', 'a', 
'partir', 'de', 'un', 'cuento', 'breve', 'una', 'lista', 'de', 'Python', 'que', 'contiene', 'cada', 'una', 'de', 
'las', 'palabras', 'que', 'lo', 'componen;', 'pero', 'en', 'la', 'creación', 'de', 'la', 'lista', 'de', 'palabras', 
'no', 'evitaron', 'que', 'aparecieran', 'adheridos', 'a', 'algunas', 'de', 'las', 'palabras', 'los', 'signos', 'de', 
'puntuación', 'ni', 'los', 'guiones', 'que', 'estaban', 'dentro', 'del', 'cuento', 'original.']

def eliminar_y_minuscula(lista_texto):
    caracteres = ['-','¿','?','.',',','¡','!',':','"','–']
    lista_texto = " ".join(lista_texto)
    for palabra in lista_texto:
        lista_texto = lista_texto.lower()
    
    for caracter in caracteres:
        lista_texto = lista_texto.replace(caracter,"")
    lista_texto = lista_texto.split(" ")
    return lista_texto


def conteo(lista_texto):
    lista_conteo = []
    lista_aux = []
    frecuencias = {}
    for palabra in lista_texto:
        if palabra != "":
            frecuencias[palabra] = lista_texto.count(palabra)
    lista_aux = sorted(frecuencias.items(), key= lambda x:x[1], reverse=True)
    for i in range(len(lista_aux)):
        lista_aux[i] = list(lista_aux[i])
    lista_conteo = [lista_aux[i] for i in range(0,20)]
    return lista_conteo

def main(lista_texto):
    lista = eliminar_y_minuscula(lista_texto)
    lista_conteo = conteo(lista)
    return lista_conteo
print(main(texto))
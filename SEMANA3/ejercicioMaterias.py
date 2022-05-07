#Preguntar nombres asignaturas
#Preguntar las notas
##Imprimirlas
def notas():
    resumen = []
    while True:
        numeroMaterias = int(input("Ingrese el numero de materias: "))
        for i in range(numeroMaterias):
            materia = input("Ingrese la materia: ")
            nota = float(input("Ingrese la nota: "))
            aux = tuple((materia, nota))
            resumen.append(aux)
        print("Sus respectivas notas en las siguientes materias fueron:",resumen)
        break
notas()



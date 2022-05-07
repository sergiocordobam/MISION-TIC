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
            while nota < 0 or nota > 5:
                nota = float(input("Por favor ingrese una nota válida: "))
            aux = tuple((materia.capitalize(), nota))
            resumen.append(aux)
        print("Sus respectivas notas en las siguientes materias fueron:",resumen)
        break
notas()



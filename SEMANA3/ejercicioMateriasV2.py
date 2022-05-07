#Preguntar nombres asignaturas
#Preguntar las notas
##Imprimirlas
def notas():
    materias = []
    notas = []
    while True:
        numeroMaterias = int(input("Ingrese el numero de materias: "))
        for i in range(numeroMaterias):
            materia = input("Ingrese la materia: ")
            nota = float(input("Ingrese la nota: "))
            materias.append(materia.capitalize())
            notas.append(nota)
        aux = dict(zip(materias,notas))
        print("Sus respectivas notas en las siguientes materias fueron:",aux)
        break
notas()

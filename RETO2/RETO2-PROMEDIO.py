def calcular_promedio_y_cuadro_de_honor(grupo: list):
    sumaNotas = 0
    for i in grupo:
        for k,v in i.items():
            sumaNotas += i["nota_fundamentos"]
            break
    promedio = (sumaNotas/len(grupo))
    return promedio

estudiante1 = {
    "cédula":"00014301503",
    "nombre": "Pepito",
    "nota_fundamentos": 4.3
}

estudiante2 = {
    "cédula":"1037678471",
    "nombre": "Fulanito",
    "nota_fundamentos": 3.2
}

estudiante3 = {
    "cédula":"710223567",
    "nombre": "Pancho",
    "nota_fundamentos": 5
}
grupo = [estudiante1, estudiante2, estudiante3]
print(calcular_promedio_y_cuadro_de_honor(grupo))

    


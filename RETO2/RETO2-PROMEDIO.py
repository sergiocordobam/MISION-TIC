def calcular_promedio_y_cuadro_de_honor(grupo: list):
    sumaNotas = 0 
    cuadro_honor = {"1": [], "2": [], "3": [] }
    for estudiante in grupo:
        for key,value in estudiante.items():
            sumaNotas += estudiante["nota_fundamentos"]
            if estudiante["nota_fundamentos"] == 5:
                cuadro_honor["1"].append(estudiante["cédula"])
            elif estudiante["nota_fundamentos"] >= 4 and estudiante["nota_fundamentos"] < 5:
                cuadro_honor["2"].append(estudiante["cédula"])
            else:
                if estudiante["nota_fundamentos"] >= 3 and estudiante["nota_fundamentos"] < 4:
                    cuadro_honor["3"].append(estudiante["cédula"])
            break
    promedio = (sumaNotas/len(grupo))
    return promedio, cuadro_honor
    
    

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

estudiante4 = {
    "cédula":"11111111",
    "nombre": "Pancho",
    "nota_fundamentos": 4
}
grupo = [estudiante1, estudiante2, estudiante3, estudiante4]
print(calcular_promedio_y_cuadro_de_honor(grupo))

    


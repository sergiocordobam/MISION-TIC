import csv, json
def solucion():
    file = open('JandJ.csv')
    leer = csv.reader(file)
    Date = []
    Open = []
    High = []
    Low = []
    Close = []
    Adj_Close = []
    Volume = []
    
    next(leer,None)
    for i in leer:
        Date.append(i[0])
        Open.append(float(i[1]))
        High.append(float(i[2]))
        Low.append(float(i[3]))
        Close.append(float(i[4]))
        Adj_Close.append(float(i[5]))
        Volume.append(int(i[6]))
    
    file.close()
    longitud = len(Date)
    variacion = []
    absoluto = []
    for i in range(longitud):
        resta = Close[i]-Open[i]
        absoluto.append(abs(Close[i]-Open[i]))
        if resta > 0:
            variacion.append('SUBE')
        elif resta < 0:
            variacion.append('BAJA')
        elif resta == 0:
            variacion.append('ESTABLE')
        
            
    #Creación de archivo CSV
    cabecera = ["Fecha analizada", "Comportamiento de la accion", "Punto medio "]
    with open('analisis_archivo.csv',"w") as archivo:
        escribir = csv.writer(archivo, delimiter="\t")
        escribir.writerow(cabecera)
        final = list(map(list,zip(Date, variacion, absoluto)))
        escribir.writerows(final)
    
    diccionario = {}
    lowest = min(Volume)
    highest = max(Volume)
    mean = sum(Volume)/len(Volume)
    greatest = max(absoluto)
    
    for i in range(longitud):
        if Volume[i] == lowest:
            diccionario['date_lowest_volume'] = Date[i]
            diccionario['lowest_volume'] = lowest
        if Volume[i] == highest:
            diccionario['date_highest_volume'] = Date[i]
            diccionario['highest_volume'] = highest
        diccionario['mean_volume'] = mean
        if absoluto[i] == greatest:
            diccionario['date_greatest_difference'] = Date[i]
            diccionario['greatest_difference'] = greatest
    with open('detalles.json','w') as archivo:
        json.dump(diccionario,archivo)
solucion()
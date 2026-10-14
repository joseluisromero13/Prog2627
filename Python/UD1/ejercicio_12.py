#Ejercicio 12

edad = input("Escribe tu edad:")
estudia = input("Eres estudiante, responde si o no:")
precio = input("Escribe el importe total de su compra")

estudia_si = estudia == "si"




descuento = int(edad) > 65 or estudia_si == True and float(precio) > 50

print(f"Edad: {edad} \n¿Es estudiante? (si/no): {estudia} \nMonto de compra: {precio} \n¿Aplica descuento?: {str(descuento)} ")

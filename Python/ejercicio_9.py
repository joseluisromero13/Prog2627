#Ejercicio 9 Ficha del programador:

nombre = input("Escribe tu nombre:")
fecha = input("Escribe tu año de nacimiento:")
altura = input("Escribe tu altura en metros:")

#Conversión a sus formatos
ano_actual = 2026
edad = ano_actual - int(fecha)
cadena = float(altura)


#1º Forma de resolverlo
"""
print("Nombre: " + str(nombre) + " Tipo: " + str(type(nombre)))
print("Edad: " + str(edad) + " Tipo: " + str(type(edad)))
print("Altura: " + str(cadena) + " Tipo: " + str(type(cadena)))
"""

#2º Forma de resolverlo
"""
print(f"Nombre: {nombre} (Tipo: {str(type(nombre))})")
print(f"Edad: {edad} años (Tipo: {str(type(edad))})")
print(f"Nombre: {cadena} m (Tipo: {str(type(cadena))})")
"""

#3º Fomra de resolverlo
print(f"--- FICHA REGISTRADA --- \nNombre: {nombre} (Tipo: {type(nombre)}) \nEdad: {edad} años (Tipo: {str(type(edad))}) \nNombre: {cadena} m (Tipo: {str(type(cadena))})")

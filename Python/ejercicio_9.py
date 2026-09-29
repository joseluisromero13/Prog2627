#Ejercicio 9 Ficha del programador:

print("Escribe tu numbre")
nombre = input()
print("Escribe tu año de nacimiento")
fecha = input()
print("Escribe tu altura en metros")
altura = input()

#Conversión a sus formatos
ano_actual = 2026
edad = ano_actual - int(fecha)
cadena = float(altura)


"""
print("Nombre: " + str(nombre) + " Tipo: " + str(type(nombre)))
print("Edad: " + str(edad) + " Tipo: " + str(type(edad)))
print("Altura: " + str(cadena) + " Tipo: " + str(type(cadena)))
"""

print(f"Nombre: {nombre} (Tipo: {type(nombre)})")
print(f"Edad: {edad} (Tipo: {str(type(edad))})")
print(f"Nombre: {cadena} (Tipo: {str(type(cadena))})")




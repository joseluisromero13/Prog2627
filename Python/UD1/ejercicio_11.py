#Ejercicio 11

total_caramelo = int(input("Escribe la cantidad total de caramelos:"))
total_alumno = int(input("Escribe la cantidad total de alumnos:"))

reparto = total_caramelo // total_alumno
resto = total_caramelo % total_alumno
print(f"Cada alumno recibe: {reparto} caramelos")
print(f"Sobran en la bolsa: {resto} caramelos")

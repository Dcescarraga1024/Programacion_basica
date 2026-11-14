Algoritmo Boleta_de_cine_con_descuento
	definir edad Como Entero
	definir rta Como Caracter
	Escribir "deme su edad: "
	leer edad
	Escribir " usted es estudiante responda S o N en mayusculas"
	leer rta
	Si edad >= 18 y edad <= 25 y rta = "S" Entonces
		Escribir "El valor de la voleta es de: 10000 " 
	SiNo
		Escribir "El valor de la voleta es de: 20000 " 
	Fin Si
FinAlgoritmo

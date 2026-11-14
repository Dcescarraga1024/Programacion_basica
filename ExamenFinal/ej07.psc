Algoritmo nota_cualitativa
	definir nota Como Real
	Escribir "deme su nota de (0 a 5)"
	leer nota
	Si nota <0 o nota >5 Entonces
		Escribir "nota invalida"
	SiNo
		Si nota<3 Entonces
			Escribir "reprobado"
		SiNo
			Si nota>=3 y nota <4 Entonces
				Escribir "aceptable"
			SiNo
				Si nota>=4 y nota<= 4.5 Entonces
					Escribir "bueno"
				SiNo
					Escribir "excelente"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo

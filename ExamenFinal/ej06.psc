Algoritmo nivel_tanque_agua
	definir nivel Como Real
	Escribir "deme el nivel que esta actualmente el tanque de agua (0 a 100)"
	leer nivel
	Si nivel < 20 Entonces
		Escribir "nivel critico"
	SiNo
		Si nivel >= 20 y nivel < 60 Entonces
			Escribir "nivel medio"
		SiNo
			Escribir "nivel alto"
		Fin Si
	Fin Si
FinAlgoritmo

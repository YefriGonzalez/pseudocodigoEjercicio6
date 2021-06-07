Algoritmo Ejercicio6
	personasMayores25=0
	personasMenores25=0
	totalEdadesMenores25=0
	totalEdadesMayores25=0
	Para i=1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese edad"
		leer edad
		si edad>25 Entonces
			personasMayores25=personasMayores25+1
			totalEdadesMayores25=totalEdadesMayores25+edad
		sino si edad<25 Entonces
				personasMenores25=personasMenores25+1
				totalEdadesMenores25=totalEdadesMenores25+edad
			sino
				Escribir "Se quivoco de dato"
			FinSi
		FinSi
	FinPara
	promedioEdadesMayores25=(totalEdadesMayores25/personasMayores25)
	promedioEdadesMenores25=(totalEdadesMenores25/personasMenores25)
	Escribir "Promedio de edad de personas mayores de 25 años: " promedioEdadesMayores25
	Escribir "Promedio de edad de personas menores de 25 años: " promedioEdadesMenores25
	
FinAlgoritmo

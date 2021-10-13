Algoritmo sin_titulo
	Escribir 'Vamos a resolver la ecuación a*x=c-b'
	Escribir 'Introduce el valor de a'
	Leer a
	Si a=0 Entonces
		Escribir 'No se puede realizar la operación'
	SiNo
		Escribir 'Introduce el valor de b'
		Leer b
		Escribir 'Introduce el valor de c'
		x <- (c-b)/a
		Leer c
		Escribir 'El valor de x es:',x
	FinSi
FinAlgoritmo

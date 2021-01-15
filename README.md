*Jorge Miguel Aaron Barrientos Alvarez
*NC:421111666
*jma.barrientos@ciencias.unam.mx

*En este archivo README se encuentran las respuestas a los ejercicios 1 y 3
de la tarea 6.

**Ejercicio 1.

*Inciso 1.
En pantalla se imprimiría lo siguiente:

   2
   5
   5
   6
   8
   
¿Por qué? la condición del while se cumple hasta que valores[a]=8 y
valores[a+1]=10. Ya que, en la siguiente iteración, valores[a]=10 y
valores[a+1]=4, lo cual no cumple la condición de que
valores[a]<=valores[a+1], por lo que se rompe el ciclo while después de
imrpimir el número 8.

*Inciso 2.
En pantalla se imprimiría lo siguiente:

   2
   1
   5
   3
   8
   10
   13

¿Por qué? la condición del while se cumple hasta justo después de imprimir
el número 13, ya que, después de que b incrementa en 1 su valor, b es
igual a 7, y valores[7]=5, por lo que no se cumple la condición del while
y por lo tanto este termina.


**Ejercicio 3
Supongamos que se crea una clase VehiculoTerrestre cuyas instancias tengan
algunos atributos como: cantidad de ruedas, tipo de motor (eléctrico o de
combustión interna) y cantidad máxima de pasajeros que pueden viajar en él.

Luego, podría crearse una subclase de VehiculoTerrestre que se llame,
por ejemplo, Motocicleta. Esta podría icluir, además de los atributos
de la clase VehiculoTerrestre, atributos que les puedan interesar a
los posibles usuarios de dicho tansporte, como: tamaño del motor en cc,
potencia, y si es manual o automática, entre otros. Luego, de esta
misma subclase Motocicleta pueden crearse más subclases de esta.
Como MotocicletaDeportiva, MotocicletaDeTrabajo, MotocicletaDeCarreras; etc.

Un ejemplo análogo sería al crear una subclase de VehiculoTerrestre que se
llame Automovil. De la cual, a su vez, se podrían crear subclases como
Camioneta, Camion, Bus, AutoDeCarreras, etc. De las cuales, a su vez, se
pueden crear aún más clases, como CamionetaDeTrabajo, MamaVan, CamionDeBasura,
CamionDeTransporte, AutoFormula1, AutoRally, etc.

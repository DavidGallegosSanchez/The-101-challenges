# The-101-challenges
101 exercises to practice programming logic

## Challenge 1 - El famoso "Fizz Buzz"
Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
- Múltiplos de 3 por la palabra "fizz".
- Múltiplos de 5 por la palabra "buzz".
- Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".

## Challenge 2 - ¿Es un anagrama?
Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Bool) según sean o no anagramas.
- Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
- NO hace falta comprobar que ambas palabras existan.
- Dos palabras exactamente iguales no son anagrama.
 
## Challenge 3 - La sucesión de Fibonacci
Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
- La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
-  0, 1, 1, 2, 3, 5, 8, 13...

## Challenge 4 - ¿Es un número primo?
Escribe un programa que se encargue de comprobar si un número es o no primo.
- Hecho esto, imprime los números primos entre 1 y 100.

## Challenge 5 - Área de un polígono
Crea una única función (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
- La función recibirá por parámetro sólo UN polígono a la vez.
- Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
- Imprime el cálculo del área de un polígono de cada tipo.

## Challenge 6 - Aspect ratio de una imagen
Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
- Url de ejemplo:
  https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
- Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.

## Challenge 7 - Invirtiendo cadenas
Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
- Si le pasamos "Hola mundo" nos retornaría "odnum aloH"

## Challenge 8 - Contando palabras
Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
- Los signos de puntuación no forman parte de la palabra.
- Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
- No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.

## Challenge 9 - Decimal a binario
Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.

## Challenge 10 - Código Morse
Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
- Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
- En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
- El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.

## Challenge 11 - Expresiones equilibradas
Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
- Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
- Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
- Expresión balanceada: { [ a * ( c + d ) ] - 5 }
- Expresión no balanceada: { a * ( c + d ) ] - 5 }

## Challenge 12 - Eliminando caracteres
Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
- out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
- out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.

## Challenge 13 - ¿Es un palindromo?
Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
NO se tienen en cuenta los espacios, signos de puntuación y tildes.
Ejemplo: Ana lleva al oso la avellana.

## Challenge 14 - Factorial recursivo
Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.

## Challenge 15 - ¿Es un número de Armtrong?
Escribe una función que calcule si un número dado es un número de Armstrong (o también llamado narcisista).
Si no conoces qué es un número de Armstrong, debes buscar información al respecto.

## Challenge 16 - ¿Cuanto días
Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
- Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
- La función recibirá dos String y retornará un Int.
- La diferencia en días será absoluta (no importa el orden de las fechas).
- Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.

## Challenge 17 - En mayúscula
Crea una función que reciba un String de cualquier tipo y se encargue de poner en mayúscula la primera letra de cada palabra.
- No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.

## Challenge 18 - La carrera de obstáculos
Crea una función que evalúe si un/a atleta ha superado correctamente una carrera de obstáculos.
- La función recibirá dos parámetros:
  - Un array que sólo puede contener String con las palabras "run" o "jump"
  - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
- La función imprimirá cómo ha finalizado la carrera:
  - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no variará el símbolo de esa parte de la pista.
  - Si hace "jump" en "_" (suelo), se variará la pista por "x".
  - Si hace "run" en "|" (valla), se variará la pista por "/".
- La función retornará un Boolean que indique si ha superado la carrera.
Para ello tiene que realizar la opción correcta en cada tramo de la pista.

## Challenge 19 - Tres en raya
Crea una función que analice una matriz 3x3 compuesta por "X" y "O" y retorne lo siguiente:
  - "X" si han ganado las "X"
  - "O" si han ganado los "O"
  - "Empate" si ha habido un empate
  - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta. O si han ganado los 2.
Nota: La matriz puede no estar totalmente cubierta.
Se podría representar con un vacío "", por ejemplo.

## Challenge 20 - Conversor tiempo
Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.


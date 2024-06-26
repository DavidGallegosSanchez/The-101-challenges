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

## Challenge 21 - Parando el tiempo
Crea una función que sume 2 números y retorne su resultado pasados unos segundos.
 - Recibirá por parámetros los 2 números a sumar y los segundos que debe tardar en finalizar su ejecución.
 - Si el lenguaje lo soporta, deberá retornar el resultado de forma asíncrona, es decir, sin detener la ejecución del programa principal.
Se podría ejecutar varias veces al mismo tiempo.
 
## Challenge 22 - Calculadora .txt
Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su resultado e imprímelo.
 - El .txt se corresponde con las entradas de una calculadora.
 - Cada línea tendrá un número o una operación representada por un símbolo (alternando ambos).
 - Soporta números enteros y decimales.
 - Soporta las operaciones suma "+", resta "-", multiplicación "*" y división "/".
 - El resultado se muestra al finalizar la lectura de la última línea (si el .txt es correcto).
 - Si el formato del .txt no es correcto, se indicará que no se han podido resolver las operaciones.

## Challenge 23 - Conjuntos
Crea una función que reciba dos array, un booleano y retorne un array.
 - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.

## Challenge 24 - Máximo común divisor y mínimo común múltiplo
Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.

## Challenge 25 - Iteration master
Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de ellas.

## Challenge 26 - Piedra, papel, tijera
Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
 - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 - La función recibe un listado que contiene pares, representando cada jugada.
 - El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
 - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 
## Challenge 27 - Cuadrado y triángulo 2D
Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
 - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
 - EXTRA: ¿Eres capaz de dibujar más figuras?

## Challenge 28 - Vectores ortogonales
Crea un programa que determine si dos vectores son ortogonales.
 - Los dos array deben tener la misma longitud.
 - Cada vector se podría representar como un array. Ejemplo: [1, -2]

## Challenge 29 - Máquina expendedora
Simula el funcionamiento de una máquina expendedora creando una operación que reciba dinero (array de monedas) y un número que indique la selección del producto.
 - El programa retornará el nombre del producto y un array con el dinero de vuelta (con el menor número de monedas).
 - Si el dinero es insuficiente o el número de producto no existe, deberá indicarse con un mensaje y retornar todas las monedas.
 - Si no hay dinero de vuelta, el array se retornará vacío.
 - Para que resulte más simple, trabajaremos en céntimos con monedas de 5, 10, 50, 100 y 200.
 - Debemos controlar que las monedas enviadas estén dentro de las soportadas.
 
## Challenge 30 - Ordena la lista
Crea una función que ordene y retorne una matriz de números.
 - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
 - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.

## Challenge 31 - Marco de palabras
Crea una función que reciba un texto y muestre cada palabra en una línea, formando un marco rectangular de asteriscos.
 - ¿Qué te parece el reto? Se vería así:
 **********
 * ¿Qué   *
 * te     *
 * parece *
 * el     *
 * reto?  *
 **********
 
## Challenge 32 - Años bisiestos
Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
 - Utiliza el menor número de líneas para resolver el ejercicio.

## Challenge 33 - El segundo
Dado un listado de números, encuentra el SEGUNDO más grande

## Challenge 34 - Ciclo sexagenario chino
Crea un función, que dado un año, indique el elemento  y animal correspondiente en el ciclo sexagenario del zodíaco chino.
 - Info: https://www.travelchinaguide.com/intro/astrology/60year-cycle.htm
 - El ciclo sexagenario se corresponde con la combinación de los elementos madera, fuego, tierra, metal, agua y los animales rata, buey, tigre, conejo, dragón, serpiente, caballo, oveja, mono, gallo, perro, cerdo (en este orden).
 - Cada elemento se repite dos años seguidos.
 - El último ciclo sexagenario comenzó en 1984 (Madera Rata).
 
## Challenge 35 - Los números perdidos
Dado un array de enteros ordenado y sin repetidos, crea una función que calcule y retorne todos los que faltan entre el mayor y el menor.
 - Lanza un error si el array de entrada no es correcto.
 
## Challenge 36 - Batalla Pokemon
Crea un programa que calcule el daño de un ataque durante una batalla Pokémon.
 - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico (buscar su efectividad)
 - El programa recibe los siguientes parámetros:
 - Tipo del Pokémon atacante.
 - Tipo del Pokémon defensor.
 - Ataque: Entre 1 y 100.
 - Defensa: Entre 1 y 100.

## Challenge 37 - Los anillos de poder
¡La Tierra Media está en guerra! En ella lucharán razas leales a Sauron contra otras bondadosas que no quieren que el mal reine sobre sus tierras.
Cada raza tiene asociado un "valor" entre 1 y 5:
 - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3), Númenóreanos (4), Elfos (5)
 - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2),  Huargos (3), Trolls (5)
 Crea un programa que calcule el resultado de la batalla entre los 2 tipos de ejércitos:
 - El resultado puede ser que gane el bien, el mal, o exista un empate.
   Dependiendo de la suma del valor del ejército y el número de integrantes.
 - Cada ejército puede estar compuesto por un número de integrantes variable de cada raza.
 - Tienes total libertad para modelar los datos del ejercicio.
 Ej: 1 Peloso pierde contra 1 Orco
     2 Pelosos empatan contra 1 Orco
     3 Pelosos ganan a 1 Orco

## Challenge 38 - Los labzamientos de "The Legen of Zelda"
¡Han anunciado un nuevo "The Legend of Zelda"!
Se llamará "Tears of the Kingdom" y se lanzará el 12 de mayo de 2023.
Pero, ¿recuerdas cuánto tiempo ha pasado entre los distintos "The Legend of Zelda" de la historia?
Crea un programa que calcule cuántos años y días hay entre 2 juegos de Zelda que tú selecciones.
- Debes buscar cada uno de los títulos y su día de lanzamiento
- (si no encuentras el día exacto puedes usar el mes, o incluso inventártelo)

## Challenge 39 - Binario a Decimal
Crea un programa se encargue de transformar un número binario a decimal sin utilizar funciones propias del lenguaje que lo hagan directamente.

## Challenge 40 - Top Algoritmos | Quick sort
Implementa uno de los algoritmos de ordenación más famosos: el "Quick Sort", creado por C.A.R. Hoare.
- Entender el funcionamiento de los algoritmos más utilizados de la historia Nos ayuda a mejorar nuestro conocimiento sobre ingeniería de software.
  Dedícale tiempo a entenderlo, no únicamente a copiar su implementación.
- Esta es una nueva serie de retos llamada "TOP ALGORITMOS", donde trabajaremos y entenderemos los más famosos de la historia.

## Challenge 41 - Triangulo de Pascal
Crea una función que sea capaz de dibujar el "Triángulo de Pascal" indicándole únicamente el tamaño del lado.
 - Aquí puedes ver rápidamente cómo se calcula el triángulo: https://commons.wikimedia.org/wiki/File:PascalTriangleAnimated2.gif

## Challenge 42 - Ley de Ohm
Crea una función que calcule el valor del parámetro perdido correspondiente a la ley de Ohm.
 - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará el valor del tercero (redondeado a 2 decimales).
 - Si los parámetros son incorrectos o insuficientes, la función retornará la cadena de texto "Invalid values".

## Challenge 43 - Conversor de temperatura
Crea una función que transforme grados Celsius en Fahrenheit y viceversa.
 - Para que un dato de entrada sea correcto debe poseer un símbolo "°"y su unidad ("C" o "F").
 - En caso contrario retornará un error.

## Challenge 44- Truco o trato
Este es un reto especial por Halloween.
Deberemos crear un programa al que le indiquemos si queremos realizar "Truco o Trato" y un listado (array) de personas con las siguientes propiedades:
- Nombre de la niña o niño
- Edad
-  Altura en centímetros
Si las personas han pedido truco, el programa retornará sustos (aleatorios) siguiendo estos criterios:
- Un susto por cada 2 letras del nombre por persona
- Dos sustos por cada edad que sea un número par
- Tres sustos por cada 100 cm de altura entre todas las personas
- Sustos: 🎃 👻 💀 🕷 🕸 🦇

Si las personas han pedido trato, el programa retornará dulces (aleatorios) siguiendo estos criterios:
- Un dulce por cada letra de nombre
- Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
- Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
- Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
- En caso contrario retornará un error.

## Challenge 45 - Bumeranes
Crea una función que retorne el número total de bumeranes de un array de números enteros e imprima cada uno de ellos.
- Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números seguidos, en el que el primero y el último son iguales, y el segundo es diferente. Por ejemplo [2, 1, 2].
- En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).

## Challenge 46 - Contenedor de agua
Dado un array de números enteros positivos, donde cada uno representa unidades de bloques apilados, debemos calcular cuantas unidades de agua quedarán atrapadas entre ellos.
- Ejemplo: Dado el array [4, 0, 3, 6, 1, 3].

        ⏹
        ⏹
  ⏹💧💧⏹
  ⏹💧⏹⏹💧⏹
  ⏹💧⏹⏹💧⏹
  ⏹💧⏹⏹⏹⏹

Representando bloque con ⏹︎ y agua con 💧, quedarán atrapadas 7 unidades de agua. Suponemos que existe un suelo impermeable en la parte inferior que retiene el agua.

## Challenge 47 - ¿Donde está el robot?
Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y".
- El robot comienza en la coordenada (0, 0).
- Para idicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos) que indican la secuencia de pasos a dar.
- Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene, y finalmente 2.
El resultado en este caso sería (x: -5, y: 12)
- Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
- Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte positiva del eje "y".
- El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira 90 grados en el sentido contrario a las agujas del reloj.

## Challenge 48 - Vocal más común
Crea un función que reciba un texto y retorne la vocal que más veces se repita.
- Ten cuidado con algunos casos especiales.
- Si no hay vocales podrá devolver vacío.

## Challenge 49 - El calendario de adviento 2022
¿Conoces el calendario de adviento de la comunidad (https://adviento.dev)? 24 días, 24 regalos sorpresa relacionados con desarrollo de software, ciencia y tecnología desde el 1 de diciembre.
Enunciado: Crea una función que reciba un objeto de tipo "Date" y retorne lo siguiente:
- Si la fecha coincide con el calendario de aDEViento 2022: Retornará el regalo de ese día (a tu elección) y cuánto queda para que finalice el sorteo de ese día.
- Si la fecha es anterior: Cuánto queda para que comience el calendario.
- Si la fecha es posterior: Cuánto tiempo ha pasado desde que ha finalizado.
Notas:
- Tenemos en cuenta que cada día del calendario comienza a medianoche 00:00:00 y finaliza a las 23:59:59.
- Debemos trabajar con fechas que tengan año, mes, día, horas, minutos y segundos.

## Challenge 50 - El detector de Handles
Crea una función que sea capaz de detectar y retornar todos los
handles de un texto usando solamente Expresiones Regulares.
Debes crear una expresión regular para cada caso:
- Handle usuario: Los que comienzan por "@"
- Handle hashtag: Los que comienzan por "#"
- Handle web: Los que comienzan por "www.", "http://", "https://" y finalizan con un dominio (.com, .es...)

## Challenge 51 - La encriptación de karaca
Crea una función que sea capaz de encriptar y desencriptar texto utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre él).

## Challenge 52 - El reto random
Crea tu propio enunciado para que forme parte de los retos de 2023.
- Ten en cuenta que su dificultad debe ser asumible por la comunidad y seguir un estilosemejante a los que hemos realizado durante el año.
- Si quieres también puedes proponer tu propia solución al reto (en el lenguaje que quieras).

## Challenge 53 - El famoso "Fizz Buzz" (v2)
Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
- Múltiplos de 3 por la palabra "fizz".
- Múltiplos de 5 por la palabra "buzz".
- Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".

## Challenge 54 - El "lenguaje hacker"
Escribe un programa que reciba un texto y transforme lenguaje natural a "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje se caracteriza por sustituir caracteres alfanuméricos.
- Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet) con el alfabeto y los números en "leet". (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")

## Challenge 55 - El partido de tenis
Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien gane cada punto del juego.

- Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
- Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
  15 - Love
  30 - Love
  30 - 15
  30 - 30
  40 - 30
  Deuce
  Ventaja P1
  Ha ganado el P1
- Si quieres, puedes controlar errores en la entrada de datos.
- Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.

## Challenge 56 - El generador de contraseñas
Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
Podrás configurar generar contraseñas con los siguientes parámetros:
- Longitud: Entre 8 y 16.
- Con o sin letras mayúsculas.
- Con o sin números.
- Con o sin símbolos.
(Pudiendo combinar todos estos parámetros entre ellos)

## Challenge 57 - Primo, fibonacci y par
Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
Ejemplos:
- Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
- Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"

## Challenge 58 - ¡Hola mundo!
Escribe un !Hola Mundo! en todos los lenguajes de programación que puedas.
Seguro que hay algún lenguaje que te llama la atención y nunca has utilizado, o quizás quieres dar tus primeros pasos... ¡Pues este es el momento!

A ver quién se atreve con uno de esos lenguajes que no solemos ver por ahí...

## Challenge 59 - Piedra, papel, tijera, lagarto, spock
Crea un programa que calcule quien gana más partidas al piedra, papel, tijera, lagarto, spock.
- El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
- La función recibe un listado que contiene pares, representando cada jugada.
- El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
  "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
- Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
- Debes buscar información sobre cómo se juega con estas 5 posibilidades.

## Challenge 60 - El sombrero seleccionador
Crea un programa que simule el comportamiento del sombrero seleccionador del universo mágico de Harry Potter.
- De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
- Cada pregunta tendrá 4 respuestas posibles (también a seleccionar a través de terminal).
- En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que coloque al alumno en una de las 4 casas de Hogwarts:
  (Gryffindor, Slytherin, Hufflepuff y Ravenclaw)
- Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador:
Por ejemplo, en Slytherin se premia la ambición y la astucia.

## Challenge 61 - El generador pseudoaleatorio
Crea un generador de números pseudoaleatorios entre 0 y 100.
- No puedes usar ninguna función "random" (o semejante) del lenguaje de programación seleccionado.
Es más complicado de lo que parece...

## Challenge 62 - Heterogrma, Isograma y pangrama
Crea 3 funciones, cada una encargada de detectar si una cadena de texto es un heterograma, un isograma o un pangrama.
- Debes buscar la definición de cada uno de estos términos.

## Challenge 63 - La API (Appication Programming Interface)
Llamar a una API es una de las tareas más comunes en programación.
Implementa una llamada HTTP a una API (la que tú quieras) y muestra su resultado a través de la terminal. Por ejemplo: Pokémon, Marvel...
Aquí tienes un listado de posibles APIs:
https://github.com/public-apis/public-apis

## Challenge 64 - Parámetros URL
Dada una URL con parámetros, crea una función que obtenga sus valores.
No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.

Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0 los parámetros serían ["2023", "0"]

## Challenge 65 - Viernes 13
Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
- La función recibirá el mes y el año y retornará verdadero o falso.

## Challenge 66 - Adivina la palabra
Crea un pequeño juego que consista en adivinar palabras en un número máximo de intentos:
- El juego comienza proponiendo una palabra aleatoria incompleta
  - Por ejemplo "m_ur_d_v", y el número de intentos que le quedan
- El usuario puede introducir únicamente una letra o una palabra (de la misma longitud que la palabra a adivinar)
  - Si escribe una letra y acierta, se muestra esa letra en la palabra. Si falla, se resta uno al número de intentos
  - Si escribe una resolución y acierta, finaliza el juego, en caso contrario, se resta uno al número de intentos
  - Si el contador de intentos llega a 0, el jugador pierde
- La palabra debe ocultar de forma aleatoria letras, y nunca puede comenzar ocultando más del 60%
- Puedes utilizar las palabras que quieras y el número de intentos que consideres

## Challenge 67 - Octal y hexadecimal
Crea una función que reciba un número decimal y lo trasforme a Octal y Hexadecimal.
- No está permitido usar funciones propias del lenguaje de programación que realicen esas operaciones directamente.

## Challenge 68 - Aurebesh
Crea una función que sea capaz de transformar Español al lenguaje básico del universo Star Wars: el "Aurebesh".
- Puedes dejar sin transformar los caracteres que no existan en "Aurebesh".
- También tiene que ser capaz de traducir en sentido contrario.

¿Lo has conseguido? Nómbrame en twitter.com/mouredev y escríbeme algo en Aurebesh.

¡Que la fuerza os acompañe!

## Challenge 69 - La escalera
Crea una función que dibuje una escalera según su número de escalones.
- Si el número es positivo, será ascendente de izquierda a derecha.
- Si el número es negativo, será descendente de izquierda a derecha.
- Si el número es cero, se dibujarán dos guiones bajos (__).

Ejemplo: 4
       _
     _|
   _|
 _|
|

## Challenge 70 - Git y Github
¡Estoy de celebración! He publicado mi primer libro:
"Git y GitHub desde cero"
- Papel: mouredev.com/libro-git
- eBook: mouredev.com/ebook-git

¿Sabías que puedes leer información de Git y GitHub desde la gran mayoría de lenguajes de programación?

Crea un programa que lea los últimos 10 commits de este repositorio y muestre:
- Hash
- Autor
- Mensaje
- Fecha y hora

Ejemplo de salida:
Commit 1 (el más reciente) | 12345A | MoureDev | Este es un commit | 24/04/2023 21:00

Se permite utilizar librerías que nos faciliten esta tarea.

## Challenge 71 -

## Challenge 72 -

## Challenge 73 -

## Challenge 74 -

## Challenge 75 -

## Challenge 76 -

## Challenge 77 -

## Challenge 78 -

## Challenge 79 -

## Challenge 80 -

## Challenge 81 -

## Challenge 82 -

## Challenge 83 -

## Challenge 84 -

## Challenge 85 -

## Challenge 86 -

## Challenge 87 -

## Challenge 88 -

## Challenge 89 -

## Challenge 90 -

## Challenge 91 -

## Challenge 92 -

## Challenge 93 -

## Challenge 94 -

## Challenge 95 -

## Challenge 96 -

## Challenge 97 -

## Challenge 98 -

## Challenge 99 -

## Challenge 100 -

## Challenge 101 -

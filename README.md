# Práctica: Estructuras Lineales (Pilas y Colas)

## Descripción
Este proyecto implementa soluciones para ejercicios clásicos de estructuras de datos utilizando Pilas (`Stack`) y Colas (`Queue`) en Java.

## Ejercicios implementados
1. **SignValidator**: Valida si una cadena de símbolos tiene los cierres correspondientes utilizando una pila.
2. **StackSorter**: Ordena los elementos de una pila de forma ascendente utilizando solo una pila auxiliar.
3. **QueuePalindrome**: Determina si una palabra es palíndromo utilizando una cola para comparar el orden de los caracteres.

## Cómo ejecutar
1. Asegúrate de tener instalado Java y el entorno configurado.
2. Compila los archivos desde la raíz del proyecto:
   `javac app/App.java utils/*.java`
3. Ejecuta la aplicación:
   `java app.App`

## Salida de consola
```text
SignValidator:
Resultado: true

StackSorter:
Antes: [5, 1, 3]
Despues: [1, 3, 5]

QueuePalindrome:
Es 'ana' palindromo: true
package app;
import utils.SignValidator;
import utils.StackSorter;
import utils.QueuePalindrome;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        //  EJERCICIO 1: VALIDACIÓN DE SIGNOS 
        System.out.println("Ejercicio 01: Validación de Signos");
        SignValidator signValidator = new SignValidator();
        System.out.println("Cadena: {([])} | Resultado: " + signValidator.isValid("{([])}"));
        System.out.println("Cadena: {([)]} | Resultado: " + signValidator.isValid("{([)]}"));

        //  EJERCICIO 2: ORDENAR PILA (STACK) 
        System.out.println("Ejercicio 02: Ordenar Stack");
        Stack<Integer> miPila = new Stack<>();
        miPila.push(2);
        miPila.push(4);
        miPila.push(1);
        miPila.push(5);
        
        System.out.println("Stack original: [2, 4, 1, 5]");
        StackSorter sorter = new StackSorter();
        sorter.sortStack(miPila);
        System.out.println("Stack ordenado: " + miPila);
        System.out.println("Tope esperado: " + miPila.peek());

        //  EJERCICIO 3: PALÍNDROMO CON COLAS 
        System.out.println("Ejercicio 03: Palíndromo usando Colas");
        QueuePalindrome queuePalindrome = new QueuePalindrome();
        System.out.println("ana | Resultado: " + queuePalindrome.isPalindrome("ana"));
        System.out.println("radar | Resultado: " + queuePalindrome.isPalindrome("radar"));
        System.out.println("java | Resultado: " + queuePalindrome.isPalindrome("java"));
    }
}
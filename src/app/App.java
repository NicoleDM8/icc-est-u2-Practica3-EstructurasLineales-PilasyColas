package app;
import utils.*;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        // EJERCICIO 1 : VALIDAR LOS SIGNOS
        SignValidator validator = new SignValidator();
        System.out.println("SignValidator:");
        System.out.println("Resultado: " + validator.isValid("([{}])"));

        // EJERCICIO 2 : ORDENAR LA PILA
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        System.out.println("StackSorter:");
        System.out.println("Antes: " + stack);
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);
        System.out.println("Despues: " + stack);

        // EJERCICIO 3: PALINDROMO
        QueuePalindrome qp = new QueuePalindrome();
        String palabra = "ana";
        System.out.println("QueuePalindrome:");
        System.out.println("Es '" + palabra + "' palindromo: " + qp.isPalindrome(palabra));
    }
}
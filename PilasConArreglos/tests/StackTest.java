package PilasConArreglos.tests;

import java.util.Scanner;

import PilasConArreglos.utils.Stack;

public class StackTest {
    public void testStackInteger() {
        Stack<Integer> stack = new Stack<Integer>(4);

        try {
            stack.push(20);
            stack.push(15);
            stack.push(10);
            stack.push(100);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void testStackString() {
        Stack<String> stackString = new Stack<String>(4);

        try {
            stackString.push("Hola");
            stackString.push("Mundo");
            stackString.push("!!!");

            System.out.println(stackString.pop());
            System.out.println(stackString.pop());
            System.out.println(stackString.pop());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public boolean testPalindromo() {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una palabra sin espacios: ");
        String palabra = consola.nextLine();

        Stack<String> palindromo = new Stack<String>(palabra.length());

        try {
            for (int i = 0; i < palabra.length(); i++) {// cargo palabra en la pila

                palindromo.push(String.valueOf(palabra.charAt(i)));

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Stack<String> revez = new Stack<String>(palabra.length());

        int i = 0;

        try {
            for (i=palabra.length(); i > 0; i--) {// cargo palabra al revez en la pila
                revez.push(String.valueOf(palabra.charAt(i-1)));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        try {
            for (i = 0; i < palabra.length(); i++) {
/*String letra1=palindromo.pop();
String letra2=revez.pop();
System.out.println(letra1);
System.out.println(letra2);*/
                if (palindromo.pop().compareTo(revez.pop()) != 0) {
                    System.out.println("No es un palindromo");
                    return false;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Es un palindromo");
        return true;
    }

}

package PilasConArreglos;

import java.util.Scanner;

import PilasConArreglos.tests.StackListTest;
import PilasConArreglos.tests.StackTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class");


int opcion=0;
Scanner consola= new Scanner(System.in);

System.out.println(("---MENU---"));
System.out.println("1- Stack con arreglos");
System.out.println("2- StackList");
System.out.print("Opcion: ");
opcion=consola.nextInt();

switch(opcion){

case 1:
    StackTest stackTest = new StackTest();
    System.out.println(("---MENU 2---"));
    System.out.println("1- Prueba implementacion pila");
    System.out.println("2- Palindromo");
    System.out.println("3- Expresion matematica");
    System.out.println("4- Implementacion de una cola");
    System.out.println("5- Ordenar una cola");
    System.out.print("Opcion: ");
    opcion=consola.nextInt();

    switch(opcion){
        case 1:
        stackTest.testStackInteger();
        stackTest.testStackString();
        break;

        case 2:
        stackTest.testPalindromo();//ej 2
        break;
    }

break;

case 2:
StackListTest stackTestList = new StackListTest();
System.out.println(("---MENU 2---"));
System.out.println("1- Implementacion Pila con lista(salteado)");
System.out.println("2- Pila de palabras");
System.out.println("3- Verificacion de parentesis");
System.out.println("4- Conversion de decimal a binario");
System.out.println("5- Implementacion Cola con lista");
System.out.println("6- Cola de numeros");
System.out.println("7- Ordenamiento de Cola");
System.out.println("8- Verificacion de palindromos");
System.out.print("Opcion: ");
opcion=consola.nextInt();

switch(opcion){
    case 1:
    break;
    case 2:
    stackTestList.pilaDePalabras();
    break;
    case 3:
    stackTestList.parentesis();
    break;
    case 4:
    stackTestList.decimalToBinario();
    break;
}

break;

}

    }
}

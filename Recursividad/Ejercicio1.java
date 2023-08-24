package Recursividad;
import java.util.Scanner;


public class Ejercicio1{




public static void main(String[] args) {
    
    int num1=0;
    int num2=0;
    int resultado=0;
    int opcion=0;
    Mente miMente= new Mente();

    Scanner consola= new Scanner(System.in);

do {
    
    System.out.println("-----MENU-----");
    System.out.println("1- Ejercicio 1");
    System.out.println("2- Ejercicio 2");
    System.out.println("3- Ejercicio 3");
    System.out.println("4- Ejercicio 4");
    System.out.println("5- Ejercicio 5");
    System.out.println("6- Ejercicio 6");
    System.out.println("7- Ejercicio 7");
    System.out.println("8- Salir");
    System.out.println("--------------");
    System.out.print("OPCION: ");
    opcion=consola.nextInt();

    switch(opcion){

        case 1:
        System.out.println("Ingrese un numero: ");
        num1=consola.nextInt();
        resultado=miMente.ej1(num1);
        System.out.println("El factorial de "+num1+" es "+resultado);
        break;

        case 2:
        System.out.println("Ingrese un numero: ");
        num1=consola.nextInt();
        resultado=miMente.ej2(num1);
        System.out.println("La suma de los primero n enteros de "+num1+" es "+resultado);
        break;

        case 3:
        System.out.println("Ingrese un numero: ");
        num1=consola.nextInt();
        System.out.println("Ingrese el exponente para elevar el numero: ");
        num2=consola.nextInt();
        resultado=miMente.ej3(num1,num2);
        System.out.println(num1+" elevado a "+num2+" es "+resultado);
        break;

        case 4:
        System.out.println("Ingrese un numero: ");
        num1=consola.nextInt();
        System.out.println("--Cuenta regresiva de "+num1+" es: --");
        miMente.ej4(num1);
        break;

        case 5:
        System.out.println("Ingrese un numero 1: ");
        num1=consola.nextInt();
        System.out.println("Ingrese un numero 2 para multiplicar el numero 1: ");
        num2=consola.nextInt();
        resultado=miMente.ej5(num1,num2);
        System.out.println();
        System.out.println(num1+" multiplicado por "+num2+" es "+resultado);
        System.out.println();
        break;

        case 6:
        int tamArreglo=0;
        int i=0;

        System.out.println("Ingrese tamaño del arreglo: ");
        tamArreglo=consola.nextInt();
        int[] arreglo= new int[tamArreglo];

        System.out.println("Ingrese "+ tamArreglo + " numeros: ");
        for(i=0;i < tamArreglo;i++){
            arreglo[i]=consola.nextInt();
        }
        System.out.println("--Cuenta regresiva del arreglo--");
        miMente.ej6(arreglo,tamArreglo-1);
        System.out.println();
        System.out.println("--------------------------------");
        break;

        case 7:

        break;

    }

} while (opcion != 8);

}

}
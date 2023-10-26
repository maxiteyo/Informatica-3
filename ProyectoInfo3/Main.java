package ProyectoInfo3;

import java.text.BreakIterator;
import java.util.Scanner;

import ProyectoInfo3.Arbol.ArbolAVL;
import ProyectoInfo3.Tests.ArbolTest;

public class Main {
    public static void main(String[] args) {
        
        int opcion=0,contador=0;
        Scanner consola= new Scanner(System.in);
        ArbolAVL arbol= new ArbolAVL();
        ArbolTest arbolTest= new ArbolTest();


    do {
            
        System.out.println("************MENU************");
        System.out.println("*  1- Agregar producto     *");
        System.out.println("*  2- Borrar producto      *");
        System.out.println("*  3- Buscar producto      *");
        System.out.println("*  4- Mostrar inventario   *");
        System.out.println("*  5- Salir                *");
        System.out.println("****************************");
        System.out.print("OPCION: ");
        opcion=consola.nextInt();

        switch(opcion){
            case 1:
            arbolTest.agregar(arbol, contador);
            contador++;
            break;

            case 2:
            arbolTest.borrar(arbol);
            break;

            case 3:
            arbolTest.buscar(arbol);
            break;

            case 4:

            break;

            default:
            System.out.println("La opcion ingresada es incorrecta, porfavor ingrese una nueva");
            break;
        }
    } while (opcion != 5);
}
}

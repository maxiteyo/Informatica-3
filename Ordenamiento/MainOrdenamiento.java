package Ordenamiento;
import java.util.Scanner;

public class MainOrdenamiento {
    public static void main(String[] args) {
        
    int opcion=0;
    int[] arreglo1= new int[100];
    int[] arreglo2= new int[1000];
    int[] arreglo3= new int[10000];
    Orden orden= new Orden();
    orden.cargar100(arreglo1);
    orden.cargar1000(arreglo2);
    orden.cargar10000(arreglo3);
    
    Scanner consola=new Scanner(System.in);

    do {
        
        System.out.println("----MENU----");
        System.out.println("1- Insercion");
        System.out.println("2- Shellsort");
        System.out.println("3- Quicksort");
        System.out.println("4- Salir");
        System.out.println("------------");
        System.out.println("OPCION: ");
        opcion=consola.nextInt();

        switch(opcion){
        
            case 1:
            System.out.println(("---ARREGLO DESORDENADO---"));
            orden.mostrar100(arreglo1);
            System.out.println();
            System.out.println();
            System.out.println("---ARREGLO ORDENADO---");
            orden.insercion100(arreglo1);
            orden.mostrar100(arreglo1);
            break;

            case 2:

            break;

            case 3:

            break;

            case 4:

            break;

        }

    } while (opcion != 4);


    }
}

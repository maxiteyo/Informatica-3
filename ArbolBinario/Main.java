package ArbolBinario;

import java.util.Scanner;

import ArbolBinario.tests.ArbolBinarioTest;

public class Main {

public static void main(String[] args) {
    
int opcion=0;
Scanner consola=new Scanner(System.in);
ArbolBinarioTest test=new ArbolBinarioTest();

do {
    
System.out.println(("----MENU----"));
System.out.println("1- 10 numeros entre 0 y 25");
System.out.println("2- Mostrar arbol en forma ordenada");
System.out.println("3- Programa del ej 1 permite valores duplicados?");
System.out.println("4- Metodo depth que determina cuantos niveles tiene el arbol");
System.out.println("5- Metodo dtree que borra un elemento a elegir e imprime inorder");
System.out.print("OPCION: ");
opcion=consola.nextInt();

switch(opcion){

    case 1:
    test.numRandoms();
    break;

    case 2:
    test.numOrd();
    break;

    case 3:
    break;

    case 4:
    break;

    case 5:
    break;


}


} while (opcion != 6);


}



    
}

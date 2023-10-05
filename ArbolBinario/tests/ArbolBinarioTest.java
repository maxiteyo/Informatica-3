package ArbolBinario.tests;

import ArbolBinario.utils.ArbolBin;
import java.util.Random;
import java.util.Scanner;

public class ArbolBinarioTest {
    
public void numRandoms(){

Random num= new Random();
ArbolBin<Integer> arbol= new ArbolBin<Integer>();

System.out.println("-------10 NUMEROS RANDOM EN ARBOL BINARIO-------");

for(int i=0;i<10;i++){
    
    try {
    arbol.insert(num.nextInt(26));
    } catch (Exception e) {
        e.printStackTrace();
    }
}
arbol.printInOrder();

}

public void numOrd(){

    int cant=0;
    int num=0;
    Scanner consola=new Scanner(System.in);
     ArbolBin<Integer> arbol= new ArbolBin<Integer>();

    System.out.println("Ingrese la cantidad de numeros que quiere agregar al arbol: ");
    cant=consola.nextInt();
    
    for(int i=0;i<cant;i++){
    System.out.println("Ingrese el numero "+(i+1)+":");
    num=consola.nextInt();
    try {
        arbol.insert(num);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    System.out.println("-----Impresion en orden-----");
    arbol.printInOrder();

}

public void Ej1NumRep(){

Random num= new Random();
ArbolBin<Integer> arbol= new ArbolBin<Integer>();

System.out.println("-------10 NUMEROS RANDOM QUE SE PUEDEN REPETIR EN ARBOL BINARIO-------");

for(int i=0;i<10;i++){
    
    try {
    arbol.insertRep(num.nextInt(26));
    } catch (Exception e) {
        e.printStackTrace();
    }
}
arbol.printInOrder();

}

public void Ej4Depth(){
    int cant=0;
    int num=0;
    Scanner consola=new Scanner(System.in);
     ArbolBin<Integer> arbol= new ArbolBin<Integer>();

    System.out.println("Ingrese la cantidad de numeros que quiere agregar al arbol: ");
    cant=consola.nextInt();
    
    for(int i=0;i<cant;i++){
    System.out.println("Ingrese el numero "+(i+1)+":");
    num=consola.nextInt();
    try {
        arbol.insert(num);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    System.out.println("");
    System.out.println("El arbol ingresado tiene "+ arbol.heightCasero() +" niveles");

}

public void BorrarElemento(){

    int cant=0;
    int num=0;
    Scanner consola=new Scanner(System.in);
     ArbolBin<Integer> arbol= new ArbolBin<Integer>();

    System.out.println("Ingrese la cantidad de numeros que quiere agregar al arbol: ");
    cant=consola.nextInt();
    
    for(int i=0;i<cant;i++){
    System.out.println("Ingrese el numero "+(i+1)+":");
    num=consola.nextInt();
    try {
        arbol.insert(num);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    System.out.println("---Arbol ordenado---");
    arbol.printInOrder();
    System.out.println("--------");

    System.out.println("\nIngrese el valor que quiere borrar");
    num=consola.nextInt();

    try {
        arbol.remove(num,arbol.getRoot());
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("----Arbol con el valor restado ordenado----");
    arbol.printInOrder();
    System.out.println("----------");

}




}

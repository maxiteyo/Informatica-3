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
        // TODO: handle exception
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
        // TODO: handle exception
    }
    }

    System.out.println("-----Impresion en orden-----");
    arbol.printInOrder();


}


}

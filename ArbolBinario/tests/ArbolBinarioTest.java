package ArbolBinario.tests;

import ArbolBinario.utils.ArbolBin;
import java.util.Random;

public class ArbolBinarioTest {
    
public void numRandoms(){

Random num= new Random();
ArbolBin<Integer> arbol= new ArbolBin<Integer>(num.nextInt(26));//por que tengo que inicianizarlo asi?

System.out.println("-------10 NUMEROS RANDOM EN ARBOL BINARIO-------");

for(int i=0;i<11;i++){
    
    try {

    arbol.insert(num.nextInt(26),arbol.getRoot());

    } catch (Exception e) {
        // TODO: handle exception
    }
}

arbol.printInOrder();

}


}

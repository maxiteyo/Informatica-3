package ArbolBinario.tests;

import ArbolBinario.utils.ArbolBin;
import java.util.Random;

public class ArbolBinarioTest {
    
public void numRandoms(){

Random num= new Random();
ArbolBin<Integer> arbol= new ArbolBin<Integer>(num.nextInt(26));

for(int i=0;i<25;i++){

    arbol.merge(num.nexInt(26),arbol.left,arbol.right);

}

}


}

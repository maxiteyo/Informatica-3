package Recursividad;

public class Mente {
    
private int n1;
private int n2;


public Mente(int n1, int n2,int[] arreglo,int tamArreglo,int i) {
    this.n1 = n1;
    this.n2 = n2;
    //this.i=i;
}

public Mente(){

}


public int ej1(int n1){

int resultado=0;

if(n1==0 || n1==1){
    return 1;
}
else{
    resultado=n1*ej1(n1-1);
}


return resultado;

}

public int ej2(int n1){

int resultado=0;

if(n1==0){
    return 0;
}
resultado=n1+ej2(n1-1);

return resultado;
}


public int ej3(int n1,int n2){

int resultado=0;

if(n2==0){
    return 1;
}
resultado=n1*ej3(n1,n2-1);

return resultado;
}

public int ej4(int n1){


if(n1==1){
    System.out.println(" "+n1);
    return 1;
}
System.out.print(" "+n1);
ej4(n1-1);

return 0;
}

public int ej5(int n1,int n2){

int resultado=0;

if(n2==0){
    return 0;
}

resultado=n1+ej5(n1,n2-1);

return resultado;
}

public void ej6(int arreglo[],int tamArreglo){

if(tamArreglo >= 0){
    System.out.print(" "+arreglo[tamArreglo]);
    ej6(arreglo,tamArreglo-1);
}

}

}

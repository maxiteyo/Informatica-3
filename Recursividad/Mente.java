package Recursividad;

public class Mente {
    
private int n1;
private int n2;

public Mente(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
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

}

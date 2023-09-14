package Ordenamiento;
import java.util.Random;

public class Orden {
    
private int[] arreglo1= new int[100];
//private int[] arreglo2= new int[1000];
//private int[] arreglo3= new int[10000];

public Orden(){

}

public Orden(int arreglo1[],int arreglo2[],int arreglo3[]){

this.arreglo1=arreglo1;
//this.arreglo2=arreglo2;
//this.arreglo3=arreglo3;
}

public void insercion100(int arreglo1[]){

    int temp=0;

    int i=0,j=0;

    for(i=0;i<100;i++){
        temp=arreglo1[i];
        j=i;
    
        for( ;j > 0;j--){

            if(temp>arreglo1[j-1]){
                arreglo1[j]=arreglo1[j-1];
                arreglo1[j-1]=temp;
            }
        }

    }
}

public void insercion1000(int arreglo2[]){

    int temp=0;

    int i=0,j=0;

    for(i=0;i<1000;i++){
        temp=arreglo2[i];
        j=i;
    
        for( ;j > 0;j--){

            if(temp>arreglo2[j-1]){
                arreglo2[j]=arreglo2[j-1];
                arreglo2[j-1]=temp;
            }
        }

    }
}

public void insercion10000(int arreglo3[]){

    int temp=0;

    int i=0,j=0;

    for(i=0;i<10000;i++){
        temp=arreglo3[i];
        j=i;
    
        for( ;j > 0;j--){

            if(temp>arreglo3[j-1]){
                arreglo3[j]=arreglo3[j-1];
                arreglo3[j-1]=temp;
            }
        }

    }
}

public void shellsort100(int arreglo1[]){

int i=0,j=0,gap=0,temp=0;

for(gap=arreglo1.length/2;gap>0;gap=gap/2){
    for(i=gap;i < arreglo1.length; i++){
        for(j=i-gap; j>=0 && arreglo1[j] > arreglo1[j+gap];j=j-gap){
            temp=arreglo1[j];
            arreglo1[j]=arreglo1[j+gap];
            arreglo1[j+gap]=temp;
        }
    }

}
}

public void shellsort1000(int arreglo2[]){

int i=0,j=0,gap=0,temp=0;

for(gap=arreglo2.length/2;gap>0;gap=gap/2){
    for(i=gap;i < arreglo2.length; i++){
        for(j=i-gap; j>=0 && arreglo2[j] > arreglo2[j+gap];j=j-gap){
            temp=arreglo2[j];
            arreglo2[j]=arreglo2[j+gap];
            arreglo2[j+gap]=temp;
        }
    }

}
}

public void shellsort10000(int arreglo3[]){

int i=0,j=0,gap=0,temp=0;

for(gap=arreglo3.length/2;gap>0;gap=gap/2){
    for(i=gap;i < arreglo3.length; i++){
        for(j=i-gap; j>=0 && arreglo3[j] > arreglo3[j+gap];j=j-gap){
            temp=arreglo3[j];
            arreglo3[j]=arreglo3[j+gap];
            arreglo3[j+gap]=temp;
        }
    }

}
}

public void mostrar100(int arreglo1[]){

    int i=0;

    for(i=0;i<100;i++){
        System.out.print("["+arreglo1[i]+"]-");
    }

}

public void mostrar1000(int arreglo2[]){

    int i=0;

    for(i=0;i<1000;i++){
        System.out.print("["+arreglo2[i]+"]-");
    }

}

public void mostrar10000(int arreglo3[]){

    int i=0;

    for(i=0;i<10000;i++){
        System.out.print("["+arreglo3[i]+"]-");
    }

}

public void cargar100(int arreglo1[]){

    int i=0;
    Random random= new Random();

    for(i=0;i<100;i++){
        
        arreglo1[i]=random.nextInt(1000);
    }
}

public void cargar1000(int arreglo2[]){

    int i=0;
    Random random= new Random();

    for(i=0;i<1000;i++){
        
        arreglo2[i]=random.nextInt(1000);
    }
}

public void cargar10000(int arreglo3[]){

    int i=0;
    Random random= new Random();

    for(i=0;i<10000;i++){
        
        arreglo3[i]=random.nextInt(1000);
    }
}

}

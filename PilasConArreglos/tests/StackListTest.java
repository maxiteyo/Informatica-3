package PilasConArreglos.tests;

import java.util.Scanner;

import PilasConArreglos.utils.StackList;

public class StackListTest {
    
public void pilaDePalabras(){

String palabra="";
Scanner consola= new Scanner(System.in);


System.out.println("Ingrese una palabra: ");
palabra=consola.nextLine();
StackList<String> palab= new StackList<String>();

for(int i=0;i<palabra.length();i++){
palab.push(String.valueOf(palabra.charAt(i)));

}

for(int i=0;i<palabra.length();i++){
System.out.print(palab.pop());
}

}

public void parentesis(){
String palabra="";
Scanner consola= new Scanner(System.in);
System.out.println("Ingrese una expresion matematica: ");
palabra=consola.nextLine();
StackList<String> expr= new StackList<String>();

for(int i=0;i<palabra.length();i++){

if(String.valueOf(palabra.charAt(i)).equals("(")){//usar equals para strings y compare to para enteros
expr.push(String.valueOf(palabra.charAt(i)));
}else{
    if(String.valueOf(palabra.charAt(i)).equals(")")){
        expr.pop();
    }
}
}

if(expr.isEmpty()==true){
    System.out.println("Expresion balanceada");
}else{
    System.out.println("Expresion desbalanceada");
}




}
}

package Calculadora;

import java.util.ArrayList;
import java.util.List;


public class Historico {
    private float n1;
    private float n2;
    private float resultado;
    private int opcion;

    List<String> historico = new ArrayList<>();

    public Historico(){

    }

    public void addHistorico(float num1,float num2, float result,int opcion){

        n1=num1;
        n2=num2;
        resultado=result;

        switch(opcion){
            case 1:
            historico.add(toStringGeneral(n1,n2,resultado,"+"));
            break;
            case 2:
            historico.add(toStringGeneral(num1, num2, result,"-"));
            break;
            case 3:
            historico.add(toStringGeneral(num1, num2, result,"*"));
            break;
            case 4:
            historico.add(toStringGeneral(num1, num2, result, "/"));
            break;
        }

        

    }

    public void imprimirLista(){

        for(String cadena :historico ){
 
            System.out.println(cadena);
        }

    }


    private String toStringGeneral(float n1, float n2, float resultado,String operacion) {
        return ""+n1+" "+operacion+" "+""+n2+"= "+resultado;
    }

    /*private String toStringSuma(float n1, float n2, float resultado) {
        return ""+n1+" + "+""+n2+"="+resultado;
    }

    private String toStringResta(float n1, float n2, float resultado) {
        return ""+n1+" - "+""+n2+"="+resultado;
    }

    private String toStringMult(float n1, float n2, float resultado) {
        return ""+n1+" * "+""+n2+"="+resultado;
    }

    private String toStringDiv(float n1, float n2, float resultado) {
        return ""+n1+" / "+""+n2+"="+resultado;
    }*/

    public void addHistorico(float num1, float num2){


    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

}

package Calculadora;


public class Calcu {

    private float num1;
    private float num2;


    public Calcu(){
    
    }

    public Calcu(float n1,float n2){

        num1=n1;
        num2=n2;
    }


    public void setNum1(float num1){
        this.num1=num1;
    }

    public void setNum2(float num2){
        this.num2=num2;
    }

    public float getNum1(){
        return num1;
    }

    public float getNum2(){
        return num2;
    }

    public void suma(float num1,float num2){

        float suma=0;
        suma=num1+num2;
        System.out.println("El resultado de la suma es: "+suma);

    }

    public void resta(float num1,float num2){

        float resta=0;
        resta =num1-num2;
        System.out.println("El resultado de la resta es: "+resta);
    }

    public void multiplicacion(float num1,float num2){

        float multiplicacion=0;
        multiplicacion = num1*num2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);

    }

    public void division(float num1,float num2) throws Exception{
            if(num2 == 0){
            throw new Exception("No se puede dividir por cero");
            }

        float division=0;
        division = num1/num2;
        System.out.println("El resultado de la division es: "+division);
    }

}
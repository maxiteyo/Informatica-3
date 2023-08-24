package Calculadora;
import java.util.Scanner;


public class mainCalculadora {
   
    public static void main(String[] args) {
        float num1=0;
        float num2=0;
        int opcion=0;
        Calcu miCalculadora= new Calcu();
        Historico hist = new Historico();

        Scanner consola= new Scanner (System.in);

        System.out.println("Ingrese numero 1:");
        num1= consola.nextInt();

        System.out.println("Ingrese numero 2:");
        num2= consola.nextInt();

        do {
        System.out.println("---MENU---");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        System.out.println("5-Mostrar historico de operaciones");
        System.out.println("6-Salir");
        opcion=consola.nextInt();
        switch(opcion){
            case 1:
            miCalculadora.suma(num1,num2);
            hist.addHistorico(num1,num2,num1+num2,opcion);
            break;
            case 2:
            miCalculadora.resta(num1, num2);
            hist.addHistorico(num1,num2,num1-num2,opcion);
            break;
            case 3:
            miCalculadora.multiplicacion(num1, num2);
            hist.addHistorico(num1,num2,num1*num2,opcion);
            break;
            case 4:
                try {
                    miCalculadora.division(num1, num2);
                    hist.addHistorico(num1,num2,num1/num2,opcion);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            break;
            case 5:
            System.out.println("----HISTORICO----");
            hist.imprimirLista();
            System.out.println("-----------------");
            break;


        }
            
        } while (opcion != 6);
    }

}

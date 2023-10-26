package ProyectoInfo3.Tests;

import ProyectoInfo3.Arbol.ArbolAVL;
import ProyectoInfo3.ModeloDeDatos.Producto;
import java.util.Scanner;

public class ArbolTest {
    
    public void agregar(ArbolAVL arbol,int contador){
    
    Producto producto= new Producto();
    Scanner consola= new Scanner(System.in);
    
    producto.codigo=contador;
    System.out.print("Ingrese nombre del producto a agregar: ");
    producto.nombre=consola.nextLine();
    System.out.print("Ingrese precio del producto: ");
    producto.precio=consola.nextFloat();
    System.out.print("Ingrese stock del producto: ");
    producto.stock=consola.nextInt();

    arbol.add(producto);
    }

    public void borrar(ArbolAVL arbol){

      Scanner consola= new Scanner(System.in);
      String nombre;
      
      System.out.println("Ingrese el nombre del producto a borrar:");
      nombre=consola.nextLine();
      try {
        arbol.delete(arbol.buscar(nombre));
      } catch (Exception e) {
          e.printStackTrace();
          return;
      }
      System.out.println("El producto se borro con exito");
    }

    public void buscar(ArbolAVL arbol){

    Scanner consola= new Scanner(System.in);
    Producto producto= new Producto();
    String nombre;

    System.out.print("Ingrese el nombre del producto a buscar: ");
    nombre=consola.nextLine();
    try {
    producto=arbol.buscar(nombre);        
    } catch (Exception e) {
        e.printStackTrace();
        return;
    }
    System.out.println("*******Producto*******");//hacer bonito la impresion del producto encontrado
    System.out.println("Codigo: "+ producto.codigo);
    System.out.println("Nombre: "+ producto.nombre);
    System.out.println("Precio: $"+ producto.precio);
    System.out.println("Stock: "+producto.stock);
    System.out.println("**********************");
    }

}

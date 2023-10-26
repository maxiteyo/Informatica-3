package ArbolBinario.utils;

import PilasConArreglos.utils.Nodo;

public class NodoBinarioAVL<AnyType> {

    AnyType valor;
    int altura;
    NodoBinarioAVL right,left;

    public NodoBinarioAVL(AnyType valor){
        this.valor=valor;
        this.altura=0;
        this.right=null;
        this.left=null;

    }

    public NodoBinarioAVL(AnyType data,NodoBinarioAVL<AnyType> left,NodoBinarioAVL<AnyType> right) {
        this.valor = data;
        this.left = left;
        this.right = right;
    }

    // Método para obtener la altura de un nodo
    int altura(NodoBinarioAVL nodo) {
        if (nodo == null) return 0;
        return nodo.altura;
    }

    // Método para actualizar la altura de un nodo
    void actualizarAltura(NodoBinarioAVL nodo) {
        nodo.altura = 1 + Math.max(altura(nodo.left), altura(nodo.right));
    }

    public void printInOrder(){
        if(left!= null){
          left.printInOrder();
        }
        System.out.println(valor);
        if(right != null){
          right.printInOrder();
        }
      }

    public AnyType getValor() {
        return valor;
    }

    public void setValor(AnyType valor) {
        this.valor = valor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public NodoBinarioAVL getRight() {
        return right;
    }

    public void setRight(NodoBinarioAVL right) {
        this.right = right;
    }

    public NodoBinarioAVL getLeft() {
        return left;
    }

    public void setLeft(NodoBinarioAVL left) {
        this.left = left;
    }
    
}

package ArbolBinario.utils;

public class ArbolAVL<AnyType> {
 
    private NodoBinarioAVL<AnyType> root = null;

    public ArbolAVL(){
        root=null;
    }
    public ArbolAVL(AnyType rootItem){
        root=new NodoBinarioAVL<AnyType>(rootItem,null,null);
       }
    
    public void printInOrder(){
        if(root != null){
            root.printInOrder();
        }
    }

    public void insertRep(AnyType x) throws Exception{
        root=insertRep(x,root);
    }
    
    //Inserto y actualizo el nivel
    public NodoBinarioAVL<AnyType> insertRep( AnyType x,NodoBinarioAVL<AnyType> t) throws Exception{
    
        if(t == null){
            t= new NodoBinarioAVL<AnyType>(x);
        }else{
            if(((Integer) x).compareTo((Integer) t.valor) <= 0){//si es duplicado lo guardo en el brazo izquierdo
                t.left= insertRep(x,t.left);
                t.actualizarAltura(t);
            }else{
                if(((Integer) x).compareTo((Integer) t.valor) > 0){
                    t.right= insertRep(x,t.right);
                    t.actualizarAltura(t);
                }else{
                    throw new Exception(x.toString());
                }
            }
        }
        return t;
    
    }
//cuando hago una rotacion tengo que actualizar las alturas de todo el arbol

public void rotacionSimpleIzq(NodoBinarioAVL nodo){
    NodoBinarioAVL<AnyType> temp;
    temp=nodo;
    nodo=nodo.right;

}
    

}

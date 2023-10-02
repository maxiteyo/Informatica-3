package ArbolBinario.utils;

import PilasConArreglos.utils.Nodo;

public class ArbolBin<AnyType> {
    
   private NodoBinario<AnyType> root = null; 

   public ArbolBin(){
    root=null;
   }
   public ArbolBin(AnyType rootItem){
    root=new NodoBinario<AnyType>(rootItem,null,null);
   }
public NodoBinario<AnyType> getRoot() {
    return root;
}
public int size(){
    return NodoBinario.size(root);
}

public int height(){
    return NodoBinario.height(root);
}

public void printInOrder(){
    if(root != null){
        root.printInOrder();
    }
}
public void makeEmpty(){
    root=null;
}

public boolean isEmpty(){
    return root == null;
}

public void merge(AnyType rootItem, ArbolBin<AnyType> t1, ArbolBin<AnyType>t2){
    if(t1.root == t2.root && t1.root != null){
        throw new IllegalStateException();
    }

    root = new NodoBinario<AnyType>(rootItem, t1.root, t2.root);

    if(this != t1){
        t1.root= null;
    }
    if(this != t2){
        t2.root= null;
    }
}

public NodoBinario<AnyType> findMin(NodoBinario<AnyType> t){

    if(t != null){
        while(t.left != null){
            t= t.left;
        }
    }
    return t;

}

public NodoBinario<AnyType> findMax(NodoBinario<AnyType> t){
    if(t != null){
        while(t.right != null){
            t=t.right;
        }
    }
    return t;
}



public NodoBinario<AnyType> insert( AnyType x,NodoBinario<AnyType> t) throws Exception{
    
    if(t == null){
        t= new NodoBinario<AnyType>(x,null,null);//verificar esta distinto al pp
    }else{
        if(((Integer) x).compareTo((Integer) t.data) < 0){
            t.left= insert(x,t.left);
        }else{
            if(((Integer) x).compareTo((Integer) t.data) > 0){
                t.right= insert(x,t.right);
            }else{
                throw new Exception(x.toString());
            }
        }
    }
    return t;

}

public NodoBinario<AnyType> removeMin(NodoBinario<AnyType> t) throws Exception{

if(t == null){
    throw new Exception();
}else{
    if(t.left != null){
        t.left= removeMin(t.left);
        return t;
    }else{
        return t.right;
    }
}
}

private NodoBinario<AnyType> remove(AnyType x,NodoBinario<AnyType> t) throws Exception{

    if(t == null){
        throw new Exception(x.toString());
    }
    if(((Integer) x).compareTo((Integer) t.data) < 0){
        t.left=remove(x,t.left);
    }else{
        if(((Integer) x).compareTo((Integer) t.data) > 0){
            t.right= remove(x,t.right);
        }else{
            if(t.left != null && t.right != null){
                t.data= findMin(t.right).data;
                t.right= removeMin(t.right);
            }else{
                t=(t.left != null) ? t.left : t.right;
            }
        }
    }
    return t;

}

public NodoBinario<AnyType> find(AnyType x, NodoBinario<AnyType> t){
    while(t != null){
        if(((Integer) x).compareTo((Integer) t.data) < 0){
            t=t.left;
        }else{
            if(((Integer) x).compareTo((Integer) t.data) > 0){
                t=t.right;
            }else{
                return t;
            }
        }
    }
    return null;

}


}

package ArbolBinario.utils;

public class NodoBinario<AnyType> {
    
    AnyType data;
    NodoBinario<AnyType> left;
    NodoBinario<AnyType> right;

    public NodoBinario(){
      this.data=null;
      this.left=null;
      this.right=null;
    }

    public NodoBinario(AnyType x){
      this.data=x;
      this.right=null;
      this.left=null;
    }

    public NodoBinario(AnyType data,NodoBinario<AnyType> left,NodoBinario<AnyType> right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }

    public AnyType getData() {
      return data;
    }

    public void setData(AnyType data) {
      this.data = data;
    }

    public NodoBinario<AnyType> getLeft() {
      return left;
    }

    public void setLeft(NodoBinario<AnyType> left) {
      this.left = left;
    }

    public NodoBinario<AnyType> getRight() {
      return right;
    }

    public void setRight(NodoBinario<AnyType> right) {
      this.right = right;
    }

    public static <AnyType> int size(NodoBinario<AnyType> t){
      if(t == null){
        return 0;
      }else{
        return 1 + size(t.left) + size(t.right);
      }
    }

    public static <AnyType>int height (NodoBinario<AnyType> t){
      if(t == null){
        return -1;
      }else{
        return 1 + Math.max(height(t.left),height(t.right));
      }
    }


    public void printInOrder(){
      if(left!= null){
        left.printInOrder();
      }
      System.out.println(data);
      if(right != null){
        right.printInOrder();
      }
    }
    



}

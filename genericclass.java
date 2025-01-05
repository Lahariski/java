class Box<T>{
    private T value ;
    public void setText(T value){
        this.value=value;
    }
    public T getText(){
        return value;
    }
}
public class genericclass{
    public static void main(String[] args) {
    Box<Integer>a=new Box<>();
    a.setText(99);
    System.out.println(a.getText());
    }
}

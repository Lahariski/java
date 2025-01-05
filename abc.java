interface iadd{
    int iadd(int a,int b);
}
interface isub{
     int isub(int a,int b);
}
interface imul{
    int imul(int a,int b);
}
interface idiv{
    int idiv(int a,int b);
}
class Add implements iadd{
    public int iadd(int a,int b){
        return a+b;
    }
}
class Sub implements isub{
    public int isub(int a,int b){
        return a-b;
    }
}
class Mul implements imul{
    public int imul(int a,int b){
        return a*b;
    }
}
class Div implements idiv{
    public int idiv(int a,int b){
        return a/b;
    }
}
public class abc {
    public static void main(String[] args){
        Add Addi=new Add();
        int a=33;
        int b=54;
        System.out.println(Addi.iadd(a,b));
    }
}

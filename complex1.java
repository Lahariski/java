class a{
    public void display(){
        System.out.println("this is a class");

    }
    
}
class b extends a{
    public void displayb(){
        System.out.println("this is b class");
    }
}
class c extends b{
    public void display(){
        System.out.println("this is c class");
    }
}
public class complex1{
    public static void main(String[] args) {
        c ob=new c();
        ob.display();
        ob.displayb();
        ob.display();
    }
}
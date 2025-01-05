class parent{
    final int finalvariable=100;
    final void finalmethod(){
        System.out.println("final method");
    }
    public void display(){
        System.out.println("this is parent class");
    }
}
class student extends parent{
    public void display(){
        super.display();
        System.out.println("this is super class keyword");
    }
}
final class finalclass{
    public void show(){
    System.out.println("final class");
    }
}
public class main {
    public static void main(String[] args) {
        
    
    student s=new student();
    s.display();
    parent p=new parent();
    p.finalmethod();
    finalclass f=new finalclass();
    f.show();
    }
}

class teacher{
    void displayt(){
    System.out.println("this is teacher");
}}
class student extends teacher{
    void displayc(){
    System.out.println("student");
}}
class marks extends student{
    void display(){
        System.out.println("marks");
    }
}
public class mains {
    public static void main(String[] args) {
        marks k=new marks();
        k.display();
        k.displayc();
        k.displayt();
    }
}

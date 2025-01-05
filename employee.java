public class employee {
    private int id;
    private String name;
    private double sal;
    public employee(int eid,String ename,double esal){
         id=eid;
         name=ename;
         sal=esal;
    }
    private void calsal(){
        double da=0.85*sal;
        double hra=0.3*sal;
         sal=da+hra+sal;
    }
    public void display(){
        calsal();
        System.out.println("employee id"+id);
        System.out.println("employee name"+name);
        System.out.println("employee sal"+sal);
        System.out.println("total sal"+sal);
    }
    public static void main(String[] args){
        employee emp=new employee(23, "kaka", 22933);
        emp.display();
    }
}

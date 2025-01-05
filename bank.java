public class bank {
    int accno;
    String name;
    double sal;
    public bank(int b_acc,String b_name,double b_sal){
    if(accno<0){
        System.out.println("account no. cannot be negatve");
    }
    else if(sal<0){
        System.err.println("Error:bal cant be negative");
    }
    else{
        accno=b_acc;
        name=b_name;
        sal=b_sal;
        System.out.println("the details are");
        System.out.println("account no"+accno);
        System.out.println("name"+name);
        System.out.println("sal"+sal);
    }
}
    public static void main(String[] args){

        bank account =new bank(392, "kanya", 39494);

    }
    
}

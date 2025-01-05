import java.util.*;
public class calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
        calculator c=new calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter an operator (+,-,/,*)");
        char op=sc.next().charAt(0);
        double res=0;
        switch (op) {
            case '+':
                res=c.add(a, b);
                break;
            case '*':
                res=c.mul(a, b);
                break;
            case '-':
                res=c.sub(a, b);
                break;
            case '/':
                res=c.div(a, b);
                break;
        
            default:
                break;
        }
        System.out.println(res);

    }
}

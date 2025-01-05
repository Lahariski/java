class invalidageexception extends Exception{
    public invalidageexception(String message){
        super(message);
    }
}
public class Myexception {
    public void divide(int a,int b){
        try{
            int r=a/b;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
    public static void checkage(int num) throws invalidageexception{
        if(num<18){
            throw new invalidageexception("age must be 18 or older");

        }
        else{
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        System.out.println("predefined exception");
        Myexception e=new Myexception();
        e.divide(10,0);
        System.out.println("check userdefined");
        try{
            checkage(10);
        }catch(invalidageexception ex){
             System.out.println(ex.getMessage());
        }

    }
}
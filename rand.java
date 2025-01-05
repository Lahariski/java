import java.util.Random;
import java.util.random.*;
class Randomg extends Thread{
    public static int num;
    public void run(){
        Random ran=new Random();
        
            While(true){
                num=ran.nextInt(100);
                System.out.println("generated num"+num);
                Thread.sleep(1000);
            }
        
    }
}
class square extends Randomg{
    5
}
class q{
    int num;
    boolean valueset=false;
    public  synchronized void put(int num){
           while(valueset){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
            this.num=num;
            System.out.println("put: "+num);
            valueset=true;
            notifyAll();
    }
    public synchronized void get(){
        while(!valueset){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
            System.out.println("get"+num);
            valueset=false;
            notifyAll();    
    }
}
class Producer implements Runnable{
        q a;
        Producer(q a){
            this.a=a;
            Thread t=new Thread(this,"producer");
            t.start();
        }
            public void run(){
                int i=0;
                while(true){
                    a.put(i++);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        

}
class Consumer implements Runnable{
	q a;
	Consumer(q a){
		this.a=a;
		Thread t=new Thread(this,"consumer");
		t.start();
	}
	public void run() {
		while(true) {
			a.get();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class pc{
    public static void main(String[] args) {
        q a=new q();
        Producer p=new Producer(a);
        Consumer c=new Consumer(a);
    }
}
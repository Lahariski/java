class q{
	int num;
	boolean value=false;
	public  synchronized void put(int num) {
		while(value) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			this.num=num;
		
			System.out.println("put : "+num);
			notify();	
            value=true;
		}
	public synchronized void get() {
		while(!value) {
		try {
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		value=false;
		System.out.println("get: "+num);
		notify();
	}
}
class produce implements Runnable{
	q a;
	produce(q a){
		this.a=a;
		Thread t=new Thread(this,"producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class consume implements Runnable{
	q a;
	consume(q a){
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
public class procon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q a=new q();
		produce p=new produce(a);
		consume c=new consume(a);
	

	}

}

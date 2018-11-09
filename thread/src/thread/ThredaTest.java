package thread;

public class ThredaTest extends Thread{
	int index=0;
	
	@Override
	public void run() {
		if("a".equals(Thread.currentThread().getName())){
			index=0;
		}else{
			index=1;
		}
		
		for(;;){
			if("a".equals(Thread.currentThread().getName())&&index%2!=0){
				continue;
			}
			if("b".equals(Thread.currentThread().getName())&&index%2!=0){
				continue;
			}
			change();
			if(index>5){
				return;
			}
		}
		
	}
	
	public synchronized void change(){
		
		
		
		if(index%2==0){
			for(int i=0;i<=(index/2);i++){
				System.out.print(1+",");
			}
			System.out.println();
			index++;
		}else {
			for(int i=0;i<=((index-1)/2);i++){
				System.out.print("a,");
			}
			System.out.println();
			index++;
		}		
	}
	
	public static void f(String param,Integer index){
		String	result="";
		for(int i=0;i<=index;i++){
			result=param+result;
		}
		System.out.println(result);
	}

	
	
	public static void main(String[] args) {
		ThredaTest test1=new ThredaTest();
		ThredaTest test2=new ThredaTest();
		test1.setName("a");
		test2.setName("b");
		test1.start();
		test2.start();
	}
}

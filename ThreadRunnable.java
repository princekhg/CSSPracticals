package CodeSetBeginners;

public class ThreadRunnable
{
 public static void main(String args[])
 {
	 RunnableTest rt=new RunnableTest();
	 Thread t=new Thread(rt);
	 t.run();
	 System.out.println("End of the Main Thread - ");
 }
}

class RunnableTest implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("ThreadRunnable Runs - "+i);
		System.out.println("End of the RunnableThread - ");
	}
}

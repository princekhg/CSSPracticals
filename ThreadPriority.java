package CodeSetBeginners;

public class ThreadPriority {

	public static void main(String[] args) {
	ThreadFirst1 ft1=new ThreadFirst1();
	SecondThread st=new SecondThread();
	ThirdThread1 tt1= new ThirdThread1();
	ft1.setPriority(Thread.MAX_PRIORITY);
	st.setPriority(Thread.NORM_PRIORITY);
	tt1.setPriority(st.getPriority()+1);
	
	System.out.println("Starting First Thread - -");
	ft1.start();
	System.out.println("Starting First Thread - -");
	st.start();
	System.out.println("Starting First Thread - -");
	tt1.start();
	}
}
class ThreadFirst1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A i == "+i);
		}
		System.out.println("Exiting from Thread A");
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B i == "+i);
		}
		System.out.println("Exiting from Thread B");
	}
	
}
class ThirdThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread C i == "+i);
		}
		System.out.println("Exiting from Thread C");
	}
	
}

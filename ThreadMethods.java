package CodeSetBeginners;

public class ThreadMethods extends Thread {
	public static void main(String args[])
	{
		ThreadFirst tf=new ThreadFirst();
		ThreadSec ts=new ThreadSec();
		ThirdThread tt=new ThirdThread();
		System.out.println("Start Thread A");
		tf.start();
		System.out.println("Start Thread B");
		ts.start();
		System.out.println("Start Thread C");
		tt.start();
		
	}
	
}


// thread A to execute yield()
class ThreadFirst extends Thread
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			if(i==1|| i==3)
				yield();
			System.out.println("Thread A - i = "+i);
		}
		System.out.println("Exit from A Thread ");
	}

}
// thread B to execute stop()
class ThreadSec extends Thread
{
	@SuppressWarnings("deprecation")
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			if(i==2|| i==4)
				stop();
			System.out.println("Thread B - i = "+i);
		}
		System.out.println("Exit from B Thread ");
	}
}
//Thread C working to execute sleep(milisec)
class ThirdThree extends Thread
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("Thread B - i = "+i);
			if(i==0)
				try {
					sleep(1000);
				}catch(Exception e) {}
			
		}
		System.out.println("Exit from B Thread ");
	}
	
}
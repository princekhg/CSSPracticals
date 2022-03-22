package CodeSetBeginners;

public class ThreadClass extends Thread{
	
	public static void main(String args[])
	{
		
		new FirstThread().start();
		new SecThread().start();
		new ThirdThread().start();
	}
}
	class FirstThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("Thread A executes - i="+i);
		System.out.println("Exiting from Thread A -  ");
	}
}

class SecThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("Thread B executes - i="+i);
		System.out.println("Exiting from Thread B -  ");
	}
}

class ThirdThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("Thread C executes - i="+i);
		System.out.println("Exiting from Thread C -  ");
	}
}


	


package CodeSetBeginners;

public class SwitchSampleOutput {
char choice;

//main method to run the code
public static void main(String args[])
{
	SwitchSampleOutput sm=new SwitchSampleOutput();
	sm.switchMod();
}
//function to show the working of switch options
private void switchMod() {
	try
	{
	switch(choice=(char)System.in.read())
	{
	case 'M':
	case 'm':
		System.out.print("Madras : Booklet 3");
		break;
	case 'B':
	case 'b':
		System.out.println("Bombay : Booklet 6");
		break;
	case 'C':
	case 'c':
		System.out.println("Calcutta : Booklet 8");
		break;
	default:
		System.out.println("Wrong Choice!!!!!!!!!!!!");
	}
	}catch(Exception e) {
		System.out.println("I/O Error");
	}
}
}//end of class

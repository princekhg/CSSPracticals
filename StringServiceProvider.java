package CompetCoding;
import java.util.Scanner;
import java.util.Arrays;
public class StringServiceProvider {

	String str;

    public void read() {
        Scanner scr = new Scanner(System.in);
        str = scr.nextLine();
    }

    public String reverse() {

        char ch[] = str.toCharArray();
        char ch1[] = new char[ch.length];
        for (int i = ch.length - 1, k = 0; i >= 0; i--, k++)
            ch1[k] = ch[i];
        return Arrays.toString(ch1);
    }

    public int linearSearch(char element) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
                return i;
            }
        }
        return -1;
    }

    // find certain character and replace in the given string;
    public String searchReplace(char element, char replace) {
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
               ch[i]=replace;
            }
            else
                ch[i]=str.charAt(i);
        }
        return Arrays.toString(ch);
    }
    public static void main(String args[])
    {
        StringServiceProvider ssp=new StringServiceProvider();
        ssp.read();
        if(ssp.linearSearch('r')>-1)
            System.out.println("The character found at index -- " +ssp.linearSearch('r'));
        else
            System.out.println("Character Not Found");
        System.out.println(ssp.searchReplace('e','r'));

    }
	
}

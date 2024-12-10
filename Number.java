package My_Package;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        byte number;
        
        for (int i=1;i<=3;i++)
        {
    		System.out.println("Enter one number");
            number=sc.nextByte();
        if (number>0)
        	System.out.println("Your enter nummber is positive");
        else if (number==0)
        	System.out.println("Your enter nummber is zero");
        else
        	System.out.println("Your enter nummber is negative");
        	
        }
        sc.close();
	}

}

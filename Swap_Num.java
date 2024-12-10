package My_Package;

public class Swap_Num {

	public static void main(String args[])
	{
		int a=10,b=11;
		System.out.println("Before Swap"+a+" "+b);
		a=a+b-a;
		b=a+b-b;
	}
}

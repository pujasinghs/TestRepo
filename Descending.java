package My_Package;

public class Descending {

	public static void main(String[] args) {
		int i;
		
		for (i=10;i>=1;i--)
		{
			if (i==3 || i==5 || i==7)
				continue;
			System.out.println(i);
		}

	}

}

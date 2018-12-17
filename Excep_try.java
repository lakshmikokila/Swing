import java.lang.*;
import java.util.*;
public class Excep_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				System.out.println("Dividing");
				int b=50/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[]=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("Other stmt");
		}
		catch(Exception e)
		{
			System.out.println("handled");
					
		}
		System.out.println("Normal Flow");
	}

}

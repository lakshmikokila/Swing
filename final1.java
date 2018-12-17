//import java.util.*;
class A
{ 
	int a;
	final void run()
	{
		a=23;
		System.out.println("Running");
	}
}
class finalEx extends A
{
	void run1()
	{
	System.out.println("Run success");
	System.out.println(a);
	}
		public static void main(String[] args)
	
	{
		//new finalEx().run();
		//new finalEx().run1();
			finalEx ob=new finalEx();
			ob.run();
			ob.run1();
		// TODO Auto-generated method stub

	}

}
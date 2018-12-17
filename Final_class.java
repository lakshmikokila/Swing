class A
{
	final void run()
	{
		a=10l;
		System.out.println("Runnung");
	}
	class B extends A
	{
		void run() //Cannot override
		{
			System.out.println("run Success");
		}
	}

public class Final_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a1=new B();
		a1.run();
	}

}

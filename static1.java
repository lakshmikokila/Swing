//import java.util.*;
public class St_ex
{
	static int a;
	static int b;
	/*static                 called as "static block"
	{
		b=20;
	}*/
	static void get()
	{
		System.out.println(a);
		a++;
	}

	public static void main(String[] args)
	{
		St_ex.get();
		St_ex.get();
		St_ex.get();
		/*St_ex a1=new St_ex();
		a1.get();
		St_ex a2=new St_ex();
		a2.get();*/

		// TODO Auto-generated method stub

	}

}

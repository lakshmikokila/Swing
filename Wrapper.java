
public class Wrap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="200";
		Integer i=Integer.parseInt(k);
		int s=i.intValue();
		System.out.println(k+i);
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("");
	
		int a=100;
		Integer a1=new Integer(a);
		int m=a1.intValue();
		System.out.println(10+a1);
		System.out.println(10+m);
		System.out.println("");
		
		int b=200; 
		Integer f=Integer.valueOf(b);
		Integer f1=f;
		System.out.println(5+f);
		System.out.println(f+f1);
		System.out.println("");
		
		Boolean b1=true;
		System.out.println(b1);
		String str=b1.toString();
		System.out.println("String Value=" +str);
			
	}

}

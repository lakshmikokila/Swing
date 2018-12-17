 class Stud {
	int rollno;
	String name;
	static String college="Xyz";
	static void change()
	{
		college="Abc";
	}
	Stud(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
	public class St_Ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud.change();
		Stud s1=new Stud(111,"aaa");
		Stud s2=new Stud(112,"bbb");
		Stud s3=new Stud(113,"ccc");
		s1.display();
		s2.display();
		s3.display();

	}

}

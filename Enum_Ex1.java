public class Enum_Ex1 {
	enum Mobile
	{
		Samsung(500),sony(1000),Nikia(750);
		int value;
		Mobile(int value)
		{
			this.value=value;
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(Mobile m:Mobile.values())
	System.out.println(m+"  "+m.value);
	}

}

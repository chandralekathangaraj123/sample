
public class SingleTon {
	static SingleTon sing;
	private SingleTon() {
		// TODO Auto-generated constructor stub
	}
	private static SingleTon add()
	{
		if(sing==null)
		{
			sing=new SingleTon();
		}
		return sing;
	}
	public static void main(String[] args) {
		
		SingleTon s=SingleTon.add();
		System.out.println(s);
		/*
		SingleTon s=add();
		System.out.println(s);
		SingleTon s1=add();
		System.out.println(s1);
		SingleTon s2=add();
		System.out.println(s2);
		*/
	}
}

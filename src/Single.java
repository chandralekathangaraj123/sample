
public class Single {
	static Single sin;   //static member
	private Single() {    //private constructor
		// TODO Auto-generated constructor stub
	}
	public static Single add() //static factory method
	{
		if(sin==null)
		{
		sin=new Single();
		}
	
		return sin;
	}
	public static void main(String[] args) {
		Single s=add();
		System.out.println(s);
		
		Single s1=add();
		System.out.println(s1);
		
		Single s2=add();
		System.out.println(s2);
	}
}


public class Practice {
	static Practice sam;
	private Practice() {
		// TODO Auto-generated constructor stub
	}
	public static Practice add()
	{
		if(sam==null)
		{
			sam=new Practice();
		}
		return sam;
	}
	public static void main(String[] args) {
		Practice s=Practice.add();
		System.out.println(s);
		
		Practice s1=Practice.add();
		System.out.println(s1);
		
		Practice s2=Practice.add();
		System.out.println(s2);
		
		Practice s3=Practice.add();
		System.out.println(s3);
		
	}
	

}

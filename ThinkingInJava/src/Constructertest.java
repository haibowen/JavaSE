
public class Constructertest {
	int A=0;
	String s="total";
	
	
	public Constructertest(String string) {
		// TODO Auto-generated constructor stub
	}
	public void  Constructertest( String ss) {
		System.out.println(ss);
		s=ss;
		
	}
	public void  Constructertest() {
		this.s=s;
		
		
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructertest constructer=new Constructertest("123");
		
		
		
		
		

	}
	
}

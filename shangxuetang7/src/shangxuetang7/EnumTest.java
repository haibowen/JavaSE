package shangxuetang7;

public class EnumTest {
	public enum Mycolor{red,blue,yellow};//–¬¿‡–Õ
	
	public enum Mydoor{me,Mywife};
	
	public static void main(String []args) {
		Mycolor mo=Mycolor.red;
		switch(mo) {
		case red:
		
			System.out.println("red");
			break;
			
		case blue:
		
			System.out.println("blue");
			
		break;
		default :
		
			System.out.println("yellow");
			
		break;
			
		}
		
		
		
	}

}

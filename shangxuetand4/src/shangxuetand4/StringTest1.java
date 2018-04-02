package shangxuetand4;

public class StringTest1 {
	public static void main(String []args) {
		String s="hfakajkjasflkEEEEEjavadkfdldklksjsunjavadkjfkdjk";
		String javafind = "java";
		int count=0;
		int index=-1;
		while ((index=s.indexOf(javafind))!=-1) {
			s=s.substring( index+javafind.length());
			count++;
			
			
		}
		System.out.println(count);
	}

}

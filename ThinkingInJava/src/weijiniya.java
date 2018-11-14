import java.util.Scanner;

public class weijiniya { 
	public static void main (String []args) {
		System.out.println("请输入要破译的密文:");
		Scanner scanner=new Scanner(System.in);
		String ss=scanner.nextLine();
		char[] test=ss.toCharArray();
		//char[] test1=new char('d',);
		System.out.println("经维吉尼亚解密后的密文为：");
		for(int i=0;i<test.length;i++) {
			if(i==0||i==9||i==18) {
				char cc=(char) (test[i]+3-32);
				System.out.print(cc);
			}
			if(i==1) {
				char cc=(char)(test[i]+4-32);
				System.out.print(cc);
			}
			if(i==2) {
				char cc=(char)(test[i]+2-32);
				System.out.print(cc);
			}
			
			if(i==3) {
				char cc=(char)(test[i]+4-32);
				System.out.print(cc);
			}
			
			if(i==4) {
				char cc=(char)(test[i]+15-32);
				System.out.print(cc);
			}
			
			if(i==5) {
				char cc=(char)(test[i]+19-32);
				System.out.print(cc);
			}
			
			if(i==6) {
				char cc=(char)(test[i]+8-32);
				System.out.print(cc);
			}
			
			if(i==7) {
				char cc=(char)(test[i]+21-32);
				System.out.print(cc);
			}
			
			if(i==8) {
				char cc=(char)(test[i]+3-32);
				System.out.print(cc);
			}			
		}
		
		
	}

}

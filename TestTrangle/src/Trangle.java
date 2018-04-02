import java.util.Scanner;

public class Trangle {
	public static void main (String [] args) {
		
		System.out.println("请输入要测试的数据");
		
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
		Trangle TL=new Trangle();
		TL.TestWay(a, b, c);
		
	}
	public boolean  TestWay(int a,int b, int c) {
		
		if(a+b>c&&a+c>b&&b+c>a) {
			return true;
		}else
		return false;
		
		
	}

}

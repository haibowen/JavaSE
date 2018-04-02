package ex1;

import java.util.Scanner;

public class ex5 {
	public static void main(String []args) {
		double []a=new double[2];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			a[i]=scanner.nextDouble();
			
		}
		double x=a[0];
		double y=a[1];
		if((x>0&&x<1)&&(y>0&&y<1)) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
	}

}

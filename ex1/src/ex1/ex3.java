package ex1;

import java.util.Scanner;
public class ex3 {
	public static void  main(String [] args) {
		int []a=new int [3];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			a[i]=scanner.nextInt();
		}
		if(a[0]==a[1]&&a[1]==a[2]) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}

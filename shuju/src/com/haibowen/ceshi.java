 package com.haibowen;

import java.util.Scanner;

public class ceshi {
		public  static void  main (String []arges){
		
		    student student  []= new student[5];
			student a=new student();
			student b=new student();
			student c=new student();
			studentXW d=new studentXW();
			studentBZ e=new studentBZ();
			student [0]= a;
			student [1]= b;
			student [2]= c;
			student [3]= d;
			student [4]= e;
			for (int i=0;i<=4;i++) {
				
				System.out.println("学生的成绩如下"+student[i].testScore(20, 30, 40));
				
			}
			
			
			
			
		}

}

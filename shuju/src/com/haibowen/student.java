package com.haibowen;

public class student {
	private int Sno;
	private String Sname;
	protected double EnglishScore;
	protected double MathScore;
	protected double ComputerScore;
	private double totalScore;
		public student (){
			this.Sname=Sname;
			this.Sno=Sno;
			this.EnglishScore=EnglishScore;
			this.MathScore=MathScore;
			this.ComputerScore=ComputerScore;
			this.totalScore=totalScore;
					
					
			
		}
		public void getScore(){
			this.MathScore=MathScore;
			
		}
		public void setScore(){
			this.MathScore=MathScore;
			sum(ComputerScore, ComputerScore, ComputerScore);
			
			
		}
		public String toString(){
			return Sname;
			
		}
		public void equals(){
			
		}
		public void compare(){
			student a=new student();
			student b=new student();
			if(a.sum(EnglishScore, MathScore, ComputerScore)>b.sum(EnglishScore, MathScore, ComputerScore)){
				System.out.println("a>b");
			}
			if(a.sum(EnglishScore, MathScore, ComputerScore)==b.sum(EnglishScore, MathScore, ComputerScore)){
				System.out.println("a==b");
				
			
			
			}else{
				System.out.println("a<b");
			}
			
		}
		public  static double sum(double EnglishScore,double MathScore,double ComputerScore){
			double Total;
			Total =EnglishScore+MathScore+ComputerScore;
			return Total;
		
		}
		public  double testScore (double EnglishScore,double MathScore,double ComputerScore){
			double avg;
			avg=(EnglishScore+MathScore+ComputerScore)/3;
			return avg;
			
		}
}

package com.haibowen;

public class studentXW extends student {
	private String ZeRen;
	public double  testScore(double EnglishScore,double MathScore,double ComputerScore){
		double avg;
		avg=(EnglishScore+MathScore+ComputerScore)/3+3;
		return avg;
	}

}

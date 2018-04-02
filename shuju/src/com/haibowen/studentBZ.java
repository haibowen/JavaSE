package com.haibowen;

public class studentBZ extends student {
	private String ZeRen;
	public double testScore(double EnglishScore,double MathScore,double ComputerScore){
		double avg ;
		avg=(EnglishScore+MathScore+ComputerScore)/3+5;
		return avg;
	}

}

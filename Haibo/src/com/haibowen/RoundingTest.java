package com.haibowen;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingTest {

	public static void main(String[] args) {
		BigDecimal bg=new BigDecimal(10000);//本金
		BigDecimal bg1=new BigDecimal(0.0423);//利息
		BigDecimal bg2=bg.multiply(bg1).setScale(2,RoundingMode.HALF_EVEN);
		System.out.println(bg2);

	}

}

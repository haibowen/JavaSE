package com.haibowen;

public class Trangle {
    private static int result;
    public void trangle(int a,int b,int c) {
    	//�߳��������0
    	if(a<=0||b<=0||c<=0) {
    		result=0;
    		
    	}
    	if(a>100||b>100||c>100) {
    		result=1;
    	}
    	if((a>0&&a<100)&&(b>0&&b<100)&&(c>0&&c<100)) {
    		
    	
    	//�ж�����
        if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)) {
    		//����������
    		if(a==b||a==c||b==c) {
    			result=2;
    		}
    		//�ȱ�������
    		if(a==b&&b==c) {
    			result=3;
    		}
    		
    		//��ͨ������
    		if(a<b&&b<c&&a*a+b*b!=c*c) {
    			result=4;
    		}
    		//ֱ��������
    		if(a<b&&b<c&&a*a+b*b==c*c) {
    			result =5;
    			
    			
    		}
    		
        }
    		
    	}
    }
      
	 
    	
    
    public int getResult() {
    	return result;
    }

}

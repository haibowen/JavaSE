package haibowen;

public class Trangle_test {
	 private static int result = 0;
	    public void triangle(int a,int b,int c)
	    {
	        if(a<=0 || b<=0 || c<=0)
	        {
	            result = 0;//�߳��������0
	        }
	        else {
	        	if(((a+b)>c) && ((a+c)>b && (b+c)>a))
	            {
	                if((a == b) &&(b == c))
	                {
	                  result = 1;//�ȱ�
	                }
	                if((c==b)) {
	                	result= 2;//  �ȱ�  ����д���
	                }
	                
	                if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=b))
	                {
	                    result = 3;//����
	                    
	                }
	                if(a!=b&&a!=c) {
	                	result=4;//��ͨ  ������
	                	
	                }
	               
	                
	                if(a!=b && a!=c && b!=c)
	                {
	                    result = 5;//��ͨ
	                }
	                if (a<b) {
	                	result =6;//ֱ��   ������
	                }
	                
	                if(a<b&&b<c&&a*a+b*b==c*c) {
	                	result =7;//ֱ��
	                	
	                }
	                if(a>b) {
	                	result =8; //ֱ��   ����д��� 
	                }
	                
	            }
	            
	            else
	            {
	                result = 9;//����������֮�ʹ��ڵ����ߵĲ���������
	            }
	            }
	    }
	        
	        
	    
	    public int getReuslt(){
	        return result;
	    }
	    
	      

	}



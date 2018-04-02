package haibowen;

public class Trangle_test {
	 private static int result = 0;
	    public void triangle(int a,int b,int c)
	    {
	        if(a<=0 || b<=0 || c<=0)
	        {
	            result = 0;//边长必须大于0
	        }
	        else {
	        	if(((a+b)>c) && ((a+c)>b && (b+c)>a))
	            {
	                if((a == b) &&(b == c))
	                {
	                  result = 1;//等边
	                }
	                if((c==b)) {
	                	result= 2;//  等边  故意写错的
	                }
	                
	                if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=b))
	                {
	                    result = 3;//等腰
	                    
	                }
	                if(a!=b&&a!=c) {
	                	result=4;//普通  故意错的
	                	
	                }
	               
	                
	                if(a!=b && a!=c && b!=c)
	                {
	                    result = 5;//普通
	                }
	                if (a<b) {
	                	result =6;//直角   故意错的
	                }
	                
	                if(a<b&&b<c&&a*a+b*b==c*c) {
	                	result =7;//直角
	                	
	                }
	                if(a>b) {
	                	result =8; //直角   故意写错的 
	                }
	                
	            }
	            
	            else
	            {
	                result = 9;//不满足两边之和大于第三边的不是三角形
	            }
	            }
	    }
	        
	        
	    
	    public int getReuslt(){
	        return result;
	    }
	    
	      

	}



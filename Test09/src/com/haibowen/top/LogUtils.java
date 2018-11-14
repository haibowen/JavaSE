package com.haibowen.top;

public class LogUtils {
	private static LogUtils lg;
	
	public static final int debug=0;
	
	public static final int info =1;
	public static final int error=2;
	public static final int waring=3;
	public int level=debug;
	
	private LogUtils() {
		
		
	}
	
/**
	public synchronized static LogUtils getInstance() {
		
		if(lg==null) {
			
		lg=	new LogUtils();
		}
		
		return lg;
		
		
	}
	**/
  public  static LogUtils getInstance() {
	  
	  if(lg==null) {
		  
		  synchronized (LogUtils.class) {
				
				if(lg==null) {
					lg=	new LogUtils();
					}
					
			}
		  
	  }
	return lg;
		
		
		
	}
	
	
	public void debug(String msg) {
		if(debug>=level) {
			
			System.out.println(msg);
		}
		
	}
	public void info(String msg) {
		
		if(info>=level) {
			
			System.out.println(msg);
			
			
		}
	}
	public void error(String msg) {
		
		if(error>=level) {
			
			System.out.println(msg);
		}
	}
	
	public void warring(String msg) {
		if(waring>=level) {
			System.out.println(msg);
		}
		
	}
	

}

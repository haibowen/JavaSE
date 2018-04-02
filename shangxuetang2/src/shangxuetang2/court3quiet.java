package shangxuetang2;

public class court3quiet {
	public static void main (String arges []) {
		boolean[] a=new boolean[500];
		for(int i=0;i<a.length;i++) {
			a[i]=true;
			}
		int leftcount=a.length;
		int count=0;
		int index=0;
		while(leftcount>1) {
			if(a[index]=true) {
				count++;
			
			if(count==3) {
				count=0;
				a[index]=false;
				leftcount--;
				
			}
		}
			index++;
			
			if(index==a.length) {
				index=0;
			}	
				
	}
			for(int i=0;i<a.length;i++) {
				if(a[i]==true) {
					System.out.println(i);
				}
			}
			
			
		
		}
			
	}

	
		
	



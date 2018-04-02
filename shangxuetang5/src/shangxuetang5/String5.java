package shangxuetang5;

public class String5 {
	public static void main (String [] args) {
		double[][] arry;
		String s="1,2;3,4,5;6,7,8";
		String [] sfirst=s.split(";");
		arry=new double[sfirst.length][];
		
		for(int i=0;i<sfirst.length;i++) {
			String[] ssecond=sfirst[i].split(",");
			arry[i]=new double[ssecond.length];
			
			for(int j=0;j<ssecond.length;j++) {
				
				
				arry[i][j]=Double.parseDouble(ssecond[j]);
				
				}
			
		}
		for(int i=0;i<arry.length;i++) {
			for(int j=0;j<arry[i].length;j++) {
				System.out.print(arry[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}

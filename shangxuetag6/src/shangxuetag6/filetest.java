package shangxuetag6;

import java.io.File;

public class filetest {
	public static void main(String []args) {
		File f=new File("E:/666");
		filetest ft=new filetest();
		ft.listtree(f,1);
		
	}
	private void listtree(File f,int level) {
		
	String str=" ";
	for(int i=0;i<level;i++) {
		str +="   ";
	}
	File[] h=	f.listFiles();
	for(int i=0;i<h.length;i++) {
		System.out.println(str+h[i].getName());
		
		if(h[i].isDirectory()) {
			listtree(h[i],level+1);
		}
		
	}
		
	}

}

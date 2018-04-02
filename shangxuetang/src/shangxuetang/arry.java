package shangxuetang;

public class arry {
	public static void main (String []arges) {
		int arr []= {1,2,3};
		System.out.println(arr[1]);
		try {
			int x=2/0;
			System.out.println(x);
			}catch(ArithmeticException e) {
			System.out.println("系统正在维护中，请稍后。。。。");
			e.printStackTrace();
		}
	}

}

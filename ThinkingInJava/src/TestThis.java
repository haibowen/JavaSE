
public class TestThis {
	public static void main(String []args) {
		TestThis ts=new TestThis();
		ts.test0();
	}
	
	
	public    void test0() {
		System.out.println("���Ƿ��� һ");
		test1();
		this.test1();
	}
	public  void  test1() {
		System.out.println("���ǵڶ�������");
	}

}

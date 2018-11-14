
public class TestThis {
	public static void main(String []args) {
		TestThis ts=new TestThis();
		ts.test0();
	}
	
	
	public    void test0() {
		System.out.println("我是方法 一");
		test1();
		this.test1();
	}
	public  void  test1() {
		System.out.println("我是第二个方法");
	}

}

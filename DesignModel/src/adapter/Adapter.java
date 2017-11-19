package adapter;

public class Adapter extends Source implements Targetable {

	//不用实现该方法，因为父类已经实现
/*	@Override
	public void mehtod1() {
		// TODO Auto-generated method stub

	}*/

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("我是adapter实现的Targetable接口的方法");
	}
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.method1();
		adapter.method2();
				
	}

}

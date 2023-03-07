package HomeWork.Cars;

interface Inter {

	void show();			// 抽象方法show方法
}
 
class Outer {

	// 补全代码
	public static Inter method(){

		return new Inter() {
			@Override
			public void show() {
				System.out.println("itheima");
			}
		};
	}

}
 
class OuterDemo {

	public static void main(String[] args) {
		Outer.method().show();
	}

}
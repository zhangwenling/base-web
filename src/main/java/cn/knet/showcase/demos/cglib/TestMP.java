package cn.knet.showcase.demos.cglib;
public class TestMP {

	public static void main(String[] args) {
		System.out.println("=== 测试基本数据类型 ===");
		int a = 30;
		System.out.println("调用前 a=" + a);
		tripValue(a);
		System.out.println("调用后 a=" + a);
		System.out.println();

		System.out.println("=== 测试对象引用参数 ===");
		Book ba = new Book("Java核心技术", 30);
		Book bb = new Book("算法技术手册", 20);
		System.out.println("调用前");
		System.out.println(ba);
		System.out.println(bb);
		System.out.println();
		System.out.println("对象引用类型参数调用可以改变对象内容");
		adjustPrice(ba);
		System.out.println(ba);
		System.out.println();
		System.out.println("对象引用类型参数调用不能改变参数引用值");
		swapBook(ba, bb);
		System.out.println(ba);
		System.out.println(bb);

	}

	static void tripValue(int data) { // doesn't work
		data = data * 3;
	}

	static void adjustPrice(Book aBook) {
		aBook.setPrice(100.0);
	}

	static void swapBook(Book x, Book y) { // doesn't work
		Book temp = x;
		x = y;
		y = temp;
	}

}

class Book {

	private String name;
	private double price;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	//
	@Override
	public String toString() {
		return "[name=" + this.name + ", price=" + this.price + "]";
	}
}

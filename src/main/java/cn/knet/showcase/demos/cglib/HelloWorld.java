package cn.knet.showcase.demos.cglib;

/**
 * 定义一个HelloWorld类
 * 
 * @author jiqinlin
 * 
 */
public class HelloWorld {
	public void sayHelloWorld() {
		System.out.println("HelloWorld1106!");
	}

	public User sayHelloWorld(User user) {
		System.err.println("改变前：" + user);
		user = null;
		return user;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setId(1L);
		user.setName("abc");
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHelloWorld(user);
		System.err.println("222222" + user);
	}
}
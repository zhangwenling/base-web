package cn.knet.showcase.demos.cglib;

public class HelloWorldTest {

    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorld();
        CglibProxy cglibProxy=new CglibProxy();
        HelloWorld hw=(HelloWorld)cglibProxy.createProxy(helloWorld);
        User user = new User();
        user.setId(1L);
        user.setName("abc");
       System.err.println("return:" +hw.sayHelloWorld(user));
        System.err.println("===>>" + user);
    }
}
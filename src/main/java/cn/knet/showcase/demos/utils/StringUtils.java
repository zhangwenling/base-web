package cn.knet.showcase.demos.utils;

public class StringUtils {

	public static void test(String message){
		System.out.println("\u3010\u6218\u8230\u770b\u76d8\u3011\u6d1b\u9633\u73bb\u7483\u5c01\u677f\uff0c\u592e\u6539\u518d\u5ea6\u88ab\u6fc0\u6d3b\uff0c\u745e\u6cf0\u51ef\uff0c\u4e2d\u6210\u80a1\u4efd\uff0c\u9645\u534e\u96c6\u56e2\u7b49\u7eb7\u7eb7\u53d1\u529b\uff0c\u6539\u9769\u662f\u8d2f\u7a7f\u5168\u5e74\u7684\u4e3b\u7ebf\uff0c\u6293\u4f4f\u4e3b\u7ebf\u505a\u597d\u6ce2\u6bb5\u4e3a\u4e3b\uff01");
	}
	
	public static void main(String[] args) {

		StringUtils stringUtils = new StringUtils();
		Class<? extends StringUtils> aClass = stringUtils.getClass();
		System.out.println(aClass.getName());


	}
}

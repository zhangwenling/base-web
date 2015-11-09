package cn.knet.showcase.demos.properties;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class LoadSample {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("id", "dean");
		p.setProperty("password", "123456");

		try {
			PrintStream fW = new PrintStream(new File("c:\\test1.properties"));
			p.list(fW);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	/*
	 * public static void main(String args[]) throws Exception { Properties prop = new Properties(); FileInputStream fis = new
	 * FileInputStream("D:\\workspaces\\base-web\\src\\main\\java\\cn\\knet\\showcase\\demos\\properties\\sample.properties"); prop.load(fis);
	 * prop.list(System.out); System.out.println("\nThe foo property: " + prop.getProperty("foo")); }
	 */
}
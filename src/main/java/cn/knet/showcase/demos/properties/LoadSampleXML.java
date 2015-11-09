package cn.knet.showcase.demos.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadSampleXML {
	public static void main(String args[]) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\workspaces\\base-web\\src\\main\\java\\cn\\knet\\showcase\\demos\\properties\\sampleprops.xml");
		prop.loadFromXML(fis);
		prop.list(System.out);
		System.out.println("\nThe foo property: " + prop.getProperty("foo"));
		System.err.println(LoadSampleXML.class.getName());
	}
}
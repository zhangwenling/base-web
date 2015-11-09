package cn.knet.showcase.demos.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>(Arrays.asList("One", "Two", "Three"));
		myList.add("four");
		System.err.println(myList);
	}
}

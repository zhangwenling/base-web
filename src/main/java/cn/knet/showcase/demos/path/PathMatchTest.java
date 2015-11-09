package cn.knet.showcase.demos.path;

import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

public class PathMatchTest {

	
	public static void main(String[] args) {
		PathMatcher pathMatcher = new AntPathMatcher();
		String path = "/root/**/*.html";
		String requestPath = "/root/a.html";
//		boolean pattern = pathMatcher.isPattern(path );
		boolean match = pathMatcher.match(path, requestPath);
		System.err.println(match);
	}
}

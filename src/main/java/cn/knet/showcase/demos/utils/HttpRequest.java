package cn.knet.showcase.demos.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;

import com.alibaba.druid.support.json.JSONUtils;

public class HttpRequest {
	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	public static String sendGet(String url, String param, String cookie) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.setRequestProperty("Cookie", cookie);
			// 建立实际的连接
			connection.connect();

			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				// System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 */
	public static String sendPost(String url, String param, String cookie) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.setRequestProperty("Cookie", cookie);
			// 建立实际的连接
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		String url = "http://www.shagualicai.cn/studio/masterViewpoint/sign/150830010116110198_/type/new/sid/888/lid/";
		String id = "949402";
		String param = "_=1443062395766";
		String cookie = "zb_font_size=font-small; uhash=55e52cd0845c4; PHPSESSID=r2hf4kjp213oih70qafu9jmad0; STrack=20150923162213115%7B00DBB558ADA217F944EAF2C9B516F4B3%7D; AUTH=MTUwODMwMDEwMTE2MTEwMTk4%23%7C%7C%2355Oc55OcXzkyMzMw%23%7C%7C%235peg5b2x5peg6LiqMTIz%23%7C%7C%23MTUtOC0zMCAxNjoxMTowMQ%3D%3D%23%7C%7C%23MTUwODMwMDEwMTE2MTEwMTk4LTQwMy1mVlV5THlpYTRLa1l1OFUyVm40bktGWnpDemZVR0ZJTFp6Ug%3D%3D%23%7C%7C%233D05792D211AFF6D4DEAE9B83FBEAE88; shipan_vd=3786OL6wg5An55yXN42xfipzw9st16cG6sp8H0x3KEFQtKb%2F2DLOQCKKHn5O17jRQAYoFVti1CeE9WE5ywYLew; sved=888%2C117%2C282%2C105; Hm_lvt_4e544208853f635bd056188b6c5272a3=1442279577,1442467072,1442800883,1442890556; Hm_lpvt_4e544208853f635bd056188b6c5272a3=1443060939";
		for (int i = 0; i < 20000; i++) {
			param = "_=" + System.currentTimeMillis();
			String sendGet = sendGet(url + id, param, cookie);
//			System.out.println(sendGet);
			HashMap parse = (HashMap) JSONUtils.parse(sendGet);
			List<HashMap> data = (List) parse.get("data");
			HashMap map = data.size() > 0 ? data.get(0) : null;
			String content = map !=null ? map.get("content").toString():null;
			if(StringUtils.isNotBlank(content)){
				id = map.get("id").toString();
				System.err.print(new Date().toLocaleString());
				System.err.println(content);
				
			}
			Thread.sleep(2000);
		}

	}
}
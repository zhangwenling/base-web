package cn.knet.showcase.demos.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkClient {

	public static void main(String args[]) {
		try {
			Socket socket = new Socket("127.0.0.1", 4700);
			// 向本机的4700端口发出客户请求
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// 由系统标准输入设备构造BufferedReader对象
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			// 由Socket对象得到输出流，并构造PrintWriter对象
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 由Socket对象得到输入流，并构造相应的BufferedReader对象
			while (true) {
				os.println("client success");
				os.flush();
				System.err.println("正在等待数据");
				System.out.println("服务器返回数据：:" + is.readLine());
			} // 继续循环
	
		} catch (Exception e) {
			System.out.println("Error" + e); // 出错，则打印出错信息
		}
	}
}
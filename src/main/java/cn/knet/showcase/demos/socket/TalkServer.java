package cn.knet.showcase.demos.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServer {

	public static void main(String args[]) {
		int i = 1;
		try {
			ServerSocket server = null;
			server = new ServerSocket(4700);
			// 创建一个ServerSocket在端口4700监听客户请求
			Socket socket = null;
			while (true) {
				socket = server.accept();
				System.err.println("来了一个新客户" + i);
				ServerThread serverThread = new ServerThread(socket);
				Thread thread = new Thread(serverThread);
				thread.setName("服务器-" + i);
				thread.start();
				i++;
			}

		} catch (Exception e) {
			System.out.println("Error:" + e);
			// 出错，打印出错信息
		} finally {
			/*
			 * os.close(); // 关闭Socket输出流 is.close(); // 关闭Socket输入流 socket.close(); // 关闭Socket server.close(); // 关闭ServerSocket
			 */}

	}
}
package cn.knet.showcase.demos.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {

	Socket socket = null;
	
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			String line;
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 由Socket对象得到输入流，并构造相应的BufferedReader对象
			BufferedOutputStream os = new BufferedOutputStream(socket.getOutputStream());
			// 由Socket对象得到输出流，并构造PrintWriter对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// 由系统标准输入设备构造BufferedReader对象
			System.out.println("服务器启动完成");
			int  i= 1;
			while (true) {
				line = Thread.currentThread().getName() + "来自的数据" + i++;
				System.out.println(Thread.currentThread().getName() + "发送数据：" + line);
				os.write(line.getBytes("utf-8"));
				os.flush();
				Thread.sleep(1*1000);
				//System.out.println("Client:" + is.readLine());
			} // 继续循环
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

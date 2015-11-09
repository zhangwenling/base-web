package cn.knet.showcase.demos.thread;

public class CopyOfThreadDemo02 {

	public static void main(String[] args) {

		TB ta = new TB();

		ta.start();

		int i = 0;

		while ((i++) < 10) {

			System.out.println("-------");

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

}

class TB extends Thread {

	@Override
	public void run() {

		super.run();

		int i = 0;

		while (!Thread.currentThread().isInterrupted() && (i++) < 40) {

			System.out.println("---->A");

			if (i == 4)
				Thread.currentThread().interrupt();// 在sleep之前调用，将不能终止线程

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

			if(i == 4) Thread.currentThread().interrupt();//在sleep之后调用，将能终止线程

		}

	}

}

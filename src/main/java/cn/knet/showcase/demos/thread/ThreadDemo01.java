package cn.knet.showcase.demos.thread;

public class ThreadDemo01 {

	public static void main(String[] args) {

		TA ta = new TA();

		ta.start();

		String name = Thread.currentThread().getThreadGroup().getName();
		System.err.println(name);
		try {

			ta.join();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

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

class TA extends Thread {

	@Override
	public void run() {

		super.run();

		int i = 0;

		String name = Thread.currentThread().getThreadGroup().getName();
		System.err.println(name);
		while ((i++) < 40) {

			System.out.println("---->A");

			if (i == 10) {

				Thread.currentThread().interrupt();

			}

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

		}

	}

}

package ex01;

import java.awt.Toolkit;

class ShowTask implements Runnable {
	@Override
	public void run() { // Thread 구현
		for (int i = 0; i < 5; i++) {
			System.out.println("탕");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class BeepTask implements Runnable{
	@Override
	public void run() { // Thread 구현
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class BeepTaskThread {
	public static void main(String[] args) {
		Runnable task1 = new ShowTask();
		Thread t1 = new Thread(task1);
		t1.start(); // 스레드 실행 시작
		
		Runnable task2 = new BeepTask();
		Thread t2 = new Thread(task2);
		t2.start(); // 스레드 실행 시작
	}

}

package ex01;

import java.awt.Toolkit;

public class BeepTaskTest {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("탕");
				//throw new InterruptedException("메롱"); 강제
				Thread.sleep(500);//0.5초 대기
			} catch (InterruptedException e) {
				e.printStackTrace(); // 에러 메세지 출력
			} 
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //static 함수
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}

}

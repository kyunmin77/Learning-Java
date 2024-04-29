package Thread;

public class ThreadEx1_2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++)
			System.out.println(Thread.currentThread().getName()); // 현재 실행중인 Thread 반환

	}

}

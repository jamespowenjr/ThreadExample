package thread.example;

public class CountThread implements Runnable {

	private int threadNumber;

	public CountThread(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread #" + threadNumber + ": " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

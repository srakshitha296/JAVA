package LabProgram;

import java.util.Random;

class SquareThread implements Runnable {
	int x;

	SquareThread(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		System.out.println("Thread Name : SquareThread\nSquare of " + x + " is " + (x * x));

	}

}

class CubeThread implements Runnable {

	int x;

	CubeThread(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		System.out.println("Thread Name : CubeThread\nCube of " + x + " is " + (x * x * x));

	}

}

class RandomNumberThread implements Runnable {
	Random r;
	Thread t2, t3;

	@Override
	public void run() {
		int num;
		r = new Random();
		while (true) {
			num = r.nextInt(100);
			System.out.println("Main Thread and generated number is " + num);
			t2 = new Thread(new SquareThread(num));
			t2.start();
			t3 = new Thread(new CubeThread(num));
			t3.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~");

		}
	}

}

public class MainThread {

	public static void main(String[] args) {
		RandomNumberThread thread_obj = new RandomNumberThread();
		Thread t1 = new Thread(thread_obj);
		t1.start();

	}

}

package com.gmail.yuriypelykh;

public class SumCalcThread implements Runnable {

	private int[] array;
	private int begin;
	private int end;
	private Thread thr;
	private int threadSum = 0;

	public SumCalcThread(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
	}

	public Thread getThr() {
		return thr;
	}	

	public int getThreadSum() {
		return threadSum;
	}

	public void setThreadSum(int threadSum) {
		this.threadSum = threadSum;
	}

	@Override
	public void run() {
		for (int i = begin; i < end; i++) {
			threadSum = threadSum + array[i];
		}
	}

}

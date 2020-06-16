package com.gmail.yuriypelykh;

import java.math.BigInteger;

public class ParallelThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread-" + Thread.currentThread().getName() + " - factorial result: "
				+ calcFactorial(Integer.parseInt(Thread.currentThread().getName())));
	}

//	public long calcFactorial(int n) {
//		return (n == 0) ? 1 : n * calcFactorial(n - 1);
//	}
	
	public BigInteger calcFactorial(int n) {
		BigInteger res = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}

}

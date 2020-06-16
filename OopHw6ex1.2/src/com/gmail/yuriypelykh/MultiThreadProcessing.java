package com.gmail.yuriypelykh;

public class MultiThreadProcessing {

	static int sum(int[] array, int threadNumber) {
		SumCalcThread[] threadArray = new SumCalcThread[threadNumber];
		for (int i = 0; i < threadArray.length; i++) {
			int size = array.length / threadNumber;
			int begin = size * i;
			int end = ((i + 1) * size);
			if ((array.length - end) < size) {
				end = array.length;
			}
			threadArray[i] = new SumCalcThread(array, begin, end);
		}
		for (int i = 0; i < threadArray.length; i++) {
			try {
				threadArray[i].getThr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		int sum = 0;
		for (int i = 0; i < threadArray.length; i++) {
			sum += threadArray[i].getThreadSum();
		}
		return sum;
	}

}

package javacorn;
import java.util.Arrays;

public class SWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100000];
		StopWatch sw1 = new StopWatch();
		// start time
		sw1.start();
		// code sort
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000);
		}
		Arrays.sort(arr); // phần này th demo cho nhanh, còn các e sẽ code 
		// endtime
		sw1.stop();
		System.out.println("Tổng thời gian: " + (double)sw1.getElapsedTime()/1000 + " seconds");
	}

}

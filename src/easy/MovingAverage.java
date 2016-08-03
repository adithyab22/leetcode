package easy;

import java.util.LinkedList;

/**
 * Given a stream of integers and window size, calculate the moving average of
 * all integers in the sliding window.
 * (window size is fixed, stream is moving)
 * @author Adithya Balasubramanian
 * 
 */
public class MovingAverage {
	LinkedList<Integer> queue;
	int size = 0;
	int average = 0;
	
	MovingAverage(int size){
		queue = new LinkedList<Integer>();
		this.size = size;
	}
	
	public int next(int val){
		if(queue.size() < this.size){
			//add new value to queue
			int sum = 0;
			queue.offer(val);
			for(int i : queue){
				sum += i;
			}
			average = sum/queue.size();
			return average;
		}else{
			//remove head from queue and add new value to queue
			int head = queue.poll();
			queue.offer(val);
			average = average + val/queue.size() - head/queue.size();
			return average;		
		}
	}
}

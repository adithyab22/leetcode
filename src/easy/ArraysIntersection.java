package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysIntersection {
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 Set<Integer> set = new HashSet<Integer>();
	        Set<Integer> intersect = new HashSet<Integer>();
	        for (int i : nums1) {
	            set.add(i);
	        }
	        for (int j : nums2) {
	            if (set.contains(j)) {
	                intersect.add(j);
	            }
	        }
	        int[] result = new int[intersect.size()];
	        int index = 0;
	        for (Integer num : intersect) {
	            result[index++] = num;
	        }
	        return result;
	    }
	 
	 public static void main(String[] args) {
		int[] a = {1,2,2,1};
		int[] b = {2,2};
		System.out.println(Arrays.toString(intersection(a,b)));
	}
}

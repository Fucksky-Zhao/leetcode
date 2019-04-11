/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	public static void solution(int[] nums) {
	    int n = nums.length;
	    List<Integer> buy = new ArrayList<>();
	    List<Integer> sell = new ArrayList<>();
	    for (int i = 0; i < n; i++) {
	        if (i == 0 && nums[i] < nums[i + 1]) {
	            buy.add(i);
	        } else if (i != 0 && i < n - 1 && nums[i] < Math.min(nums[i + 1], nums[i - 1])) {
	            buy.add(i);
	        } else if (i == n - 1 && nums[i] > nums[i - 1]) {
	            sell.add(i);
	        } else if (i != 0 && i < n - 1 && nums[i] > Math.max(nums[i + 1], nums[i - 1])) {
	            sell.add(i);
	        }
	    }
	    if (buy.size() == 0) {
	        System.out.print("No Profit");
	    } else {
	        for (int i = 0; i < buy.size(); i++) {
	            System.out.print("(" + buy.get(i) + " " + sell.get(i) + ")" + " ");
	        }
	    }
	    System.out.println();
	    buy.clear();
	    sell.clear();
	}



	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
		    int N = scanner.nextInt();
		    int[] a = new int[N];
		    for (int i = 0; i < N; i++) {
		        a[i] = scanner.nextInt();
		    }
		    //solution..
		    solution(a);
		    //System.out.println()
		}
	}
}

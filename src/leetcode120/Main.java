package leetcode120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>(4);
		
		triangle.add(Arrays.asList(2));
		triangle.add(Arrays.asList(4,3));
		triangle.add(Arrays.asList(1,5,3));
		triangle.add(Arrays.asList(9,4,2,8));
		
		System.out.println("Triangle: " + triangle);
		
		FindMinPathTriangle solution = new FindMinPathTriangle();
		
		System.out.println("Solution: " + solution.minimumTotal(triangle));
		
	}
}

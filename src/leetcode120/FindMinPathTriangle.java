package leetcode120;

import java.util.List;

public class FindMinPathTriangle {
	// Dp bottom up approach, patterns
    public int minimumTotal(List<List<Integer>> triangle) {
        int totalRows = triangle.size();
        
        int[] dp = new int[totalRows];
        
        // Fill the dp with the last row of the triangle
        for(int i = 0; i < triangle.get(totalRows - 1).size(); i++){
            dp[i] = triangle.get(totalRows - 1).get(i);
        }
        
        // From the second to last row, do bottom up approach
        for(int row = totalRows - 2; row >= 0; row--){
        	// Each row only have size of row
            for(int col = 0; col <= row; col++){
            	// Move to adjacent numbers
                dp[col] = Math.min(dp[col], dp[col + 1]) + triangle.get(row).get(col);
            }
        }
        
        return dp[0];
    }
}

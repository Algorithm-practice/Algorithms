package lc.practice;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int[] nums = {3,2,4};
		sum.twoSum(nums,6);
	}
	public int[] twoSum(int[] nums, int target) {
		List<Integer> resultIndices = new ArrayList<Integer>();
		int start = 0;
		int end = nums.length - 1;
		while(start<=end){
			for(int i = start+1; i<=end;i++){
				int sum = nums[start] + nums[i];
				if(sum == target){
					resultIndices.add(start);
					resultIndices.add(i);
				}
			}
			for(int j = end-1; j>start;j--){
				int sum = nums[end] + nums[j];
				if(sum == target){
					resultIndices.add(end);
					resultIndices.add(j);
				}
			}
			start++;
			end--;
		}
		int[] indices = new int[resultIndices.size()];
		for( int k = 0; k<resultIndices.size(); k++){
			indices[k] = resultIndices.get(k);
		}
		return indices;
    }

}

import java.util.HashMap;
import java.util.Map;

class Solution {
    // My Solution Time complexity: O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int sum;
        boolean toStop = false;
        int[] indexes = new int[2];
        for(int i =0;i < nums.length; i++){
            if(toStop)
                break;
            for(int j = 1; j < nums.length; j++){
                if(i != j){
                    sum = nums[i] + nums[j];
                    if(sum == target){
                        indexes[0] = i;
                        indexes[1] = j;
                        toStop = true;
                        break;
                    }else{
                        sum = 0;
                    }
                }
            }
        }
        return indexes;
    }


    //The best solution time Complexity : O(n)
    private static int[] findTwoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

}
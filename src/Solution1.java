//两数之和

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int [] results = new int[2];
        Map<Integer,Integer> targets  = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(targets.get(target-nums[i]) != null){
                results[0] = targets.get(target-nums[i]);
                results[1] = i;
                return results;
            }else{
                targets.put(nums[i],i);
            }
        }

        return results;

    }
    public static void main (String[] Args){
        int [] anums = {2, 7, 11, 15};
        int target = 9;
        int [] ret = twoSum(anums,target);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
    }
}

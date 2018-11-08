import java.util.HashMap;
import java.util.Map;

/*
* 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]*/
public class test001 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,2,3,3,3};
        int target = 3;
        int[] a = twoSum(nums,target);
        System.out.println(a[0]+a[1]);
        for (int i = 0; i < nums.length-1; i++) {
            for(int j =i+1;j<nums.length;j++){
                if(nums[j]+nums[i]==target) {
                    System.out.println(i+"\t"+j);
                }
            }
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        //创建哈希表
        Map<Integer,Integer> map = new HashMap(){};
        //对nums数组进行遍历
        for(int i=0;i<nums.length;i++){
            //声明一个temp临时变量，temp=目标数-nums[i]
            int temp = target-nums[i];
            //如果map中包含以temp为key的数据，则进行返回map.get(temp)和i
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            //如果没有进入if条件判断，将nums[i]的值和下标存入map中
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

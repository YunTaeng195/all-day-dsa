import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for (Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return Math.min(map.size(),nums.length/2);

    }
}
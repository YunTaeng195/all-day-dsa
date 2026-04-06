import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer n : nums)
            map.put(n,map.getOrDefault(n,0)+1);
        return Math.min(map.size(),nums.length/2);
    }
}
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int c =common[1]-common[0];
        
        if(common[2]==common[1]+c) return common[common.length-1]+c;
        else {
            return common[common.length-1]*common[1]/common[0];
        }
    }
}
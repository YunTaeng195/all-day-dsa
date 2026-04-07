class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int GCD=1;
        for(int i=1;i<=Math.min(n,m);i++){
            if (n%i==0 && m%i==0)
                GCD=i;
        }
        int LCM=n*m/GCD;
        
        return new int[] {GCD, LCM};
    }
}
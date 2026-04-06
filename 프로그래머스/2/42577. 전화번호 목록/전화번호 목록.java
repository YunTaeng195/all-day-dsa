import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String num : phone_book){
            map.put(num,1);
        }
        for (String num : phone_book){
            String tmp="";
            for(char ch : num.toCharArray()){
                tmp+=ch;
                if (map.containsKey(tmp) && !tmp.equals(num)){
                    return false;
                }
            }
            
                
        }
        
        return true;
    }
}
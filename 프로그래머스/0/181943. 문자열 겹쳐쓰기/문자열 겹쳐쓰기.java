class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String first = my_string.substring(0,s);
        int end = s + overwrite_string.length();
        String second = my_string.substring(end);
        return first+overwrite_string+second;
    }
}
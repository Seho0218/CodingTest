class Solution {
    public String solution(String my_string) {
        
        StringBuffer bf = new StringBuffer();
        
        String answer = bf.append(my_string).reverse().toString();
        return answer;
    }
}
class Solution {
    public static final String[] numbers = {
        "zero", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine",
    };
    
    public int solution(String s) {
        for(int i = 0; i < numbers.length; i++){
            s = s.replace(numbers[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
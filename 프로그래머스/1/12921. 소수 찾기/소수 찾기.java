class Solution {
    private boolean isPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }    
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long num = Long.parseLong(st.nextToken());

        solution.solution(num);
    }
}

class Solution {
    public void solution(long num) {
        long answer;
        for(long n = 1; ; n++){
            if((n * (n + 1) / 2) > num){
                answer = n - 1;
                break;
            }
        }
        System.out.print(answer);
    }
}

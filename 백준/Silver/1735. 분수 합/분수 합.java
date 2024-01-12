import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        int numerator = a * d + b * c;
        int denominator = b * d;
        int gcd = gcd(numerator, denominator);
        sb.append(numerator / gcd).append(" ").append(denominator / gcd);
        
        System.out.print(sb);
    }
    
    public static int gcd(int a, int b) {
		if(a % b==0) {
			return b;
		}
		return gcd(b, a%b);
	}
}
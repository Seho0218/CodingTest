import java.io.*;
import java.util.*;
public class Main {
  static ArrayList<Integer>[] A;
  static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i < n+1; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    private static void DFS(int i) {
        if(visited[i]){
            return;
        }
        visited[i] = true;
        for(int k : A[i]){
            if(!visited[k]){
                DFS(k);
            }
        }
    }
}
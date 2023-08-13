import java.io.*;
import java.util.*;

public class Solution{
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            LinkedList<String> arr = new LinkedList<String>();
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) arr.add(st.nextToken());

            for(int i = 0; i < M; i++){
                st = new StringTokenizer(br.readLine());
                String o = st.nextToken();
                if(o.equals("I")){
                    int index = Integer.parseInt(st.nextToken());
                    String value = st.nextToken();
                    arr.add(index, value);
                }
                if(o.equals("D")){
                    int index = Integer.parseInt(st.nextToken());
                    arr.remove(index);
                }
                if(o.equals("C")){
                    int index = Integer.parseInt(st.nextToken());
                    String value = st.nextToken();
                    arr.remove(index);
                    arr.add(index, value);
                }
            }
            sb.append("#").append(t).append(" ");
            sb.append(L > arr.size() ? -1 : arr.get(L)).append('\n');
        }
        System.out.println(sb);
    }
}

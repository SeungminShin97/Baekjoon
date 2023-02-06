import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) 
            arr[i] = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            while(arr[i] <= k) {
                k -= arr[i];
                cnt++;
            }
            if(k == 0) {
                System.out.println(cnt);
                System.exit(0);
            }
        }
    }
}
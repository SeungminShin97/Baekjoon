import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;
            if(i % 3 == 0)
                arr[i] = min(arr[i], arr[i / 3] + 1);
            if(i % 2 == 0) 
                arr[i] = min(arr[i], arr[i / 2] + 1);
        }
        System.out.println(arr[n]);
    }
    public static int min(int a, int b) {
        return (a > b) ? b : a;
    }
}
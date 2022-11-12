import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++) 
                arr[i] = Integer.parseInt(st.nextToken());
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;
            else {
                if((arr[0] * arr[0] + arr[1] * arr[1]) == (arr[2] * arr[2])) System.out.println("right");
                else if((arr[0] * arr[0] + arr[2] * arr[2]) == (arr[1] * arr[1])) System.out.println("right");
                else if((arr[1] * arr[1] + arr[2] * arr[2]) == (arr[0] * arr[0])) System.out.println("right");
                else System.out.println("wrong");
            }
        }
        
        
    }
}
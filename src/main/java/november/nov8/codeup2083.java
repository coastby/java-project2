package november.nov8;

//[코드업] 2083 이분 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = n;

        while(true){
            if (start > end){
                System.out.println(-1);
                break;
            }
            int mid = (start+end)/2;
            if (arr[mid] == s){
                System.out.println(mid+1);
                break;
            } else if (s < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

}

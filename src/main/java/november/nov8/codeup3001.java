package november.nov8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//[코드업] 3001 데이터탐색

/** * 배열로 하려다가 IntStream이 코드업에서 인식이 안되어서 list이용 * **/

public class codeup3001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int k = Integer.parseInt(br.readLine());

        System.out.println(arr.indexOf(k));

//        int result = IntStream.range(0, num+1).
//                filter(i -> k == arr[i]).findFirst().orElse(-1);
//        System.out.println(result);
    }

}

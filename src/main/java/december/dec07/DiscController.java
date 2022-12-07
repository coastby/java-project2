package december.dec07;

//[programmers] Level.3 디스크 컨트롤러

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 요청받은 순서대로 처리
 * 각 작업의 요청부터 종료까지 걸린 시간 평균이 최소가 되도록 순서 설정
 *
 * 작업처리 시간은 같으므로 대기시간을 줄어야한다
 * 대기시간 = 앞의 일이 끝날때까지 기다리는 시간
 * 작업 중에 들어 온 요청은 짧은 것 먼저 한다
 * -----|---------|--------
 * */
public class DiscController {
    public int solution(int[][] jobs){
        int end;      //현재 작업 끝나는 시간
        int sum = 0;        //총 작업소요시간
        int idx = 0;        //queue에 들어간 작업 수
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        while (idx < jobs.length) {
            queue.add(jobs[idx][1]);
            end = jobs[idx][0];
            idx++;
            while (queue.size() > 0){
                int now = queue.poll();
                end += now;
                sum += now * (queue.size() + 1);       //작업할 동안 나머지는 기다려야 한다 + 현재 작업의 작업시간

                for (int i = idx; i < jobs.length; i++) {   //작업하는 동안 들어온 요청 큐에 넣기
                    if (jobs[i][0] <= end) {
                        queue.add(jobs[i][1]);
                        idx++;
                        sum += end - jobs[i][0];
                    } else {
                        break;
                    }
                }
            }
        }

        return sum/jobs.length;
    }
}

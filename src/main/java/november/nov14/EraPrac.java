package november.nov14;

//에라토스테네스의 체 연습
public class EraPrac {
    public int EraChe(int n) {
        //boolean 배열 생성
        boolean[] nums = new boolean[n+1];
        for (int i = 2; i*i <= n; i++) {
            for (int j =i*2; j <= n ; j++) {      //j를 i*2부터 시작하도록 리팩토링
                if(!nums[i] &&(j%i == 0)){         //i가 지워지지 않았을 때, index가 i가 아닌 i의 배수이면
                    nums[j] = true;                        //지운다
                }
            }
        }
        int cnt = 0;                        //갯수세기
        for (int i = 2; i < n+1; i++) {     //배열을 돌면서 true인 인덱스 출력
            if (!nums[i]) {
                System.out.print(i+" ");
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int N = 50;
        //1. 2~50 배열
        int[] nums = new int[N-1];
        for (int i = 2; i <= N; i++){
            nums[i-2] = i;
        }
        //2. 2를 제외한 2의 배수 지우기
        for (int i = 2; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] != 2){
                nums[i] = 0;
            }
        }
        EraPrac ep = new EraPrac();
        System.out.println(ep.EraChe(50));
    }
}

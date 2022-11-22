package november.nov22;


//배열 더하기
public class PlusArray {
    public int plus(int[] arr, int idx){
        if (idx == arr.length){
            return 0;
        }
        int num = arr[idx++];
        return num+plus(arr, idx);
    }
    public static void main(String[] args) {
        PlusArray c = new PlusArray();
        int[] arr = new int[] {100, 3, 2, 9};
        System.out.println(c.plus(arr, 0));
    }
}

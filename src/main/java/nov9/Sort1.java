package nov9;

public class Sort1 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 4, 9, 10, 223, 111, 23, 1, 3, 39};

        int i = 0;
        int min = arr[i];
        for (int j = i; j < arr.length; j++){
            if (arr[j] < arr[i]){
                min = arr[j];
                arr[j] = arr[i];
                arr[i] = min;
            }
        }
        System.out.println(arr[i]);
    }
}

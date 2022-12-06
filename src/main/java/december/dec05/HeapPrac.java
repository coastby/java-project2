package december.dec05;

import java.util.Arrays;


//최대힙 구현하기
public class HeapPrac {
    public static int[] down(int[] arr, int a){
        int par = (a-1)/2;      //인덱스가 0부터 시작
        int chil = a;
        if(a%2 == 0 && arr[a] < arr[a-1]) return arr;               //오른쪽 자식노드일 때 왼쪽 자식노드가 더 크면 패스

        if (arr[par] < arr[chil]){
            int tmp = arr[chil];
            arr[chil] = arr[par];
            arr[par] = tmp;

            if(a*2+2 < arr.length && arr[a*2+2] > arr[a*2+1])
                arr = down(arr, a*2+2);       //오른쪽 자식노드가 arr 범위 내이고, 왼쪽 자식노드보다 크면 오른쪽 자식으로 재귀
            else if (a*2+1 < arr.length) arr = down(arr, a*2+1);      //아니면 왼쪽 자식으로 재귀
        }
        return arr;
    }

    public static int[] heap(int[] arr){
        for (int i = arr.length-1; i > 0; i--){     //i가 자식 인덱스가 되며 밑에서부터 교환을 한다.
            arr = down(arr, i);                     //교환을 시작하면 아래로 쭉 들어가면서 교환을 한다.
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, 7, 8, 2, 3, 6, 1, 8, 0, 4, 10};
        System.out.println(Arrays.toString(heap(arr)));
    }
}

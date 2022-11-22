package november.nov22;

import java.util.ArrayList;
import java.util.List;

//리스트 더하기
public class PlusList {
    public int plus(List<Integer> list){
        if (list.size() == 1){
            return list.get(0);
        }
        int num = list.remove(0);
        return num+plus(list);
    }
    public static void main(String[] args) {
        PlusList c = new PlusList();
        List<Integer> list = new ArrayList<>(List.of(100, 3, 2, 9));
        System.out.println(c.plus(list));
    }
}

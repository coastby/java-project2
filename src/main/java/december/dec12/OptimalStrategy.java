package december.dec12;

import java.util.ArrayList;
import java.util.List;

/**
 * list = [2, 7, 40, 19, 4, 9]
 * 위 배열과 같이 **짝수 개**의 숫자 카드가 일렬로 놓여있습니다. 나와 상대방
 * 이 번갈아 가면서 카드를 가지고 올 수 있는데 현재 놓여있는 카드 중에서 **맨 앞에 있는 카드 또는 맨 뒤에 있는 카드**를 가지고 올 수 있습니다.
 * 예를들어 [2, 7, 40, 19, 4, 9] 카드가 있다면 카드를 가지고 올 때 맨 앞에 있는 2 또는 맨 뒤에 있는 9를 가지고 올 수 있습니다. 처음부터 40이나 19를 가지고 올 수는 없습니다.
 * [2, 7, 40, 19, 4, 9]여기에서 9를 가지고 왔다면 상대방은 [2, 7, 40, 19, 4] 중 2와 4를 가지고 갈 수 있습니다.
 * 이 게임은 가지고온 카드의 숫자 총 합이 많은 사람이 이기는 게임입니다.
 * 내가 먼저 카드를 가지고 올 수 있을 때. 이 게임에서 항상 승리 할 수 있는 알고리즘을 만들어 보세요. 여기에서 상대방은 단순히 남아있는 숫자 중 큰 숫자를 가지고 가는 것이 아니라 그 순간에 최적의 선택을 합니다.
 * */

public class OptimalStrategy {

    public static void main(String[] args) {
        List<Integer> cards = new ArrayList<>(List.of(2, 7, 40, 19, 4, 9));
        int start = 0;
        int end = cards.size()-1;
        List<Integer> mine = new ArrayList<>();
        List<Integer> yours = new ArrayList<>();

    }
}

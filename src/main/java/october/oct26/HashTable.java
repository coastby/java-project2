package october.oct26;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
    class Node {            //내부에서 사용되는 노드 클래스 작성
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
        public String getKey() {
            return key;
        }
    }


    private int size = 10000;
    //노드리스트의 배열을 테이블로 설정
    private List<Node>[] table = new ArrayList[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum%size;
    }
    public void insert(String key, Integer value) {
        int hashIdx = this.hash(key);
        if (this.table[hashIdx] == null){           //배열이 비어있으면 리스트 생성
            this.table[hashIdx] = new ArrayList<>();
        }
        //노드를 생성해서 리스트에 삽입
        this.table[hashIdx].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];  //인덱스에 있는 노드리스트를 가지고 온다.
        for (Node node : nodes) {                   //리스트에서 key값에 해당하는 노드를 찾는다.
            //== 안씀!!
            if (key.equals(node.getKey())) {
                return node.value;          //찾으면 값을 반환
            }
        }
        //없으면 null 반환
        return null;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("Hoon", 1);
        ht.insert("Nooh", 2);

        if(ht.get("Nooh") == 2) {           //테스트 통과
            System.out.println("good");
        }
    }
}

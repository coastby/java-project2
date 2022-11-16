package october.oct25;

public class HashPrac {
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    public static void main(String[] args) {
        HashPrac hp = new HashPrac();
        int hashcode = hp.hash(("YejiJo"));
        System.out.println(hashcode);
    }
}

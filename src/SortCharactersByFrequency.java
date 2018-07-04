import java.util.*;

/**
 * Created by arunesh on 10/1/17.
 */
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(char c:s.toCharArray())
            h.put(c, h.getOrDefault(c, 0) + 1);
        PriorityQueue<Map.Entry> pq = new PriorityQueue<>(
                new Comparator<Map.Entry>() {
                    public int compare(Map.Entry e1, Map.Entry e2) {
                        return (int)e2.getValue() - (int)e1.getValue();
                    }
                }
        );
        for (Map.Entry en: h.entrySet()) {
            pq.add(en);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry e1: pq) {
            for(int i=0; i < (int)e1.getValue(); i++) {
                sb.append(e1.getKey().toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(frequencySort(s));
    }
}

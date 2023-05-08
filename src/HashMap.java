import java.util.Iterator;
import java.util.Map;

public class HashMap {

    public static void main(String[] args) {
        java.util.HashMap<Integer, String>
                hashMap = new java.util.HashMap<>();
        hashMap.put(1, "China");
        hashMap.put(2, "India ");
        hashMap.put(3, "USA ");
        hashMap.forEach((k, v) -> {
            System.out.println("k " + k + " v " + v);
        });
        hashMap.remove(3);
        Iterator<Map.Entry<Integer, String>> iterator =
                hashMap.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<Integer, String> v = iterator.next();

            System.out.println("iterator" + "k " + v.getKey() + " v " + v.getValue());
        }
        hashMap.put(4, "Canada");
        for (Map.Entry<Integer, String> s : hashMap.entrySet()) {
            System.out.println("key " + s.getKey() + " v " + s.getValue());
        }

    }

}

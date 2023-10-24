package ArrayUsingMap;

import java.util.HashMap;
import java.util.Map;

public class ArrayUsingMap {
    public static void main(String[] args) {
        String str = "a b c D a b C d e f g";
        String string = str.toLowerCase();
        String[] array = string.split(" ");
        Map<String,Integer> map = new HashMap<>();

        for (String s: array) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}

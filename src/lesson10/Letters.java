package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Letters {
    public static void main(String[] args) {
        String str = "ich wuensche dir ein schonen tag";

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < charCount.size(); i++) {
            Character ch = str.charAt(i);
            if (charCount.containsKey(ch)) {
                Integer count = charCount.get(ch);
                count++;
                charCount.put(ch, count);
            } else {
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);
    }


}

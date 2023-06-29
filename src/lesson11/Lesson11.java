package lesson11;

import javax.print.DocFlavor;
import java.util.TreeMap;

public class Lesson11 {

    public static void main(String[] args) {
        String text = "меня зовут Светлана";


        TreeMap<String, String> translateToRussian = new TreeMap<>();
        translateToRussian.put("меня", "My");
        translateToRussian.put("зовут", "name is");
        translateToRussian.put("Svetlana", "Светлана");

        System.out.println(text + translateToRussian);
    }

    private static StringBuffer translation(TreeMap<String, String> translateToRussia, String text) {
        String[] words = text.split("");
        StringBuffer j = new StringBuffer();

        for (String word : words) {
            if (!translateToRussia.containsKey(word)) {
                j.append(translateToRussia.get(word));
                j.append(words);
            } else {
                j.append(words);

            }
        }
        return j;
    }





    }


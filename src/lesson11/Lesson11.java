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



    }



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordAppearanceCounter {

    public static void main(String[] args) {
        String paragraph = "Once upon a time, there was a kind girl named Cinderella. All of the animals loved her,"
                + " especially two mice named Gus and Jaq. They had do anything for the girl they called Cinderelly. "
                + "Cinderella lived with her stepmother and her two stepsisters, Anastasia and Drizella.";
        System.out.println(paragraph);
        TreeMap<String, Integer> appearanceCounter = new TreeMap<>();
        String[] split = paragraph.toLowerCase().split(" ");
        System.out.println(split);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replace(".", "");
            split[i] = split[i].replace(",", "");
            split[i] = split[i].replace("?", "");
            split[i] = split[i].replace("!", "");
            System.out.println(split[i]);
            String key = split[i];
            if (appearanceCounter.containsKey(key)) {
                appearanceCounter.put(key, appearanceCounter.get(key) + 1);
            } else {
                appearanceCounter.put(key, 1);
            }
        }
        System.out.println(appearanceCounter);
    }

}

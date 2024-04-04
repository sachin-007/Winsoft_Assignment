import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
        String str = "i am checking the string it is reapeating the words or not just that!";


        str = str.trim();


        // we are slipting the string into words with regex
        String[] words = str.split("\\s+");


        // used to store the count of words
        HashMap<String, Integer> countMap = new HashMap<>();


        // we iterate and print the woeds

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            System.out.println(word + ": " + countMap.get(word));
        }
    }
}
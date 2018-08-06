package ship.developer;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<Integer, Integer> getLengthOfWords(String line, boolean withSymbols){
        if(withSymbols)
            line = line.replaceAll("[^a-zA-Z0-9_\\s+]", "");
        String words[] = line.split("\\s+");
        Map<Integer, String> stringMap = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(String word : words){
            if(map.containsKey(word.length())){
                map.put(word.length(), map.get(word.length()) + 1);
                stringMap.put(word.length(), stringMap.get(word.length()) + " " + word);
            } else {
                map.put(word.length(), 1);
                stringMap.put(word.length(), word);
            }
        }
        //stringMap.forEach((k, v) -> System.out.println(k + " " + v));
        return map;
    }
}

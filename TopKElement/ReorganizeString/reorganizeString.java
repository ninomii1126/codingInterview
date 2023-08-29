import java.util.*;
public class Main{
    public static String reorganizeString(String string1) {

        char[] stringArray = string1.toCharArray();
        Map<Character, Integer> charFreq = new HashMap<>();

        // Max heap sorted by char frequency
        PriorityQueue<Map.Entry<Character, Integer>> sortedCharFreq 
        = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(int i=0; i<stringArray.length; i++){
            int freq = charFreq.getOrDefault(stringArray[i], 0);
            charFreq.put(stringArray[i], freq + 1);
        }

        sortedCharFreq.addAll(charFreq.entrySet());

        StringBuilder res = new StringBuilder();

        Map.Entry<Character, Integer> previous = null;

        while(!sortedCharFreq.isEmpty()){
            Map.Entry<Character, Integer> charToFreq = sortedCharFreq.poll();
            char c = charToFreq.getKey();
            int freq = charToFreq.getValue();

            res.append(c);

            if(previous != null){
                sortedCharFreq.add(previous);
                previous = null;
            }

            if(freq > 1){
                previous =  Map.entry(c, freq - 1);
            }
        }

        if(previous != null){
            return "";
        }

    
        return res.toString();
    }
}
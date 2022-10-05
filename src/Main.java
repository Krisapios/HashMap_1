import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String lowText = text.toLowerCase().replaceAll("[ ,.]", "");
        Map<Character, Integer> mapText = new HashMap<>();

                for(int i = 0; i < lowText.length(); i++){
            if(mapText.containsKey(lowText.charAt(i))){
                mapText.put(lowText.charAt(i), mapText.get(lowText.charAt(i))+1);
            } else {
                mapText.put(lowText.charAt(i), 1);
            }
        }
        System.out.println(mapText);

        int maxValue = -1;
        char maxKey = 0;
        for(Map.Entry<Character, Integer> kv : mapText.entrySet()){
            if(kv.getValue() > maxValue){
                maxValue = kv.getValue();
                maxKey = kv.getKey();
            }
        }
        System.out.println(maxKey + "=" + maxValue);

        int minValue = Integer.MAX_VALUE;
        char minKey = 0;
        for(Map.Entry<Character, Integer> kv : mapText.entrySet()){
            if(kv.getValue() < minValue){
                minValue = kv.getValue();
                minKey = kv.getKey();
            }
        }
        System.out.println(minKey + "=" + minValue);
    }
}
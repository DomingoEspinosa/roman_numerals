import java.util.LinkedHashMap;

public class RomanNumerals {
    public static String arabicToRoman(int value) {
        LinkedHashMap<Integer, String> dictionary = new LinkedHashMap();
        dictionary.put(1,"i");
        dictionary.put(4,"iv");
        dictionary.put(5,"v");

        if (dictionary.containsKey(value)){
            return dictionary.get(value);
        }
        String result = "";
        while (value >= 5){
            result += "v";
            value += -5;
        }
        while (value >= 4){
            result += "iv";
            value += -4;
        }
        while (value >= 1){
            result += "i";
            value += -1;
        }
        return result;
    }
}

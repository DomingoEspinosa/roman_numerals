import java.util.LinkedHashMap;

public class RomanNumerals {
    public static String arabicToRoman(int value) {
        LinkedHashMap<Integer, String> dictionary = new LinkedHashMap();
        dictionary.put(1,"i");
        dictionary.put(2,"ii");
        dictionary.put(3,"iii");
        dictionary.put(4,"iv");

        return dictionary.get(value);
    }
}

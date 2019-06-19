public class RomanNumerals {
    public static String arabicToRoman(int value) {
        String[] romanNumbers = {"i", "ii", "iii"};
        return romanNumbers[value - 1];
    }
}

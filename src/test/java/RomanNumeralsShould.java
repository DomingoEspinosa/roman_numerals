import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource({"i, 1",
                "ii, 2",
                "iii, 3",
                "iv, 4",
                "v, 5", "viii, 8"})
    public void convert_arabic_to_roman(String actual,int value) {
        assertThat(actual, is(RomanNumerals.arabicToRoman(value)));
    }
}

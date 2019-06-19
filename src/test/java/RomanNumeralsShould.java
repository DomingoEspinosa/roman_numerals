import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource({"i, 1", "ii, 2"})
    public void convert_arabic_to_roman(String actual,int value) {
        assertThat(actual, is(RomanNumerals.arabicToRoman(value)));
    }
}

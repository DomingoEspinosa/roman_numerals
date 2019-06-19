import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralsShould {
    @Test
    public void convert_arabic_to_roman() {
        assertThat("i", is(RomanNumerals.arabicToRoman(1)));
    }
}

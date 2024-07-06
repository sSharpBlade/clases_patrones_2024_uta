import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanTest {

    @Test
    public void testConvert1ToRoman() {
        assertEquals("I", RomanConverter.convertToRoman(1));
    }

    @Test
    public void testConvert5ToRoman() {
        assertEquals("V", RomanConverter.convertToRoman(5));
    }

    @Test
    public void testConvert10ToRoman() {
        assertEquals("X", RomanConverter.convertToRoman(10));
    }

    @Test
    public void testConvert100ToRoman() {
        assertEquals("C", RomanConverter.convertToRoman(100));
    }

    @Test
    public void testConvert3999ToRoman() {
        assertEquals("XV", RomanConverter.convertToRoman(15));
    }

}

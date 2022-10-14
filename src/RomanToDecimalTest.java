import static org.junit.Assert.*;

/**
 * @author 26prakash
 * @version 10.13.2022
 * junit testing program for RomanToDecimal class
 */

public class RomanToDecimalTest {

    @org.junit.Test
    /**
     * romanToDecimal method of RomanToDecimalTest class
     * uses 18 assertEquals methods, 10 valid, 4 invalid, 4 illogical
     * uses 2 asserNotEquals methods
     */
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("X"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("CLIX"), 159);
        assertEquals(RomanToDecimal.romanToDecimal("LXXIV"), 74);
        assertEquals(RomanToDecimal.romanToDecimal("MCCXLIV"), 1244);
        assertEquals(RomanToDecimal.romanToDecimal("MM"), 2000);
        assertEquals(RomanToDecimal.romanToDecimal("XXIX"), 29);
        assertEquals(RomanToDecimal.romanToDecimal("VII"), 7);
        assertEquals(RomanToDecimal.romanToDecimal("CCCXXI"), 321);
        assertEquals(RomanToDecimal.romanToDecimal("CIV"), 104);
        assertEquals(RomanToDecimal.romanToDecimal("MX"), 1010);
        assertEquals(RomanToDecimal.romanToDecimal("IVIV"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("XXXCI"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("CMMIX"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("IVXX"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("CCCDG"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("GGDSMS"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("daus"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("batmanrocks"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("IX"), 3);
        assertNotEquals(RomanToDecimal.romanToDecimal("CXXX"), 13);




    }
}
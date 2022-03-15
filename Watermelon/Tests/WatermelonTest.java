import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class WatermelonTest {

    @Test
    public void check_Watermelon() {
        Watermelon test = new Watermelon();
        assertEquals("YES", test.check_Watermelon(8));
        assertEquals("NO", test.check_Watermelon(5));
        assertEquals("YES", test.check_Watermelon(4));
        assertEquals("NO", test.check_Watermelon(3));
        assertEquals("NO", test.check_Watermelon(2));
        assertEquals("NO", test.check_Watermelon(1));
        assertEquals("NO", test.check_Watermelon(7));
        assertEquals("YES", test.check_Watermelon(6));
        assertEquals("YES", test.check_Watermelon(10));
        assertEquals("NO", test.check_Watermelon(9));
        assertEquals("NO", test.check_Watermelon(53));
        assertEquals("NO", test.check_Watermelon(77));
        assertEquals("YES", test.check_Watermelon(32));
        assertEquals("YES", test.check_Watermelon(44));
        assertEquals("YES", test.check_Watermelon(98));
        assertEquals("NO", test.check_Watermelon(99));
        assertEquals("YES", test.check_Watermelon(90));
        assertEquals("NO", test.check_Watermelon(67));
        assertEquals("YES", test.check_Watermelon(100));
        assertEquals("YES", test.check_Watermelon(88));
    }
}
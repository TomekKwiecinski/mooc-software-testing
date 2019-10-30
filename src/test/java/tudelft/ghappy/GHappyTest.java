package tudelft.ghappy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void testEmpty() {
        boolean result = new GHappy().gHappy("");
        Assertions.assertTrue(result);
    }
    @Test
    public void testLetterNotG() {
        boolean result = new GHappy().gHappy("x");

        Assertions.assertTrue(result);
    }
    @Test
    public void testTwoLetters() {

        boolean result = new GHappy().gHappy("aa");
        Assertions.assertTrue(result);
    }
    @Test
    public void testTwoGLetters() {
           boolean result1 = new GHappy().gHappy("gg");
           Assertions.assertTrue(result1);

    }

    @Test
    public void testExample2() {
        boolean result2 = new GHappy().gHappy(("xxggxx"));

        Assertions.assertTrue(result2);
    }

    @Test
    public void testExample3() {
        boolean result1 = new GHappy().gHappy("xxgxx");

        Assertions.assertFalse(result1);
        return;
    }
    @Test
    public void testExample() {
        boolean result = new GHappy().gHappy("xxggyygxx");

        Assertions.assertFalse(result);
    }
    @Test
    public void testExample4() {
        boolean result = new GHappy().gHappy("xxggggyygxx");

        Assertions.assertFalse(result);
    }
    @Test
    public void testExample5() {
        boolean result = new GHappy().gHappy("ggxxx");

        Assertions.assertTrue(result);
    }
}




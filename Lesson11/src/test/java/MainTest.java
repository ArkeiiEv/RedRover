import org.testng.Assert;
import school.redrover.Main;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testAddition() {
        double expected = 5.0;
        double actual = Main.addNumbers(2.0, 3.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
        double expected = -1.0;
        double actual = Main.subNumbers(3.0, 4.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication() {
        double expected = 12.0;
        double actual = Main.multNumbers(3.0, 4.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        double expected = 0.75;
        double actual = Main.divNumbers(15.0, 20.0);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testAbbrevitations() {
        String expected = "Привет ...";
        String actual = Main.abbrevitations("Привет всем кто живет на луне!", 10);
        Assert.assertEquals(expected, actual);
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrafficLightTest {

    TrafficLight SUT;

    @Before
    public void setup() {
        SUT = new TrafficLight();
    }

    @Test
    public void getColor_isRedColor_RedReturned() {
        String result = SUT.getColor(1);
        assertThat(result, is("Red"));
    }
    @Test
    public void getColor_isOrangeColor_OrangeReturned() {
        String result = SUT.getColor(2);
        assertThat(result, is("Orange"));
    }
    @Test
    public void getColor_isGreenColor_GreenReturned() {
        String result = SUT.getColor(3);
        assertThat(result, is("Green"));
    }

    @Test
    public void getColor_isInvalidColor_InvalidLightNumberReturned() {
        String result = SUT.getColor(0);
        assertThat(result, is("Invalid Light Number"));
    }

    @Test
    public void isPositiveNumber_isGreaterThanZero_trueReturned() {
        boolean result = SUT.isPositiveNumber(1);
        assertThat(result, is(true));
    }

    @Test
    public void isPositiveNumber_isZero_trueReturned() {
        assertTrue(SUT.isPositiveNumber(0));
    }

    @Test
    public void isPositiveNumber_isGreaterThanZero_falseReturned() {
        assertFalse(SUT.isPositiveNumber(-1));
    }

    @Test
    public void changeColor_makeColorGreen_GreenReturned() {
        int result = SUT.changeColor(1);
        assertThat(result, is(3));
    }

    @Test
    public void changeColor_makeColorOrange_OrangeReturned() {
        int result = SUT.changeColor(3);
        assertThat(result, is(2));
    }

    @Test
    public void changeColor_makeColorRed_RedReturned() {
        int result = SUT.changeColor(2);
        assertThat(result, is(1));
    }
}

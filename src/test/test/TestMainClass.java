import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMainClass {
    private static Main st;

    @BeforeClass
    public static void setup() {
        st = new Main();
    }

    //test by varma
    @Test
    public void test_circle_area() {
        assertEquals(50, st.circle_area(4));
    }


}
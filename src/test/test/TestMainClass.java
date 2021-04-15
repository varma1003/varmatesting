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
        assertEquals(5, st.circle_area(4));
    }

    //New test case but passed case
    @Test
    public void test_circle_area1() {
        assertEquals(28, st.circle_area(3));
    }

    @Test
    public void test_rectangle_area() {
        assertEquals(20, st.rectangle_area(4, 5));
    }



}
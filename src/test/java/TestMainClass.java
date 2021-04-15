import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMainClass {
    private static Main st;


    public static void setup() {
        st = new Main();
    }

    //test by varma
    public void test_circle_area() {
        assertEquals(50, st.circle_area(4));
    }

    //New test case but passed case
    public void test_circle_area1() {
        assertEquals(28, st.circle_area(3));
    }


    public void test_rectangle_area() {
        assertEquals(20, st.rectangle_area(4, 5));
    }


    public void test_triangle_area() {
        assertEquals(10, st.triangle_area(4, 5));
    }
}

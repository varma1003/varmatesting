import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMainClass {
    private static Main st;


    public static void setup() {
        st =new Main();
    }

    //test by varma
    public void test_circle_area() {
        assertEquals(50,st.circle_area(4));
    }


    public void test_rectangle_area() {
        assertEquals(25,st.rectangle_area(4,5));
    }


    public void test_triangle_area() {
        assertEquals(10,st.triangle_area(4,5));
    }
}

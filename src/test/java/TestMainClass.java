import static org.junit.Assert.*;
import org.junit.Test;

public class TestMainClass {
    Area st = new Area();

    @Test
    public void test_rectangle_area() {
        assertEquals(20, st.rectangle_area(4, 5));
    }

    @Test
    public void test_triangle_area() {
        assertEquals(12, st.triangle_area(5, 5));
    }

    @Test
    public void test_area(){
        assertEquals(28, st.circle_area(3));
    }

    //Integration tests
    @Test
    public void integration_test1(){
        assertEquals(1256,st.circle_area(st.rectangle_area(4,5)));
    }

    @Test
    public void integration_test2(){assertEquals(336,st.rectangle_area(st.triangle_area(5,5),st.circle_area(3)));}
}


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class TriangleClassifierTest {
    @Test
    @DisplayName("Test equilateral triangle")
    public void testEquilateralTriangle() {
        final int A = 2;
        final int B = 2;
        final int C = 2;

        String expected = "equilateral triangle";
        String actual = TriangleClassifier.result(A, B, C);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test isosceles triangle")
    public void testIsoscelesTriangle() {
        final int A = 2;
        final int B = 2;
        final int C = 3;

        String expected = "isosceles triangle";
        String actual = TriangleClassifier.result(A, B, C);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test normal triangle")
    public void testNormalTriangle() {
        final int A = 3;
        final int B = 4;
        final int C = 5;

        String expected = "normal triangle";
        String actual = TriangleClassifier.result(A, B, C);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test not a triangle")
    public void testNotATriangle() {
        final int A = 8;
        final int B = 2;
        final int C = 3;

        String expected = "not a triangle";
        String actual = TriangleClassifier.result(A, B, C);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test not triangle")
    public void testNotTriangle() {
        final int A = -1;
        final int B = 2;
        final int C = 1;

        String expected = "not a triangle";
        String actual = TriangleClassifier.result(A, B, C);
        assertEquals(expected, actual);
    }
}
public class TriangleClassifier {
    public static void main(String[] args) {

    }
    public static String result(int a, int b, int c) {
        if (a == b && a == c) return "equilateral triangle";
        else if (a == b && a != c) return "isosceles triangle";
        else if (a != b && a != c && a + b > c && b + c > a && a + c > b) return "normal triangle";
        return "not a triangle";
    }
}

package ImpQuestions;
public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        int length = 10, breadth = 20;
        System.out.println(" Area of rectangle " + length + " & " + breadth + " is " + area(length, breadth));
        System.out.println(" Perimeter of rectangle " + length + " & " + breadth + " is " + perimeter(length, breadth));
    }

    public static int area(int l, int b) {
        return l * b;
    }

    public static int perimeter(int l, int b) {
        return 2 * (l + b);
    }
}

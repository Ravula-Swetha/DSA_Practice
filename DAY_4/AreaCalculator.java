// 2. Implement method overloading for calculating the area of a square and a rectangle. 
public class AreaCalculator {
    public static float Area(int side){
        return side*side;
    }
    public static float Area(int length, int breadth){
        return length*breadth;
    }
     public static void main(String[] args) {
        System.out.println("Area of a square: " + Area(5));
        System.out.println("Area of a rectangle: " + Area(5, 10));
    }
}

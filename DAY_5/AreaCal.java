// 1. Write a method overloading program to calculate: 
// o	The area of a square o 	The area of a rectangle o 	The area of a circle 

public class AreaCal {
    public static float Area(int side){
        return side*side;
    }
    public static float Area(int length, int breadth){
        return length*breadth;
    }
    public static double Area(double radius){
        return 2*3.14*radius;
    }
     public static void main(String[] args) {
        System.out.println("Area of a square: " + Area(5));
        System.out.println("Area of a rectangle: " + Area(5, 10));
        System.out.println("Area of a rectangle: " + Area( 10.5));
    }
}


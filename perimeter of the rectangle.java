import java.util.Scanner;

public class RectClass {
    double length;	
    double width;
    String color;

    double area() {	
        return length*width;
    }
    
    double perimeter() {
        return 2*(length + width);
    }
    
    void showInfo() {
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("color = " + color);
        System.out.println("area = " + area());
        System.out.println("perimeter = " + perimeter());
    }

    RectClass(double l, double w, String c) { 
        System.out.println("A Rect object is created by the constructor with 3 parameters.");
        length = l;
        width = w;
        color= c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        RectClass rect;
        
        rect = new RectClass(input.nextDouble(), input.nextDouble(), input.next());
        rect.showInfo();

    }
}


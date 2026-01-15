package classandobject.level1;

public class Circle {
    private int radius;
    final double PI=3.14;
    Circle(int radius)
    {
        this.radius=radius;
    }

    public void  calculateArea(int radius)
    {
        System.out.println("Area of circle: "+PI*radius*radius);
    }
    public void calculatePerimeter(int radius)
    {
        System.out.print("Perimeter of circle: "+2*PI*radius);
    }
}


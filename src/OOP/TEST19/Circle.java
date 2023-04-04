package OOP.TEST19;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        final  double pi=3.14;
        double area=pi*Math.pow(radius,2);


        return area;
    }

    @Override
    public double perimeter() {
        final  double pi=3.14;
        double perimeter =2*pi*radius;


        return perimeter;
    }
}

package OOP.TEST19;

public class Rectangle extends Shape{
    private double width;
    private double lenght;
    public Rectangle(double width,double lenght){
        this.lenght=lenght;
        this.width=width;

    }

    @Override
    public double area() {
        return width*lenght;
    }

    @Override
    public double perimeter() {
        return 2*(width+lenght);

    }
}

package OOP.TEST18;

public class Rectangle extends Square{
    double height;
    public Rectangle(double len,double height){
        super(len);
        this.height=height;
    }
    public double circumferenceCalc(){
        return 2*(getLenght()+height);

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

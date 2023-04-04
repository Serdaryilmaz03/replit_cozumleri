package OOP.TEST18;

public class Square {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }
    public double circumferenceCalc(){
        return lenght*4;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}

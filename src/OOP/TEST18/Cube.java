package OOP.TEST18;

public class Cube extends Square{

    public Cube(double len) {
        super(len);
    }

    @Override
    public double circumferenceCalc() {
        return super.circumferenceCalc()*3;
    }
    public double volumeCalc(){
        return getLenght()*getLenght()*getLenght();
    }
}

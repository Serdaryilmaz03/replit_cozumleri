package OOP.TEST6;

public class Carpet {
    public double width, lenght, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet() {
        width = 300;
        lenght = 300;
        unitPrice = 0;
        totalPrice = 200;
        isPersian = false;

    }

    public Carpet(double width, double lenght, double unitPrice, boolean isPersian) {
        this.width = width;
        this.lenght = lenght;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice = (width + lenght) * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }

    }


}

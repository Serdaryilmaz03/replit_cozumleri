package OOP.TEST9;

public class GasTank {
    double amount;
    double capacity;


    public GasTank(double capacity) {
        this.capacity = capacity;
        capacity++;
    }

    public void addGas(double gasAdded) {
        if (gasAdded + amount < capacity) {
            amount += gasAdded;
        } else {
            amount = capacity;
        }

    }

    public void useGas(double gasUsed) {
        if (gasUsed>amount) {
            amount =0;
        } else {
            amount -= gasUsed;
        }

    }

    public boolean isEmpty() {


        return amount < 0.1;


    }

    public boolean isFull() {
        return amount > capacity - 0.1;
    }

    public int getGasLevel() {
        return (int)amount;
    }

    public double fillUp() {
      double diffrence = (capacity - amount);
        amount = capacity;
        return diffrence;
    }
}

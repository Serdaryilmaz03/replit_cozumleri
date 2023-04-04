package OOP.TEST20;

public interface TableGenerator {
    public abstract int[] generateTable(int value, int numberOfEntries);
    public abstract boolean checkTable(int value, int[] tableToTest);
}

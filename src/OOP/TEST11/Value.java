package OOP.TEST11;

public class Value {
    int val;
    boolean modified;

    public Value() {
    }

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        if (this.val==val){
            return;
        }
        this.val = val;
        this.modified = true;
    }

    public boolean wasModified() {
        return modified;
    }


}

package OOP.TEST21;

public class TestData {
    public static String [][] getBoard(int num) {
        switch(num) {
            case 1:
                return new String[][]{
                        {"w","w","w","w"},
                        {"w","w","w","m"},
                        {"w","w","m","w"},
                        {"w","w","w","w"}
                };
            case 2:
                return new String[][]{
                        {"w","w","w"},
                        {"w","w","w"},
                        {"w","w","m"}
                };

        }
        return null;
    }

}

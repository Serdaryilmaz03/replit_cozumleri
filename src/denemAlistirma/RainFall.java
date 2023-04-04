package denemAlistirma;

public  class RainFall {
    double[] rainMonths = {1, 2, 0.4, 3, 3, 1.2, 0, 0, 0.3, 1.1, 1, 0.5};

    public static double rainFallYear(double[] rainMonths) {
        double totalRainFall = 0;
        for (int i = 0; i < 12; i++) {
            totalRainFall = totalRainFall + rainMonths[i];

        }
        return totalRainFall;
    }

    public static double averageRainFall(double[] rainMonths) {
        double average = 0.0;
        for (int i = 0; i < 12; i++) {
            average = average + rainMonths[i];

        }
        average /= 12;
        return average;
    }

    public static double maxRain(double[] rainMonths) {
        double max = rainMonths[0];
        for (int i = 0; i < 12; i++) {
            if (max < rainMonths[i]) {
               max= rainMonths[i];
            }


        }
        return max;
    }

    public static double leastRain(double[] rainMonths) {
        double least = rainMonths[0];
        for (int i = 0; i < 12; i++) {
            if (least > rainMonths[i]) {
                 least=rainMonths[i];
            }


        }

        return least;

    }

    public static void main(String[] args) {
        double[] rainMonths = {1, 2, 0.4, 3, 3, 1.2, 0, 0, 0.3, 1.1, 1, 0.5};
        System.out.println(leastRain(rainMonths));
        System.out.println(maxRain(rainMonths));
        System.out.println(averageRainFall(rainMonths));
        System.out.println(rainFallYear(rainMonths));


    }


}
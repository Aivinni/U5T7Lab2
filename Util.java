public class Util {
    private Util() {}

    // A
    public static double convertToSuperiorScale(double temp, String scale) {
        if (scale.equalsIgnoreCase("F")) {
            return round(temp);
        } else if (scale.equalsIgnoreCase("C")) {
            return round(convertCtoF(temp));
        } else if (scale.equalsIgnoreCase("K")) {
            return round(convertKtoF(temp));
        } else {
            return round(temp);
        }
    }
    private static double round(double toRound) {
        return (double) ((int)(toRound * 100)) / 100;
    }
    public static double convertCtoF(double temp) {
        return 32 + (temp * ((double)9 / 5));
    }
    public static double convertKtoF(double temp) {
        return 32 + ((temp + 273) * ((double)9 / 5));
    }
    public static double convertFtoC(double temp) {
        return (temp - 32) * ((double) 5 / 9);
    }
    public static double convertKtoC(double temp) {
        return temp - 273;
    }
    public static double convertCtoK(double temp) {
        return temp + 273;
    }
    public static double convertFtoK(double temp) {
        return ((temp - 32) * ((double) 5 / 9)) + 273;
    }
}

public class Main {
    public static void main(String[] args) {
        double F = Util.convertToSuperiorScale(1, "C");
        System.out.println(F);
        double testA = Util.convertCtoF(85);
        System.out.println(testA);
        double testB = Util.convertKtoF(301);
        System.out.println(testB);
        double testC = Util.convertFtoC(76);
        System.out.println(testC);
        double testD = Util.convertKtoC(285);
        System.out.println(testD);
        double testE = Util.convertCtoK(53);
        System.out.println(testE);
        double testF = Util.convertFtoK(75);
        System.out.println(testF);
        NotUtil test1 = new NotUtil("sunny", 94, "C", "3/2/2023");
        System.out.println(test1.getWeather());
        System.out.println(test1.getTemperature());
        System.out.println(test1.getDate());
        System.out.println(test1.getInfo());
        NotUtil.greeting("Aivin");
    }
}

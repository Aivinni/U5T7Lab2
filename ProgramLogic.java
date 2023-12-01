import java.util.Scanner;

public class ProgramLogic {
    private static Scanner scan = new Scanner(System.in);

    public static void start() {
        System.out.println("What is your name?");
        String name = scan.nextLine();
        NotUtil.greeting(name);
        System.out.println("How's the weather like today?");
        String weather = scan.nextLine();
        System.out.println("What is the temperature today?");
        double temperature = scan.nextInt();
        scan.nextLine();
        System.out.println("What scale is the temperature in?");
        String scale = scan.nextLine();
        System.out.println("What day is it?");
        String date = scan.nextLine();
        NotUtil object1 = new NotUtil(weather, temperature, scale, date);
        System.out.println(object1.getInfo());
    }
}

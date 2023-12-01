public class NotUtil {
    private String weather;
    private double temperature;
    private String scale;
    private String date;
    //E
    public NotUtil(String w, double temp, String s, String d) {
        weather = w;
        temperature = Util.convertToSuperiorScale(temp, s);
        scale = s;
        date = d;
    }

    public String getWeather() {
        return weather;
    }
    public double getTemperature() {
        return temperature;
    }
    public String getDate() {
        return date;
    }
    //B & C
    public String getInfo() {
        return "Date: " + date +
        "\nTemperature: " + temperature + 
        "\nWeather: " + weather + 
        "\nScale: " + scale + 
        "\nGood Weather: " + isGoodWeather();
    }
    private boolean isGoodWeather() {
        if (40 < temperature && temperature < 80) {
            if (weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("partly cloudy")) {
                return true;
            }
        }
        return false;
    }

    public static void greeting(String name) {
        System.out.println("Hello there, " + name);
    }
}
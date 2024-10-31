public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(args[0]);
        System.out.println("température passé en argument en degrés Celsius : " + celsius);
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
    }
    
}

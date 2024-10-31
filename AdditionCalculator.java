public class AdditionCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Veuillez fournir deux nombres en arguments.");
            return;
        }
        try {
            double number1 = Double.parseDouble(args[0]);
            double number2 = Double.parseDouble(args[1]);
            double result = number1 + number2;
            System.out.println("La somme des deux nombres est : " + result);
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer des valeurs numériques valides.");
        }
    }
}

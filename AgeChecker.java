public class AgeChecker {
    private static final int AGE_MAJORITY = 18;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un âge en argument.");
            return;
        }
        try {
            int age = Integer.parseInt(args[0]);
            System.out.println("âge passé en argument : " + age);
            if (age >= AGE_MAJORITY) {
                System.out.println("Vous êtes majeur.");
            } else {
                System.out.println("Vous êtes mineur.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer un âge valide.");
        }
    }
}


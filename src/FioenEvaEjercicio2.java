import java.util.Scanner;

public class FioenEvaEjercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String patron = "€€";
        int tamanoPatron = 0;

        while (patron.length() != 1) {
            System.out.println("Enter  1 character to make the pattern");
            patron = input.nextLine();
            if (patron.length() == 1) {
                System.out.println("You have chosen the character " + patron);
            } else {
                System.out.println("That is incorrect. Try again.");
            }
        }
        while (tamanoPatron < 1 || tamanoPatron > 15) {
            System.out.println("Enter the size you want the pattern to be, between 1-15:");
            if (input.hasNextInt()) {
                tamanoPatron = input.nextInt();
                if (tamanoPatron >= 1 && tamanoPatron <= 15) {
                    System.out.println("You have chosen the size " + tamanoPatron);
                } else {
                    System.out.println("That number is too big or too small. Try again.");
                }
            }
        }
    }
}

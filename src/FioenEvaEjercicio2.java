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
        String duplicarPatron = patron.repeat(tamanoPatron);
        String[][] patronParaAjedrez = new String[tamanoPatron][tamanoPatron];

        for (int i = 0; i < patronParaAjedrez.length; i++) {
            for (int j = 0; j < patronParaAjedrez[i].length; j++) {
                System.out.println(duplicarPatron);
            }
            System.out.println();
        }
    }
}

/*
        char [][] ajedrez = new char[8][8];

        for (int i = 0; i < ajedrez.length; i++) {
            for (int j = 0; j < ajedrez[i].length; j++) {
                System.out.print(patronParaAjedrez + " ");
            }
            System.out.println();

 */
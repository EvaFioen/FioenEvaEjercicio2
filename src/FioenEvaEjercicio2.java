import java.util.Scanner;

public class FioenEvaEjercicio2 {

    public static void main(String[] args) {

        // VARIABLES
        Scanner input = new Scanner(System.in);
        String patron = "€€";
        int tamanoPatron = 0;

        // Solicitar el caracter donde el usuario solo puedo poner 1 numero, letra o simbolo
        System.out.println("Welcome! We will personalize your chess board however you like.  ");
        while (patron.length() != 1) {
            System.out.println("Enter  1 letter, symbol or letter to make the pattern.");
            patron = input.nextLine();
            if (patron.length() == 1) {
                System.out.println("You have chosen the character " + patron);
            } else {
                System.out.println("That is incorrect. Try again.");
            }
        }
        // Solicitar el tamaño donde pueden elegir entre 1 y 15
        while (tamanoPatron < 1 || tamanoPatron > 15) {
            System.out.println("Enter the size you want the pattern to be, between 1-15:");
            if (input.hasNextInt()) {
                tamanoPatron = input.nextInt();
                if (tamanoPatron >= 1 && tamanoPatron <= 15) {
                    System.out.println("You have chosen the size " + tamanoPatron);
                } else {
                    System.out.println("That number is too big or too small. Try again.");
                }
            } else { // si el usuario no da un numero, se vuelve a preguntar.
                System.out.println("That is incorrect. Try again.");
                input.next();
            }
        }
        // Construir el ajedrez con la información dado por el usuario
        System.out.println("Here is your personalized chess board:");
        for (int i = 0; i < 8 * tamanoPatron; i++) {
            if (i % tamanoPatron == 0) {
                for (int j = 0; j < (8 * tamanoPatron) + 9; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int j = 0; j < 8 * tamanoPatron; j++) {
                if (j % tamanoPatron == 0) {
                    System.out.print("|");
                }
                if ((i / tamanoPatron + j / tamanoPatron) % 2 == 0) {
                    System.out.print(patron);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        for (int j = 0; j < (8 * tamanoPatron) + 9; j++) { // La linea '-' para el abajo del ajedrez
            System.out.print("-");
        }
        System.out.println();
    System.out.println("Come again soon!"); // se acaba el programa
    }
}
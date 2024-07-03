import java.util.Scanner;

public class index {

    // random number generater method
    public static int randomNumber() {
        double random = Math.random();
        int range = 100;
        int random_no = (int) (range * random);
        return random_no;
    }

    public static void numberGame() {

        int attempts = 11;
        int score = 0;
        int random_no = randomNumber();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < attempts; i++) {
            System.out.println("\n---------- NUMBER GAME ---------\n");
            System.out.print("Guess the Number : ");
            int userNo = sc.nextInt();

            if (random_no == userNo) {
                System.out.println("\nCorrect, You Win!\n");
                score++;

                random_no = randomNumber();
            } else if (random_no < userNo) {
                System.out.println("\nWrong, too High!\n");
            } else {
                System.out.println("\nWrong, too Low!\n");
            }
        }

        int choice;
        do {
            System.out.println("---------- ---------- ----------\n");
            System.out.println("Attempts : "+ attempts);
            System.out.println("Score : "+ score + "\n");
            System.out.print("Press 1 for Play Again.\n");
            System.out.print("Press 0 for Exit Game.");
            System.out.println("\n\n---------- ---------- ----------\n");

            choice = sc.nextInt();

            if (choice == 1) {
                numberGame();
            }
        } while (choice != 0);

    }

    public static void main(String[] args) {
        numberGame();
    }
}
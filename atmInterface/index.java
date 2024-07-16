import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class index {

    public static void main(String[] args) {
        Home home = new Home();
        home.homePage();
    }
}

class Home {
    Scanner sc = new Scanner(System.in);

    void homePage() {
        System.out.println("\n---------------------------------\n");
        System.out.println("       State Bank of India          \n");
        System.out.print("\nPress 1 to enter your card : ");
        int card = sc.nextInt();

        System.out.println("\nGathering Information please wait...");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (card == 1) {
                    UI();
                }
            }
        };
        timer.schedule(task, 3000);

        // System.out.println("\n---------------------------------\n");
    }

    void UI() {
        System.out.println("\n---------------------------------\n");
        System.out.println("       State Bank of India          \n");
        System.out.println("1. Withdraw\n2. Deposite\n3. Check Balance\n");
        System.out.println("\n---------------------------------\n");

        ATM a = new ATM();

        System.out.print("Enter Choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                a.withdraw();
                break;

            case 2:
                a.deposit();
                break;

            case 3:
                a.checkBalance();
                break;

            default:
                System.out.println("Choose correct option.");
                break;
        }
    }

}

class userAcc {
    String userName;
    String bankName;
    String address;
    int ifsc;
    int accNumber;
    int cif;
    static int balance = 5000;
    int atmpin = 1234;

    void userData() {

    }

}

class ATM extends userAcc {

    public static void withdraw() {
        Home home = new Home();
        ATM a = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin : ");
        int pin = sc.nextInt();

        if (pin == a.atmpin) {
            System.out.print("Enter amount : ");
            int withdrawAmount = sc.nextInt();

            System.out.println("\nYour transaction is being processed, Please wait...");
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    // System.out.println("\nTransaction Sussessful.");
                    if (withdrawAmount <= a.balance) {
                        a.balance -= withdrawAmount;
                        System.out.println("Transaction Sussessful, Take your money.");

                        System.out.print("\nPress 1 to know your balance\nOR press any number to continue : ");
                        int checkBal = sc.nextInt();
                        if (checkBal == 1) {
                            System.out.println("\nAvailable balance : " + a.balance);

                            Timer timer = new Timer();
                            TimerTask task = new TimerTask() {
                                @Override
                                public void run() {
                                    System.out.println("\nTake Your Card.\n");

                                    Timer timer = new Timer();
                                    TimerTask task = new TimerTask() {
                                        @Override
                                        public void run() {
                                            home.homePage();
                                        }
                                    };
                                    timer.schedule(task, 2000);
                                }
                            };
                            timer.schedule(task, 3000);
                        } else {
                            Timer timer = new Timer();
                            TimerTask task = new TimerTask() {
                                @Override
                                public void run() {
                                    System.out.println("\nTake Your Card.");

                                    Timer timer = new Timer();
                                    TimerTask task = new TimerTask() {
                                        @Override
                                        public void run() {
                                            home.homePage();
                                        }
                                    };
                                    timer.schedule(task, 2000);
                                }
                            };
                            timer.schedule(task, 1500);
                        }

                    } else if (withdrawAmount > a.balance) {
                        System.out.println("Insufficient Balance");
                    }
                }
            };
            timer.schedule(task, 3000);

        } else {
            System.out.println("Incorrect Pin");

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    home.homePage();
                }
            };
            timer.schedule(task, 2000);
        }

    }

    public static void deposit() {
        Home home = new Home();
        ATM a = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin : ");
        int pin = sc.nextInt();

        if (pin == a.atmpin) {
            System.out.println("Please, Enter Only Notes of 500, 200 & 100\n");
            int totalAmount = 0;
            int choice;
            do {
                System.out.println("Choose Notes :");
                System.out.println("\n1. 500\n2. 200\n3. 100\n4. Next\n");

                System.out.print("\nEnter Choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Quantity : ");
                        int five_h_note = sc.nextInt();
                        totalAmount += 500 * five_h_note;
                        break;

                    case 2:
                        System.out.print("Enter Quantity : ");
                        int two_h_note = sc.nextInt();
                        totalAmount += 200 * two_h_note;
                        break;

                    case 3:
                        System.out.print("Enter Quantity : ");
                        int one_h_note = sc.nextInt();
                        totalAmount += 100 * one_h_note;
                        break;

                    default:
                        if (choice != 4) {

                            System.out.println("\nPlease select correct option.");
                        }
                        break;
                }
            } while (choice != 4);

            a.balance += totalAmount;

            System.out.println("\nYour transaction is being processed, Please wait...");
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\nTransaction Sussessful.");
                    System.out.println("\nBalance : " + a.balance);

                    Timer timer = new Timer();
                    TimerTask task = new TimerTask() {
                        @Override
                        public void run() {
                            home.homePage();
                        }
                    };
                    timer.schedule(task, 2000);
                }
            };
            timer.schedule(task, 3000);

            // System.out.println(a.balance);
        } else {
            System.out.println("Incorrect Pin");

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    home.homePage();
                }
            };
            timer.schedule(task, 2000);
        }
    }

    public static void checkBalance() {
        Home home = new Home();
        ATM a = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin : ");
        int pin = sc.nextInt();

        if (pin == a.atmpin) {
            System.out.println("\nYour transaction is being processed, Please wait...");
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\nYour balance : " + a.balance);

                    Timer timer = new Timer();
                    TimerTask task = new TimerTask() {
                        @Override
                        public void run() {
                            home.homePage();
                        }
                    };
                    timer.schedule(task, 2000);
                }
            };
            timer.schedule(task, 3000);

        } else {
            System.out.println("Incorrect Pin");

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    home.homePage();
                }
            };
            timer.schedule(task, 2000);
        }
    }
}

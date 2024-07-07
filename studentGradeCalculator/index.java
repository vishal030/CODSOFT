import java.util.Scanner;

public class index {
    public static void student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------- Student Grade Calculator ----------\n");
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("---------- Enter Student Marks ----------\n");
        System.out.print("Subject 1 Marks : ");
        int sub_1_marks = sc.nextInt();
        System.out.print("Subject 2 Marks : ");
        int sub_2_marks = sc.nextInt();
        System.out.print("Subject 3 Marks : ");
        int sub_3_marks = sc.nextInt();
        System.out.print("Subject 4 Marks : ");
        int sub_4_marks = sc.nextInt();
        System.out.print("Subject 5 Marks : ");
        int sub_5_marks = sc.nextInt();

        float total_marks = sub_1_marks + sub_2_marks + sub_3_marks + sub_4_marks + sub_5_marks;

        float avg_per = total_marks / 5;
        String grade;

        if (avg_per >= 91) {
            grade = "O";
        } else if (avg_per >= 81 && avg_per < 91) {
            grade = "A+";
        } else if (avg_per >= 71 && avg_per < 81) {
            grade = "A";
        } else if (avg_per >= 61 && avg_per < 71) {
            grade = "B+";
        } else if (avg_per >= 55 && avg_per < 61) {
            grade = "B";
        } else if (avg_per >= 50 && avg_per < 55) {
            grade = "C+";
        } else if (avg_per >= 40 && avg_per < 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("\n********************\n");
        System.out.println("Result : \n");
        System.out.println("Name           : " + name);
        System.out.println("Total Marks    : " + total_marks);
        System.out.println("Percentage     : " + avg_per + "%");
        System.out.println("Grade          : " + grade);
        System.out.println("\n********************\n");
    }

    public static void main(String[] args) {
        student();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int total = 0;
        int letterCount = 0;
        double average = 0;

        String name = "";

        while (true) {
            String details = scanner.nextLine();
            if (details.equals("")) {
                break;
            }
            String[] splitDetails = details.split(",");

            for (int i = 0; i < splitDetails.length; i = i + 2) {

                letterCount = splitDetails[i].length();
                if (letterCount > total) {
                    total = letterCount;
                    name = splitDetails[i];
                }

                sum = Integer.valueOf(splitDetails[i + 1]) + sum;
                count++;
            }

            average = (double) sum / (double) count;

        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);

    }
}

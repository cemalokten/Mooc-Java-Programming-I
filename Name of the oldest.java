import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        String name = "";
        while (true) {

            String nameInput = scanner.nextLine();

            if (nameInput.equals("")) {
                break;
            }

            String[] splitInput = nameInput.split(",");

            for (int i = 1; i < splitInput.length; i = i + 2) {
                int age = Integer.valueOf(splitInput[i]);

                if (age > total) {
                    total = age;
                    name = splitInput[i - 1];
                }
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        names.add("alex");
        names.add("emma");

        ArrayList<String> password = new ArrayList<>();
        password.add("sunshine");
        password.add("haskell");

        System.out.println("Enter username:");
        String search = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();

        for (int i = 0; i < names.size(); i++) {

            if (search.equals(names.get(i)) && pass.equals(password.get(i))) {
                System.out.println("You have successfully logged in!");
                break;
            } else if (i == (names.size() - 1)) {
                System.out.println("Incorrect username or password!");
                break;
            }

        }

    }

}

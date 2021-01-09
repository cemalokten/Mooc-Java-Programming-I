
import java.util.Scanner;

public class UserInterface {

    private TodoList listObject;
    private Scanner scanner;

    public UserInterface(TodoList listObject, Scanner scanner) {
        this.listObject = listObject;
        this.scanner = scanner;
    }

    public void add() {
        System.out.print("To add:");
        String toAdd = this.scanner.nextLine();
        this.listObject.add(toAdd);
    }

    public void list() {
        listObject.print();
    }

    public void remove() {
        System.out.print("Which one is removed?");
        int toRemove = Integer.valueOf(this.scanner.next());
        listObject.remove(toRemove);
    }

    public void conditions(String command) {
        if (command.equals("add")) {
            this.add();
        }

        else if (command.equals("remove")) {
            this.remove();
        }

        else if (command.equals("list")) {
            this.list();
        }
    }

    public void start() {

        while (true) {

            System.out.print("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            this.conditions(command);
        }

    }
}

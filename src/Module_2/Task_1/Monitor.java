package Module_2.Task_1;


import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Monitor {

    private Catalog catalog;
    private Scanner scan = new Scanner(System.in);

    public Monitor(Catalog catalog) {
        this.catalog = catalog;
    }

    public void start() {
        String info = "++++++++++\nMenu:\nAdd train - 1\nFilter train - 2\nShow trains - 3\nExit - 0\n+++++++++";
        boolean isExit = false;

        while (!isExit) {
            try {
                System.out.println(info);
                int answer = Integer.parseInt(scan.nextLine());
                switch (answer) {
                    case (1):
                        addTrain();
                        break;
                    case (2):
                        filterTrains();
                        break;
                    case (3):
                        showCatalog();
                        break;
                    case (0):
                        isExit = true;
                        break;
                    default:
                        System.out.println("Unknown comamnd!");
                        break;
                }
            } catch (NumberFormatException ex) {
                System.err.println("Incorrect answer!");
            } catch (DateTimeParseException ex) {
                System.err.println("Incorrect date or Departure!");
            }
        }
    }

    private void addTrain() {
        System.out.print("id = ");
        int id = Integer.parseInt(scan.nextLine());
        System.out.print("From - ");
        String from = scan.nextLine();
        System.out.print("To - ");
        String to = scan.nextLine();
        System.out.print("Date (dd.MM.yyyy) - ");
        String date = scan.nextLine();
        System.out.print("Departure (HH:mm) - ");
        String departure = scan.nextLine();

        Train train = new Train(id, from, to, date, departure);
        catalog.add(train);
    }

    private void filterTrains() {
        System.out.print("Date (dd.MM.yyyy) - ");
        String date2 = scan.nextLine();
        System.out.print("From time (HH:mm) - ");
        String fromTime = scan.nextLine();
        System.out.print("To time (HH:mm) - ");
        String toTime = scan.nextLine();
        catalog = catalog.filter(date2, fromTime, toTime);
        showCatalog();
    }

    private void showCatalog() {
        System.out.println("-----------");
        System.out.print(catalog);
        System.out.println("-----------");
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }
}

























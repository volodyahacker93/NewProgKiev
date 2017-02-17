package Module_2.Task_1;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\java\\GitHubProjects\\JavaProgKievPro\\src\\Module_2\\Trains.xml";
        Catalog catalog = Parser.<Catalog>read(path);

        Monitor monitor = new Monitor(catalog);
        monitor.start();
        catalog = monitor.getCatalog();

        Parser.<Catalog>write(path, catalog);
    }
}

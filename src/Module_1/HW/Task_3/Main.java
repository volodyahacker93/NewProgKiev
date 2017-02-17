package Module_1.HW.Task_3;

public class Main {

    public static void main(String[] args) {

        try {
            String path = "c:/dir1/file.txt";
            MyClass mc = new MyClass("Hello World!", 1, 3.1415, 2L, true);

            System.out.println("Before serialization: " + mc);
            Serialize.serialize(path, mc);

            mc = (MyClass) Serialize.deserialize(path, MyClass.class);
            System.out.println("After deserialization: " + mc);
        } catch (IllegalArgumentException | IllegalAccessException | InstantiationException ex) {
            System.err.println("ERROR - " + ex.getMessage());
        }
    }
}

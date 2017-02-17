package Module_1.HW.Task_2;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "c:\\dir1\\file93.txt")
public class TextContainer {

    private static final String TEXT = "This is SPARTAaa!";

    @Saver
    public static void save(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(TEXT);
            System.out.println("Saving: DONE");
        } catch (IOException ex) {
            System.out.println("Saving: ERROR - " + ex.getMessage());
        }
    }
}

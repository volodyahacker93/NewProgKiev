package Module_2.Task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static String readFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader reader = new BufferedReader(fr)) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        try {
            String path = "D:\\java\\GitHubProjects\\JavaProgKievPro\\src\\Module_2\\HW\\Task_2\\json.txt";
            String result = readFile(path);

            Gson gson = new GsonBuilder().create();
            JSON json = (JSON) gson.fromJson(result, JSON.class);

            System.out.println(json.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// Сложно объяснить.
public class Reader {
    public static List<List<String>> readCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("null\\TaskManager.csv"));
        String row;
        List<List<String>> readedData = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            List<String> taskData = new ArrayList<>();
            if (data[0] != "priority") {
                for (int i = 0; i < data.length; i++) {
                    taskData.add(data[i]);
                }
                readedData.add(taskData);
            }
        }
        csvReader.close();
        return readedData;
    }
}

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создание задач.
        TaskManager app = new TaskManager();
        Task newTask = app.createTask(2, "Dev dep-t", "22 oct");
        Task newNewTask = app.createTask(1, "Dev dep-t", "22 oct");
        // Составление списков задач.
        List<Object> task1 = new ArrayList<>();
        task1.add(newTask.getPriority());
        task1.add(newTask.getDeadline());
        task1.add(newTask.getInitiator());
        task1.add(newTask.getExecutor());
        task1.add(newTask.getContent());
        List<Object> task2 = new ArrayList<>();
        task2.add(newNewTask.getPriority());
        task2.add(newNewTask.getDeadline());
        task2.add(newNewTask.getInitiator());
        task2.add(newNewTask.getExecutor());
        task2.add(newNewTask.getContent());
        List<List<Object>> taskData = new ArrayList<>();
        taskData.add(task1);
        taskData.add(task2);
        List<Object> headData = new ArrayList<>();
        headData.add("priority");
        headData.add("deadline");
        headData.add("init-or");
        headData.add("exec-or");
        headData.add("task");
        // Запись задач в файл.
        Writer.createCsvFile(headData, taskData, null, "TaskManager");
        // Чтение задач из файла.
        List<List<String>> data = Reader.readCSV();
        System.out.print(data);
        System.out.println();
        // Сортировка задач.
        Sorter.prioritySort(data);  
    }
}

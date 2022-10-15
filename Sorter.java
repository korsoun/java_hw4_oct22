import java.util.List;
public class Sorter {
    // Метод для сортировки задач от более приоритетных к менее.
    public static void prioritySort (List<List<String>> data) {
        // Т.к. возможных приоритетов 1, 2 или 3, то вложенные циклы с поиском нужного на данном этапе приоритета.
        for (int i = 1; i < 4; i++) {
            // j = 0 выведет шапку и все сломает.
            for (int j = 1; j < data.size(); j++) {
                if (Character.digit(data.get(j).get(0).charAt(1), 10) == i) {
                    System.out.println(data.get(j));
                }
            }
        }
    }
}

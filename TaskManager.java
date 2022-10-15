import java.util.Scanner;

 class TaskManager {  
    // Таск-менеджер создает задачу, используя принятые значения приоритета, исполнителя и дедлайна.
    // Инициатор устанавливается единожды для всех задач при запуске программы.
    // Содержание задачи добавляется отдельным методом.
    public Task createTask(int prior, String name, String date) {
        
        Task newTask = new Task(prior, name, date);
        String cnt = TaskManager.setTask();
        newTask.setContent(cnt);
        return newTask;
    }

    public static String setTask() {
        String cont = "";
        System.out.print("Введите содержание задачи... ");
        Scanner myscan = new Scanner(System.in);
        cont = myscan.nextLine();
        return cont;
    }
}

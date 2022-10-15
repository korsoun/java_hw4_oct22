import java.util.Scanner;

public class Logger {

    private String name;  //Имя пользователя. Будет присваиваться задачам в качестве инициатора.
    public Logger (String name) {
        this.name = name;
    }

    public Logger() {
        this.name = " ";
    }

    public static String setUser () {
        System.out.print("Для начала работы введите имя пользователя... ");
        String name;
        Scanner globalScanner = new Scanner(System.in);    
        name = globalScanner.nextLine();
        
        return name;
    }

    public String getName() {
        return name;
    }

}

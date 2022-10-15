public class Task {
    // Статический инициатор будет создан один раз при запуске программы для всех созданных в сеансе задач. 
    private static String initiator = Logger.setUser();
    private String executor;
    private int priority;
    private String deadline;
    private String content;

    public Task (int prior, String executor, String dLine) {
        this.executor = executor;
        this.priority = prior;
        this.deadline = dLine;
        this.content = " ";
    }
    // Геттеры сеттеры больше для количества и приличия. Не придумал применения.
    public String getInitiator() {
        return this.initiator;
    }

    public void setInitiator(String name) {
        this.initiator = name;
    }

    public String getExecutor() {
        return this.executor;
    }

    public void setExecutor(String name) {
        this.executor = name;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDaedline(String dLine) {
        this.deadline = dLine;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int prior) {
        this.priority = prior;
    }

    public String toString() {
        String res = (this.getPriority()) + ", " + this.getDeadline() + ", " + this.getInitiator() + ", " + this.getExecutor() + ", " + this.getContent();
        return res;
    }
}
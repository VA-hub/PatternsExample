package CreationalDesignPatterns.Singleton;

public class ProgramLogger {
    public static void main(String[] args) {
        President president = President.getInstance();
        President president1 = President.getInstance();


        System.out.println(president.toString());
    }
}



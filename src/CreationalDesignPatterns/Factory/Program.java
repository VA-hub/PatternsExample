package CreationalDesignPatterns.Factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("PHP");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        switch (specialty) {
            case "Java":
                return new JavaDeveloperFactory();
            case "C++":
                return new CppDeveloperFactory();

            case "PHP":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException("HOLY SHIT!!!");
        }
    }
}

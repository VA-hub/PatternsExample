package CreationalDesignPatterns.Singleton;

public final class President {
    private static final String name = "test";

    private President() {
    }

    private static final President INSTANCE = new President();

    public static President getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "President{" + name + "}";
    }
}

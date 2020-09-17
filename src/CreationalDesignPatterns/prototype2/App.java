package CreationalDesignPatterns.prototype2;

public class App {
    public static void main(String[] args) {
        Mage mage = new OrcMage("Staff");
        Mage mage2 = mage.copy();
        System.out.println(mage.equals(mage2));
    }
}

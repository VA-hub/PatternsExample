package StructuralDesignPatterns.Adapter;

public class BattlecruiserAdapter implements RowingBoat{
    private final Battlecruiser boat;

    public BattlecruiserAdapter() {
        boat = new Battlecruiser();
    }

    public final void row() {
        boat.sail();
    }
}

package StructuralDesignPatterns.Adapter;

public class PirateBoatAdapter implements RowingBoat {
    private final PirateBoat boat;

    public PirateBoatAdapter() {
        boat = new PirateBoat();
    }


    @Override
    public void row() {
        boat.sail();
    }
}

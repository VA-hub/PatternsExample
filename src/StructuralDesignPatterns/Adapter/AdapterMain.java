package StructuralDesignPatterns.Adapter;

public class AdapterMain {
    public static void main(String[] args) {

        Captain captain1 = new Captain(new FishingBoatAdapter());
        captain1.row();

        Captain captain2 = new Captain((new BattlecruiserAdapter()));
        captain2.row();

        Captain captain3 = new Captain(new PirateBoatAdapter());
        captain3.row();
    }
}

package CreationalDesignPatterns.Builder;

public class BuildHouse{
    public static void main(String[] args) {
        House house1 = new House.Builder("W")
                .setWood("W")
                .setConcrete("C")
                .setRoof("R")
                .setWindow("W")
                .build();
        House house2 = new House.Builder("C")
                .setConcrete("C")
                .setRoof("W")
                .setWindow("W")
                .build();
        House house3 = new House.Builder("C")
                .setConcrete("C")
                .setRoof("R")
                .build();

        boolean sr = house1.equals(house2);
        System.out.println(sr);
        System.out.println(house1.getConcrete());
    }
}

class House {
    private String material;
    private String wood;
    private String concrete;
    private String roof;
    private String window;

    public String getMaterial() {
        return material;
    }

    public String getWood() {
        return wood;
    }

    public String getConcrete() {
        return concrete;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindow() {
        return window;
    }

    private House(Builder builder) {
        this.material = builder.material;
        this.wood = builder.wood;
        this.concrete = builder.concrete;
        this.roof = builder.roof;
        this.window = builder.window;
    }

    public static class Builder {
        private String material;
        private String wood;
        private String concrete;
        private String roof;
        private String window;

        public Builder(String material) {
            this.material = material;
        }

        public Builder setWood(String wood) {
            this.wood = wood;
            return this;
        }

        public Builder setConcrete(String concrete) {
            this.concrete = concrete;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setWindow(String window) {
            this.window = window;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}

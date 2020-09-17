package CreationalDesignPatterns.Builder2;

public class Food{
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder(5)
                .addCheese(true)
                .addLettuce(true)
                .addPepperoni(true)
                .addPepperoni(true)
                .addTomato(true)
                .build();

        burger.burgerInfo();
    }
}

class Burger {
    private int size;
    protected boolean cheese;
    protected boolean pepperoni;
    protected boolean lettuce;
    protected boolean tomato;
    private int num;

    private Burger(BurgerBuilder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.num = builder.num;
    }

    public void burgerInfo(){
        System.out.println("size = " + this.size);
        System.out.println("cheese = " + this.cheese);
        System.out.println("pepperoni = " + this.pepperoni);
        System.out.println("lettuce = " + this.lettuce);
        System.out.println("tomato = " + this.tomato);
        System.out.println("num = " + this.num);
    }

    static class BurgerBuilder{
        private int size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean lettuce;
        private boolean tomato;
        private int num = 0;

        public BurgerBuilder(int size) {
            this.size = size;
        }

        public BurgerBuilder addCheese(boolean cheese){
            this.cheese = cheese;
            num++;
            return this;
        }

        public BurgerBuilder addPepperoni(boolean pepperoni){
            this.pepperoni = pepperoni;
            num++;
            return this;
        }

        public BurgerBuilder addLettuce(boolean lettuce){
            this.lettuce = lettuce;
            num++;
            return this;
        }

        public BurgerBuilder addTomato(boolean tomato){
            this.tomato = tomato;
            num++;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}

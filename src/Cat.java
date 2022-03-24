public class Cat extends Animal { //  = konkret klasse

    public Cat(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Miav";
    }

    public void eat(String food) {
        if(food.equalsIgnoreCase("raw meat") || food.equalsIgnoreCase("fish")){
            System.out.println("Eating delicious " + food);
        } else {
            System.out.println("No thanks, " + food + " is not edible!");
        }
    }

    public void hiss() {
        System.out.println("Hissing at something or someone!");
        System.out.println("-also arching my back, just to look big and scary!");
    }

    @Override
    public String toString() {
        return name + " is a cat";
    }

}

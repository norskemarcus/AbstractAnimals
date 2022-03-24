public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

// Hvis man ikke overrider en abstract  metode fra Animal:
// Class 'Dog' must either be declared abstract or implement abstract method 'makeNoise()' in 'Animal'
    public String makeNoise() {
        return "Vuf";
    }


    public void eat(String food) {
        System.out.println("Eating " + food + " - slophf, slophf, slophf");
    }



    public void wagTail() {
        System.out.println("Wagging my tail");
    }

    @Override
    public String toString() {
        return name + " is a dog";
    }
}

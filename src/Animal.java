public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String makeNoise() {
        return "-default noise-";
    }

    public void eat(String food) {
        // no default code defined
    }

    public void sleep(int hours) {
        String s = "s";
        if(hours == 1) {
            s = "";
        }
        System.out.printf("Sleeping for %d hour%s...\n", hours,s);
    }

}

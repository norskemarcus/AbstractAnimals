// For at lave en abstract metode skal man have en abstrakt klasse!


public abstract class Animal { // skriv det abstrakte klassenavnet med kursiv i diagram
    // Removes abstract: Class 'Animal' must either be declared abstract or implement abstract
    // method 'makeNoise()' in 'Animal'
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

// med abstract i metodenavnet SKAL metoden overrides i subklasserne
    public abstract String makeNoise(); // removes abstract: Missing method body, or declare abstract

    public abstract void eat(String food); // metoden gjort abstract for at sikre sig at den bliver
    //implementeret i subklasserne

    public void sleep(int hours) {
        String s = "s";
        if(hours == 1) {
            s = "";
        }
        System.out.printf("Sleeping for %d hour%s...\n", hours,s);
    }

}

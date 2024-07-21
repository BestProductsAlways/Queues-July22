// Main.java
public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue some animals
        shelter.enqueue("Buddy", "dog");
        shelter.enqueue("Mittens", "cat");
        shelter.enqueue("Max", "dog");
        shelter.enqueue("Whiskers", "cat");

        // Dequeue examples
        System.out.println(shelter.dequeueAny()); // Should print: dog: Buddy
        System.out.println(shelter.dequeueDog()); // Should print: dog: Max
        System.out.println(shelter.dequeueCat()); // Should print: cat: Mittens
    }
}


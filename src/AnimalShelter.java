import java.util.LinkedList;
import java.util.Queue;

// AnimalShelter.java
public class AnimalShelter {
    private Queue<Animal> dogs;
    private Queue<Animal> cats;
    private long timestamp;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        timestamp = 0;
    }

    // Enqueue an animal
    public void enqueue(String name, String type) {
        Animal animal = new Animal(name, type, timestamp++);
        if (type.equals("dog")) {
            dogs.offer(animal);
        } else if (type.equals("cat")) {
            cats.offer(animal);
        } else {
            throw new IllegalArgumentException("Unknown animal type.");
        }
    }

    // Dequeue the oldest animal of any type
    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            if (dogs.peek().getTimestamp() < cats.peek().getTimestamp()) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }
    }

    // Dequeue the oldest dog
    public Animal dequeueDog() {
        if (dogs.isEmpty()) {
            throw new IllegalStateException("No dogs available.");
        }
        return dogs.poll();
    }

    // Dequeue the oldest cat
    public Animal dequeueCat() {
        if (cats.isEmpty()) {
            throw new IllegalStateException("No cats available.");
        }
        return cats.poll();
    }
}

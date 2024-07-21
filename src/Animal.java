// Animal.java
public class Animal {
    private String name;
    private String type; // "dog" or "cat"
    private long timestamp; // Arrival timestamp

    public Animal(String name, String type, long timestamp) {
        this.name = name;
        this.type = type;
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return type + ": " + name;
    }
}


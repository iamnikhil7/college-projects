
package Singleton;

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
        // Private constructor to prevent instantiation outside the class
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    // Other methods and properties can be added here

    public static void main(String[] args) {
        // Example usage
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        // Both references point to the same instance
        System.out.println(s1 == s2); // Output: true
    }
}

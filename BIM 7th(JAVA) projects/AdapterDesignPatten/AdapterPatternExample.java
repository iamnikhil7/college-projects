
package AdapterDesignPatten;

// AdapterPatternExample.java
public class AdapterPatternExample {
    public static void main(String[] args) {
        // Create an Adaptee
        Adaptee adaptee = new Adaptee();

        // Create an Adapter and pass the Adaptee to it
        Target adapter = new Adapter(adaptee);

        // Use the Client code with the Target interface
        Client client = new Client();
        client.makeRequest(adapter);
    }
}

package ooad;

public class TestModule {

    public static void main(String[] args) {
        Computer c = new Computer();
        IDisplayModule dm1 = new Monitor();
        IDisplayModule dm2 = new Projector();

        c.setIDisplayModule(dm1);
        c.display();
        c.setIDisplayModule(dm2);
        c.display();
    }
}

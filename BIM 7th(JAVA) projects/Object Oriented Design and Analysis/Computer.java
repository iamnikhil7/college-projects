package ooad;

public class Computer {

    IDisplayModule dm;

    public void setIDisplayModule(IDisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }
}

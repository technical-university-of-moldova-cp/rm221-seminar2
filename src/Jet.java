public class Jet {
    private int height;

    public Jet(int height) {
        this.height = height;
    }

    public void simulate() {
        System.out.println("Simulate Jet");
        height*=2;

    }

    @Override
    public String toString() {
        return "Jet{" +
                "height=" + height +
                '}';
    }
}

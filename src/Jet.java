public class Jet {
    private int height;
    private int latitude;
    private int longitude;

    public Jet(int height, int latitude, int longitude) {
        this.height = height;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void simulate(Weather weather) {

        switch (weather) {
            case SUN -> {
                height += 2;
                latitude += 10;
            }
            case FOG -> {
                latitude += 1;
            }
        }
    }

    @Override
    public String toString() {
        return "Jet{" +
                "height=" + height +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

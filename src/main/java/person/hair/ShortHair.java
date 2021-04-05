package person.hair;

public class ShortHair extends Hair {

    private final String color;

    public ShortHair(final String color) {
        this.color = color;
    }

    @Override
    public final String toString() {
        return String.format("Волосы:\t\t%1$s", "короткие, " + color);
    }
}

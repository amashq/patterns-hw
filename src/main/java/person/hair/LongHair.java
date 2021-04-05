package person.hair;

public class LongHair extends Hair {

    private final String color;

    public LongHair(final String color) {
        this.color = color;
    }

    @Override
    public final String toString() {
        return String.format("Волосы:\t\t%1$s", "длинные, " + color);
    }
}

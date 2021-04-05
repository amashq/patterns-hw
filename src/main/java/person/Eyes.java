package person;

public class Eyes {

    private final String eyes;

    public Eyes(final String eyes) {
        this.eyes = eyes;
    }

    @Override
    public final String toString() {
        return String.format("Глаза:\t\t%1$s", eyes);
    }
}

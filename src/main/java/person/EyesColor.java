package person;

public enum EyesColor {
    BLUE("голубые"),
    GREEN("зелёные"),
    BROWN("карие"),
    GRAY("серые"),
    DIFF("разные");

    private final String colorEyes;

    EyesColor(final String colorEyes) {
        this.colorEyes = colorEyes;
    }

    public String getColorEyes() {
        return colorEyes;
    }
}

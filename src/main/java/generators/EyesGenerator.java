package generators;

import person.Eyes;
import person.EyesColor;

public class EyesGenerator implements Generator<Eyes> {
    private EyesColor eyes;

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */
    @Override
    public final Eyes generateParams(final int code) {
        final int i = code % 100 / 10;

        switch (i / 2) {
            case 0:
                eyes = EyesColor.BLUE;
                break;
            case 1:
                eyes = EyesColor.GREEN;
                break;
            case 2:
                eyes = EyesColor.BROWN;
                break;
            case 3:
                eyes = EyesColor.GRAY;
                break;
            case 4:
                eyes = EyesColor.DIFF;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i / 2);
        }
        return new Eyes(eyes.getColorEyes());
    }
}

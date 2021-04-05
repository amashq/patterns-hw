package generators;

import person.FIO;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator {

    private String lastName;
    private String firstName;
    private String middleName;

    //     ФИО берутся из соответствующих файлов по индексу в листе:
//     Фамилия - сумма цифр в коде
//     Имя - сумма первых двух цифр
//     Отчество - сумма последних двух цифр.
//     @param code код для генерации

    public final FIO generateParams(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        setFio(code, sex);
        return new FIO(this.lastName, this.firstName, this.middleName);
    }

    public final void setFio(final int i, final String sex) {
        lastName = getLinesFromFile("lastNames_" + sex).get(getDigitsSum(i));
        firstName = getLinesFromFile("names_" + sex).get(getDigitsSum(i / 100));
        middleName = getLinesFromFile("middleNames_" + sex).get(getDigitsSum(i % 100));
    }

}


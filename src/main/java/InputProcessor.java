import generators.EyesGenerator;
import generators.FioGenerator;
import generators.HairGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.Eyes;
import person.FIO;
import person.Person;
import person.Phone;
import person.Physical;
import person.hair.Hair;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            final int intCode = Integer.parseInt(input);
            final FIO fio = new FioGenerator().generateParams(intCode);
            final Physical physical = new PhysGenerator().generateParams(intCode);
            final Hair hair = new HairGenerator().generateParams(intCode);
            final Eyes eyes = new EyesGenerator().generateParams(intCode);

            Phone phone = null;
            // добавляем телефон, только если введённый код не палиндром
            if (!input.equals(new StringBuilder(input).reverse().toString())) {
                phone = new PhoneGenerator().generateParams(intCode);
            }

            result = new Person.PersonBuilder(input)
                    .setFio(fio)
                    .setPhys(physical)
                    .setEyes(eyes)
                    .setHair(hair)
                    .setPhone(phone)
                    .build().toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}

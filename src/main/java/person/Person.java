package person;

import person.hair.Hair;

public class Person {

    private String id;
    private FIO fio;
    private Physical phys;
    private Eyes eyes;
    private Hair hair;
    private Phone phone;

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n").
                        append(eyes).append("\n").
                        append(hair).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }

    public static class PersonBuilder {
        private final String id;
        private FIO fio;
        private Physical phys;
        private Eyes eyes;
        private Hair hair;
        private Phone phone;

        public PersonBuilder(final String id) {
            this.id = id;
        }

        public final PersonBuilder setFio(final FIO fio) {
            this.fio = fio;
            return this;
        }

        public final PersonBuilder setPhys(final Physical phys) {
            this.phys = phys;
            return this;
        }

        public final PersonBuilder setEyes(final Eyes eyes) {
            this.eyes = eyes;
            return this;
        }

        public final PersonBuilder setHair(final Hair hair) {
            this.hair = hair;
            return this;
        }

        public final PersonBuilder setPhone(final Phone phone) {
            this.phone = phone;
            return this;
        }

        public final Person build() {
            final Person person = new Person();
            person.id = this.id;
            person.fio = this.fio;
            person.phys = this.phys;
            person.eyes = this.eyes;
            person.hair = this.hair;
            person.phone = this.phone;
            return person;
        }
    }
}
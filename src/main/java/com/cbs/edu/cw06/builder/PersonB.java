package com.cbs.edu.cw06.builder;

public class PersonB {

    private String firstName; // required
    private String lastName;  // required
    private int age;
    private String education;
    private String nationality;
    private boolean isMarried;

    private PersonB(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
        this.education = personBuilder.education;
        this.nationality = personBuilder.nationality;
        this.isMarried = personBuilder.isMarried;
    }

    public static class PersonBuilder {
        private String firstName; // required
        private String lastName;  // required
        private int age;
        private String education;
        private String nationality;
        private boolean isMarried;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setEducation(String education) {
            this.education = education;
            return this;
        }

        public PersonBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public PersonBuilder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public PersonB build() {
            return new PersonB(this);
        }
    }

    public static void main(String[] args) {
        PersonB person = new PersonBuilder("Ivan", "Ivanov")
                .setAge(10).setNationality("Ukrainian")
                .setMarried(true)
                .build();

        String stringBuilder = new StringBuilder("Hello")
                .append(" ")
                .append("world")
                .append("!")
                .toString();
    }
}

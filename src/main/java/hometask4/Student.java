package hometask4;

import java.time.LocalDate;

public class Student {
    private final int id;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final LocalDate dateOfBirth;
    private final String address;
    private final int phoneNumber;
    private final String faculty;
    private final int studyYear;
    private final String group;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.patronymic = builder.patronymic;
        this.dateOfBirth = builder.dateOfBirth;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.faculty = builder.faculty;
        this.studyYear = builder.studyYear;
        this.group = builder.group;
    }

    public static Builder builder(){
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return ("ID: " + id +
                ", Name: " + name +
                ", Surname: " + surname +
                ", Patronymic: " + patronymic +
                ", Date of birth: " + dateOfBirth +
                ", Address: " + address +
                ", Phone number: " + phoneNumber +
                ", Faculty: " + faculty +
                ", Year: " + studyYear +
                ", Group: " + group);
    }

    public static class Builder{
        private int id;
        private String name;
        private String surname;
        private String patronymic;
        private LocalDate dateOfBirth;
        private String address;
        private int phoneNumber;
        private String faculty;
        private int studyYear;
        private String group;

        private Builder(){}

        public Student build(){
            return new Student(this);
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public Builder withDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withFaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }

        public Builder withStudyYear(int studyYear) {
            this.studyYear = studyYear;
            return this;
        }

        public Builder withGroup(String group) {
            this.group = group;
            return this;
        }
    }

}

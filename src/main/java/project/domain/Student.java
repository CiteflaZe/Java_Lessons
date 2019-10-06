package project.domain;

import project.Menu;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private final String email;
    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;
    private final Address address;
    private final String phoneNumber;
    private final Department department;
    private final Integer studyYear;
    private final String group;

    private Student(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
        this.surname = builder.surname;
        this.dateOfBirth = builder.dateOfBirth;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.department = builder.department;
        this.studyYear = builder.studyYear;
        this.group = builder.group;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static Builder updater(Student student){
        return new Builder(student);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return (Menu.bundle.getString("student.email") + " " + email +
                Menu.bundle.getString("student.name") + " " + name +
                Menu.bundle.getString("student.surname") + " " + surname +
                Menu.bundle.getString("student.birthday") + " " + dateOfBirth +
                Menu.bundle.getString("student.address") + " " + address +
                Menu.bundle.getString("student.phoneNumber") + " " + phoneNumber +
                Menu.bundle.getString("student.department") + " " + department +
                Menu.bundle.getString("student.studyYear") + " " + studyYear +
                Menu.bundle.getString("student.group") + " " + group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studyYear == student.studyYear &&
                Objects.equals(email, student.email) &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(dateOfBirth, student.dateOfBirth) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(department, student.department) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, surname, dateOfBirth, address, phoneNumber, department, studyYear, group);
    }

    public static class Builder{
        private String email;
        private String name;
        private String surname;
        private LocalDate dateOfBirth;
        private Address address;
        private String phoneNumber;
        private Department department;
        private int studyYear;
        private String group;

        private Builder(){}

        public Builder(Student student) {
            this.email = student.email;
            this.name = student.name;
            this.surname = student.surname;
            this.dateOfBirth = student.dateOfBirth;
            this.address = student.address;
            this.phoneNumber = student.phoneNumber;
            this.department = student.department;
            this.studyYear = student.studyYear;
            this.group = student.group;
        }

        public Student build(){
            return new Student(this);
        }

        public Builder withEmail(String email) {
            this.email = email;
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

        public Builder withDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withDepartment(Department department) {
            this.department = department;
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
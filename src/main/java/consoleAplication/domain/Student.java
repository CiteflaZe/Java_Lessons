package consoleAplication.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends User {
    private final String phoneNumber;
    private final LocalDate birthDate;
    private final Address address;
    private final Group group;


    private Student(Builder builder) {
        super(builder.id, builder.email, builder.password, builder.surName, builder.name, builder.role);
        this.phoneNumber = builder.phoneNumber;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.group = builder.group;
    }

    public static Builder builder(){
        return new Builder();
    }
    public static Builder update(Student student){
        return new Builder(student);
    }

    public static class Builder{
        private Long id;
        private LocalDate birthDate;
        private Address address;
        private Group group;
        private String email;
        private String password;
        private String surName;
        private String name;
        private Role role;
        private String phoneNumber;

        private Builder(){

        }

        private Builder(Student student) {
            if (student != null){
                this.id = student.getId();
                this.birthDate = student.getBirthDate();
                this.address = student.getAddress();
                this.group = student.getGroup();
                this.email = student.getEmail();
                this.password = student.getPassword();
                this.surName = student.getSurName();
                this.name = student.getName();
                this.role = student.getRole();
                this.phoneNumber = student.getPhoneNumber();
            }
        }

        public Student build(){
            return new Student(this);
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setId(Student student) {
            this.id = student.getId();
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setGroup(Group group) {
            this.group = group;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public Role getRole() {
        return super.getRole();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getSurName() {
        return super.getSurName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (!Objects.equals(phoneNumber, student.phoneNumber)) return false;
        if (!Objects.equals(birthDate, student.birthDate)) return false;
        if (!Objects.equals(address, student.address)) return false;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                ", group=" + group ;
    }
}

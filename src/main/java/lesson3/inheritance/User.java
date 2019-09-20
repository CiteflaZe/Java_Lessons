package lesson3.inheritance;

public final class User {

    private final String name;
    private final String surname;
    private final String password;
    private final String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;
        this.email = builder.email;

    }

    public static Builder builder(){
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{
        private String name;
        private String surname;
        private String password;
        private String email;

        private Builder(){
        }

        public User build(){
            return new User(this);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }
    }

}

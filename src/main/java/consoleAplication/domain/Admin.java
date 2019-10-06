package consoleAplication.domain;

public class Admin extends User {
    private Admin(Builder builder) {
        super(builder.id, builder.email, builder.password, builder.surName, builder.name, builder.role);
    }

    public static Builder builder(){
        return new Builder();
    }
    public static Builder update(Admin admin){
        return new Builder(admin);
    }

    public static class Builder{
        private Long id;
        private String email;
        private String password;
        private String surName;
        private String name;
        private Role role;

        private Builder(){

        }

        public Builder(Admin admin) {
            if (admin != null){
                this.id = admin.getId();
                this.email = admin.getEmail();
                this.password = admin.getPassword();
                this.surName = admin.getSurName();
                this.name = admin.getName();
                this.role = admin.getRole();
            }
        }

        public Admin build(){
            return new Admin(this);
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setId(Admin admin) {
            this.id = admin.getId();
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
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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

}

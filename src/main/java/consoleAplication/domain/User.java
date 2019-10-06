package consoleAplication.domain;

import java.util.Objects;

public abstract class User {
    private static Long UUID = 0L;
    private final Long id;
    private final String email;
    private final String password;
    private final String surName;
    private final String name;
    private final Role role;

    protected User(Long id, String email, String password, String surName, String name, Role role) {
        this.id = UUID++;
        this.email = email;
        this.password = password;
        this.surName = surName;
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(id, user.id)) return false;
        if (!Objects.equals(email, user.email)) return false;
        if (!Objects.equals(password, user.password)) return false;
        if (!Objects.equals(surName, user.surName)) return false;
        if (!Objects.equals(name, user.name)) return false;
        return role == user.role;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role;
    }
}

package org.firstspring.course.entities;


import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long  serialVersionUID = 1L;

    private long id;
    private String name;
    private String email;
    private String password;

    public User() {

    }

    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(getId());
    }

}

package com.jsuryakt.restfulwebservices.user;

import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {

    @UniqueElements(message = "ID is unique, it may already exist in the database")
    private Integer id;
    @Size(min = 2, message = "Name should me atleast 2 characters")
    private String name;
    @Past(message = "Birthdate can't be today or in the future")
    private Date birthDate;

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

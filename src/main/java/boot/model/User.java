package boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, message = "Size of name should be more than 2 characters!")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "Surname should not be empty")
    @Size(min = 2, message = "Size of surname should be more than 2 characters!")
    @Column(name = "surname")
    private String surname;

    @Min(value = 1, message = "Age should be more than 1 years!")
    @Max(value = 130, message = "Age can't be more than 130 years! Sorry! ;) ")
    @Column(name = "age")
    private int age;

    @Column(name = "email")
    @NotEmpty
    @Email(message = "Email should be valid format: example@gmail.com")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

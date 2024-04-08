package com.webcode.SistemaEscolarChile.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dni")
    private String dni;

    @Column(name = "birth_date_day")
    private Date birthday;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_teacher_id")
    private ProfileTeacher profileTeacher;

    // Constructor, getters and setters, toString...


    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String dni, Date birthday, ProfileTeacher profileTeacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.birthday = birthday;
        this.profileTeacher = profileTeacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ProfileTeacher getProfileTeacher() {
        return profileTeacher;
    }

    public void setProfileTeacher(ProfileTeacher profileTeacher) {
        this.profileTeacher = profileTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", birthday=" + birthday +
                ", profileTeacher=" + profileTeacher +
                '}';
    }
}


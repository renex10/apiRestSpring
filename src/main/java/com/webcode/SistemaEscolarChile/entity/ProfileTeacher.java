package com.webcode.SistemaEscolarChile.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profile_teachers")
public class ProfileTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "biography", columnDefinition = "TEXT")
    private String biography; // Columna para almacenar la biografía como texto

    @Column(name = "academic_title")
    private String academicTitle; // Academic title of the teacher


    @Column(name = "work_experience", columnDefinition = "TEXT")
    private String workExperience; // Work experience of the teacher

    @Column(name = "hobby")
    private String hobby; // Hobby or leisure activity of the teacher

    // Constructor, getters and setters, toString...


    public ProfileTeacher() {
    }

    public ProfileTeacher(String email, String phone, String biography, String academicTitle, String workExperience, String hobby) {
        this.email = email;
        this.phone = phone;
        this.biography = biography;
        this.academicTitle = academicTitle;
        this.workExperience = workExperience;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "ProfileTeacher{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", biography='" + biography + '\'' +
                ", academicTitle='" + academicTitle + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

package com.bi183.wardhiana.model;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("id")
    private int id;
    @SerializedName("judul")
    private String firstName;
    @SerializedName("penulis")
    private String lastName;
    @SerializedName("tahun")
    private String phoneNumber;
    @SerializedName("penerbit")
    private String email;
    @SerializedName("sampul")
    private String photo;
    @SerializedName("stok")
    private String gender;

    public Contact(int id, String firstName, String lastName, String phoneNumber, String email, String photo, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.photo = photo;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }

    public String getGender() {
        return gender;
    }
}
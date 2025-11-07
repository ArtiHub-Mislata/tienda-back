package com.proyect.artyhub_back.domain.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class User {
    // En caso de no tener DTO, aqui hariamos la validación de datos de entrada
    //
    // @NotNull(message = "El id es obligatorio")
    private Long id;
    // @NotNull(message = "El nombre es obligatorio")
    private String name;
    // @NotNull(message = "El email es obligatorio")
    private String email;
    // @NotNull(message = "La contraseña es obligatoria")
    private String password;
    // @Size (min = 24, max = 24)
    private String nAccount;
    // @Size (max=250)
    private String description;
    private String address;
    private String imageProfileUrl;

    public User(Long id, String name, String email, String password, String nAccount, String description, String address, String imageProfileUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.nAccount = nAccount;
        this.description = description;
        this.address = address;
        this.imageProfileUrl = imageProfileUrl;
        // this.setAddress("yfyf"); Si no tuvieramos JakartaValidation, tendriamos que poner el this.set_xxx
    }

    // Si no tuvieramos JakartaValidation, las validaciones se hacen en el setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getnAccount() {
        return nAccount;
    }

    public void setnAccount(String nAccount) {
        this.nAccount = nAccount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageProfileUrl() {
        return imageProfileUrl;
    }

    public void setImageProfileUrl(String imageProfileUrl) {
        this.imageProfileUrl = imageProfileUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nAccount='" + nAccount + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", imageProfileUrl='" + imageProfileUrl + '\'' +
                '}';
    }
}

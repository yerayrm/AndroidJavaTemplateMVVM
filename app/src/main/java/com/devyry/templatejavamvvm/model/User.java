package com.devyry.templatejavamvvm.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yeray Rguez on 04/03/2019.
 */
public class User {

    @SerializedName("name")
    private String name;

    @SerializedName("mail")
    private String mail;

    public User(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}

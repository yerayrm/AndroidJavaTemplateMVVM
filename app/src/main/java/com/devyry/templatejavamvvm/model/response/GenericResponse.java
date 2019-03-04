package com.devyry.templatejavamvvm.model.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yeray Rguez on 01/03/2019.
 */
public class GenericResponse {

    @SerializedName("code")
    private String code;

    @SerializedName("message")
    private String message;

    public GenericResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

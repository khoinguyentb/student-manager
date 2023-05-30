/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author vankh
 */
public class User implements Serializable{
    private long idUser;
    private String userName;
    private String passWorld;

    public User() {
        this.idUser = new Date().getTime();
    }

    public User(String userName, String passWorld) {
        this.idUser = new Date().getTime();
        this.userName = userName;
        this.passWorld = passWorld;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
    
    
    
}

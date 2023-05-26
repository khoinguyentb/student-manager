/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author vankh
 */
public class User {
    private String userName;
    private String passWorld;

    public User() {
    }

    public User(String userName, String passWorld) {
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
    
}

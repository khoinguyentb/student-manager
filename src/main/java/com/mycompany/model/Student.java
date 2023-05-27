/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author vankh
 */
public class Student implements Serializable,Comparable<Student>{
    
    
    
    private long  id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String department;
    private String Class;
    private String phoneNumber;
    private String email;
    private double  GPA;

    public Student() {
        this.id = new Date().getTime();
    }

    public Student(long id, String name, String dateOfBirth, String address, String department, String Class, String phoneNumber, String email, double GPA) {
        this.id = new Date().getTime();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.department = department;
        this.Class = Class;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.GPA = GPA;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public String getAddress() {
        return address;
    }

    public String getclass() {
        return Class;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public double getGPA() {
        return GPA;
    }

    public long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

  

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}
